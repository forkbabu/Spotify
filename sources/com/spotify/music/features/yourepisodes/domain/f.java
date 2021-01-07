package com.spotify.music.features.yourepisodes.domain;

import kotlin.jvm.internal.h;

public abstract class f {

    public static final class a extends f {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends f {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends f {
        private final b a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(null);
            h.e(bVar, "config");
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar != null) {
                return bVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayContext(config=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class d extends f {
        private final boolean a;

        public d(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && this.a == ((d) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("SetDownloadState(download="), this.a, ")");
        }
    }

    public static final class e extends f {
        private final d a;

        public final d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && h.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar != null) {
                return dVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SubscribeToContent(config=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public f(kotlin.jvm.internal.f fVar) {
    }
}
