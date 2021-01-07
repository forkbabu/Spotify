package defpackage;

import com.spotify.music.features.profile.saveprofile.domain.r;
import defpackage.mm7;

/* renamed from: ll7  reason: default package */
abstract class ll7 extends mm7 {
    private final String b;
    private final String c;
    private final boolean f;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final String q;
    private final String r;
    private final boolean s;
    private final int t;
    private final boolean u;
    private final r v;

    /* renamed from: ll7$b */
    static final class b extends mm7.a {
        private String a;
        private String b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private String g;
        private String h;
        private Boolean i;
        private Integer j;
        private Boolean k;
        private r l;

        b() {
        }

        @Override // defpackage.mm7.a
        public mm7 a() {
            String str = this.a == null ? " username" : "";
            if (this.b == null) {
                str = je.x0(str, " displayName");
            }
            if (this.c == null) {
                str = je.x0(str, " displayNameChanged");
            }
            if (this.d == null) {
                str = je.x0(str, " readExternalStoragePermissionPermanentlyDenied");
            }
            if (this.e == null) {
                str = je.x0(str, " cameraPermissionPermanentlyDenied");
            }
            if (this.f == null) {
                str = je.x0(str, " imageChanged");
            }
            if (this.h == null) {
                str = je.x0(str, " newImageUri");
            }
            if (this.i == null) {
                str = je.x0(str, " hasSpotifyImage");
            }
            if (this.j == null) {
                str = je.x0(str, " color");
            }
            if (this.k == null) {
                str = je.x0(str, " savingChanges");
            }
            if (this.l == null) {
                str = je.x0(str, " saveProfileStatus");
            }
            if (str.isEmpty()) {
                return new jm7(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g, this.h, this.i.booleanValue(), this.j.intValue(), this.k.booleanValue(), this.l);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.mm7.a
        public mm7.a b(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.mm7.a
        public mm7.a c(int i2) {
            this.j = Integer.valueOf(i2);
            return this;
        }

        @Override // defpackage.mm7.a
        public mm7.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null displayName");
        }

        @Override // defpackage.mm7.a
        public mm7.a e(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.mm7.a
        public mm7.a f(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.mm7.a
        public mm7.a g(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.mm7.a
        public mm7.a h(String str) {
            this.g = str;
            return this;
        }

        @Override // defpackage.mm7.a
        public mm7.a i(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null newImageUri");
        }

        @Override // defpackage.mm7.a
        public mm7.a j(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.mm7.a
        public mm7.a k(r rVar) {
            if (rVar != null) {
                this.l = rVar;
                return this;
            }
            throw new NullPointerException("Null saveProfileStatus");
        }

        @Override // defpackage.mm7.a
        public mm7.a l(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.mm7.a
        public mm7.a m(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null username");
        }

        b(mm7 mm7, a aVar) {
            this.a = mm7.p();
            this.b = mm7.e();
            this.c = Boolean.valueOf(mm7.f());
            this.d = Boolean.valueOf(mm7.l());
            this.e = Boolean.valueOf(mm7.a());
            this.f = Boolean.valueOf(mm7.h());
            this.g = mm7.i();
            this.h = mm7.j();
            this.i = Boolean.valueOf(mm7.g());
            this.j = Integer.valueOf(mm7.c());
            this.k = Boolean.valueOf(mm7.n());
            this.l = mm7.m();
        }
    }

    ll7(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, String str4, boolean z5, int i, boolean z6, r rVar) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                this.f = z;
                this.n = z2;
                this.o = z3;
                this.p = z4;
                this.q = str3;
                if (str4 != null) {
                    this.r = str4;
                    this.s = z5;
                    this.t = i;
                    this.u = z6;
                    if (rVar != null) {
                        this.v = rVar;
                        return;
                    }
                    throw new NullPointerException("Null saveProfileStatus");
                }
                throw new NullPointerException("Null newImageUri");
            }
            throw new NullPointerException("Null displayName");
        }
        throw new NullPointerException("Null username");
    }

    @Override // defpackage.mm7
    public boolean a() {
        return this.o;
    }

    @Override // defpackage.mm7
    public int c() {
        return this.t;
    }

    @Override // defpackage.mm7
    public String e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mm7)) {
            return false;
        }
        mm7 mm7 = (mm7) obj;
        if (this.b.equals(mm7.p()) && this.c.equals(mm7.e()) && this.f == mm7.f() && this.n == mm7.l() && this.o == mm7.a() && this.p == mm7.h() && ((str = this.q) != null ? str.equals(mm7.i()) : mm7.i() == null) && this.r.equals(mm7.j()) && this.s == mm7.g() && this.t == mm7.c() && this.u == mm7.n() && this.v.equals(mm7.m())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mm7
    public boolean f() {
        return this.f;
    }

    @Override // defpackage.mm7
    public boolean g() {
        return this.s;
    }

    @Override // defpackage.mm7
    public boolean h() {
        return this.p;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003;
        String str = this.q;
        int hashCode2 = (((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.r.hashCode()) * 1000003) ^ (this.s ? 1231 : 1237)) * 1000003) ^ this.t) * 1000003;
        if (!this.u) {
            i = 1237;
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.v.hashCode();
    }

    @Override // defpackage.mm7
    public String i() {
        return this.q;
    }

    @Override // defpackage.mm7
    public String j() {
        return this.r;
    }

    @Override // defpackage.mm7
    public boolean l() {
        return this.n;
    }

    @Override // defpackage.mm7
    public r m() {
        return this.v;
    }

    @Override // defpackage.mm7
    public boolean n() {
        return this.u;
    }

    @Override // defpackage.mm7
    public mm7.a o() {
        return new b(this, null);
    }

    @Override // defpackage.mm7
    public String p() {
        return this.b;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("EditProfileModel{username=");
        V0.append(this.b);
        V0.append(", displayName=");
        V0.append(this.c);
        V0.append(", displayNameChanged=");
        V0.append(this.f);
        V0.append(", readExternalStoragePermissionPermanentlyDenied=");
        V0.append(this.n);
        V0.append(", cameraPermissionPermanentlyDenied=");
        V0.append(this.o);
        V0.append(", imageChanged=");
        V0.append(this.p);
        V0.append(", imageUrl=");
        V0.append(this.q);
        V0.append(", newImageUri=");
        V0.append(this.r);
        V0.append(", hasSpotifyImage=");
        V0.append(this.s);
        V0.append(", color=");
        V0.append(this.t);
        V0.append(", savingChanges=");
        V0.append(this.u);
        V0.append(", saveProfileStatus=");
        V0.append(this.v);
        V0.append("}");
        return V0.toString();
    }
}
