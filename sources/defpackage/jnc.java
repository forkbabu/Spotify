package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: jnc  reason: default package */
public abstract class jnc {

    /* renamed from: jnc$a */
    public static final class a extends jnc {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            h.e(str, "failureCause");
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Error(failureCause="), this.a, ")");
        }
    }

    /* renamed from: jnc$b */
    public static final class b extends jnc {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public jnc(f fVar) {
    }
}
