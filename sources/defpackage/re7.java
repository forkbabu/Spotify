package defpackage;

/* renamed from: re7  reason: default package */
public abstract class re7 {

    /* renamed from: re7$a */
    public static final class a extends re7 {
        private final String a;

        a(String str) {
            this.a = str;
        }

        @Override // defpackage.re7
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02) {
            return ti0.apply(this);
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return gf0.e(((a) obj).a, this.a);
        }

        public int hashCode() {
            String str = this.a;
            return 0 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return je.H0(je.V0("Failure{message="), this.a, '}');
        }
    }

    /* renamed from: re7$b */
    public static final class b extends re7 {
        private final b91 a;

        b(b91 b91) {
            b91.getClass();
            this.a = b91;
        }

        @Override // defpackage.re7
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02) {
            return ti02.apply(this);
        }

        public final b91 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Success{hubsViewModel=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    re7() {
    }

    public abstract <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02);
}
