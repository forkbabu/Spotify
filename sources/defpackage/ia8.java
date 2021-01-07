package defpackage;

import com.google.common.base.Optional;
import defpackage.x98;

/* renamed from: ia8  reason: default package */
final class ia8 extends x98 {
    private final xb8 a;
    private final int b;
    private final Optional<String> c;
    private final Optional<String> d;
    private final Optional<String> e;

    ia8(xb8 xb8, int i, Optional optional, Optional optional2, Optional optional3, a aVar) {
        this.a = xb8;
        this.b = i;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
    }

    @Override // defpackage.x98
    public int b() {
        return this.b;
    }

    @Override // defpackage.x98
    public Optional<String> c() {
        return this.e;
    }

    @Override // defpackage.x98
    public Optional<String> d() {
        return this.d;
    }

    @Override // defpackage.x98
    public Optional<String> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x98)) {
            return false;
        }
        x98 x98 = (x98) obj;
        if (!this.a.equals(x98.g()) || this.b != x98.b() || !this.c.equals(x98.e()) || !this.d.equals(x98.d()) || !this.e.equals(x98.c())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.x98
    public x98.a f() {
        return new b(this, null);
    }

    @Override // defpackage.x98
    public xb8 g() {
        return this.a;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ActionLoggerData{ubiEventSource=");
        V0.append(this.a);
        V0.append(", position=");
        V0.append(this.b);
        V0.append(", targetUri=");
        V0.append(this.c);
        V0.append(", sectionId=");
        V0.append(this.d);
        V0.append(", requestId=");
        return je.F0(V0, this.e, "}");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ia8$b */
    public static final class b implements x98.a {
        private xb8 a;
        private Integer b;
        private Optional<String> c = Optional.absent();
        private Optional<String> d = Optional.absent();
        private Optional<String> e = Optional.absent();

        b() {
        }

        @Override // defpackage.x98.a
        public x98.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.x98.a
        public x98.a b(String str) {
            this.c = Optional.of(str);
            return this;
        }

        @Override // defpackage.x98.a
        public x98 build() {
            String str = this.a == null ? " ubiEventSource" : "";
            if (this.b == null) {
                str = je.x0(str, " position");
            }
            if (str.isEmpty()) {
                return new ia8(this.a, this.b.intValue(), this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.x98.a
        public x98.a c(Optional<String> optional) {
            this.d = optional;
            return this;
        }

        @Override // defpackage.x98.a
        public x98.a d(Optional<String> optional) {
            if (optional != null) {
                this.e = optional;
                return this;
            }
            throw new NullPointerException("Null requestId");
        }

        @Override // defpackage.x98.a
        public x98.a e(xb8 xb8) {
            this.a = xb8;
            return this;
        }

        b(x98 x98, a aVar) {
            this.a = x98.g();
            this.b = Integer.valueOf(x98.b());
            this.c = x98.e();
            this.d = x98.d();
            this.e = x98.c();
        }
    }
}
