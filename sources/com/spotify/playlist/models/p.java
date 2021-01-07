package com.spotify.playlist.models;

import kotlin.jvm.internal.h;

public final class p {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final String e;
    private final String f;

    public static final class a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private boolean f;

        public a() {
            this(null, null, null, null, null, false, 63);
        }

        public a(String str, String str2, String str3, String str4, String str5, boolean z, int i) {
            String str6 = "";
            String str7 = (i & 1) != 0 ? str6 : null;
            str6 = (i & 2) == 0 ? null : str6;
            int i2 = i & 4;
            int i3 = i & 8;
            int i4 = i & 16;
            z = (i & 32) != 0 ? false : z;
            h.e(str7, "uri");
            h.e(str6, "username");
            this.a = str7;
            this.b = str6;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = z;
        }

        public final p a() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            return new p(str, str2, this.d, this.f, str3, this.e);
        }

        public final a b(String str) {
            this.d = str;
            return this;
        }

        public final a c(boolean z) {
            this.f = z;
            return this;
        }

        public final a d(String str) {
            this.c = str;
            return this;
        }

        public final a e(String str) {
            this.e = str;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && this.f == aVar.f;
        }

        public final a f(String str) {
            h.e(str, "uri");
            this.a = str;
            return this;
        }

        public final a g(String str) {
            h.e(str, "username");
            this.b = str;
            return this;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.e;
            if (str5 != null) {
                i = str5.hashCode();
            }
            int i2 = (hashCode4 + i) * 31;
            boolean z = this.f;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(uri=");
            V0.append(this.a);
            V0.append(", username=");
            V0.append(this.b);
            V0.append(", imageUri=");
            V0.append(this.c);
            V0.append(", displayName=");
            V0.append(this.d);
            V0.append(", thumbnailUri=");
            V0.append(this.e);
            V0.append(", hasProperDisplayName=");
            return je.P0(V0, this.f, ")");
        }
    }

    public p(String str, String str2, String str3, boolean z, String str4, String str5) {
        h.e(str, "uri");
        h.e(str2, "username");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
    }

    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return h.a(this.a, pVar.a) && h.a(this.b, pVar.b) && h.a(this.c, pVar.c) && this.d == pVar.d && h.a(this.e, pVar.e) && h.a(this.f, pVar.f);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        String str4 = this.e;
        int hashCode4 = (i5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("User(uri=");
        V0.append(this.a);
        V0.append(", username=");
        V0.append(this.b);
        V0.append(", displayName=");
        V0.append(this.c);
        V0.append(", hasProperDisplayName=");
        V0.append(this.d);
        V0.append(", imageUri=");
        V0.append(this.e);
        V0.append(", thumbnailUri=");
        return je.I0(V0, this.f, ")");
    }

    public p() {
        this("", "", null, false, null, null);
    }
}
