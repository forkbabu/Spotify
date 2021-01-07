package defpackage;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: i2d  reason: default package */
public abstract class i2d {

    /* renamed from: i2d$a */
    public static final class a extends i2d {
        private final List<o8e> a;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o8e> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<? extends o8e> list) {
            super(null);
            h.e(list, "destinations");
            this.a = list;
        }

        public final List<o8e> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<o8e> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("DestinationsLoaded(destinations="), this.a, ")");
        }
    }

    /* renamed from: i2d$b */
    public static final class b extends i2d {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: i2d$c */
    public static final class c extends i2d {
        private final l2d a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(l2d l2d) {
            super(null);
            h.e(l2d, "result");
            this.a = l2d;
        }

        public final l2d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            l2d l2d = this.a;
            if (l2d != null) {
                return l2d.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShareFinished(result=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: i2d$d */
    public static final class d extends i2d {
        private final g2d<szc> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(g2d<szc> g2d) {
            super(null);
            h.e(g2d, "previewShareData");
            this.a = g2d;
        }

        public final g2d<szc> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && h.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            g2d<szc> g2d = this.a;
            if (g2d != null) {
                return g2d.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SharePreviewDataChanged(previewShareData=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: i2d$e */
    public static final class e extends i2d {
        private final o8e a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(o8e o8e, int i) {
            super(null);
            h.e(o8e, "destination");
            this.a = o8e;
            this.b = i;
        }

        public final o8e a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return h.a(this.a, eVar.a) && this.b == eVar.b;
        }

        public int hashCode() {
            o8e o8e = this.a;
            return ((o8e != null ? o8e.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShareRequested(destination=");
            V0.append(this.a);
            V0.append(", position=");
            return je.B0(V0, this.b, ")");
        }
    }

    private i2d() {
    }

    public i2d(f fVar) {
    }
}
