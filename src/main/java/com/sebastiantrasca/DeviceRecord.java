package com.sebastiantrasca;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceRecord {
    @JsonProperty("id")
    private long id;
    @JsonProperty("device")
    private Device device;

    @JsonCreator
    public DeviceRecord(@JsonProperty("id") long id, @JsonProperty("device") Device device) {
        this.id = id;
        this.device = device;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\n Device info:\n" + device;
    }
}