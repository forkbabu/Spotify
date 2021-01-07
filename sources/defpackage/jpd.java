package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import defpackage.mpd;

/* renamed from: jpd  reason: default package */
final class jpd extends mpd.b {
    private final String a;
    private final boolean b;
    private final String c;
    private final SpotifyIconV2 d;

    /* access modifiers changed from: package-private */
    /* renamed from: jpd$b */
    public static final class b extends mpd.b.a {
        private String a;
        private Boolean b;
        private String c;
        private SpotifyIconV2 d;

        b() {
        }

        @Override // defpackage.mpd.b.a
        public mpd.b.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.mpd.b.a
        public mpd.b b() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " active");
            }
            if (this.c == null) {
                str = je.x0(str, " title");
            }
            if (this.d == null) {
                str = je.x0(str, " icon");
            }
            if (str.isEmpty()) {
                return new jpd(this.a, this.b.booleanValue(), this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.mpd.b.a
        public mpd.b.a c(SpotifyIconV2 spotifyIconV2) {
            if (spotifyIconV2 != null) {
                this.d = spotifyIconV2;
                return this;
            }
            throw new NullPointerException("Null icon");
        }

        @Override // defpackage.mpd.b.a
        public mpd.b.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // defpackage.mpd.b.a
        public mpd.b.a e(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }
    }

    jpd(String str, boolean z, String str2, SpotifyIconV2 spotifyIconV2, a aVar) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = spotifyIconV2;
    }

    @Override // defpackage.mpd.b
    public boolean a() {
        return this.b;
    }

    @Override // defpackage.mpd.b
    public SpotifyIconV2 c() {
        return this.d;
    }

    @Override // defpackage.mpd.b
    public String d() {
        return this.a;
    }

    @Override // defpackage.mpd.b
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mpd.b)) {
            return false;
        }
        mpd.b bVar = (mpd.b) obj;
        if (!this.a.equals(bVar.d()) || this.b != bVar.a() || !this.c.equals(bVar.e()) || !this.d.equals(bVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("FilterToggle{id=");
        V0.append(this.a);
        V0.append(", active=");
        V0.append(this.b);
        V0.append(", title=");
        V0.append(this.c);
        V0.append(", icon=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }
}
