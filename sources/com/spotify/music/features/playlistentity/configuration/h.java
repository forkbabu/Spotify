package com.spotify.music.features.playlistentity.configuration;

import kotlin.jvm.internal.f;

public final class h {
    public static final b f = new b(null);
    private final boolean a;
    private final boolean b;
    private final b66 c;
    private final boolean d;
    private final boolean e;

    public static final class a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private b66 e;

        public a() {
            this(null, null, null, null, null, 31);
        }

        public a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, b66 b66) {
            this.a = bool;
            this.b = bool2;
            this.c = bool3;
            this.d = bool4;
            this.e = b66;
        }

        public final h a() {
            Boolean bool = this.a;
            kotlin.jvm.internal.h.c(bool);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.b;
            kotlin.jvm.internal.h.c(bool2);
            boolean booleanValue2 = bool2.booleanValue();
            Boolean bool3 = this.c;
            kotlin.jvm.internal.h.c(bool3);
            boolean booleanValue3 = bool3.booleanValue();
            b66 b66 = this.e;
            kotlin.jvm.internal.h.c(b66);
            Boolean bool4 = this.d;
            kotlin.jvm.internal.h.c(bool4);
            return new h(booleanValue2, booleanValue, b66, bool4.booleanValue(), booleanValue3);
        }

        public final a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final a c(b66 b66) {
            kotlin.jvm.internal.h.e(b66, "playButtonBehavior");
            this.e = b66;
            return this;
        }

        public final a d(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final a e(boolean z) {
            this.a = Boolean.valueOf(z);
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
            return kotlin.jvm.internal.h.a(this.a, aVar.a) && kotlin.jvm.internal.h.a(this.b, aVar.b) && kotlin.jvm.internal.h.a(this.c, aVar.c) && kotlin.jvm.internal.h.a(this.d, aVar.d) && kotlin.jvm.internal.h.a(this.e, aVar.e);
        }

        public final a f(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public int hashCode() {
            Boolean bool = this.a;
            int i = 0;
            int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
            Boolean bool2 = this.b;
            int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.c;
            int hashCode3 = (hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.d;
            int hashCode4 = (hashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            b66 b66 = this.e;
            if (b66 != null) {
                i = b66.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(showPlayButton=");
            V0.append(this.a);
            V0.append(", showFollowButton=");
            V0.append(this.b);
            V0.append(", enableFastScroll=");
            V0.append(this.c);
            V0.append(", useLikesInsteadOfFollowers=");
            V0.append(this.d);
            V0.append(", playButtonBehavior=");
            V0.append(this.e);
            V0.append(")");
            return V0.toString();
        }

        public a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, b66 b66, int i) {
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

    public static final class b {
        public b(f fVar) {
        }
    }

    static {
        kotlin.jvm.internal.h.e(b66.e, "playButtonBehavior");
    }

    public h(boolean z, boolean z2, b66 b66, boolean z3, boolean z4) {
        kotlin.jvm.internal.h.e(b66, "playButtonBehavior");
        this.a = z;
        this.b = z2;
        this.c = b66;
        this.d = z3;
        this.e = z4;
    }

    public final boolean a() {
        return this.e;
    }

    public final b66 b() {
        return this.c;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final a e() {
        return new a(Boolean.valueOf(this.b), Boolean.valueOf(this.a), Boolean.valueOf(this.e), Boolean.valueOf(this.d), this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && kotlin.jvm.internal.h.a(this.c, hVar.c) && this.d == hVar.d && this.e == hVar.e;
    }

    public final boolean f() {
        return this.d;
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
        b66 b66 = this.c;
        int hashCode = (i9 + (b66 != null ? b66.hashCode() : 0)) * 31;
        boolean z3 = this.d;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (hashCode + i10) * 31;
        boolean z4 = this.e;
        if (!z4) {
            i = z4 ? 1 : 0;
        }
        return i13 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RefreshHeaderConfiguration(showFollowButton=");
        V0.append(this.a);
        V0.append(", showPlayButton=");
        V0.append(this.b);
        V0.append(", playButtonBehavior=");
        V0.append(this.c);
        V0.append(", useLikesInsteadOfFollowers=");
        V0.append(this.d);
        V0.append(", enableFastScroll=");
        return je.P0(V0, this.e, ")");
    }
}
