package defpackage;

import defpackage.ff0;
import java.util.Date;

/* renamed from: bf0  reason: default package */
final class bf0 extends ff0 {
    private final int a;
    private final int b;
    private final Date c;
    private final boolean d;
    private final boolean e;

    /* access modifiers changed from: package-private */
    /* renamed from: bf0$b */
    public static final class b extends ff0.a {
        private Integer a;
        private Integer b;
        private Date c;
        private Boolean d;
        private Boolean e;

        b() {
        }

        @Override // defpackage.ff0.a
        public ff0 a() {
            String str = this.a == null ? " lengthInSeconds" : "";
            if (this.b == null) {
                str = je.x0(str, " timeLeftInSeconds");
            }
            if (this.c == null) {
                str = je.x0(str, " publicationDate");
            }
            if (this.d == null) {
                str = je.x0(str, " currentlyPlaying");
            }
            if (this.e == null) {
                str = je.x0(str, " fullyPlayed");
            }
            if (str.isEmpty()) {
                return new bf0(this.a.intValue(), this.b.intValue(), this.c, this.d.booleanValue(), this.e.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.ff0.a
        public ff0.a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.ff0.a
        public ff0.a c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.ff0.a
        public ff0.a d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.ff0.a
        public ff0.a e(Date date) {
            this.c = date;
            return this;
        }

        @Override // defpackage.ff0.a
        public ff0.a f(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    bf0(int i, int i2, Date date, boolean z, boolean z2, a aVar) {
        this.a = i;
        this.b = i2;
        this.c = date;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.ff0
    public boolean b() {
        return this.d;
    }

    @Override // defpackage.ff0
    public boolean c() {
        return this.e;
    }

    @Override // defpackage.ff0
    public int d() {
        return this.a;
    }

    @Override // defpackage.ff0
    public Date e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ff0)) {
            return false;
        }
        ff0 ff0 = (ff0) obj;
        if (this.a == ff0.d() && this.b == ff0.f() && this.c.equals(ff0.e()) && this.d == ff0.b() && this.e == ff0.c()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ff0
    public int f() {
        return this.b;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastEpisodeSubtitleInformation{lengthInSeconds=");
        V0.append(this.a);
        V0.append(", timeLeftInSeconds=");
        V0.append(this.b);
        V0.append(", publicationDate=");
        V0.append(this.c);
        V0.append(", currentlyPlaying=");
        V0.append(this.d);
        V0.append(", fullyPlayed=");
        return je.P0(V0, this.e, "}");
    }
}
