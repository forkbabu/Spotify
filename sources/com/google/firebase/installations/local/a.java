package com.google.firebase.installations.local;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.c;

/* access modifiers changed from: package-private */
public final class a extends c {
    private final String b;
    private final PersistedInstallation.RegistrationStatus c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    private final String h;

    /* access modifiers changed from: package-private */
    public static final class b extends c.a {
        private String a;
        private PersistedInstallation.RegistrationStatus b;
        private String c;
        private String d;
        private Long e;
        private Long f;
        private String g;

        b() {
        }

        @Override // com.google.firebase.installations.local.c.a
        public c a() {
            String str = this.b == null ? " registrationStatus" : "";
            if (this.e == null) {
                str = je.x0(str, " expiresInSecs");
            }
            if (this.f == null) {
                str = je.x0(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a e(String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a f(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a g(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        b(c cVar, C0132a aVar) {
            this.a = cVar.c();
            this.b = cVar.f();
            this.c = cVar.a();
            this.d = cVar.e();
            this.e = Long.valueOf(cVar.b());
            this.f = Long.valueOf(cVar.g());
            this.g = cVar.d();
        }
    }

    a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4, C0132a aVar) {
        this.b = str;
        this.c = registrationStatus;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }

    @Override // com.google.firebase.installations.local.c
    public String a() {
        return this.d;
    }

    @Override // com.google.firebase.installations.local.c
    public long b() {
        return this.f;
    }

    @Override // com.google.firebase.installations.local.c
    public String c() {
        return this.b;
    }

    @Override // com.google.firebase.installations.local.c
    public String d() {
        return this.h;
    }

    @Override // com.google.firebase.installations.local.c
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str3 = this.b;
        if (str3 != null ? str3.equals(cVar.c()) : cVar.c() == null) {
            if (this.c.equals(cVar.f()) && ((str = this.d) != null ? str.equals(cVar.a()) : cVar.a() == null) && ((str2 = this.e) != null ? str2.equals(cVar.e()) : cVar.e() == null) && this.f == cVar.b() && this.g == cVar.g()) {
                String str4 = this.h;
                if (str4 == null) {
                    if (cVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(cVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.c
    public PersistedInstallation.RegistrationStatus f() {
        return this.c;
    }

    @Override // com.google.firebase.installations.local.c
    public long g() {
        return this.g;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f;
        long j2 = this.g;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    @Override // com.google.firebase.installations.local.c
    public c.a l() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PersistedInstallationEntry{firebaseInstallationId=");
        V0.append(this.b);
        V0.append(", registrationStatus=");
        V0.append(this.c);
        V0.append(", authToken=");
        V0.append(this.d);
        V0.append(", refreshToken=");
        V0.append(this.e);
        V0.append(", expiresInSecs=");
        V0.append(this.f);
        V0.append(", tokenCreationEpochInSecs=");
        V0.append(this.g);
        V0.append(", fisError=");
        return je.I0(V0, this.h, "}");
    }
}
