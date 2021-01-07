package com.spotify.instrumentation.navigation.logger;

import kotlin.jvm.internal.h;

public abstract class b {

    public static final class a extends b {
        private final d a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(null);
            h.e(dVar, "backgroundLocation");
            this.a = dVar;
        }

        public final d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
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

        @Override // com.spotify.instrumentation.navigation.logger.b
        public String toString() {
            StringBuilder V0 = je.V0("AppBackground(backgroundLocation=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: com.spotify.instrumentation.navigation.logger.b$b  reason: collision with other inner class name */
    public static final class C0159b extends b {
        public static final C0159b a = new C0159b();

        private C0159b() {
            super(null);
        }
    }

    public static final class c extends b {
        private final c a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(c cVar) {
            super(null);
            h.e(cVar, "interaction");
            this.a = cVar;
        }

        public final c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        @Override // com.spotify.instrumentation.navigation.logger.b
        public String toString() {
            StringBuilder V0 = je.V0("InteractionSeen(interaction=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class d extends b {
        private final f a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(f fVar, String str) {
            super(null);
            h.e(fVar, "action");
            h.e(str, "locationChangerIdentity");
            this.a = fVar;
            this.b = str;
        }

        public final f a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return h.a(this.a, dVar.a) && h.a(this.b, dVar.b);
        }

        public int hashCode() {
            f fVar = this.a;
            int i = 0;
            int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        @Override // com.spotify.instrumentation.navigation.logger.b
        public String toString() {
            StringBuilder V0 = je.V0("LocationChanging(action=");
            V0.append(this.a);
            V0.append(", locationChangerIdentity=");
            return je.I0(V0, this.b, ")");
        }
    }

    public static final class e extends b {
        private final d a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(null);
            h.e(dVar, "newLocation");
            this.a = dVar;
        }

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

        @Override // com.spotify.instrumentation.navigation.logger.b
        public String toString() {
            StringBuilder V0 = je.V0("NavigationCompleted(newLocation=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class f extends b {
        private final f a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(f fVar) {
            super(null);
            h.e(fVar, "action");
            this.a = fVar;
        }

        public final f a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && h.a(this.a, ((f) obj).a);
            }
            return true;
        }

        public int hashCode() {
            f fVar = this.a;
            if (fVar != null) {
                return fVar.hashCode();
            }
            return 0;
        }

        @Override // com.spotify.instrumentation.navigation.logger.b
        public String toString() {
            StringBuilder V0 = je.V0("NavigationRequested(action=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private b() {
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public b(kotlin.jvm.internal.f fVar) {
    }
}
