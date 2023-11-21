package com.example.shelter.controller;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;

@RestController
@RequestMapping("volunteer")
public class VolunteerController {
    ShelterVolunteerService shelterVolunteerService;

    public VolunteerController(ShelterVolunteerService shelterVolunteerService) {
        this.shelterVolunteerService = shelterVolunteerService;
    }

    @ApiResponse(
            responseCode = "200",
            description = "the method sends a message to the user about the extension of the trial period for 14 days"
    )
    @PostMapping("14-days")
    public void sendAMessageAboutAFourteenDayExtension(@RequestParam Long chatId) {
        shelterVolunteerService.sendMessageWeekExtensionProbation(chatId);
    }

    @ApiResponse(
            responseCode = "200",
            description = "the method sends a message to the user about the extension of the trial period for 30 days"
    )
    @PostMapping("30-days")
    public void sendAMessageAboutAThirtyDayExtension(@RequestParam Long chatId) {
        shelterVolunteerService.sendMessageMonthExtensionProbation(chatId);
    }

    @ApiResponse(
            responseCode = "200",
            description = "the method sends a message to the user that he has not passed the probation period"
    )
    @PostMapping("The trial period failed")
    public void sendMessageFailureProbation(@RequestParam Long chatId) {
        shelterVolunteerService.sendMessageFailureProbation(chatId);
    }

    @ApiResponse(
            responseCode = "200",
            description = "the method sends a message to the user that he has passed the probation period"
    )
    @PostMapping("Probation period passed")
    public void sendMessageSuccessfulProbation(@RequestParam Long chatId) {
        shelterVolunteerService.sendMessageSuccessfulProbation(chatId);
    }

    @ApiResponse(
            responseCode = "200",
            description = "the method sends a message to the user that the report has not been accepted"
    )
    @PostMapping("Bad-Report")
    public void sendMessageBadReport(@RequestParam Long chatId) {
        shelterVolunteerService.sendMessageBadReport(chatId);
    }

    @ApiResponse(
            responseCode = "200",
            description = "the method get all users",
            content = @Content(
                    mediaType = MediaType.APPLICATION_JSON_VALUE)
    )
    @GetMapping("all-users")
    public Collection<Users> getAllUsers() {
        return shelterVolunteerService.getAllUsers();
    }

}