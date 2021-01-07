package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: ee2  reason: default package */
public abstract class ee2 {

    /* renamed from: ee2$a */
    public static final class a extends ee2 {
        private final String a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            h.e(str, "state");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error(state=");
            V0.append(this.a);
            V0.append(", error=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: ee2$b */
    public static final class b extends ee2 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: ee2$c */
    public static final class c extends ee2 {
        private final String a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(null);
            h.e(str, "state");
            h.e(str2, "code");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.a(this.a, cVar.a) && h.a(this.b, cVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Success(state=");
            V0.append(this.a);
            V0.append(", code=");
            return je.I0(V0, this.b, ")");
        }
    }

    private ee2() {
    }

    public ee2(f fVar) {
    }
}
