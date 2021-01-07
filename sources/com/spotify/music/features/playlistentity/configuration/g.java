package com.spotify.music.features.playlistentity.configuration;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class g {
    public static final b g = new b(null);
    private final boolean a;
    private final boolean b;
    private final b66 c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public static final class a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private b66 f;

        public a() {
            this(null, null, null, null, null, null, 63);
        }

        public a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, b66 b66) {
            this.a = bool;
            this.b = bool2;
            this.c = bool3;
            this.d = bool4;
            this.e = bool5;
            this.f = b66;
        }

        public final g a() {
            Boolean bool = this.a;
            h.c(bool);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.b;
            h.c(bool2);
            boolean booleanValue2 = bool2.booleanValue();
            Boolean bool3 = this.c;
            h.c(bool3);
            boolean booleanValue3 = bool3.booleanValue();
            Boolean bool4 = this.d;
            h.c(bool4);
            boolean booleanValue4 = bool4.booleanValue();
            b66 b66 = this.f;
            h.c(b66);
            Boolean bool5 = this.e;
            h.c(bool5);
            return new g(booleanValue3, booleanValue, b66, booleanValue2, bool5.booleanValue(), booleanValue4);
        }

        public final a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final a c(b66 b66) {
            h.e(b66, "playButtonBehavior");
            this.f = b66;
            return this;
        }

        public final a d(boolean z) {
            this.c = Boolean.valueOf(z);
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && h.a(this.f, aVar.f);
        }

        public final a f(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final a g(boolean z) {
            this.e = Boolean.valueOf(z);
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
            Boolean bool5 = this.e;
            int hashCode5 = (hashCode4 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            b66 b66 = this.f;
            if (b66 != null) {
                i = b66.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(showPlayButton=");
            V0.append(this.a);
            V0.append(", showSecondPage=");
            V0.append(this.b);
            V0.append(", showFollowButton=");
            V0.append(this.c);
            V0.append(", enableFastScroll=");
            V0.append(this.d);
            V0.append(", useLikesInsteadOfFollowers=");
            V0.append(this.e);
            V0.append(", playButtonBehavior=");
            V0.append(this.f);
            V0.append(")");
            return V0.toString();
        }

        public a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, b66 b66, int i) {
            int i2 = i & 1;
            int i3 = i & 2;
            int i4 = i & 4;
            int i5 = i & 8;
            int i6 = i & 16;
            int i7 = i & 32;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    static {
        h.e(b66.e, "playButtonBehavior");
    }

    public g(boolean z, boolean z2, b66 b66, boolean z3, boolean z4, boolean z5) {
        h.e(b66, "playButtonBehavior");
        this.a = z;
        this.b = z2;
        this.c = b66;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean a() {
        return this.f;
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

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && h.a(this.c, gVar.c) && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f;
    }

    public final a f() {
        return new a(Boolean.valueOf(this.b), Boolean.valueOf(this.d), Boolean.valueOf(this.a), Boolean.valueOf(this.f), Boolean.valueOf(this.e), this.c);
    }

    public final boolean g() {
        return this.e;
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
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        boolean z5 = this.f;
        if (!z5) {
            i = z5 ? 1 : 0;
        }
        return i17 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaylistHeaderConfiguration(showFollowButton=");
        V0.append(this.a);
        V0.append(", showPlayButton=");
        V0.append(this.b);
        V0.append(", playButtonBehavior=");
        V0.append(this.c);
        V0.append(", showSecondPage=");
        V0.append(this.d);
        V0.append(", useLikesInsteadOfFollowers=");
        V0.append(this.e);
        V0.append(", enableFastScroll=");
        return je.P0(V0, this.f, ")");
    }
}
