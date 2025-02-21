package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.BedroomDevices;
import com.javacasestudy2.CategoryOfDevices.KitchenDevices;
import com.javacasestudy2.CategoryOfDevices.LivingroomDevices;
import com.javacasestudy2.CategoryOfDevices.StoreroomDevices;

public class Fan extends Device implements BedroomDevices, LivingroomDevices, KitchenDevices, StoreroomDevices {

    public Fan() {
    }

    public Fan(int productId, String deviceName, boolean status) {
        super(productId, deviceName, status);
    }
}
