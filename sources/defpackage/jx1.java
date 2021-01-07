package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: jx1  reason: default package */
public abstract class jx1 {

    /* renamed from: jx1$a */
    public static final class a extends jx1 {
        private final long a;
        private final TimeUnit b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(long j, TimeUnit timeUnit) {
            super(null);
            h.e(timeUnit, "timeUnit");
            this.a = j;
            this.b = timeUnit;
        }

        public final long a() {
            return this.a;
        }

        public final TimeUnit b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && h.a(this.b, aVar.b);
        }

        public int hashCode() {
            int a2 = e.a(this.a) * 31;
            TimeUnit timeUnit = this.b;
            return a2 + (timeUnit != null ? timeUnit.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Fixed(duration=");
            V0.append(this.a);
            V0.append(", timeUnit=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: jx1$b */
    public static final class b extends jx1 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public jx1(f fVar) {
    }
}
