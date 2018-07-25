package com.prophet.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationInfo {

    // 用户ID
    private String userId;

    // 预定日期
    private LocalDate reservationDate;

    // 预定开始时间
    private LocalTime startTime;

    // 预定持续时间
    private int durationInHour;

    // 场地
    private String area;

    // 预定是否被取消
    private boolean canceled;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public int getDurationInHour() {
        return durationInHour;
    }

    public void setDurationInHour(int durationInHour) {
        this.durationInHour = durationInHour;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}
