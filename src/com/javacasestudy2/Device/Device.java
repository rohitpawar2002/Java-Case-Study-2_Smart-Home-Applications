package com.javacasestudy2.Device;

public class Device {
    int productId;
    String deviceName;
    boolean status;

    public Device() {
    }

    public Device(int productId, String deviceName, boolean status) {
        this.productId = productId;
        this.deviceName = deviceName;
        this.status = status;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
