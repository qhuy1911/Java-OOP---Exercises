package defining_classes;

import java.util.Date;

public class Call {
    private Date dateTime;
    private String phoneNumber;
    private int duration;

    public Call(Date dateTime, String phoneNumber, int duration) {
        this.dateTime = dateTime;
        this.phoneNumber = phoneNumber;
        this.duration = duration;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Call{" +
                "dateTime=" + dateTime +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", duration=" + duration +
                '}';
    }
}
