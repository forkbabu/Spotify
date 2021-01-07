package com.spotify.music.appprotocol.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_OtaAppProtocol_PackageState extends OtaAppProtocol$PackageState {
    private final String hash;
    private final String packageName;
    private final long size;
    private final String state;
    private final String version;

    AutoValue_OtaAppProtocol_PackageState(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.state = str;
            if (str2 != null) {
                this.packageName = str2;
                if (str3 != null) {
                    this.version = str3;
                    if (str4 != null) {
                        this.hash = str4;
                        this.size = j;
                        return;
                    }
                    throw new NullPointerException("Null hash");
                }
                throw new NullPointerException("Null version");
            }
            throw new NullPointerException("Null packageName");
        }
        throw new NullPointerException("Null state");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OtaAppProtocol$PackageState)) {
            return false;
        }
        OtaAppProtocol$PackageState otaAppProtocol$PackageState = (OtaAppProtocol$PackageState) obj;
        if (!this.state.equals(otaAppProtocol$PackageState.state()) || !this.packageName.equals(otaAppProtocol$PackageState.packageName()) || !this.version.equals(otaAppProtocol$PackageState.version()) || !this.hash.equals(otaAppProtocol$PackageState.hash()) || this.size != otaAppProtocol$PackageState.size()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$PackageState
    @JsonProperty("hash")
    public String hash() {
        return this.hash;
    }

    public int hashCode() {
        long j = this.size;
        return ((((((((this.state.hashCode() ^ 1000003) * 1000003) ^ this.packageName.hashCode()) * 1000003) ^ this.version.hashCode()) * 1000003) ^ this.hash.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$PackageState
    @JsonProperty("name")
    public String packageName() {
        return this.packageName;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$PackageState
    @JsonProperty("size")
    public long size() {
        return this.size;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$PackageState
    @JsonProperty("state")
    public String state() {
        return this.state;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PackageState{state=");
        V0.append(this.state);
        V0.append(", packageName=");
        V0.append(this.packageName);
        V0.append(", version=");
        V0.append(this.version);
        V0.append(", hash=");
        V0.append(this.hash);
        V0.append(", size=");
        return je.E0(V0, this.size, "}");
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$PackageState
    @JsonProperty("version")
    public String version() {
        return this.version;
    }
}
