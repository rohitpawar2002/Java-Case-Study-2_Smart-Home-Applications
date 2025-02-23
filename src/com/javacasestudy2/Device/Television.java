package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.BedroomDevices;
import com.javacasestudy2.CategoryOfDevices.LivingroomDevices;
import com.javacasestudy2.Interfaces.EntertainmentDevices;

public class Television extends Device implements BedroomDevices, LivingroomDevices, EntertainmentDevices {

    public Television() {
    }

    public Television(int productId, String deviceName, boolean status) {
        super(productId, deviceName, status);
    }

    @Override
    public boolean increaseVolume() {
        return true;
    }

    @Override
    public boolean decreaseVolume() {
        return true;
    }

    @Override
    public boolean channelChange() {
        return true;
    }
}
