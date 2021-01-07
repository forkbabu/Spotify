package com.spotify.music.features.playlistentity.configuration;

import com.spotify.music.features.playlistallsongs.c;
import kotlin.jvm.internal.h;

public final class a {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final Boolean d;

    /* renamed from: com.spotify.music.features.playlistentity.configuration.a$a  reason: collision with other inner class name */
    public static final class C0241a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;

        public C0241a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public final C0241a a(Boolean bool) {
            this.b = bool;
            return this;
        }

        public final a b() {
            Boolean bool = this.a;
            h.c(bool);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.b;
            Boolean bool3 = this.c;
            h.c(bool3);
            boolean booleanValue2 = bool3.booleanValue();
            Boolean bool4 = this.d;
            h.c(bool4);
            return new a(booleanValue, booleanValue2, bool4.booleanValue(), bool2);
        }

        public final C0241a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final C0241a d(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final C0241a e(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0241a)) {
                return false;
            }
            C0241a aVar = (C0241a) obj;
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
            Boolean bool4 = this.d;
            if (bool4 != null) {
                i = bool4.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(includeEpisodes=");
            V0.append(this.a);
            V0.append(", availableItemsOnly=");
            V0.append(this.b);
            V0.append(", showRankingNumbers=");
            V0.append(this.c);
            V0.append(", contextAwareSharing=");
            V0.append(this.d);
            V0.append(")");
            return V0.toString();
        }

        public C0241a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.a = bool;
            this.b = bool2;
            this.c = bool3;
            this.d = bool4;
        }
    }

    public a(boolean z, boolean z2, boolean z3, Boolean bool) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = bool;
    }

    public static final a b(c cVar) {
        h.e(cVar, "allSongsConfiguration");
        return new a(cVar.e(), cVar.g(), cVar.c(), cVar.b());
    }

    public final c a(c cVar) {
        h.e(cVar, "original");
        return new c(this.a, this.b, this.d, this.c, cVar.f());
    }

    public final C0241a c() {
        return new C0241a(Boolean.valueOf(this.a), this.d, Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && h.a(this.d, aVar.d);
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
        Boolean bool = this.d;
        return i10 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("AllSongsConfigurationExternal(includeEpisodes=");
        V0.append(this.a);
        V0.append(", showRankingNumbers=");
        V0.append(this.b);
        V0.append(", contextAwareSharing=");
        V0.append(this.c);
        V0.append(", availableItemsOnly=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }
}
