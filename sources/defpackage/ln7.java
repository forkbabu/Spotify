package defpackage;

import defpackage.mn7;

/* renamed from: ln7  reason: default package */
final class ln7 extends mn7 {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final int e;

    /* access modifiers changed from: package-private */
    /* renamed from: ln7$b */
    public static final class b extends mn7.a {
        private String a;
        private String b;
        private String c;
        private Boolean d;
        private Integer e;

        b() {
        }

        @Override // defpackage.mn7.a
        public mn7 a() {
            String str = this.d == null ? " hasSpotifyImage" : "";
            if (this.e == null) {
                str = je.x0(str, " color");
            }
            if (str.isEmpty()) {
                return new ln7(this.a, this.b, this.c, this.d.booleanValue(), this.e.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.mn7.a
        public mn7.a b(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.mn7.a
        public mn7.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // defpackage.mn7.a
        public mn7.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.mn7.a
        public mn7.a e(String str) {
            this.c = str;
            return this;
        }

        @Override // defpackage.mn7.a
        public mn7.a f(String str) {
            this.a = str;
            return this;
        }
    }

    ln7(String str, String str2, String str3, boolean z, int i, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.mn7
    public int b() {
        return this.e;
    }

    @Override // defpackage.mn7
    public String c() {
        return this.b;
    }

    @Override // defpackage.mn7
    public boolean d() {
        return this.d;
    }

    @Override // defpackage.mn7
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mn7)) {
            return false;
        }
        mn7 mn7 = (mn7) obj;
        String str = this.a;
        if (str != null ? str.equals(mn7.f()) : mn7.f() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(mn7.c()) : mn7.c() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(mn7.e()) : mn7.e() == null) {
                    if (this.d == mn7.d() && this.e == mn7.b()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.mn7
    public String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EditProfileData{username=");
        V0.append(this.a);
        V0.append(", displayName=");
        V0.append(this.b);
        V0.append(", imageUrl=");
        V0.append(this.c);
        V0.append(", hasSpotifyImage=");
        V0.append(this.d);
        V0.append(", color=");
        return je.B0(V0, this.e, "}");
    }
}
