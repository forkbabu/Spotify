package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.bakery.d;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;
import defpackage.tv1;

/* renamed from: uv1  reason: default package */
final class uv1 extends tv1 {
    private final AuthorizationRequest b;
    private final ProtocolVersion c;
    private final Optional<d> d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    uv1(AuthorizationRequest authorizationRequest, ProtocolVersion protocolVersion, Optional optional, boolean z, boolean z2, boolean z3, a aVar) {
        this.b = authorizationRequest;
        this.c = protocolVersion;
        this.d = optional;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    @Override // defpackage.tv1
    public AuthorizationRequest a() {
        return this.b;
    }

    @Override // defpackage.tv1
    public Optional<d> b() {
        return this.d;
    }

    @Override // defpackage.tv1
    public boolean c() {
        return this.f;
    }

    @Override // defpackage.tv1
    public boolean d() {
        return this.e;
    }

    @Override // defpackage.tv1
    public ProtocolVersion e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tv1)) {
            return false;
        }
        tv1 tv1 = (tv1) obj;
        AuthorizationRequest authorizationRequest = this.b;
        if (authorizationRequest != null ? authorizationRequest.equals(tv1.a()) : tv1.a() == null) {
            if (this.c.equals(tv1.e()) && this.d.equals(tv1.b()) && this.e == tv1.d() && this.f == tv1.c() && this.g == tv1.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tv1
    public tv1.a f() {
        return new b(this, null);
    }

    @Override // defpackage.tv1
    public boolean g() {
        return this.g;
    }

    public int hashCode() {
        AuthorizationRequest authorizationRequest = this.b;
        int i = 1231;
        int hashCode = ((((((((((authorizationRequest == null ? 0 : authorizationRequest.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003;
        if (!this.g) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AuthorizationModel{authorizationRequest=");
        V0.append(this.b);
        V0.append(", protocolVersion=");
        V0.append(this.c);
        V0.append(", gotBakeryResponse=");
        V0.append(this.d);
        V0.append(", loginAlreadyAttempted=");
        V0.append(this.e);
        V0.append(", gotPreflightAccountsResponse=");
        V0.append(this.f);
        V0.append(", usePkce=");
        return je.P0(V0, this.g, "}");
    }

    /* renamed from: uv1$b */
    static final class b extends tv1.a {
        private AuthorizationRequest a;
        private ProtocolVersion b;
        private Optional<d> c = Optional.absent();
        private Boolean d;
        private Boolean e;
        private Boolean f;

        b() {
        }

        @Override // defpackage.tv1.a
        public tv1.a a(AuthorizationRequest authorizationRequest) {
            this.a = authorizationRequest;
            return this;
        }

        @Override // defpackage.tv1.a
        public tv1 b() {
            String str = this.b == null ? " protocolVersion" : "";
            if (this.d == null) {
                str = je.x0(str, " loginAlreadyAttempted");
            }
            if (this.e == null) {
                str = je.x0(str, " gotPreflightAccountsResponse");
            }
            if (this.f == null) {
                str = je.x0(str, " usePkce");
            }
            if (str.isEmpty()) {
                return new uv1(this.a, this.b, this.c, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.tv1.a
        public tv1.a c(Optional<d> optional) {
            this.c = optional;
            return this;
        }

        @Override // defpackage.tv1.a
        public tv1.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.tv1.a
        public tv1.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.tv1.a
        public tv1.a f(ProtocolVersion protocolVersion) {
            if (protocolVersion != null) {
                this.b = protocolVersion;
                return this;
            }
            throw new NullPointerException("Null protocolVersion");
        }

        @Override // defpackage.tv1.a
        public tv1.a g(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        b(tv1 tv1, a aVar) {
            this.a = tv1.a();
            this.b = tv1.e();
            this.c = tv1.b();
            this.d = Boolean.valueOf(tv1.d());
            this.e = Boolean.valueOf(tv1.c());
            this.f = Boolean.valueOf(tv1.g());
        }
    }
}
