package com.spotify.music.nowplaying.drivingmode.view.pivot;

import com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon;
import com.spotify.music.nowplaying.drivingmode.view.pivot.l;
import com.spotify.player.model.ContextIndex;

final class h extends l {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final cfc e;
    private final ContextIndex f;
    private final long g;
    private final String h;
    private final PivotSubtitleIcon i;
    private final boolean j;

    /* access modifiers changed from: package-private */
    public static final class b implements l.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private cfc e;
        private ContextIndex f;
        private Long g;
        private String h;
        private PivotSubtitleIcon i;
        private Boolean j;

        b() {
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l.a
        public l.a a(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l.a
        public l.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l.a
        public l build() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " spaceId");
            }
            if (this.c == null) {
                str = je.x0(str, " title");
            }
            if (this.d == null) {
                str = je.x0(str, " subtitleText");
            }
            if (this.e == null) {
                str = je.x0(str, " contextUri");
            }
            if (this.f == null) {
                str = je.x0(str, " playerContextIndex");
            }
            if (this.g == null) {
                str = je.x0(str, " positionAsOfTimestamp");
            }
            if (this.h == null) {
                str = je.x0(str, " imageUri");
            }
            if (this.i == null) {
                str = je.x0(str, " subtitleIcon");
            }
            if (this.j == null) {
                str = je.x0(str, " isAlwaysOnDemand");
            }
            if (str.isEmpty()) {
                return new h(this.a, this.b, this.c, this.d, this.e, this.f, this.g.longValue(), this.h, this.i, this.j.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l.a
        public l.a c(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l.a
        public l.a d(long j2) {
            this.g = Long.valueOf(j2);
            return this;
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l.a
        public l.a e(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l.a
        public l.a f(PivotSubtitleIcon pivotSubtitleIcon) {
            if (pivotSubtitleIcon != null) {
                this.i = pivotSubtitleIcon;
                return this;
            }
            throw new NullPointerException("Null subtitleIcon");
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l.a
        public l.a g(ContextIndex contextIndex) {
            if (contextIndex != null) {
                this.f = contextIndex;
                return this;
            }
            throw new NullPointerException("Null playerContextIndex");
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l.a
        public l.a h(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null spaceId");
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l.a
        public l.a i(cfc cfc) {
            this.e = cfc;
            return this;
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l.a
        public l.a j(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null subtitleText");
        }
    }

    h(String str, String str2, String str3, String str4, cfc cfc, ContextIndex contextIndex, long j2, String str5, PivotSubtitleIcon pivotSubtitleIcon, boolean z, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = cfc;
        this.f = contextIndex;
        this.g = j2;
        this.h = str5;
        this.i = pivotSubtitleIcon;
        this.j = z;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l
    public cfc b() {
        return this.e;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l
    public String c() {
        return this.a;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l
    public String d() {
        return this.h;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l
    public boolean e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.a.equals(lVar.c()) || !this.b.equals(lVar.h()) || !this.c.equals(lVar.k()) || !this.d.equals(lVar.j()) || !this.e.equals(lVar.b()) || !this.f.equals(lVar.f()) || this.g != lVar.g() || !this.h.equals(lVar.d()) || !this.i.equals(lVar.i()) || this.j != lVar.e()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l
    public ContextIndex f() {
        return this.f;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l
    public long g() {
        return this.g;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l
    public String h() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.g;
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (this.j ? 1231 : 1237);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l
    public PivotSubtitleIcon i() {
        return this.i;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l
    public String j() {
        return this.d;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.l
    public String k() {
        return this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PivotItem{id=");
        V0.append(this.a);
        V0.append(", spaceId=");
        V0.append(this.b);
        V0.append(", title=");
        V0.append(this.c);
        V0.append(", subtitleText=");
        V0.append(this.d);
        V0.append(", contextUri=");
        V0.append(this.e);
        V0.append(", playerContextIndex=");
        V0.append(this.f);
        V0.append(", positionAsOfTimestamp=");
        V0.append(this.g);
        V0.append(", imageUri=");
        V0.append(this.h);
        V0.append(", subtitleIcon=");
        V0.append(this.i);
        V0.append(", isAlwaysOnDemand=");
        return je.P0(V0, this.j, "}");
    }
}
