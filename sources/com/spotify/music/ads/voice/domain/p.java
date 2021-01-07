package com.spotify.music.ads.voice.domain;

import com.spotify.music.ads.voice.domain.v;

final class p extends v {
    private final w a;
    private final u b;
    private final int c;
    private final String d;
    private final boolean e;
    private final boolean f;

    /* access modifiers changed from: package-private */
    public static final class b extends v.a {
        private w a;
        private u b;
        private Integer c;
        private String d;
        private Boolean e;
        private Boolean f;

        b() {
        }

        @Override // com.spotify.music.ads.voice.domain.v.a
        public v a() {
            String str = this.a == null ? " voiceState" : "";
            if (this.b == null) {
                str = je.x0(str, " voiceAdMetadata");
            }
            if (this.c == null) {
                str = je.x0(str, " timerId");
            }
            if (this.d == null) {
                str = je.x0(str, " sessionId");
            }
            if (this.e == null) {
                str = je.x0(str, " speechReceivedEventLogged");
            }
            if (this.f == null) {
                str = je.x0(str, " shouldAudioSignalActivateMic");
            }
            if (str.isEmpty()) {
                return new p(this.a, this.b, this.c.intValue(), this.d, this.e.booleanValue(), this.f.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.ads.voice.domain.v.a
        public v.a b(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        @Override // com.spotify.music.ads.voice.domain.v.a
        public v.a c(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.ads.voice.domain.v.a
        public v.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.ads.voice.domain.v.a
        public v.a e(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.ads.voice.domain.v.a
        public v.a f(u uVar) {
            this.b = uVar;
            return this;
        }

        @Override // com.spotify.music.ads.voice.domain.v.a
        public v.a g(w wVar) {
            if (wVar != null) {
                this.a = wVar;
                return this;
            }
            throw new NullPointerException("Null voiceState");
        }

        b(v vVar, a aVar) {
            this.a = vVar.h();
            this.b = vVar.g();
            this.c = Integer.valueOf(vVar.e());
            this.d = vVar.b();
            this.e = Boolean.valueOf(vVar.d());
            this.f = Boolean.valueOf(vVar.c());
        }
    }

    p(w wVar, u uVar, int i, String str, boolean z, boolean z2, a aVar) {
        this.a = wVar;
        this.b = uVar;
        this.c = i;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    @Override // com.spotify.music.ads.voice.domain.v
    public String b() {
        return this.d;
    }

    @Override // com.spotify.music.ads.voice.domain.v
    public boolean c() {
        return this.f;
    }

    @Override // com.spotify.music.ads.voice.domain.v
    public boolean d() {
        return this.e;
    }

    @Override // com.spotify.music.ads.voice.domain.v
    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.a.equals(vVar.h()) || !this.b.equals(vVar.g()) || this.c != vVar.e() || !this.d.equals(vVar.b()) || this.e != vVar.d() || this.f != vVar.c()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.ads.voice.domain.v
    public v.a f() {
        return new b(this, null);
    }

    @Override // com.spotify.music.ads.voice.domain.v
    public u g() {
        return this.b;
    }

    @Override // com.spotify.music.ads.voice.domain.v
    public w h() {
        return this.a;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceAdModel{voiceState=");
        V0.append(this.a);
        V0.append(", voiceAdMetadata=");
        V0.append(this.b);
        V0.append(", timerId=");
        V0.append(this.c);
        V0.append(", sessionId=");
        V0.append(this.d);
        V0.append(", speechReceivedEventLogged=");
        V0.append(this.e);
        V0.append(", shouldAudioSignalActivateMic=");
        return je.P0(V0, this.f, "}");
    }
}
