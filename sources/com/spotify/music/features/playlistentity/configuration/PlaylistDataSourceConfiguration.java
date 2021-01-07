package com.spotify.music.features.playlistentity.configuration;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class PlaylistDataSourceConfiguration {
    public static final b i = new b(null);
    private final c a;
    private final boolean b;
    private final Boolean c;
    private final Boolean d;
    private final Integer e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    public enum DecorationPolicy {
        LARGE_WITH_VIEWPORT,
        LARGE_WITHOUT_VIEWPORT,
        LIMITED_WITHOUT_VIEWPORT
    }

    public static final class a {
        private c a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Integer e;
        private Boolean f;
        private Boolean g;
        private Boolean h;

        public a() {
            this(null, null, null, null, null, null, null, null, BitmapRenderer.ALPHA_VISIBLE);
        }

        public a(c cVar, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, Boolean bool5, Boolean bool6) {
            this.a = cVar;
            this.b = bool;
            this.c = bool2;
            this.d = bool3;
            this.e = num;
            this.f = bool4;
            this.g = bool5;
            this.h = bool6;
        }

        public final PlaylistDataSourceConfiguration a() {
            c cVar = this.a;
            h.c(cVar);
            Integer num = this.e;
            Boolean bool = this.b;
            h.c(bool);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.d;
            Boolean bool3 = this.g;
            h.c(bool3);
            boolean booleanValue2 = bool3.booleanValue();
            Boolean bool4 = this.f;
            h.c(bool4);
            boolean booleanValue3 = bool4.booleanValue();
            Boolean bool5 = this.c;
            Boolean bool6 = this.h;
            h.c(bool6);
            return new PlaylistDataSourceConfiguration(cVar, booleanValue, bool5, bool2, num, booleanValue3, booleanValue2, bool6.booleanValue());
        }

        public final a b(c cVar) {
            h.e(cVar, "external");
            this.a = cVar;
            return this;
        }

        public final a c(Boolean bool) {
            this.d = bool;
            return this;
        }

        public final a d(Boolean bool) {
            this.c = bool;
            return this;
        }

        public final a e(boolean z) {
            this.f = Boolean.valueOf(z);
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && h.a(this.f, aVar.f) && h.a(this.g, aVar.g) && h.a(this.h, aVar.h);
        }

        public final a f(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final a g(Integer num) {
            this.e = num;
            return this;
        }

        public final a h(boolean z) {
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
            Integer num = this.e;
            int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
            Boolean bool4 = this.f;
            int hashCode6 = (hashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Boolean bool5 = this.g;
            int hashCode7 = (hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.h;
            if (bool6 != null) {
                i = bool6.hashCode();
            }
            return hashCode7 + i;
        }

        public final a i(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(external=");
            V0.append(this.a);
            V0.append(", loadRecommendations=");
            V0.append(this.b);
            V0.append(", includeTracksFromBannedArtists=");
            V0.append(this.c);
            V0.append(", includeBannedTracks=");
            V0.append(this.d);
            V0.append(", limitRangeTo=");
            V0.append(this.e);
            V0.append(", keepRangeLimitDuringPlayback=");
            V0.append(this.f);
            V0.append(", keepTextFilterDuringPlayback=");
            V0.append(this.g);
            V0.append(", persistSortOptionInPreferences=");
            V0.append(this.h);
            V0.append(")");
            return V0.toString();
        }

        public a(c cVar, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, Boolean bool5, Boolean bool6, int i) {
            int i2 = i & 1;
            int i3 = i & 2;
            int i4 = i & 4;
            int i5 = i & 8;
            int i6 = i & 16;
            int i7 = i & 32;
            int i8 = i & 64;
            int i9 = i & 128;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    public static final class c {
        private final boolean a;
        private final DecorationPolicy b;
        private final Boolean c;
        private final ListPolicy d;

        public static final class a {
            private Boolean a;
            private ListPolicy b;
            private DecorationPolicy c;
            private Boolean d;

            public a() {
                this(null, null, null, null, 15);
            }

            public a(Boolean bool, ListPolicy listPolicy, DecorationPolicy decorationPolicy, Boolean bool2) {
                this.a = bool;
                this.b = listPolicy;
                this.c = decorationPolicy;
                this.d = bool2;
            }

            public final c a() {
                Boolean bool = this.a;
                h.c(bool);
                boolean booleanValue = bool.booleanValue();
                DecorationPolicy decorationPolicy = this.c;
                h.c(decorationPolicy);
                Boolean bool2 = this.d;
                ListPolicy listPolicy = this.b;
                h.c(listPolicy);
                return new c(booleanValue, decorationPolicy, bool2, listPolicy);
            }

            public final a b(DecorationPolicy decorationPolicy) {
                h.e(decorationPolicy, "decorationPolicy");
                this.c = decorationPolicy;
                return this;
            }

            public final a c(boolean z) {
                this.a = Boolean.valueOf(z);
                return this;
            }

            public final a d(Boolean bool) {
                this.d = bool;
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
                ListPolicy listPolicy = this.b;
                int hashCode2 = (hashCode + (listPolicy != null ? listPolicy.hashCode() : 0)) * 31;
                DecorationPolicy decorationPolicy = this.c;
                int hashCode3 = (hashCode2 + (decorationPolicy != null ? decorationPolicy.hashCode() : 0)) * 31;
                Boolean bool2 = this.d;
                if (bool2 != null) {
                    i = bool2.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Builder(includeEpisodes=");
                V0.append(this.a);
                V0.append(", additionalListPolicy=");
                V0.append(this.b);
                V0.append(", decorationPolicy=");
                V0.append(this.c);
                V0.append(", showUnavailableSongs=");
                V0.append(this.d);
                V0.append(")");
                return V0.toString();
            }

            public a(Boolean bool, ListPolicy listPolicy, DecorationPolicy decorationPolicy, Boolean bool2, int i) {
                int i2 = i & 1;
                listPolicy = (i & 2) != 0 ? null : listPolicy;
                int i3 = i & 4;
                int i4 = i & 8;
                this.a = null;
                this.b = listPolicy;
                this.c = null;
                this.d = null;
            }
        }

        public c(boolean z, DecorationPolicy decorationPolicy, Boolean bool, ListPolicy listPolicy) {
            h.e(decorationPolicy, "decorationPolicy");
            h.e(listPolicy, "additionalListPolicy");
            this.a = z;
            this.b = decorationPolicy;
            this.c = bool;
            this.d = listPolicy;
        }

        public final ListPolicy a() {
            return this.d;
        }

        public final DecorationPolicy b() {
            return this.b;
        }

        public final boolean c() {
            return this.a;
        }

        public final Boolean d() {
            return this.c;
        }

        public final a e() {
            return new a(Boolean.valueOf(this.a), this.d, this.b, this.c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && h.a(this.b, cVar.b) && h.a(this.c, cVar.c) && h.a(this.d, cVar.d);
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            DecorationPolicy decorationPolicy = this.b;
            int i5 = 0;
            int hashCode = (i4 + (decorationPolicy != null ? decorationPolicy.hashCode() : 0)) * 31;
            Boolean bool = this.c;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            ListPolicy listPolicy = this.d;
            if (listPolicy != null) {
                i5 = listPolicy.hashCode();
            }
            return hashCode2 + i5;
        }

        public String toString() {
            StringBuilder V0 = je.V0("External(includeEpisodes=");
            V0.append(this.a);
            V0.append(", decorationPolicy=");
            V0.append(this.b);
            V0.append(", showUnavailableSongs=");
            V0.append(this.c);
            V0.append(", additionalListPolicy=");
            V0.append(this.d);
            V0.append(")");
            return V0.toString();
        }
    }

    static {
        h.e(new c(false, DecorationPolicy.LARGE_WITHOUT_VIEWPORT, null, new ListPolicy(null, null, null, null, null, null, 63, null)), "external");
    }

    public PlaylistDataSourceConfiguration(c cVar, boolean z, Boolean bool, Boolean bool2, Integer num, boolean z2, boolean z3, boolean z4) {
        h.e(cVar, "external");
        this.a = cVar;
        this.b = z;
        this.c = bool;
        this.d = bool2;
        this.e = num;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public final c a() {
        return this.a;
    }

    public final Boolean b() {
        return this.d;
    }

    public final Boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistDataSourceConfiguration)) {
            return false;
        }
        PlaylistDataSourceConfiguration playlistDataSourceConfiguration = (PlaylistDataSourceConfiguration) obj;
        return h.a(this.a, playlistDataSourceConfiguration.a) && this.b == playlistDataSourceConfiguration.b && h.a(this.c, playlistDataSourceConfiguration.c) && h.a(this.d, playlistDataSourceConfiguration.d) && h.a(this.e, playlistDataSourceConfiguration.e) && this.f == playlistDataSourceConfiguration.f && this.g == playlistDataSourceConfiguration.g && this.h == playlistDataSourceConfiguration.h;
    }

    public final Integer f() {
        return this.e;
    }

    public final boolean g() {
        return this.b;
    }

    public final boolean h() {
        return this.h;
    }

    public int hashCode() {
        c cVar = this.a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        boolean z = this.b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        Boolean bool = this.c;
        int hashCode2 = (i7 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.d;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num = this.e;
        if (num != null) {
            i2 = num.hashCode();
        }
        int i8 = (hashCode3 + i2) * 31;
        boolean z2 = this.f;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        boolean z3 = this.g;
        if (z3) {
            z3 = true;
        }
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = z3 ? 1 : 0;
        int i16 = (i12 + i13) * 31;
        boolean z4 = this.h;
        if (!z4) {
            i3 = z4 ? 1 : 0;
        }
        return i16 + i3;
    }

    public final a i() {
        c cVar = this.a;
        Integer num = this.e;
        Boolean valueOf = Boolean.valueOf(this.b);
        Boolean bool = this.d;
        Boolean valueOf2 = Boolean.valueOf(this.g);
        return new a(cVar, valueOf, this.c, bool, num, Boolean.valueOf(this.f), valueOf2, Boolean.valueOf(this.h));
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaylistDataSourceConfiguration(external=");
        V0.append(this.a);
        V0.append(", loadRecommendations=");
        V0.append(this.b);
        V0.append(", includeTracksFromBannedArtists=");
        V0.append(this.c);
        V0.append(", includeBannedTracks=");
        V0.append(this.d);
        V0.append(", limitRangeTo=");
        V0.append(this.e);
        V0.append(", keepRangeLimitDuringPlayback=");
        V0.append(this.f);
        V0.append(", keepTextFilterDuringPlayback=");
        V0.append(this.g);
        V0.append(", persistSortOptionInPreferences=");
        return je.P0(V0, this.h, ")");
    }
}
