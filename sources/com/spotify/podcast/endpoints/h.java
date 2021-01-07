package com.spotify.podcast.endpoints;

import com.google.common.base.Optional;
import com.spotify.podcast.endpoints.policy.ShowPolicy;
import com.spotify.podcast.endpoints.x;

final class h extends x.a {
    private final int a;
    private final Optional<ShowPolicy> b;
    private final Optional<Boolean> c;
    private final Optional<Boolean> d;
    private final Optional<Boolean> e;
    private final Optional<Boolean> f;
    private final Optional<Boolean> g;
    private final Optional<ane> h;
    private final Optional<Boolean> i;
    private final Optional<Integer> j;
    private final Optional<Integer> k;
    private final Optional<Double> l;
    private final Optional<Integer> m;
    private final Optional<String> n;
    private final Optional<Integer> o;
    private final Optional<String> p;
    private final Optional<r> q;

    h(int i2, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, Optional optional13, Optional optional14, Optional optional15, Optional optional16, a aVar) {
        this.a = i2;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
        this.f = optional5;
        this.g = optional6;
        this.h = optional7;
        this.i = optional8;
        this.j = optional9;
        this.k = optional10;
        this.l = optional11;
        this.m = optional12;
        this.n = optional13;
        this.o = optional14;
        this.p = optional15;
        this.q = optional16;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<Integer> a() {
        return this.m;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<Boolean> d() {
        return this.i;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<Boolean> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x.a)) {
            return false;
        }
        x.a aVar = (x.a) obj;
        if (this.a != aVar.s() || !this.b.equals(aVar.k()) || !this.c.equals(aVar.h()) || !this.d.equals(aVar.i()) || !this.e.equals(aVar.r()) || !this.f.equals(aVar.e()) || !this.g.equals(aVar.t()) || !this.h.equals(aVar.n()) || !this.i.equals(aVar.d()) || !this.j.equals(aVar.p()) || !this.k.equals(aVar.j()) || !this.l.equals(aVar.m()) || !this.m.equals(aVar.a()) || !this.n.equals(aVar.f()) || !this.o.equals(aVar.g()) || !this.p.equals(aVar.o()) || !this.q.equals(aVar.l())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<String> f() {
        return this.n;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<Integer> g() {
        return this.o;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<Boolean> h() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode();
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<Boolean> i() {
        return this.d;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<Integer> j() {
        return this.k;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<ShowPolicy> k() {
        return this.b;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<r> l() {
        return this.q;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<Double> m() {
        return this.l;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<ane> n() {
        return this.h;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<String> o() {
        return this.p;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<Integer> p() {
        return this.j;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public x.a.AbstractC0383a q() {
        return new b(this, null);
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<Boolean> r() {
        return this.e;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public int s() {
        return this.a;
    }

    @Override // com.spotify.podcast.endpoints.x.a
    public Optional<Boolean> t() {
        return this.g;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Configuration{updateThrottling=");
        V0.append(this.a);
        V0.append(", policy=");
        V0.append(this.b);
        V0.append(", isAvailable=");
        V0.append(this.c);
        V0.append(", isAvailableOffline=");
        V0.append(this.d);
        V0.append(", unheardOnly=");
        V0.append(this.e);
        V0.append(", inCollectionOnly=");
        V0.append(this.f);
        V0.append(", videoEpisodes=");
        V0.append(this.g);
        V0.append(", sortOrder=");
        V0.append(this.h);
        V0.append(", hasTimeLeft=");
        V0.append(this.i);
        V0.append(", timePlayedInSec=");
        V0.append(this.j);
        V0.append(", lastPlayedInDays=");
        V0.append(this.k);
        V0.append(", relativeTimeLeftInPct=");
        V0.append(this.l);
        V0.append(", absoluteTimeLeftInSec=");
        V0.append(this.m);
        V0.append(", includeInRange=");
        V0.append(this.n);
        V0.append(", includeInRangeContext=");
        V0.append(this.o);
        V0.append(", textFilter=");
        V0.append(this.p);
        V0.append(", range=");
        return je.F0(V0, this.q, "}");
    }

    /* access modifiers changed from: package-private */
    public static final class b implements x.a.AbstractC0383a {
        private Integer a;
        private Optional<ShowPolicy> b = Optional.absent();
        private Optional<Boolean> c = Optional.absent();
        private Optional<Boolean> d = Optional.absent();
        private Optional<Boolean> e = Optional.absent();
        private Optional<Boolean> f = Optional.absent();
        private Optional<Boolean> g = Optional.absent();
        private Optional<ane> h = Optional.absent();
        private Optional<Boolean> i = Optional.absent();
        private Optional<Integer> j = Optional.absent();
        private Optional<Integer> k = Optional.absent();
        private Optional<Double> l = Optional.absent();
        private Optional<Integer> m = Optional.absent();
        private Optional<String> n = Optional.absent();
        private Optional<Integer> o = Optional.absent();
        private Optional<String> p = Optional.absent();
        private Optional<r> q = Optional.absent();

        b() {
        }

        @Override // com.spotify.podcast.endpoints.x.a.AbstractC0383a
        public x.a.AbstractC0383a a(Optional<ane> optional) {
            this.h = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.x.a.AbstractC0383a
        public x.a.AbstractC0383a b(Optional<ShowPolicy> optional) {
            this.b = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.x.a.AbstractC0383a
        public x.a build() {
            String str = this.a == null ? " updateThrottling" : "";
            if (str.isEmpty()) {
                return new h(this.a.intValue(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.podcast.endpoints.x.a.AbstractC0383a
        public x.a.AbstractC0383a c(Optional<Boolean> optional) {
            this.c = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.x.a.AbstractC0383a
        public x.a.AbstractC0383a d(Optional<r> optional) {
            this.q = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.x.a.AbstractC0383a
        public x.a.AbstractC0383a e(Optional<String> optional) {
            this.n = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.x.a.AbstractC0383a
        public x.a.AbstractC0383a f(Optional<Boolean> optional) {
            this.f = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.x.a.AbstractC0383a
        public x.a.AbstractC0383a g(Optional<Boolean> optional) {
            this.e = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.x.a.AbstractC0383a
        public x.a.AbstractC0383a h(Optional<Integer> optional) {
            this.o = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.x.a.AbstractC0383a
        public x.a.AbstractC0383a i(Optional<Boolean> optional) {
            this.d = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.x.a.AbstractC0383a
        public x.a.AbstractC0383a j(Optional<Boolean> optional) {
            this.g = optional;
            return this;
        }

        public x.a.AbstractC0383a k(Optional<Integer> optional) {
            this.m = optional;
            return this;
        }

        public x.a.AbstractC0383a l(Optional<Boolean> optional) {
            this.i = optional;
            return this;
        }

        public x.a.AbstractC0383a m(Optional<Integer> optional) {
            this.k = optional;
            return this;
        }

        public x.a.AbstractC0383a n(Optional<Double> optional) {
            this.l = optional;
            return this;
        }

        public x.a.AbstractC0383a o(Optional<String> optional) {
            this.p = optional;
            return this;
        }

        public x.a.AbstractC0383a p(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        b(x.a aVar, a aVar2) {
            this.a = Integer.valueOf(aVar.s());
            this.b = aVar.k();
            this.c = aVar.h();
            this.d = aVar.i();
            this.e = aVar.r();
            this.f = aVar.e();
            this.g = aVar.t();
            this.h = aVar.n();
            this.i = aVar.d();
            this.j = aVar.p();
            this.k = aVar.j();
            this.l = aVar.m();
            this.m = aVar.a();
            this.n = aVar.f();
            this.o = aVar.g();
            this.p = aVar.o();
            this.q = aVar.l();
        }
    }
}
