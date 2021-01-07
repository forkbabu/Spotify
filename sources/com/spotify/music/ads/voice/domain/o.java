package com.spotify.music.ads.voice.domain;

/* access modifiers changed from: package-private */
public final class o extends u {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final String f;
    private final String g;
    private final long h;

    o(String str, String str2, String str3, String str4, long j, String str5, String str6, long j2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = j;
                        if (str5 != null) {
                            this.f = str5;
                            if (str6 != null) {
                                this.g = str6;
                                this.h = j2;
                                return;
                            }
                            throw new NullPointerException("Null actionUri");
                        }
                        throw new NullPointerException("Null intents");
                    }
                    throw new NullPointerException("Null adPlaybackId");
                }
                throw new NullPointerException("Null creativeId");
            }
            throw new NullPointerException("Null lineItemId");
        }
        throw new NullPointerException("Null adId");
    }

    @Override // com.spotify.music.ads.voice.domain.u
    public String a() {
        return this.g;
    }

    @Override // com.spotify.music.ads.voice.domain.u
    public String b() {
        return this.a;
    }

    @Override // com.spotify.music.ads.voice.domain.u
    public String c() {
        return this.d;
    }

    @Override // com.spotify.music.ads.voice.domain.u
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.a.equals(uVar.b()) || !this.b.equals(uVar.g()) || !this.c.equals(uVar.e()) || !this.d.equals(uVar.c()) || this.e != uVar.h() || !this.f.equals(uVar.f()) || !this.g.equals(uVar.a()) || this.h != uVar.i()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.ads.voice.domain.u
    public String f() {
        return this.f;
    }

    @Override // com.spotify.music.ads.voice.domain.u
    public String g() {
        return this.b;
    }

    @Override // com.spotify.music.ads.voice.domain.u
    public long h() {
        return this.e;
    }

    public int hashCode() {
        long j = this.e;
        long j2 = this.h;
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.spotify.music.ads.voice.domain.u
    public long i() {
        return this.h;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceAdMetadata{adId=");
        V0.append(this.a);
        V0.append(", lineItemId=");
        V0.append(this.b);
        V0.append(", creativeId=");
        V0.append(this.c);
        V0.append(", adPlaybackId=");
        V0.append(this.d);
        V0.append(", microphoneDelay=");
        V0.append(this.e);
        V0.append(", intents=");
        V0.append(this.f);
        V0.append(", actionUri=");
        V0.append(this.g);
        V0.append(", microphoneListeningPeriod=");
        return je.E0(V0, this.h, "}");
    }
}
