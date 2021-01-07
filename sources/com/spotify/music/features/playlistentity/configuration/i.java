package com.spotify.music.features.playlistentity.configuration;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class i {
    public static final b c = new b(null);
    private final c a;
    private final boolean b;

    public static final class a {
        private c a;
        private Boolean b;

        public a() {
            this(null, null, 3);
        }

        public a(c cVar, Boolean bool) {
            this.a = cVar;
            this.b = bool;
        }

        public final a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final i b() {
            c cVar = this.a;
            h.c(cVar);
            Boolean bool = this.b;
            h.c(bool);
            return new i(cVar, bool.booleanValue());
        }

        public final a c(c cVar) {
            h.e(cVar, "external");
            this.a = cVar;
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
            c cVar = this.a;
            int i = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            Boolean bool = this.b;
            if (bool != null) {
                i = bool.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(external=");
            V0.append(this.a);
            V0.append(", allowAutoPlayEpisode=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }

        public a(c cVar, Boolean bool, int i) {
            int i2 = i & 1;
            int i3 = i & 2;
            this.a = null;
            this.b = null;
        }
    }

    public static final class b {
        public b(f fVar) {
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
                this.b = Boolean.valueOf(z);
                return this;
            }

            public final a d(boolean z) {
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
                StringBuilder V0 = je.V0("Builder(showNumbers=");
                V0.append(this.a);
                V0.append(", shouldShuffleTrackCloud=");
                V0.append(this.b);
                V0.append(", openNpvWhenStartingPlaybackOfVideoItem=");
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
            return this.b;
        }

        public final boolean c() {
            return this.a;
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
            StringBuilder V0 = je.V0("External(showNumbers=");
            V0.append(this.a);
            V0.append(", shouldShuffleTrackCloud=");
            V0.append(this.b);
            V0.append(", openNpvWhenStartingPlaybackOfVideoItem=");
            return je.P0(V0, this.c, ")");
        }
    }

    static {
        h.e(new c(false, false, false), "external");
    }

    public i(c cVar, boolean z) {
        h.e(cVar, "external");
        this.a = cVar;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final c b() {
        return this.a;
    }

    public final a c() {
        return new a(this.a, Boolean.valueOf(this.b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.a(this.a, iVar.a) && this.b == iVar.b;
    }

    public int hashCode() {
        c cVar = this.a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackCloudConfiguration(external=");
        V0.append(this.a);
        V0.append(", allowAutoPlayEpisode=");
        return je.P0(V0, this.b, ")");
    }
}
