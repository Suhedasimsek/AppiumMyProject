package utils;

public enum Device {

    PIXEL2("emulator-5554",
            "12",
            "HUAWEI P40",
            "Android"),
    HUAWEIP40(
            "EPHUT20721025903",
            "12",
            "My Phone",
            "Android");

    public String udid;
    public String version;
    public String deviceName;
    public String platformName;

    Device(String udid, String version, String deviceName, String platformName) {
        this.udid = udid;
        this.version = version;
        this.deviceName = deviceName;
        this.platformName = platformName;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
