package defpackage;

import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import defpackage.qyd;
import java.util.List;

/* renamed from: iyd  reason: default package */
final class iyd extends qyd {
    private final List<Episode> a;
    private final boolean b;
    private final int c;
    private final int f;
    private final Show n;
    private final nyd o;
    private final lyd p;
    private final syd q;
    private final pyd r;
    private final myd s;

    /* access modifiers changed from: package-private */
    /* renamed from: iyd$b */
    public static final class b implements qyd.a {
        private List<Episode> a;
        private Boolean b;
        private Integer c;
        private Integer d;
        private Show e;
        private nyd f;
        private lyd g;
        private syd h;
        private pyd i;
        private myd j;

        b() {
        }

        @Override // defpackage.qyd.a
        public qyd.a a(List<Episode> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        @Override // defpackage.qyd.a
        public qyd.a b(int i2) {
            this.d = Integer.valueOf(i2);
            return this;
        }

        @Override // defpackage.qyd.a
        public qyd build() {
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
                str = je.x0(str, " header");
            }
            if (str.isEmpty()) {
                return new iyd(this.a, this.b.booleanValue(), this.c.intValue(), this.d.intValue(), this.e, this.f, this.g, this.h, this.i, this.j, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.qyd.a
        public qyd.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.qyd.a
        public qyd.a d(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        @Override // defpackage.qyd.a
        public qyd.a e(pyd pyd) {
            this.i = pyd;
            return this;
        }

        @Override // defpackage.qyd.a
        public qyd.a f(lyd lyd) {
            this.g = lyd;
            return this;
        }

        @Override // defpackage.qyd.a
        public qyd.a g(syd syd) {
            this.h = syd;
            return this;
        }

        @Override // defpackage.qyd.a
        public qyd.a h(Show show) {
            this.e = show;
            return this;
        }

        @Override // defpackage.qyd.a
        public qyd.a i(myd myd) {
            this.j = myd;
            return this;
        }

        @Override // defpackage.qyd.a
        public qyd.a j(nyd nyd) {
            this.f = nyd;
            return this;
        }
    }

    iyd(List list, boolean z, int i, int i2, Show show, nyd nyd, lyd lyd, syd syd, pyd pyd, myd myd, a aVar) {
        this.a = list;
        this.b = z;
        this.c = i;
        this.f = i2;
        this.n = show;
        this.o = nyd;
        this.p = lyd;
        this.q = syd;
        this.r = pyd;
        this.s = myd;
    }

    @Override // defpackage.qyd
    public lyd c() {
        return this.p;
    }

    @Override // defpackage.qyd
    public Show d() {
        return this.n;
    }

    @Override // defpackage.qyd
    public myd e() {
        return this.s;
    }

    public boolean equals(Object obj) {
        nyd nyd;
        lyd lyd;
        syd syd;
        pyd pyd;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qyd)) {
            return false;
        }
        qyd qyd = (qyd) obj;
        if (this.a.equals(((iyd) qyd).a)) {
            iyd iyd = (iyd) qyd;
            if (this.b == iyd.b && this.c == iyd.c && this.f == iyd.f && this.n.equals(qyd.d()) && ((nyd = this.o) != null ? nyd.equals(qyd.f()) : qyd.f() == null) && ((lyd = this.p) != null ? lyd.equals(qyd.c()) : qyd.c() == null) && ((syd = this.q) != null ? syd.equals(qyd.h()) : qyd.h() == null) && ((pyd = this.r) != null ? pyd.equals(qyd.g()) : qyd.g() == null)) {
                myd myd = this.s;
                if (myd == null) {
                    if (qyd.e() == null) {
                        return true;
                    }
                } else if (myd.equals(qyd.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qyd
    public nyd f() {
        return this.o;
    }

    @Override // defpackage.qyd
    public pyd g() {
        return this.r;
    }

    @Override // com.spotify.playlist.models.i
    public List<Episode> getItems() {
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

    @Override // defpackage.qyd
    public syd h() {
        return this.q;
    }

    public int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c) * 1000003) ^ this.f) * 1000003) ^ this.n.hashCode()) * 1000003;
        nyd nyd = this.o;
        int i = 0;
        int hashCode2 = (hashCode ^ (nyd == null ? 0 : nyd.hashCode())) * 1000003;
        lyd lyd = this.p;
        int hashCode3 = (hashCode2 ^ (lyd == null ? 0 : lyd.hashCode())) * 1000003;
        syd syd = this.q;
        int hashCode4 = (hashCode3 ^ (syd == null ? 0 : syd.hashCode())) * 1000003;
        pyd pyd = this.r;
        int hashCode5 = (hashCode4 ^ (pyd == null ? 0 : pyd.hashCode())) * 1000003;
        myd myd = this.s;
        if (myd != null) {
            i = myd.hashCode();
        }
        return hashCode5 ^ i;
    }

    @Override // com.spotify.playlist.models.i
    public boolean isLoading() {
        return this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShowEntity{items=");
        V0.append(this.a);
        V0.append(", loading=");
        V0.append(this.b);
        V0.append(", unfilteredLength=");
        V0.append(this.c);
        V0.append(", unrangedLength=");
        V0.append(this.f);
        V0.append(", header=");
        V0.append(this.n);
        V0.append(", onlineData=");
        V0.append(this.o);
        V0.append(", continueListeningSection=");
        V0.append(this.p);
        V0.append(", trailerSection=");
        V0.append(this.q);
        V0.append(", podcastTopics=");
        V0.append(this.r);
        V0.append(", htmlDescriptionSection=");
        V0.append(this.s);
        V0.append("}");
        return V0.toString();
    }
}
