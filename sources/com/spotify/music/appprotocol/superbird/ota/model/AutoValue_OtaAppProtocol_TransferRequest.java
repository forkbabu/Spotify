package com.spotify.music.appprotocol.superbird.ota.model;

final class AutoValue_OtaAppProtocol_TransferRequest extends OtaAppProtocol$TransferRequest {
    private final int offset;
    private final String packageName;
    private final int size;
    private final String version;

    AutoValue_OtaAppProtocol_TransferRequest(String str, String str2, int i, int i2) {
        if (str != null) {
            this.packageName = str;
            if (str2 != null) {
                this.version = str2;
                this.offset = i;
                this.size = i2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null packageName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OtaAppProtocol$TransferRequest)) {
            return false;
        }
        OtaAppProtocol$TransferRequest otaAppProtocol$TransferRequest = (OtaAppProtocol$TransferRequest) obj;
        if (!this.packageName.equals(otaAppProtocol$TransferRequest.packageName()) || !this.version.equals(otaAppProtocol$TransferRequest.version()) || this.offset != otaAppProtocol$TransferRequest.offset() || this.size != otaAppProtocol$TransferRequest.size()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.packageName.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode()) * 1000003) ^ this.offset) * 1000003) ^ this.size;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$TransferRequest
    public int offset() {
        return this.offset;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$TransferRequest
    public String packageName() {
        return this.packageName;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$TransferRequest
    public int size() {
        return this.size;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TransferRequest{packageName=");
        V0.append(this.packageName);
        V0.append(", version=");
        V0.append(this.version);
        V0.append(", offset=");
        V0.append(this.offset);
        V0.append(", size=");
        return je.B0(V0, this.size, "}");
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$TransferRequest
    public String version() {
        return this.version;
    }
}
