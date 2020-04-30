package com.spi;

import java.util.ServiceLoader;

public class TestSpi {
    public static void main(String[] args) {
        ServiceLoader<SpiService> shouts = ServiceLoader.load(SpiService.class);
        for (SpiService shout : shouts) {
            shout.test();
        }
    }
}
