package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.*;

public class Light extends Device implements BedroomDevices, KitchenDevices, LivingroomDevices, StoreroomDevices, WashroomDevices {

    public Light() {
    }

    public Light(int productId, String deviceName, boolean status) {
        super(productId, deviceName, status);
    }
}
