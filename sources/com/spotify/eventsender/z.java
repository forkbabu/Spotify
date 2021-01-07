package com.spotify.eventsender;

import com.spotify.eventsender.r0;
import java.util.List;

final class z extends r0 {
    private final List<fk0> a;
    private final kl0 b;
    private final il0 c;
    private final String d;
    private final boolean e;
    private final long f;
    private final a0 g;

    /* access modifiers changed from: package-private */
    public static final class b extends r0.a {
        private List<fk0> a;
        private kl0 b;
        private il0 c;
        private String d;
        private Boolean e;
        private Long f;
        private a0 g;

        b() {
        }

        @Override // com.spotify.eventsender.r0.a
        public r0 a() {
            String str = this.a == null ? " eventContextProviders" : "";
            if (this.b == null) {
                str = je.x0(str, " logger");
            }
            if (this.c == null) {
                str = je.x0(str, " eventScheduler");
            }
            if (this.d == null) {
                str = je.x0(str, " baseUrl");
            }
            if (this.e == null) {
                str = je.x0(str, " synchronous");
            }
            if (this.f == null) {
                str = je.x0(str, " statsPeriodMillis");
            }
            if (this.g == null) {
                str = je.x0(str, " clock");
            }
            if (str.isEmpty()) {
                return new z(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.longValue(), this.g, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.eventsender.r0.a
        public r0.a b(String str) {
            this.d = str;
            return this;
        }

        @Override // com.spotify.eventsender.r0.a
        public r0.a c(a0 a0Var) {
            this.g = a0Var;
            return this;
        }

        @Override // com.spotify.eventsender.r0.a
        public r0.a d(List<fk0> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null eventContextProviders");
        }

        @Override // com.spotify.eventsender.r0.a
        public r0.a e(il0 il0) {
            this.c = il0;
            return this;
        }

        @Override // com.spotify.eventsender.r0.a
        public r0.a f(kl0 kl0) {
            if (kl0 != null) {
                this.b = kl0;
                return this;
            }
            throw new NullPointerException("Null logger");
        }

        @Override // com.spotify.eventsender.r0.a
        public r0.a g(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // com.spotify.eventsender.r0.a
        public r0.a h(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    z(List list, kl0 kl0, il0 il0, String str, boolean z, long j, a0 a0Var, a aVar) {
        this.a = list;
        this.b = kl0;
        this.c = il0;
        this.d = str;
        this.e = z;
        this.f = j;
        this.g = a0Var;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.eventsender.r0
    public String b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.eventsender.r0
    public a0 c() {
        return this.g;
    }

    @Override // com.spotify.eventsender.r0
    public List<fk0> d() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.eventsender.r0
    public il0 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (!this.a.equals(r0Var.d()) || !this.b.equals(r0Var.f()) || !this.c.equals(r0Var.e()) || !this.d.equals(r0Var.b()) || this.e != r0Var.h() || this.f != r0Var.g() || !this.g.equals(r0Var.c())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.eventsender.r0
    public kl0 f() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.eventsender.r0
    public long g() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.eventsender.r0
    public boolean h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i = this.e ? 1231 : 1237;
        long j = this.f;
        return ((((hashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.g.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SdkConfiguration{eventContextProviders=");
        V0.append(this.a);
        V0.append(", logger=");
        V0.append(this.b);
        V0.append(", eventScheduler=");
        V0.append(this.c);
        V0.append(", baseUrl=");
        V0.append(this.d);
        V0.append(", synchronous=");
        V0.append(this.e);
        V0.append(", statsPeriodMillis=");
        V0.append(this.f);
        V0.append(", clock=");
        V0.append(this.g);
        V0.append("}");
        return V0.toString();
    }
}
