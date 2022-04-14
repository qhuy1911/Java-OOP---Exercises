package defining_classes;

public class Battery {
    private String model;
    private int hoursIdle;
    private int hoursTalk;

    private enum BatteryType {LiIon, NiMH, NiCd};

    public Battery(String model, int hoursIdle, int hoursTalk) {
        this.model = model;
        this.hoursIdle = hoursIdle;
        this.hoursTalk = hoursTalk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHoursIdle() {
        return hoursIdle;
    }

    public void setHoursIdle(int hoursIdle) {
        this.hoursIdle = hoursIdle;
    }

    public int getHoursTalk() {
        return hoursTalk;
    }

    public void setHoursTalk(int hoursTalk) {
        this.hoursTalk = hoursTalk;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "model='" + model + '\'' +
                ", hoursIdle=" + hoursIdle +
                ", hoursTalk=" + hoursTalk +
                '}';
    }
}
