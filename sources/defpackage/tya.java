package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.connection.g;
import defpackage.bza;

/* renamed from: tya  reason: default package */
final class tya extends bza {
    private final String b;
    private final dza c;
    private final Optional<yya> d;
    private final g e;
    private final fza f;
    private final txa g;

    tya(String str, dza dza, Optional optional, g gVar, fza fza, txa txa, a aVar) {
        this.b = str;
        this.c = dza;
        this.d = optional;
        this.e = gVar;
        this.f = fza;
        this.g = txa;
    }

    @Override // defpackage.bza
    public txa a() {
        return this.g;
    }

    @Override // defpackage.bza
    public g b() {
        return this.e;
    }

    @Override // defpackage.bza
    public Optional<yya> c() {
        return this.d;
    }

    @Override // defpackage.bza
    public String d() {
        return this.b;
    }

    @Override // defpackage.bza
    public dza e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bza)) {
            return false;
        }
        bza bza = (bza) obj;
        if (!this.b.equals(bza.d()) || !this.c.equals(bza.e()) || !this.d.equals(bza.c()) || !this.e.equals(bza.b()) || !this.f.equals(bza.g()) || !this.g.equals(bza.a())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bza
    public bza.a f() {
        return new b(this, null);
    }

    @Override // defpackage.bza
    public fza g() {
        return this.f;
    }

    public int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchModel{query=");
        V0.append(this.b);
        V0.append(", result=");
        V0.append(this.c);
        V0.append(", error=");
        V0.append(this.d);
        V0.append(", connectionState=");
        V0.append(this.e);
        V0.append(", userSession=");
        V0.append(this.f);
        V0.append(", config=");
        V0.append(this.g);
        V0.append("}");
        return V0.toString();
    }

    /* renamed from: tya$b */
    static final class b extends bza.a {
        private String a;
        private dza b;
        private Optional<yya> c = Optional.absent();
        private g d;
        private fza e;
        private txa f;

        b() {
        }

        @Override // defpackage.bza.a
        public bza a() {
            String str = this.a == null ? " query" : "";
            if (this.b == null) {
                str = je.x0(str, " result");
            }
            if (this.d == null) {
                str = je.x0(str, " connectionState");
            }
            if (this.e == null) {
                str = je.x0(str, " userSession");
            }
            if (this.f == null) {
                str = je.x0(str, " config");
            }
            if (str.isEmpty()) {
                return new tya(this.a, this.b, this.c, this.d, this.e, this.f, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.bza.a
        public bza.a b(txa txa) {
            if (txa != null) {
                this.f = txa;
                return this;
            }
            throw new NullPointerException("Null config");
        }

        @Override // defpackage.bza.a
        public bza.a c(g gVar) {
            if (gVar != null) {
                this.d = gVar;
                return this;
            }
            throw new NullPointerException("Null connectionState");
        }

        @Override // defpackage.bza.a
        public bza.a d(Optional<yya> optional) {
            this.c = optional;
            return this;
        }

        @Override // defpackage.bza.a
        public bza.a e(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null query");
        }

        @Override // defpackage.bza.a
        public bza.a f(dza dza) {
            if (dza != null) {
                this.b = dza;
                return this;
            }
            throw new NullPointerException("Null result");
        }

        @Override // defpackage.bza.a
        public bza.a g(fza fza) {
            if (fza != null) {
                this.e = fza;
                return this;
            }
            throw new NullPointerException("Null userSession");
        }

        b(bza bza, a aVar) {
            this.a = bza.d();
            this.b = bza.e();
            this.c = bza.c();
            this.d = bza.b();
            this.e = bza.g();
            this.f = bza.a();
        }
    }
}
