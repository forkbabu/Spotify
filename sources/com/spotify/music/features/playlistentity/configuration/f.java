package com.spotify.music.features.playlistentity.configuration;

import kotlin.jvm.internal.h;

public final class f {
    private final Boolean a;
    private final Boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public static final class a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;

        public a() {
            this(null, null, null, null, null, 31);
        }

        public a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i) {
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

        public final a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final f b() {
            Boolean bool = this.a;
            Boolean bool2 = this.b;
            Boolean bool3 = this.c;
            h.c(bool3);
            boolean booleanValue = bool3.booleanValue();
            Boolean bool4 = this.d;
            h.c(bool4);
            boolean booleanValue2 = bool4.booleanValue();
            Boolean bool5 = this.e;
            h.c(bool5);
            return new f(bool, bool2, booleanValue, booleanValue2, bool5.booleanValue());
        }

        public final a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final a d(Boolean bool) {
            this.a = null;
            return this;
        }

        public final a e(Boolean bool) {
            this.b = bool;
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
            this.c = Boolean.valueOf(z);
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
            if (bool5 != null) {
                i = bool5.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(repeat=");
            V0.append(this.a);
            V0.append(", shuffle=");
            V0.append(this.b);
            V0.append(", useWeightedShuffle=");
            V0.append(this.c);
            V0.append(", jumpInOnDemandInFree=");
            V0.append(this.d);
            V0.append(", allowToStartPlaybackFromItemInShuffleOnlyContext=");
            V0.append(this.e);
            V0.append(")");
            return V0.toString();
        }
    }

    public f(Boolean bool, Boolean bool2, boolean z, boolean z2, boolean z3) {
        this.a = bool;
        this.b = bool2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.d;
    }

    public final Boolean c() {
        return this.a;
    }

    public final Boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.a(this.a, fVar.a) && h.a(this.b, fVar.b) && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e;
    }

    public int hashCode() {
        Boolean bool = this.a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.b;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.d;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.e;
        if (!z3) {
            i3 = z3 ? 1 : 0;
        }
        return i11 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerConfiguration(repeat=");
        V0.append(this.a);
        V0.append(", shuffle=");
        V0.append(this.b);
        V0.append(", useWeightedShuffle=");
        V0.append(this.c);
        V0.append(", jumpInOnDemandInFree=");
        V0.append(this.d);
        V0.append(", allowToStartPlaybackFromItemInShuffleOnlyContext=");
        return je.P0(V0, this.e, ")");
    }
}
