package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.WashroomDevices;

public class Geyser extends Device implements WashroomDevices {

    public Geyser() {
    }

    public Geyser(int productId, String deviceName, boolean status) {
        super(productId, deviceName, status);
    }
}
