package com.spotify.playlist.models;

import kotlin.jvm.internal.h;

public final class m {
    private final String a;
    private final String b;
    private final long c;
    private final b d;
    private final c e;

    public static final class a {
        private String a;
        private Long b;
        private String c;
        private b d;
        private c e;

        public a() {
            this(null, null, null, null, null, 31);
        }

        public a(String str, Long l, String str2, b bVar, c cVar, int i) {
            int i2 = i & 1;
            int i3 = i & 2;
            int i4 = i & 4;
            int i5 = i & 8;
            int i6 = i & 16;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public final a a(String str) {
            this.c = str;
            return this;
        }

        public final m b() {
            String str = this.a;
            b bVar = this.d;
            c cVar = this.e;
            Long l = this.b;
            h.c(l);
            return new m(str, this.c, l.longValue(), bVar, cVar);
        }

        public final a c(b bVar) {
            this.d = bVar;
            return this;
        }

        public final a d(c cVar) {
            this.e = cVar;
            return this;
        }

        public final a e(String str) {
            this.a = str;
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e);
        }

        public final a f(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Long l = this.b;
            int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            b bVar = this.d;
            int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            c cVar = this.e;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(text=");
            V0.append(this.a);
            V0.append(", timestamp=");
            V0.append(this.b);
            V0.append(", attribution=");
            V0.append(this.c);
            V0.append(", image=");
            V0.append(this.d);
            V0.append(", shareInfo=");
            V0.append(this.e);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b {
        private final String a;
        private final String b;

        public static final class a {
            private String a;
            private String b;

            public a() {
                this(null, null, 3);
            }

            public a(String str, String str2, int i) {
                int i2 = i & 1;
                int i3 = i & 2;
                this.a = null;
                this.b = null;
            }

            public final b a() {
                return new b(this.a, this.b);
            }

            public final a b(String str) {
                this.b = str;
                return this;
            }

            public final a c(String str) {
                this.a = str;
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
                return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
            }

            public int hashCode() {
                String str = this.a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.b;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Builder(smallUrl=");
                V0.append(this.a);
                V0.append(", largeUrl=");
                return je.I0(V0, this.b, ")");
            }
        }

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PodcastQuoteImage(smallUrl=");
            V0.append(this.a);
            V0.append(", largeUrl=");
            return je.I0(V0, this.b, ")");
        }
    }

    public static final class c {
        private final String a;
        private final String b;
        private final String c;
        private final String d;

        public static final class a {
            private String a;
            private String b;
            private String c;
            private String d;

            public a() {
                this(null, null, null, null, 15);
            }

            public a(String str, String str2, String str3, String str4, int i) {
                int i2 = i & 1;
                int i3 = i & 2;
                int i4 = i & 4;
                int i5 = i & 8;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
            }

            public final c a() {
                return new c(this.a, this.c, this.b, this.d);
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
                StringBuilder V0 = je.V0("Builder(message=");
                V0.append(this.a);
                V0.append(", imageUrl=");
                V0.append(this.b);
                V0.append(", destinationUrl=");
                V0.append(this.c);
                V0.append(", previewImageUrl=");
                return je.I0(V0, this.d, ")");
            }
        }

        public c(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.a(this.a, cVar.a) && h.a(this.b, cVar.b) && h.a(this.c, cVar.c) && h.a(this.d, cVar.d);
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
            StringBuilder V0 = je.V0("PodcastQuoteShareInfo(message=");
            V0.append(this.a);
            V0.append(", destinationUrl=");
            V0.append(this.b);
            V0.append(", imageUrl=");
            V0.append(this.c);
            V0.append(", previewImageUrl=");
            return je.I0(V0, this.d, ")");
        }
    }

    public m(String str, String str2, long j, b bVar, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = bVar;
        this.e = cVar;
    }

    public final String a() {
        return this.b;
    }

    public final b b() {
        return this.d;
    }

    public final c c() {
        return this.e;
    }

    public final long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.a(this.a, mVar.a) && h.a(this.b, mVar.b) && this.c == mVar.c && h.a(this.d, mVar.d) && h.a(this.e, mVar.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + e.a(this.c)) * 31;
        b bVar = this.d;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        c cVar = this.e;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastQuote(text=");
        V0.append(this.a);
        V0.append(", attribution=");
        V0.append(this.b);
        V0.append(", timestamp=");
        V0.append(this.c);
        V0.append(", image=");
        V0.append(this.d);
        V0.append(", shareInfo=");
        V0.append(this.e);
        V0.append(")");
        return V0.toString();
    }
}
