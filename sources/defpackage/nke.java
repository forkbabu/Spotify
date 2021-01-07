package defpackage;

/* renamed from: nke  reason: default package */
public abstract class nke {

    /* renamed from: nke$a */
    public static final class a extends nke {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
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
            return "LocalVerifyPassword{password=***}";
        }
    }

    /* renamed from: nke$b */
    public static final class b extends nke {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateToNext{}";
        }
    }

    /* renamed from: nke$c */
    public static final class c extends nke {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return "RemoteVerifyPassword{password=***}";
        }
    }

    nke() {
    }
}
