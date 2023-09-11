package com.example.slackendpoint;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class SlackEndpointController {

    @PostMapping("/api")
    public ApiResponse getInfo(@RequestBody JsonRequest request) {
        // Get current day of the week
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String currentDay = sdf.format(new Date());

        // Get current UTC time
        SimpleDateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        utcFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        String currentTime = utcFormat.format(new Date());

        // GitHub URLs
        String githubFileUrl = "https://github.com/username/repo/blob/main/file_name.ext";
        String githubRepoUrl = "https://github.com/Marysule38/backend-endpoint";

        ApiResponse response = new ApiResponse();
        response.setSlackName(request.getSlackName());
        response.setCurrentDay(currentDay);
        response.setUtcTime(currentTime);
        response.setTrack(request.getTrack());
        response.setGithubFileUrl(githubFileUrl);
        response.setGithubRepoUrl(githubRepoUrl);
        response.setStatusCode(200);

        return response;
    }
}

