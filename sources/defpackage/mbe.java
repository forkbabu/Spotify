package defpackage;

import com.spotify.login.AuthenticationMetadata;
import defpackage.kee;

/* renamed from: mbe  reason: default package */
abstract class mbe extends kee {
    private final gee b;
    private final phe c;
    private final pke f;
    private final tae n;
    private final zie o;
    private final sje p;
    private final boolean q;
    private final String r;
    private final com.spotify.loginflow.navigation.a s;
    private final AuthenticationMetadata.AuthSource t;
    private final int u;

    /* access modifiers changed from: package-private */
    /* renamed from: mbe$b */
    public static class b implements kee.a {
        private gee a;
        private phe b;
        private pke c;
        private tae d;
        private zie e;
        private sje f;
        private Boolean g;
        private String h;
        private com.spotify.loginflow.navigation.a i;
        private AuthenticationMetadata.AuthSource j;
        private Integer k;

        b() {
        }

        public kee.a a(tae tae) {
            if (tae != null) {
                this.d = tae;
                return this;
            }
            throw new NullPointerException("Null ageModel");
        }

        public kee.a b(AuthenticationMetadata.AuthSource authSource) {
            this.j = authSource;
            return this;
        }

        public kee c() {
            String str = this.a == null ? " signupConfigurationState" : "";
            if (this.b == null) {
                str = je.x0(str, " emailModel");
            }
            if (this.c == null) {
                str = je.x0(str, " passwordModel");
            }
            if (this.d == null) {
                str = je.x0(str, " ageModel");
            }
            if (this.e == null) {
                str = je.x0(str, " genderModel");
            }
            if (this.f == null) {
                str = je.x0(str, " nameModel");
            }
            if (this.g == null) {
                str = je.x0(str, " hasConnection");
            }
            if (this.k == null) {
                str = je.x0(str, " page");
            }
            if (str.isEmpty()) {
                return new eee(this.a, this.b, this.c, this.d, this.e, this.f, this.g.booleanValue(), this.h, this.i, this.j, this.k.intValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public kee.a d(phe phe) {
            if (phe != null) {
                this.b = phe;
                return this;
            }
            throw new NullPointerException("Null emailModel");
        }

        public kee.a e(com.spotify.loginflow.navigation.a aVar) {
            this.i = aVar;
            return this;
        }

        public kee.a f(zie zie) {
            if (zie != null) {
                this.e = zie;
                return this;
            }
            throw new NullPointerException("Null genderModel");
        }

        public kee.a g(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public kee.a h(String str) {
            this.h = str;
            return this;
        }

        public kee.a i(sje sje) {
            if (sje != null) {
                this.f = sje;
                return this;
            }
            throw new NullPointerException("Null nameModel");
        }

        public kee.a j(int i2) {
            this.k = Integer.valueOf(i2);
            return this;
        }

        public kee.a k(pke pke) {
            if (pke != null) {
                this.c = pke;
                return this;
            }
            throw new NullPointerException("Null passwordModel");
        }

        public kee.a l(gee gee) {
            if (gee != null) {
                this.a = gee;
                return this;
            }
            throw new NullPointerException("Null signupConfigurationState");
        }

        b(kee kee, a aVar) {
            this.a = kee.n();
            this.b = kee.c();
            this.c = kee.l();
            this.d = kee.a();
            this.e = kee.f();
            this.f = kee.j();
            this.g = Boolean.valueOf(kee.g());
            this.h = kee.h();
            this.i = kee.e();
            this.j = kee.b();
            this.k = Integer.valueOf(kee.k());
        }
    }

    mbe(gee gee, phe phe, pke pke, tae tae, zie zie, sje sje, boolean z, String str, com.spotify.loginflow.navigation.a aVar, AuthenticationMetadata.AuthSource authSource, int i) {
        if (gee != null) {
            this.b = gee;
            if (phe != null) {
                this.c = phe;
                if (pke != null) {
                    this.f = pke;
                    if (tae != null) {
                        this.n = tae;
                        if (zie != null) {
                            this.o = zie;
                            if (sje != null) {
                                this.p = sje;
                                this.q = z;
                                this.r = str;
                                this.s = aVar;
                                this.t = authSource;
                                this.u = i;
                                return;
                            }
                            throw new NullPointerException("Null nameModel");
                        }
                        throw new NullPointerException("Null genderModel");
                    }
                    throw new NullPointerException("Null ageModel");
                }
                throw new NullPointerException("Null passwordModel");
            }
            throw new NullPointerException("Null emailModel");
        }
        throw new NullPointerException("Null signupConfigurationState");
    }

    @Override // defpackage.kee
    public tae a() {
        return this.n;
    }

    @Override // defpackage.kee
    public AuthenticationMetadata.AuthSource b() {
        return this.t;
    }

    @Override // defpackage.kee
    public phe c() {
        return this.c;
    }

    @Override // defpackage.kee
    public com.spotify.loginflow.navigation.a e() {
        return this.s;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        com.spotify.loginflow.navigation.a aVar;
        AuthenticationMetadata.AuthSource authSource;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kee)) {
            return false;
        }
        kee kee = (kee) obj;
        if (!this.b.equals(kee.n()) || !this.c.equals(kee.c()) || !this.f.equals(kee.l()) || !this.n.equals(kee.a()) || !this.o.equals(kee.f()) || !this.p.equals(kee.j()) || this.q != kee.g() || ((str = this.r) != null ? !str.equals(kee.h()) : kee.h() != null) || ((aVar = this.s) != null ? !aVar.equals(kee.e()) : kee.e() != null) || ((authSource = this.t) != null ? !authSource.equals(kee.b()) : kee.b() != null) || this.u != kee.k()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.kee
    public zie f() {
        return this.o;
    }

    @Override // defpackage.kee
    public boolean g() {
        return this.q;
    }

    @Override // defpackage.kee
    public String h() {
        return this.r;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ (this.q ? 1231 : 1237)) * 1000003;
        String str = this.r;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        com.spotify.loginflow.navigation.a aVar = this.s;
        int hashCode3 = (hashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        AuthenticationMetadata.AuthSource authSource = this.t;
        if (authSource != null) {
            i = authSource.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.u;
    }

    @Override // defpackage.kee
    public sje j() {
        return this.p;
    }

    @Override // defpackage.kee
    public int k() {
        return this.u;
    }

    @Override // defpackage.kee
    public pke l() {
        return this.f;
    }

    @Override // defpackage.kee
    public gee n() {
        return this.b;
    }

    @Override // defpackage.kee
    public kee.a o() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SignupModel{signupConfigurationState=");
        V0.append(this.b);
        V0.append(", emailModel=");
        V0.append(this.c);
        V0.append(", passwordModel=");
        V0.append(this.f);
        V0.append(", ageModel=");
        V0.append(this.n);
        V0.append(", genderModel=");
        V0.append(this.o);
        V0.append(", nameModel=");
        V0.append(this.p);
        V0.append(", hasConnection=");
        V0.append(this.q);
        V0.append(", identifierToken=");
        V0.append(this.r);
        V0.append(", facebookUser=");
        V0.append(this.s);
        V0.append(", authSource=");
        V0.append(this.t);
        V0.append(", page=");
        return je.B0(V0, this.u, "}");
    }
}
