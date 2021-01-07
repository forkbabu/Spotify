package defpackage;

import com.spotify.playlist.models.Show;
import defpackage.ryd;
import java.util.List;

/* renamed from: jyd  reason: default package */
final class jyd extends ryd {
    private final List<Show> a;
    private final boolean b;
    private final int c;
    private final int f;
    private final int n;

    /* access modifiers changed from: package-private */
    /* renamed from: jyd$b */
    public static final class b implements ryd.a {
        private List<Show> a;
        private Boolean b;
        private Integer c;
        private Integer d;
        private Integer e;

        b() {
        }

        @Override // defpackage.ryd.a
        public ryd.a a(List<Show> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        @Override // defpackage.ryd.a
        public ryd.a b(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.ryd.a
        public ryd build() {
            String str = this.a == null ? " items" : "";
            if (this.b == null) {
                str = je.x0(str, " loading");
            }
            if (this.c == null) {
                str = je.x0(str, " unfilteredLength");
            }
            if (this.d == null) {
                str = je.x0(str, " unrangedLength");
            }
            if (this.e == null) {
                str = je.x0(str, " numOfflinedEpisodes");
            }
            if (str.isEmpty()) {
                return new jyd(this.a, this.b.booleanValue(), this.c.intValue(), this.d.intValue(), this.e.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.ryd.a
        public ryd.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.ryd.a
        public ryd.a d(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.ryd.a
        public ryd.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }
    }

    jyd(List list, boolean z, int i, int i2, int i3, a aVar) {
        this.a = list;
        this.b = z;
        this.c = i;
        this.f = i2;
        this.n = i3;
    }

    @Override // defpackage.ryd
    public int b() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ryd)) {
            return false;
        }
        ryd ryd = (ryd) obj;
        if (this.a.equals(((jyd) ryd).a)) {
            jyd jyd = (jyd) ryd;
            if (this.b == jyd.b && this.c == jyd.c && this.f == jyd.f && this.n == ryd.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.playlist.models.i
    public List<Show> getItems() {
        return this.a;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnfilteredLength() {
        return this.c;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnrangedLength() {
        return this.f;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c) * 1000003) ^ this.f) * 1000003) ^ this.n;
    }

    @Override // com.spotify.playlist.models.i
    public boolean isLoading() {
        return this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Shows{items=");
        V0.append(this.a);
        V0.append(", loading=");
        V0.append(this.b);
        V0.append(", unfilteredLength=");
        V0.append(this.c);
        V0.append(", unrangedLength=");
        V0.append(this.f);
        V0.append(", numOfflinedEpisodes=");
        return je.B0(V0, this.n, "}");
    }
}
