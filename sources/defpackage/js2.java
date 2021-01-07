package defpackage;

/* renamed from: js2  reason: default package */
public abstract class js2 {

    /* renamed from: js2$a */
    public static final class a extends js2 {
        private final String a;
        private final String b;

        a(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a.equals(this.a) || !aVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ConcatExercise{stringOne=");
            V0.append(this.a);
            V0.append(", stringTwo=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: js2$b */
    public static final class b extends js2 {
        private final String a;
        private final String b;

        b(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a.equals(this.a) || !bVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ConcatStrings{stringOne=");
            V0.append(this.a);
            V0.append(", stringTwo=");
            return je.H0(V0, this.b, '}');
        }
    }

    js2() {
    }
}
