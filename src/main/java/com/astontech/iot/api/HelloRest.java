package com.astontech.iot.api;

import com.pi4j.io.gpio.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {

    public static GpioPinDigitalOutput pin;

    @GetMapping("/api/hi")
    public String helloWorld() {
        return "H3!!0 W()R!D     -   004";
    }

    @PostMapping("/api/led/")
    public String toggleLed() {
        if(pin==null) {
            GpioController gpio = GpioFactory.getInstance();
            pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_16, "LED 01", PinState.LOW);
        }
        pin.toggle();
        return "Light Toggled!";
    }
}
