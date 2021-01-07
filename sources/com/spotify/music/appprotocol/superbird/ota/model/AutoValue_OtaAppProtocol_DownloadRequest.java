package com.spotify.music.appprotocol.superbird.ota.model;

final class AutoValue_OtaAppProtocol_DownloadRequest extends OtaAppProtocol$DownloadRequest {
    private final boolean critical;
    private final String fromVersion;
    private final String hash;
    private final String networkType;
    private final String packageName;
    private final long size;
    private final String url;
    private final String version;

    AutoValue_OtaAppProtocol_DownloadRequest(String str, String str2, String str3, boolean z, String str4, String str5, long j, String str6) {
        if (str != null) {
            this.packageName = str;
            if (str2 != null) {
                this.fromVersion = str2;
                if (str3 != null) {
                    this.version = str3;
                    this.critical = z;
                    if (str4 != null) {
                        this.url = str4;
                        if (str5 != null) {
                            this.hash = str5;
                            this.size = j;
                            if (str6 != null) {
                                this.networkType = str6;
                                return;
                            }
                            throw new NullPointerException("Null networkType");
                        }
                        throw new NullPointerException("Null hash");
                    }
                    throw new NullPointerException("Null url");
                }
                throw new NullPointerException("Null version");
            }
            throw new NullPointerException("Null fromVersion");
        }
        throw new NullPointerException("Null packageName");
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$DownloadRequest
    public boolean critical() {
        return this.critical;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OtaAppProtocol$DownloadRequest)) {
            return false;
        }
        OtaAppProtocol$DownloadRequest otaAppProtocol$DownloadRequest = (OtaAppProtocol$DownloadRequest) obj;
        if (!this.packageName.equals(otaAppProtocol$DownloadRequest.packageName()) || !this.fromVersion.equals(otaAppProtocol$DownloadRequest.fromVersion()) || !this.version.equals(otaAppProtocol$DownloadRequest.version()) || this.critical != otaAppProtocol$DownloadRequest.critical() || !this.url.equals(otaAppProtocol$DownloadRequest.url()) || !this.hash.equals(otaAppProtocol$DownloadRequest.hash()) || this.size != otaAppProtocol$DownloadRequest.size() || !this.networkType.equals(otaAppProtocol$DownloadRequest.networkType())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$DownloadRequest
    public String fromVersion() {
        return this.fromVersion;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$DownloadRequest
    public String hash() {
        return this.hash;
    }

    public int hashCode() {
        int hashCode = (((((this.packageName.hashCode() ^ 1000003) * 1000003) ^ this.fromVersion.hashCode()) * 1000003) ^ this.version.hashCode()) * 1000003;
        int i = this.critical ? 1231 : 1237;
        long j = this.size;
        return ((((((((hashCode ^ i) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.hash.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.networkType.hashCode();
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$DownloadRequest
    public String networkType() {
        return this.networkType;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$DownloadRequest
    public String packageName() {
        return this.packageName;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$DownloadRequest
    public long size() {
        return this.size;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DownloadRequest{packageName=");
        V0.append(this.packageName);
        V0.append(", fromVersion=");
        V0.append(this.fromVersion);
        V0.append(", version=");
        V0.append(this.version);
        V0.append(", critical=");
        V0.append(this.critical);
        V0.append(", url=");
        V0.append(this.url);
        V0.append(", hash=");
        V0.append(this.hash);
        V0.append(", size=");
        V0.append(this.size);
        V0.append(", networkType=");
        return je.I0(V0, this.networkType, "}");
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$DownloadRequest
    public String url() {
        return this.url;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$DownloadRequest
    public String version() {
        return this.version;
    }
}
