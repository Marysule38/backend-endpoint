package com.example.slackendpoint;

public class ApiResponse {
    private String slackName;
    private String currentDay;
    private String utcTime;
    private String track;
    private String githubFileUrl;
    private String githubRepoUrl;
    private int statusCode;

    // getters and setters
    public String getSlackName() {
        return slackName;
    }

    public void setSlackName(String slackName) {
        this.slackName = slackName;
    }

    public String getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
    }

    public String getUtcTime() {
        return utcTime;
    }

    public void setUtcTime(String utcTime) {
        this.utcTime = utcTime;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getGithubFileUrl() {
        return githubFileUrl;
    }

    public void setGithubFileUrl(String githubFileUrl) {
        this.githubFileUrl = githubFileUrl;
    }

//    public String getGithubRepoUrl() {
//        return githubRepoUrl;
//    }

    public void setGithubRepoUrl(String githubRepoUrl) {
        this.githubRepoUrl = githubRepoUrl;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}

