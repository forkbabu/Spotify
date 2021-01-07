package com.spotify.music.appprotocol.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_OtaAppProtocol_CheckForUpdatesResponseItem extends OtaAppProtocol$CheckForUpdatesResponseItem {
    private final boolean autoUpdatable;
    private final boolean critical;
    private final String hash;
    private final String packageName;
    private final long sizeBytes;
    private final String url;
    private final String version;

    AutoValue_OtaAppProtocol_CheckForUpdatesResponseItem(String str, String str2, String str3, String str4, boolean z, long j, boolean z2) {
        if (str != null) {
            this.version = str;
            if (str2 != null) {
                this.packageName = str2;
                if (str3 != null) {
                    this.hash = str3;
                    if (str4 != null) {
                        this.url = str4;
                        this.critical = z;
                        this.sizeBytes = j;
                        this.autoUpdatable = z2;
                        return;
                    }
                    throw new NullPointerException("Null url");
                }
                throw new NullPointerException("Null hash");
            }
            throw new NullPointerException("Null packageName");
        }
        throw new NullPointerException("Null version");
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesResponseItem
    @JsonProperty("auto_updatable")
    public boolean autoUpdatable() {
        return this.autoUpdatable;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesResponseItem
    @JsonProperty("critical")
    public boolean critical() {
        return this.critical;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OtaAppProtocol$CheckForUpdatesResponseItem)) {
            return false;
        }
        OtaAppProtocol$CheckForUpdatesResponseItem otaAppProtocol$CheckForUpdatesResponseItem = (OtaAppProtocol$CheckForUpdatesResponseItem) obj;
        if (!this.version.equals(otaAppProtocol$CheckForUpdatesResponseItem.version()) || !this.packageName.equals(otaAppProtocol$CheckForUpdatesResponseItem.packageName()) || !this.hash.equals(otaAppProtocol$CheckForUpdatesResponseItem.hash()) || !this.url.equals(otaAppProtocol$CheckForUpdatesResponseItem.url()) || this.critical != otaAppProtocol$CheckForUpdatesResponseItem.critical() || this.sizeBytes != otaAppProtocol$CheckForUpdatesResponseItem.sizeBytes() || this.autoUpdatable != otaAppProtocol$CheckForUpdatesResponseItem.autoUpdatable()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesResponseItem
    @JsonProperty("hash")
    public String hash() {
        return this.hash;
    }

    public int hashCode() {
        int hashCode = (((((((this.version.hashCode() ^ 1000003) * 1000003) ^ this.packageName.hashCode()) * 1000003) ^ this.hash.hashCode()) * 1000003) ^ this.url.hashCode()) * 1000003;
        int i = 1231;
        int i2 = this.critical ? 1231 : 1237;
        long j = this.sizeBytes;
        int i3 = (((hashCode ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        if (!this.autoUpdatable) {
            i = 1237;
        }
        return i3 ^ i;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesResponseItem
    @JsonProperty("name")
    public String packageName() {
        return this.packageName;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesResponseItem
    @JsonProperty("size_bytes")
    public long sizeBytes() {
        return this.sizeBytes;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CheckForUpdatesResponseItem{version=");
        V0.append(this.version);
        V0.append(", packageName=");
        V0.append(this.packageName);
        V0.append(", hash=");
        V0.append(this.hash);
        V0.append(", url=");
        V0.append(this.url);
        V0.append(", critical=");
        V0.append(this.critical);
        V0.append(", sizeBytes=");
        V0.append(this.sizeBytes);
        V0.append(", autoUpdatable=");
        return je.P0(V0, this.autoUpdatable, "}");
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesResponseItem
    @JsonProperty("url")
    public String url() {
        return this.url;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesResponseItem
    @JsonProperty("version")
    public String version() {
        return this.version;
    }
}
