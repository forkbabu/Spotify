package com.spotify.instrumentation.navigation.logger;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class g {

    public static final class a extends g {
        private final d a;
        private final d b;
        private final f c;
        private final List<h> d;
        private final List<c> e;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.spotify.instrumentation.navigation.logger.h> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, d dVar2, f fVar, List<? extends h> list, List<c> list2) {
            super(null);
            h.e(dVar, "to");
            h.e(fVar, "action");
            h.e(list, "errors");
            h.e(list2, "recentInteractions");
            this.a = dVar;
            this.b = dVar2;
            this.c = fVar;
            this.d = list;
            this.e = list2;
        }

        public final f a() {
            return this.c;
        }

        public final List<h> b() {
            return this.d;
        }

        public final d c() {
            return this.b;
        }

        public final List<c> d() {
            return this.e;
        }

        public final d e() {
            return this.a;
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

        public int hashCode() {
            d dVar = this.a;
            int i = 0;
            int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
            d dVar2 = this.b;
            int hashCode2 = (hashCode + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
            f fVar = this.c;
            int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
            List<h> list = this.d;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<c> list2 = this.e;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NavigatedToLocation(to=");
            V0.append(this.a);
            V0.append(", from=");
            V0.append(this.b);
            V0.append(", action=");
            V0.append(this.c);
            V0.append(", errors=");
            V0.append(this.d);
            V0.append(", recentInteractions=");
            return je.L0(V0, this.e, ")");
        }
    }

    private g() {
    }

    public g(f fVar) {
    }
}
