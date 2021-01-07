package defpackage;

/* renamed from: ugf  reason: default package */
public abstract class ugf {

    /* renamed from: ugf$a */
    public static final class a extends ugf {
        a() {
        }

        @Override // defpackage.ugf
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02) {
            return ti02.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NotPlaying{}";
        }
    }

    /* renamed from: ugf$b */
    public static final class b extends ugf {
        private final String a;
        private final String b;

        b(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        @Override // defpackage.ugf
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02) {
            return ti0.apply(this);
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
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
            StringBuilder V0 = je.V0("Playing{contextUri=");
            V0.append(this.a);
            V0.append(", trackUri=");
            return je.H0(V0, this.b, '}');
        }
    }

    ugf() {
    }

    public static ugf b() {
        return new a();
    }

    public static ugf c(String str, String str2) {
        return new b(str, str2);
    }

    public abstract <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02);
}
