package defpackage;

/* renamed from: zwd  reason: default package */
public abstract class zwd {

    /* renamed from: zwd$a */
    public static final class a extends zwd {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Failure{reasons="), this.a, '}');
        }
    }

    /* renamed from: zwd$b */
    public static final class b extends zwd {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Success{}";
        }
    }

    zwd() {
    }

    public static zwd a(String str) {
        return new a(str);
    }

    public static zwd b() {
        return new b();
    }
}
