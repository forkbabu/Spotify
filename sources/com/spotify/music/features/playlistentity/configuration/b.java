package com.spotify.music.features.playlistentity.configuration;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class b {
    public static final C0242b f = new C0242b(null);
    private final c a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public static final class a {
        private c a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;

        public a() {
            this(null, null, null, null, null, 31);
        }

        public a(c cVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.a = cVar;
            this.b = bool;
            this.c = bool2;
            this.d = bool3;
            this.e = bool4;
        }

        public final b a() {
            c cVar = this.a;
            h.c(cVar);
            Boolean bool = this.b;
            h.c(bool);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.c;
            h.c(bool2);
            boolean booleanValue2 = bool2.booleanValue();
            Boolean bool3 = this.d;
            h.c(bool3);
            boolean booleanValue3 = bool3.booleanValue();
            Boolean bool4 = this.e;
            h.c(bool4);
            return new b(cVar, booleanValue3, bool4.booleanValue(), booleanValue2, booleanValue);
        }

        public final a b(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final a c(c cVar) {
            h.e(cVar, "external");
            this.a = cVar;
            return this;
        }

        public final a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final a e(boolean z) {
            this.c = Boolean.valueOf(z);
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

        public final a f(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public int hashCode() {
            c cVar = this.a;
            int i = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            Boolean bool = this.b;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            Boolean bool2 = this.c;
            int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.d;
            int hashCode4 = (hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.e;
            if (bool4 != null) {
                i = bool4.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(external=");
            V0.append(this.a);
            V0.append(", trackList=");
            V0.append(this.b);
            V0.append(", trackCloud=");
            V0.append(this.c);
            V0.append(", inlinePlayButton=");
            V0.append(this.d);
            V0.append(", downloadToggleSpacing=");
            V0.append(this.e);
            V0.append(")");
            return V0.toString();
        }

        public a(c cVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i) {
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
    }

    /* renamed from: com.spotify.music.features.playlistentity.configuration.b$b  reason: collision with other inner class name */
    public static final class C0242b {
        public C0242b(f fVar) {
        }
    }

    public static final class c {
        private final boolean a;
        private final boolean b;
        private final boolean c;

        public static final class a {
            private Boolean a;
            private Boolean b;
            private Boolean c;

            public a() {
                this(null, null, null, 7);
            }

            public a(Boolean bool, Boolean bool2, Boolean bool3) {
                this.a = bool;
                this.b = bool2;
                this.c = bool3;
            }

            public final c a() {
                Boolean bool = this.a;
                h.c(bool);
                boolean booleanValue = bool.booleanValue();
                Boolean bool2 = this.b;
                h.c(bool2);
                boolean booleanValue2 = bool2.booleanValue();
                Boolean bool3 = this.c;
                h.c(bool3);
                return new c(booleanValue, booleanValue2, bool3.booleanValue());
            }

            public final a b(boolean z) {
                this.c = Boolean.valueOf(z);
                return this;
            }

            public final a c(boolean z) {
                this.a = Boolean.valueOf(z);
                return this;
            }

            public final a d(boolean z) {
                this.b = Boolean.valueOf(z);
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
                return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c);
            }

            public int hashCode() {
                Boolean bool = this.a;
                int i = 0;
                int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
                Boolean bool2 = this.b;
                int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
                Boolean bool3 = this.c;
                if (bool3 != null) {
                    i = bool3.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Builder(emptyViews=");
                V0.append(this.a);
                V0.append(", filterAndSort=");
                V0.append(this.b);
                V0.append(", downloadToggle=");
                V0.append(this.c);
                V0.append(")");
                return V0.toString();
            }

            public a(Boolean bool, Boolean bool2, Boolean bool3, int i) {
                int i2 = i & 1;
                int i3 = i & 2;
                int i4 = i & 4;
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }

        public c(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean a() {
            return this.c;
        }

        public final boolean b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        public final a d() {
            return new a(Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public int hashCode() {
            boolean z = this.a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.b;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (i5 + i6) * 31;
            boolean z3 = this.c;
            if (!z3) {
                i = z3 ? 1 : 0;
            }
            return i9 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("External(emptyViews=");
            V0.append(this.a);
            V0.append(", filterAndSort=");
            V0.append(this.b);
            V0.append(", downloadToggle=");
            return je.P0(V0, this.c, ")");
        }
    }

    static {
        h.e(new c(false, false, false), "external");
    }

    public b(c cVar, boolean z, boolean z2, boolean z3, boolean z4) {
        h.e(cVar, "external");
        this.a = cVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean a() {
        return this.c;
    }

    public final c b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final a d() {
        return new a(this.a, Boolean.valueOf(this.e), Boolean.valueOf(this.d), Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
    }

    public final boolean f() {
        return this.e;
    }

    public int hashCode() {
        c cVar = this.a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        boolean z = this.b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.c;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.d;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.e;
        if (!z4) {
            i = z4 ? 1 : 0;
        }
        return i13 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ComponentConfiguration(external=");
        V0.append(this.a);
        V0.append(", inlinePlayButton=");
        V0.append(this.b);
        V0.append(", downloadToggleSpacing=");
        V0.append(this.c);
        V0.append(", trackCloud=");
        V0.append(this.d);
        V0.append(", trackList=");
        return je.P0(V0, this.e, ")");
    }
}
