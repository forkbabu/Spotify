package defpackage;

/* renamed from: o21  reason: default package */
public abstract class o21 {

    /* renamed from: o21$a */
    public static final class a extends o21 {
        private final s21 a;

        a(s21 s21) {
            s21.getClass();
            this.a = s21;
        }

        public final s21 a() {
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
            StringBuilder V0 = je.V0("Error{error=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: o21$b */
    public static final class b extends o21 {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "None{}";
        }
    }

    o21() {
    }
}
