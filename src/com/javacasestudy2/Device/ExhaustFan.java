package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.KitchenDevices;
import com.javacasestudy2.CategoryOfDevices.StoreroomDevices;
import com.javacasestudy2.CategoryOfDevices.WashroomDevices;

public class ExhaustFan extends Device implements KitchenDevices, WashroomDevices, StoreroomDevices {

    public ExhaustFan() {
    }

    public ExhaustFan(int productId, String deviceName, boolean status) {
        super(productId, deviceName, status);
    }
}
