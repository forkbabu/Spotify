package com.spotify.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class c extends g {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final long g;

    c(String str, String str2, String str3, String str4, String str5, boolean z, long j) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        if (str5 != null) {
                            this.e = str5;
                            this.f = z;
                            this.g = j;
                            return;
                        }
                        throw new NullPointerException("Null hash");
                    }
                    throw new NullPointerException("Null packageName");
                }
                throw new NullPointerException("Null version");
            }
            throw new NullPointerException("Null fromVersion");
        }
        throw new NullPointerException("Null url");
    }

    @Override // com.spotify.superbird.ota.model.g
    @JsonProperty("critical")
    public boolean critical() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.a.equals(gVar.url()) || !this.b.equals(gVar.fromVersion()) || !this.c.equals(gVar.version()) || !this.d.equals(gVar.packageName()) || !this.e.equals(gVar.hash()) || this.f != gVar.critical() || this.g != gVar.sizeBytes()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.superbird.ota.model.g
    @JsonProperty("from_version")
    public String fromVersion() {
        return this.b;
    }

    @Override // com.spotify.superbird.ota.model.g
    @JsonProperty("hash")
    public String hash() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = this.f ? 1231 : 1237;
        long j = this.g;
        return ((hashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.spotify.superbird.ota.model.g
    @JsonProperty("package")
    public String packageName() {
        return this.d;
    }

    @Override // com.spotify.superbird.ota.model.g
    @JsonProperty("size_bytes")
    public long sizeBytes() {
        return this.g;
    }

    public String toString() {
        StringBuilder V0 = je.V0("UpdatableItem{url=");
        V0.append(this.a);
        V0.append(", fromVersion=");
        V0.append(this.b);
        V0.append(", version=");
        V0.append(this.c);
        V0.append(", packageName=");
        V0.append(this.d);
        V0.append(", hash=");
        V0.append(this.e);
        V0.append(", critical=");
        V0.append(this.f);
        V0.append(", sizeBytes=");
        return je.E0(V0, this.g, "}");
    }

    @Override // com.spotify.superbird.ota.model.g
    @JsonProperty("url")
    public String url() {
        return this.a;
    }

    @Override // com.spotify.superbird.ota.model.g
    @JsonProperty("version")
    public String version() {
        return this.c;
    }
}
