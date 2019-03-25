package com.example.coursescheduleapp;

class CourseSchedule {
    private String scheduleWeek;
    private String lectureTopic;
    private String labTopic;
    private String assessment;
    private String date;

    public CourseSchedule(String weekNumber, String date, String lectureTopic, String labTopic, String assessment) {
        this.scheduleWeek = weekNumber;
        this.lectureTopic = lectureTopic;
        this.labTopic = labTopic;
        this.assessment = assessment;
        this.date = date;
    }

    public String getWeek() {
        return scheduleWeek;
    }

    public void setWeek(String weekNumber) {
        this.scheduleWeek = weekNumber;
    }

    public String getLectureTopic() {
        return lectureTopic;
    }

    public void setLectureTopic(String lectureTopic) {
        this.lectureTopic = lectureTopic;
    }

    public String getLabTopic() {
        return labTopic;
    }

    public void setLabTopic(String labTopic) {
        this.labTopic = labTopic;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
