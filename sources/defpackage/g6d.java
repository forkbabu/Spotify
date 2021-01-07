package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.models.Participant;
import com.spotify.music.sociallistening.models.Session;
import defpackage.k6d;

/* renamed from: g6d  reason: default package */
final class g6d extends k6d.b {
    private final ImmutableList<Participant> b;
    private final ImmutableList<Session> c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;

    /* renamed from: g6d$b */
    static final class b extends k6d.b.a {
        private ImmutableList<Participant> a;
        private ImmutableList<Session> b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private Boolean l;
        private Boolean m;

        b() {
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.k6d.b.a
        public k6d.b b() {
            String str = this.a == null ? " participants" : "";
            if (this.b == null) {
                str = je.x0(str, " nearbySessions");
            }
            if (this.c == null) {
                str = je.x0(str, " activeSession");
            }
            if (this.d == null) {
                str = je.x0(str, " isGroupSession");
            }
            if (this.e == null) {
                str = je.x0(str, " sessionShared");
            }
            if (this.f == null) {
                str = je.x0(str, " loadingIndicatorVisible");
            }
            if (this.g == null) {
                str = je.x0(str, " facePileVisible");
            }
            if (this.h == null) {
                str = je.x0(str, " startSessionVisible");
            }
            if (this.i == null) {
                str = je.x0(str, " seeListenersVisible");
            }
            if (this.j == null) {
                str = je.x0(str, " scanCodeButtonVisible");
            }
            if (this.k == null) {
                str = je.x0(str, " leaveButtonVisible");
            }
            if (this.l == null) {
                str = je.x0(str, " endButtonVisible");
            }
            if (this.m == null) {
                str = je.x0(str, " errorVisible");
            }
            if (str.isEmpty()) {
                return new g6d(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a c(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a d(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a e(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a f(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a g(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a h(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a i(ImmutableList<Session> immutableList) {
            if (immutableList != null) {
                this.b = immutableList;
                return this;
            }
            throw new NullPointerException("Null nearbySessions");
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a j(ImmutableList<Participant> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null participants");
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a k(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a l(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a m(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.k6d.b.a
        public k6d.b.a n(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        b(k6d.b bVar, a aVar) {
            this.a = bVar.i();
            this.b = bVar.h();
            this.c = Boolean.valueOf(bVar.a());
            this.d = Boolean.valueOf(bVar.e());
            this.e = Boolean.valueOf(bVar.l());
            this.f = Boolean.valueOf(bVar.g());
            this.g = Boolean.valueOf(bVar.d());
            this.h = Boolean.valueOf(bVar.m());
            this.i = Boolean.valueOf(bVar.k());
            this.j = Boolean.valueOf(bVar.j());
            this.k = Boolean.valueOf(bVar.f());
            this.l = Boolean.valueOf(bVar.b());
            this.m = Boolean.valueOf(bVar.c());
        }
    }

    g6d(ImmutableList immutableList, ImmutableList immutableList2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, a aVar) {
        this.b = immutableList;
        this.c = immutableList2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = z9;
        this.m = z10;
        this.n = z11;
    }

    @Override // defpackage.k6d.b
    public boolean a() {
        return this.d;
    }

    @Override // defpackage.k6d.b
    public boolean b() {
        return this.m;
    }

    @Override // defpackage.k6d.b
    public boolean c() {
        return this.n;
    }

    @Override // defpackage.k6d.b
    public boolean d() {
        return this.h;
    }

    @Override // defpackage.k6d.b
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k6d.b)) {
            return false;
        }
        k6d.b bVar = (k6d.b) obj;
        if (this.b.equals(bVar.i()) && this.c.equals(bVar.h()) && this.d == bVar.a() && this.e == bVar.e() && this.f == bVar.l() && this.g == bVar.g() && this.h == bVar.d() && this.i == bVar.m() && this.j == bVar.k() && this.k == bVar.j() && this.l == bVar.f() && this.m == bVar.b() && this.n == bVar.c()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.k6d.b
    public boolean f() {
        return this.l;
    }

    @Override // defpackage.k6d.b
    public boolean g() {
        return this.g;
    }

    @Override // defpackage.k6d.b
    public ImmutableList<Session> h() {
        return this.c;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003) ^ (this.m ? 1231 : 1237)) * 1000003;
        if (!this.n) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    @Override // defpackage.k6d.b
    public ImmutableList<Participant> i() {
        return this.b;
    }

    @Override // defpackage.k6d.b
    public boolean j() {
        return this.k;
    }

    @Override // defpackage.k6d.b
    public boolean k() {
        return this.j;
    }

    @Override // defpackage.k6d.b
    public boolean l() {
        return this.f;
    }

    @Override // defpackage.k6d.b
    public boolean m() {
        return this.i;
    }

    @Override // defpackage.k6d.b
    public k6d.b.a n() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("UIState{participants=");
        V0.append(this.b);
        V0.append(", nearbySessions=");
        V0.append(this.c);
        V0.append(", activeSession=");
        V0.append(this.d);
        V0.append(", isGroupSession=");
        V0.append(this.e);
        V0.append(", sessionShared=");
        V0.append(this.f);
        V0.append(", loadingIndicatorVisible=");
        V0.append(this.g);
        V0.append(", facePileVisible=");
        V0.append(this.h);
        V0.append(", startSessionVisible=");
        V0.append(this.i);
        V0.append(", seeListenersVisible=");
        V0.append(this.j);
        V0.append(", scanCodeButtonVisible=");
        V0.append(this.k);
        V0.append(", leaveButtonVisible=");
        V0.append(this.l);
        V0.append(", endButtonVisible=");
        V0.append(this.m);
        V0.append(", errorVisible=");
        return je.P0(V0, this.n, "}");
    }
}
