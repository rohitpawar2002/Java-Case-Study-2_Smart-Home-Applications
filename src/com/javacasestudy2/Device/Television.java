package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.BedroomDevices;
import com.javacasestudy2.CategoryOfDevices.LivingroomDevices;

public class Television extends Device implements BedroomDevices, LivingroomDevices {

    public Television() {
    }

    public Television(int productId, String deviceName, boolean status) {
        super(productId, deviceName, status);
    }
}
