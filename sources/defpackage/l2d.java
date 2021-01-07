package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: l2d  reason: default package */
public abstract class l2d {

    /* renamed from: l2d$a */
    public static final class a extends l2d {
        private final o8e a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o8e o8e, int i) {
            super(null);
            h.e(o8e, "shareDestination");
            this.a = o8e;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final o8e b() {
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
            return h.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            o8e o8e = this.a;
            return ((o8e != null ? o8e.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error(shareDestination=");
            V0.append(this.a);
            V0.append(", position=");
            return je.B0(V0, this.b, ")");
        }
    }

    /* renamed from: l2d$b */
    public static final class b extends l2d {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: l2d$c */
    public static final class c extends l2d {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public l2d(f fVar) {
    }
}
