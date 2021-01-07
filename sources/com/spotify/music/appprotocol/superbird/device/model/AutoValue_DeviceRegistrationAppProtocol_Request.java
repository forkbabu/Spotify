package com.spotify.music.appprotocol.superbird.device.model;

final class AutoValue_DeviceRegistrationAppProtocol_Request extends DeviceRegistrationAppProtocol$Request {
    private final String serial;
    private final String versionOs;
    private final String versionSoftware;

    AutoValue_DeviceRegistrationAppProtocol_Request(String str, String str2, String str3) {
        if (str != null) {
            this.serial = str;
            if (str2 != null) {
                this.versionSoftware = str2;
                if (str3 != null) {
                    this.versionOs = str3;
                    return;
                }
                throw new NullPointerException("Null versionOs");
            }
            throw new NullPointerException("Null versionSoftware");
        }
        throw new NullPointerException("Null serial");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceRegistrationAppProtocol$Request)) {
            return false;
        }
        DeviceRegistrationAppProtocol$Request deviceRegistrationAppProtocol$Request = (DeviceRegistrationAppProtocol$Request) obj;
        if (!this.serial.equals(deviceRegistrationAppProtocol$Request.serial()) || !this.versionSoftware.equals(deviceRegistrationAppProtocol$Request.versionSoftware()) || !this.versionOs.equals(deviceRegistrationAppProtocol$Request.versionOs())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.serial.hashCode() ^ 1000003) * 1000003) ^ this.versionSoftware.hashCode()) * 1000003) ^ this.versionOs.hashCode();
    }

    @Override // com.spotify.music.appprotocol.superbird.device.model.DeviceRegistrationAppProtocol$Request
    public String serial() {
        return this.serial;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Request{serial=");
        V0.append(this.serial);
        V0.append(", versionSoftware=");
        V0.append(this.versionSoftware);
        V0.append(", versionOs=");
        return je.I0(V0, this.versionOs, "}");
    }

    @Override // com.spotify.music.appprotocol.superbird.device.model.DeviceRegistrationAppProtocol$Request
    public String versionOs() {
        return this.versionOs;
    }

    @Override // com.spotify.music.appprotocol.superbird.device.model.DeviceRegistrationAppProtocol$Request
    public String versionSoftware() {
        return this.versionSoftware;
    }
}
