package com.spotify.music.features.playlistentity.configuration;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class e {
    public static final b e = new b(null);
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final b66 d;

    public static final class a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private b66 d;

        public a() {
            this(null, null, null, null, 15);
        }

        public a(Boolean bool, Boolean bool2, Boolean bool3, b66 b66, int i) {
            int i2 = i & 1;
            int i3 = i & 2;
            int i4 = i & 4;
            int i5 = i & 8;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public final e a() {
            Boolean bool = this.a;
            h.c(bool);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.b;
            h.c(bool2);
            boolean booleanValue2 = bool2.booleanValue();
            b66 b66 = this.d;
            h.c(b66);
            Boolean bool3 = this.c;
            h.c(bool3);
            return new e(booleanValue, booleanValue2, bool3.booleanValue(), b66);
        }

        public final a b(b66 b66) {
            this.d = b66;
            return this;
        }

        public final a c(boolean z) {
            this.b = Boolean.valueOf(z);
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d);
        }

        public int hashCode() {
            Boolean bool = this.a;
            int i = 0;
            int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
            Boolean bool2 = this.b;
            int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.c;
            int hashCode3 = (hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            b66 b66 = this.d;
            if (b66 != null) {
                i = b66.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(showPlayButton=");
            V0.append(this.a);
            V0.append(", showFollowButton=");
            V0.append(this.b);
            V0.append(", showLikesInsteadOfFollowers=");
            V0.append(this.c);
            V0.append(", playButtonBehavior=");
            V0.append(this.d);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    static {
        h.e(b66.e, "playButtonBehavior");
    }

    public e(boolean z, boolean z2, boolean z3, b66 b66) {
        h.e(b66, "playButtonBehavior");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = b66;
    }

    public final b66 a() {
        return this.d;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && h.a(this.d, eVar.d);
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
        int i10 = (i9 + i) * 31;
        b66 b66 = this.d;
        return i10 + (b66 != null ? b66.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("P2sHeaderConfiguration(showPlayButton=");
        V0.append(this.a);
        V0.append(", showFollowButton=");
        V0.append(this.b);
        V0.append(", showLikesInsteadOfFollowers=");
        V0.append(this.c);
        V0.append(", playButtonBehavior=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }
}
