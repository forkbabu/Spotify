package defpackage;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: h2d  reason: default package */
public abstract class h2d {

    /* renamed from: h2d$a */
    public static final class a extends h2d {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: h2d$b */
    public static final class b extends h2d {
        private final pzc a;
        private final List<Integer> b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(pzc pzc, List<Integer> list) {
            super(null);
            h.e(pzc, "shareData");
            h.e(list, "excludedDestinationIds");
            this.a = pzc;
            this.b = list;
        }

        public final List<Integer> a() {
            return this.b;
        }

        public final pzc b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
        }

        public int hashCode() {
            pzc pzc = this.a;
            int i = 0;
            int hashCode = (pzc != null ? pzc.hashCode() : 0) * 31;
            List<Integer> list = this.b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FetchShareDestinations(shareData=");
            V0.append(this.a);
            V0.append(", excludedDestinationIds=");
            return je.L0(V0, this.b, ")");
        }
    }

    /* renamed from: h2d$c */
    public static final class c extends h2d {
        private final pzc a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(pzc pzc) {
            super(null);
            h.e(pzc, "shareData");
            this.a = pzc;
        }

        public final pzc a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            pzc pzc = this.a;
            if (pzc != null) {
                return pzc.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FetchSharePreviewData(shareData=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: h2d$d */
    public static final class d extends h2d {
        private final pzc a;
        private final o8e b;
        private final m2d c;
        private final int d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(pzc pzc, o8e o8e, m2d m2d, int i) {
            super(null);
            h.e(pzc, "shareData");
            h.e(o8e, "shareDestination");
            h.e(m2d, "sourcePage");
            this.a = pzc;
            this.b = o8e;
            this.c = m2d;
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public final pzc b() {
            return this.a;
        }

        public final o8e c() {
            return this.b;
        }

        public final m2d d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return h.a(this.a, dVar.a) && h.a(this.b, dVar.b) && h.a(this.c, dVar.c) && this.d == dVar.d;
        }

        public int hashCode() {
            pzc pzc = this.a;
            int i = 0;
            int hashCode = (pzc != null ? pzc.hashCode() : 0) * 31;
            o8e o8e = this.b;
            int hashCode2 = (hashCode + (o8e != null ? o8e.hashCode() : 0)) * 31;
            m2d m2d = this.c;
            if (m2d != null) {
                i = m2d.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.d;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PerformShare(shareData=");
            V0.append(this.a);
            V0.append(", shareDestination=");
            V0.append(this.b);
            V0.append(", sourcePage=");
            V0.append(this.c);
            V0.append(", position=");
            return je.B0(V0, this.d, ")");
        }
    }

    public h2d(f fVar) {
    }
}
