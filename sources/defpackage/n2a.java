package defpackage;

import com.spotify.rcs.model.proto.Platform;
import defpackage.x2a;

/* renamed from: n2a  reason: default package */
final class n2a extends x2a {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Platform e;

    /* access modifiers changed from: package-private */
    /* renamed from: n2a$b */
    public static final class b extends x2a.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private Platform e;

        b() {
        }

        @Override // defpackage.x2a.a
        public x2a a() {
            String str = this.a == null ? " clientId" : "";
            if (this.b == null) {
                str = je.x0(str, " clientVersion");
            }
            if (this.c == null) {
                str = je.x0(str, " installationId");
            }
            if (this.d == null) {
                str = je.x0(str, " propertySetId");
            }
            if (this.e == null) {
                str = je.x0(str, " platform");
            }
            if (str.isEmpty()) {
                return new n2a(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.x2a.a
        public x2a.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null clientId");
        }

        @Override // defpackage.x2a.a
        public x2a.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null clientVersion");
        }

        @Override // defpackage.x2a.a
        public x2a.a d(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null installationId");
        }

        @Override // defpackage.x2a.a
        public x2a.a e(Platform platform) {
            this.e = platform;
            return this;
        }

        @Override // defpackage.x2a.a
        public x2a.a f(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null propertySetId");
        }
    }

    n2a(String str, String str2, String str3, String str4, Platform platform, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = platform;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.x2a
    public String b() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.x2a
    public String c() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.x2a
    public String d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.x2a
    public Platform e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x2a)) {
            return false;
        }
        x2a x2a = (x2a) obj;
        if (!this.a.equals(x2a.b()) || !this.b.equals(x2a.c()) || !this.c.equals(x2a.d()) || !this.d.equals(x2a.f()) || !this.e.equals(x2a.e())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.x2a
    public String f() {
        return this.d;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ClientData{clientId=");
        V0.append(this.a);
        V0.append(", clientVersion=");
        V0.append(this.b);
        V0.append(", installationId=");
        V0.append(this.c);
        V0.append(", propertySetId=");
        V0.append(this.d);
        V0.append(", platform=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}
