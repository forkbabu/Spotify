package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.music.nowplaying.drivingmode.presenter.pivot.r0;

/* access modifiers changed from: package-private */
public final class i0 extends r0 {
    private final String a;
    private final PivotSubtitleIcon b;
    private final boolean c;

    /* access modifiers changed from: package-private */
    public static final class b implements r0.a {
        private String a;
        private PivotSubtitleIcon b;
        private Boolean c;

        b() {
        }

        public r0 a() {
            String str = this.a == null ? " subtitleText" : "";
            if (this.b == null) {
                str = je.x0(str, " subtitleIcon");
            }
            if (this.c == null) {
                str = je.x0(str, " isAlwaysOnDemand");
            }
            if (str.isEmpty()) {
                return new i0(this.a, this.b, this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public r0.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public r0.a c(PivotSubtitleIcon pivotSubtitleIcon) {
            this.b = pivotSubtitleIcon;
            return this;
        }

        public r0.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null subtitleText");
        }
    }

    i0(String str, PivotSubtitleIcon pivotSubtitleIcon, boolean z, a aVar) {
        this.a = str;
        this.b = pivotSubtitleIcon;
        this.c = z;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.presenter.pivot.r0
    public boolean a() {
        return this.c;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.presenter.pivot.r0
    public PivotSubtitleIcon b() {
        return this.b;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.presenter.pivot.r0
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (!this.a.equals(r0Var.c()) || !this.b.equals(r0Var.b()) || this.c != r0Var.a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PivotSubtitleContent{subtitleText=");
        V0.append(this.a);
        V0.append(", subtitleIcon=");
        V0.append(this.b);
        V0.append(", isAlwaysOnDemand=");
        return je.P0(V0, this.c, "}");
    }
}
