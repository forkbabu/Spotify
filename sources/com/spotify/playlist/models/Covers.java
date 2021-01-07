package com.spotify.playlist.models;

import kotlin.jvm.internal.h;

public final class Covers {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public enum Size {
        NORMAL,
        SMALL,
        LARGE,
        XLARGE
    }

    public static final class a {
        private String a;
        private String b;
        private String c;
        private String d;

        public a() {
            this(null, null, null, null, 15);
        }

        public a(String str, String str2, String str3, String str4, int i) {
            String str5 = (i & 1) != 0 ? "" : null;
            int i2 = i & 2;
            int i3 = i & 4;
            int i4 = i & 8;
            h.e(str5, "uri");
            this.a = str5;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public final Covers a() {
            return new Covers(this.a, this.b, this.c, this.d);
        }

        public final a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(String str) {
            this.b = str;
            return this;
        }

        public final a d(String str) {
            h.e(str, "uri");
            this.a = str;
            return this;
        }

        public final a e(String str) {
            this.d = str;
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d);
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
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(uri=");
            V0.append(this.a);
            V0.append(", smallUri=");
            V0.append(this.b);
            V0.append(", largeUri=");
            V0.append(this.c);
            V0.append(", xlargeUri=");
            return je.I0(V0, this.d, ")");
        }
    }

    public Covers(String str, String str2, String str3, String str4) {
        h.e(str, "uri");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static final a a() {
        return new a(null, null, null, null, 15);
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Covers)) {
            return false;
        }
        Covers covers = (Covers) obj;
        return h.a(this.a, covers.a) && h.a(this.b, covers.b) && h.a(this.c, covers.c) && h.a(this.d, covers.d);
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
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Covers(uri=");
        V0.append(this.a);
        V0.append(", smallUri=");
        V0.append(this.b);
        V0.append(", largeUri=");
        V0.append(this.c);
        V0.append(", xlargeUri=");
        return je.I0(V0, this.d, ")");
    }
}
