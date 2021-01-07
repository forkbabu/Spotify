package com.spotify.music.superbird.setup.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

public final class CarThingDevice implements JacksonModel {
    private final String connectDeviceName;
    private final String deviceId;
    private final String modified;
    private final Platform platform;
    private final String serial;
    private final String status;
    private final String username;
    private final String versionAudioDriver;
    private final String versionFirmware;
    private final String versionHardware;
    private final String versionOs;
    private final String versionSoftware;

    public CarThingDevice(@JsonProperty("device_id") String str, @JsonProperty("serial") String str2, @JsonProperty("username") String str3, @JsonProperty("version_os") String str4, @JsonProperty("version_hardware") String str5, @JsonProperty("version_firmware") String str6, @JsonProperty("version_software") String str7, @JsonProperty("version_audio_driver") String str8, @JsonProperty("connect_device_name") String str9, @JsonProperty("platform") Platform platform2, @JsonProperty("status") String str10, @JsonProperty("modified") String str11) {
        h.e(str, "deviceId");
        h.e(str2, "serial");
        h.e(str10, "status");
        h.e(str11, "modified");
        this.deviceId = str;
        this.serial = str2;
        this.username = str3;
        this.versionOs = str4;
        this.versionHardware = str5;
        this.versionFirmware = str6;
        this.versionSoftware = str7;
        this.versionAudioDriver = str8;
        this.connectDeviceName = str9;
        this.platform = platform2;
        this.status = str10;
        this.modified = str11;
    }

    public static /* synthetic */ CarThingDevice copy$default(CarThingDevice carThingDevice, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Platform platform2, String str10, String str11, int i, Object obj) {
        return carThingDevice.copy((i & 1) != 0 ? carThingDevice.deviceId : str, (i & 2) != 0 ? carThingDevice.serial : str2, (i & 4) != 0 ? carThingDevice.username : str3, (i & 8) != 0 ? carThingDevice.versionOs : str4, (i & 16) != 0 ? carThingDevice.versionHardware : str5, (i & 32) != 0 ? carThingDevice.versionFirmware : str6, (i & 64) != 0 ? carThingDevice.versionSoftware : str7, (i & 128) != 0 ? carThingDevice.versionAudioDriver : str8, (i & 256) != 0 ? carThingDevice.connectDeviceName : str9, (i & 512) != 0 ? carThingDevice.platform : platform2, (i & 1024) != 0 ? carThingDevice.status : str10, (i & 2048) != 0 ? carThingDevice.modified : str11);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final Platform component10() {
        return this.platform;
    }

    public final String component11() {
        return this.status;
    }

    public final String component12() {
        return this.modified;
    }

    public final String component2() {
        return this.serial;
    }

    public final String component3() {
        return this.username;
    }

    public final String component4() {
        return this.versionOs;
    }

    public final String component5() {
        return this.versionHardware;
    }

    public final String component6() {
        return this.versionFirmware;
    }

    public final String component7() {
        return this.versionSoftware;
    }

    public final String component8() {
        return this.versionAudioDriver;
    }

    public final String component9() {
        return this.connectDeviceName;
    }

    public final CarThingDevice copy(@JsonProperty("device_id") String str, @JsonProperty("serial") String str2, @JsonProperty("username") String str3, @JsonProperty("version_os") String str4, @JsonProperty("version_hardware") String str5, @JsonProperty("version_firmware") String str6, @JsonProperty("version_software") String str7, @JsonProperty("version_audio_driver") String str8, @JsonProperty("connect_device_name") String str9, @JsonProperty("platform") Platform platform2, @JsonProperty("status") String str10, @JsonProperty("modified") String str11) {
        h.e(str, "deviceId");
        h.e(str2, "serial");
        h.e(str10, "status");
        h.e(str11, "modified");
        return new CarThingDevice(str, str2, str3, str4, str5, str6, str7, str8, str9, platform2, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarThingDevice)) {
            return false;
        }
        CarThingDevice carThingDevice = (CarThingDevice) obj;
        return h.a(this.deviceId, carThingDevice.deviceId) && h.a(this.serial, carThingDevice.serial) && h.a(this.username, carThingDevice.username) && h.a(this.versionOs, carThingDevice.versionOs) && h.a(this.versionHardware, carThingDevice.versionHardware) && h.a(this.versionFirmware, carThingDevice.versionFirmware) && h.a(this.versionSoftware, carThingDevice.versionSoftware) && h.a(this.versionAudioDriver, carThingDevice.versionAudioDriver) && h.a(this.connectDeviceName, carThingDevice.connectDeviceName) && h.a(this.platform, carThingDevice.platform) && h.a(this.status, carThingDevice.status) && h.a(this.modified, carThingDevice.modified);
    }

    public final String getConnectDeviceName() {
        return this.connectDeviceName;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getModified() {
        return this.modified;
    }

    public final Platform getPlatform() {
        return this.platform;
    }

    public final String getSerial() {
        return this.serial;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getVersionAudioDriver() {
        return this.versionAudioDriver;
    }

    public final String getVersionFirmware() {
        return this.versionFirmware;
    }

    public final String getVersionHardware() {
        return this.versionHardware;
    }

    public final String getVersionOs() {
        return this.versionOs;
    }

    public final String getVersionSoftware() {
        return this.versionSoftware;
    }

    public int hashCode() {
        String str = this.deviceId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.serial;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.username;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.versionOs;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.versionHardware;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.versionFirmware;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.versionSoftware;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.versionAudioDriver;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.connectDeviceName;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Platform platform2 = this.platform;
        int hashCode10 = (hashCode9 + (platform2 != null ? platform2.hashCode() : 0)) * 31;
        String str10 = this.status;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.modified;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CarThingDevice(deviceId=");
        V0.append(this.deviceId);
        V0.append(", serial=");
        V0.append(this.serial);
        V0.append(", username=");
        V0.append(this.username);
        V0.append(", versionOs=");
        V0.append(this.versionOs);
        V0.append(", versionHardware=");
        V0.append(this.versionHardware);
        V0.append(", versionFirmware=");
        V0.append(this.versionFirmware);
        V0.append(", versionSoftware=");
        V0.append(this.versionSoftware);
        V0.append(", versionAudioDriver=");
        V0.append(this.versionAudioDriver);
        V0.append(", connectDeviceName=");
        V0.append(this.connectDeviceName);
        V0.append(", platform=");
        V0.append(this.platform);
        V0.append(", status=");
        V0.append(this.status);
        V0.append(", modified=");
        return je.I0(V0, this.modified, ")");
    }
}
