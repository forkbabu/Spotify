package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: lx1  reason: default package */
public abstract class lx1 {

    /* renamed from: lx1$a */
    public static final class a extends lx1 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: lx1$b */
    public static final class b extends lx1 {
        private final hx1 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(hx1 hx1) {
            super(null);
            h.e(hx1, "story");
            this.a = hx1;
        }

        public final hx1 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            hx1 hx1 = this.a;
            if (hx1 != null) {
                return hx1.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Success(story=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private lx1() {
    }

    public lx1(f fVar) {
    }
}
