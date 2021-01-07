package defpackage;

import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.i;
import defpackage.ute;

/* renamed from: qte  reason: default package */
final class qte extends ute {
    private final String a;
    private final String b;
    private final ErrorDomain c;
    private final i d;
    private final String e;

    /* access modifiers changed from: package-private */
    /* renamed from: qte$b */
    public static final class b implements ute.a {
        private String a;
        private String b;
        private ErrorDomain c;
        private i d;
        private String e;

        b() {
        }

        @Override // defpackage.ute.a
        public ute.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null consumer");
        }

        @Override // defpackage.ute.a
        public ute.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // defpackage.ute.a
        public ute build() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " consumer");
            }
            if (this.c == null) {
                str = je.x0(str, " domain");
            }
            if (this.d == null) {
                str = je.x0(str, " type");
            }
            if (str.isEmpty()) {
                return new qte(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.ute.a
        public ute.a c(ErrorDomain errorDomain) {
            if (errorDomain != null) {
                this.c = errorDomain;
                return this;
            }
            throw new NullPointerException("Null domain");
        }

        @Override // defpackage.ute.a
        public ute.a d(i iVar) {
            if (iVar != null) {
                this.d = iVar;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        @Override // defpackage.ute.a
        public ute.a n(String str) {
            this.e = str;
            return this;
        }
    }

    qte(String str, String str2, ErrorDomain errorDomain, i iVar, String str3, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = errorDomain;
        this.d = iVar;
        this.e = str3;
    }

    @Override // defpackage.ute
    public String b() {
        return this.b;
    }

    @Override // defpackage.ute
    public String c() {
        return this.e;
    }

    @Override // defpackage.ute
    public ErrorDomain d() {
        return this.c;
    }

    @Override // defpackage.ute
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ute)) {
            return false;
        }
        ute ute = (ute) obj;
        if (this.a.equals(ute.e()) && this.b.equals(ute.b()) && this.c.equals(ute.d()) && this.d.equals(ute.f())) {
            String str = this.e;
            if (str == null) {
                if (ute.c() == null) {
                    return true;
                }
            } else if (str.equals(ute.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ute
    public i f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.e;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("ErrorLogEvent{id=");
        V0.append(this.a);
        V0.append(", consumer=");
        V0.append(this.b);
        V0.append(", domain=");
        V0.append(this.c);
        V0.append(", type=");
        V0.append(this.d);
        V0.append(", description=");
        return je.I0(V0, this.e, "}");
    }
}
