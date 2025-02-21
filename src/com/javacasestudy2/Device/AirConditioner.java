package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.BedroomDevices;
import com.javacasestudy2.CategoryOfDevices.KitchenDevices;
import com.javacasestudy2.CategoryOfDevices.LivingroomDevices;

public class AirConditioner extends Device implements BedroomDevices, LivingroomDevices {

    public AirConditioner() {
    }

    public AirConditioner(int productId, String deviceName, boolean status) {
        super(productId, deviceName, status);
    }
}
