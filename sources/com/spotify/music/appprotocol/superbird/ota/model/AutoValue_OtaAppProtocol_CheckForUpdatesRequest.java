package com.spotify.music.appprotocol.superbird.ota.model;

import com.spotify.superbird.ota.model.VersionedPackage;
import java.util.List;

final class AutoValue_OtaAppProtocol_CheckForUpdatesRequest extends OtaAppProtocol$CheckForUpdatesRequest {
    private final boolean firstTime;
    private final List<VersionedPackage> packages;
    private final String serial;

    AutoValue_OtaAppProtocol_CheckForUpdatesRequest(String str, List<VersionedPackage> list, boolean z) {
        if (str != null) {
            this.serial = str;
            if (list != null) {
                this.packages = list;
                this.firstTime = z;
                return;
            }
            throw new NullPointerException("Null packages");
        }
        throw new NullPointerException("Null serial");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OtaAppProtocol$CheckForUpdatesRequest)) {
            return false;
        }
        OtaAppProtocol$CheckForUpdatesRequest otaAppProtocol$CheckForUpdatesRequest = (OtaAppProtocol$CheckForUpdatesRequest) obj;
        if (!this.serial.equals(otaAppProtocol$CheckForUpdatesRequest.serial()) || !this.packages.equals(otaAppProtocol$CheckForUpdatesRequest.packages()) || this.firstTime != otaAppProtocol$CheckForUpdatesRequest.firstTime()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesRequest
    public boolean firstTime() {
        return this.firstTime;
    }

    public int hashCode() {
        return ((((this.serial.hashCode() ^ 1000003) * 1000003) ^ this.packages.hashCode()) * 1000003) ^ (this.firstTime ? 1231 : 1237);
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesRequest
    public List<VersionedPackage> packages() {
        return this.packages;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesRequest
    public String serial() {
        return this.serial;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CheckForUpdatesRequest{serial=");
        V0.append(this.serial);
        V0.append(", packages=");
        V0.append(this.packages);
        V0.append(", firstTime=");
        return je.P0(V0, this.firstTime, "}");
    }
}
