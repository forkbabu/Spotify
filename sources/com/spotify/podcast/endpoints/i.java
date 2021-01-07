package com.spotify.podcast.endpoints;

import com.google.common.base.Optional;
import com.spotify.podcast.endpoints.i0;
import com.spotify.podcast.endpoints.policy.Policy;

final class i extends i0.a {
    private final Optional<Policy> a;
    private final Optional<ane> b;
    private final Optional<r> c;
    private final Optional<Double> d;
    private final Optional<Integer> e;
    private final Optional<Boolean> f;
    private final Optional<Boolean> g;
    private final Optional<Integer> h;
    private final Optional<Boolean> i;
    private final Optional<Integer> j;
    private final int k;

    /* access modifiers changed from: package-private */
    public static final class b implements i0.a.AbstractC0382a {
        private Optional<Policy> a = Optional.absent();
        private Optional<ane> b = Optional.absent();
        private Optional<r> c = Optional.absent();
        private Optional<Double> d = Optional.absent();
        private Optional<Integer> e = Optional.absent();
        private Optional<Boolean> f = Optional.absent();
        private Optional<Boolean> g = Optional.absent();
        private Optional<Integer> h = Optional.absent();
        private Optional<Boolean> i = Optional.absent();
        private Optional<Integer> j = Optional.absent();
        private Integer k;

        b() {
        }

        @Override // com.spotify.podcast.endpoints.i0.a.AbstractC0382a
        public i0.a.AbstractC0382a a(Optional<Boolean> optional) {
            this.i = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.i0.a.AbstractC0382a
        public i0.a.AbstractC0382a b(Optional<Policy> optional) {
            this.a = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.i0.a.AbstractC0382a
        public i0.a build() {
            String str = this.k == null ? " updateThrottling" : "";
            if (str.isEmpty()) {
                return new i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.podcast.endpoints.i0.a.AbstractC0382a
        public i0.a.AbstractC0382a c(Optional<Boolean> optional) {
            this.f = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.i0.a.AbstractC0382a
        public i0.a.AbstractC0382a d(Optional<r> optional) {
            this.c = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.i0.a.AbstractC0382a
        public i0.a.AbstractC0382a e(Optional<Integer> optional) {
            this.h = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.i0.a.AbstractC0382a
        public i0.a.AbstractC0382a f(Optional<Double> optional) {
            this.d = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.i0.a.AbstractC0382a
        public i0.a.AbstractC0382a g(Optional<Integer> optional) {
            this.j = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.i0.a.AbstractC0382a
        public i0.a.AbstractC0382a h(Optional<Integer> optional) {
            this.e = optional;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.i0.a.AbstractC0382a
        public i0.a.AbstractC0382a i(Optional<Boolean> optional) {
            this.g = optional;
            return this;
        }

        public i0.a.AbstractC0382a j(Optional<ane> optional) {
            this.b = optional;
            return this;
        }

        public i0.a.AbstractC0382a k(int i2) {
            this.k = Integer.valueOf(i2);
            return this;
        }
    }

    i(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, int i2, a aVar) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = optional7;
        this.h = optional8;
        this.i = optional9;
        this.j = optional10;
        this.k = i2;
    }

    @Override // com.spotify.podcast.endpoints.i0.a
    public Optional<Integer> a() {
        return this.e;
    }

    @Override // com.spotify.podcast.endpoints.i0.a
    public Optional<Boolean> d() {
        return this.g;
    }

    @Override // com.spotify.podcast.endpoints.i0.a
    public Optional<Boolean> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0.a)) {
            return false;
        }
        i0.a aVar = (i0.a) obj;
        if (!this.a.equals(aVar.h()) || !this.b.equals(aVar.k()) || !this.c.equals(aVar.i()) || !this.d.equals(aVar.j()) || !this.e.equals(aVar.a()) || !this.f.equals(aVar.e()) || !this.g.equals(aVar.d()) || !this.h.equals(aVar.l()) || !this.i.equals(aVar.f()) || !this.j.equals(aVar.g()) || this.k != aVar.m()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.podcast.endpoints.i0.a
    public Optional<Boolean> f() {
        return this.i;
    }

    @Override // com.spotify.podcast.endpoints.i0.a
    public Optional<Integer> g() {
        return this.j;
    }

    @Override // com.spotify.podcast.endpoints.i0.a
    public Optional<Policy> h() {
        return this.a;
    }

    public int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k;
    }

    @Override // com.spotify.podcast.endpoints.i0.a
    public Optional<r> i() {
        return this.c;
    }

    @Override // com.spotify.podcast.endpoints.i0.a
    public Optional<Double> j() {
        return this.d;
    }

    @Override // com.spotify.podcast.endpoints.i0.a
    public Optional<ane> k() {
        return this.b;
    }

    @Override // com.spotify.podcast.endpoints.i0.a
    public Optional<Integer> l() {
        return this.h;
    }

    @Override // com.spotify.podcast.endpoints.i0.a
    public int m() {
        return this.k;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Configuration{policy=");
        V0.append(this.a);
        V0.append(", sortOrder=");
        V0.append(this.b);
        V0.append(", range=");
        V0.append(this.c);
        V0.append(", relativeTimeLeftInPct=");
        V0.append(this.d);
        V0.append(", absoluteTimeLeftInSec=");
        V0.append(this.e);
        V0.append(", isAvailable=");
        V0.append(this.f);
        V0.append(", hasTimeLeft=");
        V0.append(this.g);
        V0.append(", timePlayedInSec=");
        V0.append(this.h);
        V0.append(", isUnique=");
        V0.append(this.i);
        V0.append(", lastPlayedInDays=");
        V0.append(this.j);
        V0.append(", updateThrottling=");
        return je.B0(V0, this.k, "}");
    }
}
