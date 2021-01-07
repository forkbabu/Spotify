package defpackage;

import defpackage.qrd;
import java.util.Set;

/* renamed from: rrd  reason: default package */
final class rrd extends qrd {
    private final String a;
    private final String b;
    private final boolean c;
    private final String d;
    private final Set<String> e;

    /* renamed from: rrd$b */
    static final class b extends qrd.a {
        private String a;
        private String b;
        private Boolean c;
        private String d;
        private Set<String> e;

        b() {
        }

        public qrd.a a(Set<String> set) {
            if (set != null) {
                this.e = set;
                return this;
            }
            throw new NullPointerException("Null allowedResources");
        }

        public qrd b() {
            String str = this.a == null ? " name" : "";
            if (this.b == null) {
                str = je.x0(str, " packageName");
            }
            if (this.c == null) {
                str = je.x0(str, " release");
            }
            if (this.d == null) {
                str = je.x0(str, " signingCertificate");
            }
            if (this.e == null) {
                str = je.x0(str, " allowedResources");
            }
            if (str.isEmpty()) {
                return new rrd(this.a, this.b, this.c.booleanValue(), this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public qrd.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public qrd.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null packageName");
        }

        public qrd.a e(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public qrd.a f(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null signingCertificate");
        }
    }

    rrd(String str, String str2, boolean z, String str3, Set set, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = set;
    }

    @Override // defpackage.qrd
    public Set<String> a() {
        return this.e;
    }

    @Override // defpackage.qrd
    public String b() {
        return this.a;
    }

    @Override // defpackage.qrd
    public String c() {
        return this.b;
    }

    @Override // defpackage.qrd
    public boolean d() {
        return this.c;
    }

    @Override // defpackage.qrd
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qrd)) {
            return false;
        }
        qrd qrd = (qrd) obj;
        if (!this.a.equals(qrd.b()) || !this.b.equals(qrd.c()) || this.c != qrd.d() || !this.d.equals(qrd.e()) || !this.e.equals(qrd.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AllowedCallerDescription{name=");
        V0.append(this.a);
        V0.append(", packageName=");
        V0.append(this.b);
        V0.append(", release=");
        V0.append(this.c);
        V0.append(", signingCertificate=");
        V0.append(this.d);
        V0.append(", allowedResources=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}
