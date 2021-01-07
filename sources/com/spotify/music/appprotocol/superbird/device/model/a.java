package com.spotify.music.appprotocol.superbird.device.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class a extends b {
    private final String a;
    private final long b;
    private final String c;
    private final String d;

    a(String str, long j, String str2, String str3) {
        if (str != null) {
            this.a = str;
            this.b = j;
            if (str2 != null) {
                this.c = str2;
                if (str3 != null) {
                    this.d = str3;
                    return;
                }
                throw new NullPointerException("Null versionOs");
            }
            throw new NullPointerException("Null versionSoftware");
        }
        throw new NullPointerException("Null serial");
    }

    @Override // com.spotify.music.appprotocol.superbird.device.model.b
    @JsonProperty("device_time")
    public long deviceTime() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.serial()) || this.b != bVar.deviceTime() || !this.c.equals(bVar.versionSoftware()) || !this.d.equals(bVar.versionOs())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.b;
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    @Override // com.spotify.music.appprotocol.superbird.device.model.b
    @JsonProperty("serial")
    public String serial() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RegisterDeviceRequest{serial=");
        V0.append(this.a);
        V0.append(", deviceTime=");
        V0.append(this.b);
        V0.append(", versionSoftware=");
        V0.append(this.c);
        V0.append(", versionOs=");
        return je.I0(V0, this.d, "}");
    }

    @Override // com.spotify.music.appprotocol.superbird.device.model.b
    @JsonProperty("version_os")
    public String versionOs() {
        return this.d;
    }

    @Override // com.spotify.music.appprotocol.superbird.device.model.b
    @JsonProperty("version_software")
    public String versionSoftware() {
        return this.c;
    }
}
