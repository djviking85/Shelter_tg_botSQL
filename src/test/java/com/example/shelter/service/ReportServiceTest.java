package com.example.shelter.service;

import com.example.shelter.entity.Report;
import com.example.shelter.entity.Users;
import com.example.shelter.repository.ReportRepository;
import com.example.shelter.repository.UsersRepository;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.File;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import javax.annotation.PostConstruct;

@ContextConfiguration(classes = {ReportService.class})
@ExtendWith(SpringExtension.class)
class ReportServiceTest {

    @MockBean
    private ReportRepository reportRepository;
    @MockBean
    private UsersRepository usersRepository;
    @MockBean
    private TelegramBot telegramBot;

    private final ReportService reportService;

    @Autowired
    ReportServiceTest(ReportService reportService) {
        this.reportService = reportService;
    }

    @PostConstruct
    void initData() {
        Report emptyReport = new Report();
        reportService.setReportTmp(emptyReport);
    }

    @Test
    void nullReportCheck() {
        String expectedResult = "Отчет пока пуст";

        Assertions.assertEquals(expectedResult, reportService.reportCheck());
    }

    @Test
    void ReportWithoutPhotoCheck() {
        Report reportTmp = new Report();
        reportTmp.setReportText("Test");
        reportService.setReportTmp(reportTmp);

        String expectedResult = "В отчете не хватает фото(";

        Assertions.assertEquals(expectedResult, reportService.reportCheck());
    }

    @Test
    void ReportWithoutTextCheck() {
        Report reportTmp = new Report();
        File file = new File();
        reportTmp.setFile(file);
        reportService.setReportTmp(reportTmp);

        String expectedResult = "В отчете не хватает текстовой части(";

        Assertions.assertEquals(expectedResult, reportService.reportCheck());
    }

    @Test
    void ReportCorrectCheck() {
        Report reportTmp = new Report();
        File file = new File();
        Users user = new Users();
        user.setId(1L);
        reportTmp.setFile(file);
        reportTmp.setReportText("Test");
        reportTmp.setUsers(user);
        reportService.setReportTmp(reportTmp);

        String expectedResult = "Отчет принят, спасибо!";

        Assertions.assertEquals(expectedResult, reportService.reportCheck());
    }

    @Test
    void ReportExceptionCheck() {
        Report reportTmp = new Report();
        File file = new File();
        reportTmp.setFile(file);
        reportTmp.setReportText("Test");
        reportService.setReportTmp(reportTmp);

        String expectedResult = "Отчет не принят, так как мы обнаружили, что текущий пользователь не зарегистрирован. " +
                "Для корректной работы приложения - пожалуйста, зарегистрируйтесь в стартовом меню" +
                " \"Нужна помощь волонтера\", спасибо)";

        Mockito.when(reportRepository.save(reportTmp)).thenThrow(DataIntegrityViolationException.class);

        Assertions.assertThrows(DataIntegrityViolationException.class, () -> {
            reportRepository.save(reportTmp);
        });

        Assertions.assertEquals(expectedResult, reportService.reportCheck());
    }
}