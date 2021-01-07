package defpackage;

import com.google.common.base.Optional;
import defpackage.wsa;

/* renamed from: vsa  reason: default package */
final class vsa extends wsa {
    private final rqe a;
    private final Optional<Integer> b;
    private final Optional<String> c;
    private final Optional<String> d;
    private final Optional<String> e;

    /* access modifiers changed from: package-private */
    /* renamed from: vsa$b */
    public static final class b implements wsa.a {
        private rqe a;
        private Optional<Integer> b = Optional.absent();
        private Optional<String> c = Optional.absent();
        private Optional<String> d = Optional.absent();
        private Optional<String> e = Optional.absent();

        b() {
        }

        @Override // defpackage.wsa.a
        public wsa.a a(int i) {
            this.b = Optional.of(Integer.valueOf(i));
            return this;
        }

        @Override // defpackage.wsa.a
        public wsa.a b(String str) {
            this.c = Optional.of(str);
            return this;
        }

        @Override // defpackage.wsa.a
        public wsa build() {
            String str = this.a == null ? " ubiEventLocation" : "";
            if (str.isEmpty()) {
                return new vsa(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.wsa.a
        public wsa.a c(String str) {
            this.e = Optional.of(str);
            return this;
        }

        @Override // defpackage.wsa.a
        public wsa.a d(String str) {
            this.d = Optional.of(str);
            return this;
        }

        @Override // defpackage.wsa.a
        public wsa.a e(rqe rqe) {
            if (rqe != null) {
                this.a = rqe;
                return this;
            }
            throw new NullPointerException("Null ubiEventLocation");
        }
    }

    vsa(rqe rqe, Optional optional, Optional optional2, Optional optional3, Optional optional4, a aVar) {
        this.a = rqe;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
    }

    @Override // defpackage.wsa
    public Optional<Integer> b() {
        return this.b;
    }

    @Override // defpackage.wsa
    public Optional<String> c() {
        return this.e;
    }

    @Override // defpackage.wsa
    public Optional<String> d() {
        return this.d;
    }

    @Override // defpackage.wsa
    public Optional<String> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wsa)) {
            return false;
        }
        wsa wsa = (wsa) obj;
        if (!this.a.equals(wsa.f()) || !this.b.equals(wsa.b()) || !this.c.equals(wsa.e()) || !this.d.equals(wsa.d()) || !this.e.equals(wsa.c())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.wsa
    public rqe f() {
        return this.a;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("LoggingData{ubiEventLocation=");
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
}
