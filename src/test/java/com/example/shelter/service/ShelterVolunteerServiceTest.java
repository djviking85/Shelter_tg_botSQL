package com.example.shelter.service;

import com.example.shelter.entity.Users;
import com.example.shelter.repository.UsersRepository;
import com.example.shelter.shelter.ShelterVolunteerType;
import com.pengrad.telegrambot.TelegramBot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Collection;

import static com.example.shelter.shelter.ShelterVolunteerType.VOLUNTEER;


/**
 * This class is responsible for testing ShelterVolunteerService.class methods
 */
@ContextConfiguration(classes = {ShelterVolunteerService.class})
@ExtendWith(SpringExtension.class)
class ShelterVolunteerServiceTest {

    @MockBean
    private UsersRepository usersRepository;

    @MockBean
    private TelegramBot telegramBot;
    private final ShelterVolunteerService shelterVolunteerService;

    @Autowired
    public ShelterVolunteerServiceTest(ShelterVolunteerService shelterVolunteerService) {
        this.shelterVolunteerService = shelterVolunteerService;
    }

    /**
     * Method for testing shelterVolunteerService.getInfoAboutQuestion
     */
    @Test
    void getInfoAboutQuestionTest() {
        String expectedResult = "В ответном сообщении" +
                " оставьте свой номер телефона" +
                " и email в формате: \n +7 123 456 78 90 example@email.com";
        ShelterVolunteerType type = VOLUNTEER;

        Assertions.assertEquals(expectedResult, shelterVolunteerService.getInfoAboutQuestion());
    }

    /**
     * Method for testing shelterVolunteerService.getAllUsers
     */
    @Test
    void getAllUsersTest() {
        Users testUser = new Users();
        Collection<Users> testCollection = new ArrayList<>();
        testCollection.add(testUser);

        Mockito.when(shelterVolunteerService.getAllUsers()).thenReturn(testCollection);

        Assertions.assertEquals(testCollection, shelterVolunteerService.getAllUsers());

    }
}
