package main.exercise1;

import java.util.ArrayList;
import java.util.List;

public class GSM {
    private String model;
    private String manufacturer;
    private float price;
    private String owner;
    private Battery battery;
    private Display display;
    private List<Call> callHistory = new ArrayList<>();

    public GSM(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public GSM(String model, String manufacturer, float price, String owner, Battery battery, Display display) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.owner = owner;
        this.battery = battery;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public List<Call> getCallHistory() {
        return callHistory;
    }

    @Override
    public String toString() {
        return "GSM{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                ", battery=" + battery +
                ", display=" + display +
                '}';
    }

    public void addCall(Call call) {
        callHistory.add(call);
    }

    public void deleteCall(Call call) {
        callHistory.remove(call);
    }

    public void clearCallHistory() {
        callHistory.clear();
    }

    public Call getLongestCall() {
        int longestDuration = 0;
        Call longestCall = null;
        for (Call call : callHistory) {
            if (call.getDuration() > longestDuration) {
                longestCall = call;
                longestDuration = call.getDuration();
            }
        }
        return longestCall;
    }

    public double totalPrice(double pricePerMinute) {
        double totalSeconds = 0;
        for (Call call : callHistory) {
            totalSeconds += call.getDuration();
        }
        return totalSeconds * pricePerMinute / 60;
    }
}
