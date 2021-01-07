package defpackage;

/* renamed from: ks2  reason: default package */
public abstract class ks2 {

    /* renamed from: ks2$a */
    public static final class a extends ks2 {
        private final String a;
        private final String b;
        private final boolean c;

        a(String str, String str2, boolean z) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            this.c = z;
        }

        @Override // defpackage.ks2
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02) {
            return (R_) ((hs2) ti0).apply(this);
        }

        public final boolean d() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.c != this.c || !aVar.a.equals(this.a) || !aVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.b;
        }

        public int hashCode() {
            return je.n(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("ConcatStringsRequested{stringOne=");
            V0.append(this.a);
            V0.append(", stringTwo=");
            V0.append(this.b);
            V0.append(", exercise=");
            return je.O0(V0, this.c, '}');
        }
    }

    /* renamed from: ks2$b */
    public static final class b extends ks2 {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.ks2
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02) {
            return (R_) ((is2) ti02).apply(this);
        }

        public final String d() {
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
            return je.H0(je.V0("StringsConcatenated{concatenated="), this.a, '}');
        }
    }

    ks2() {
    }

    public static ks2 a(String str, String str2, boolean z) {
        return new a(str, str2, z);
    }

    public static ks2 c(String str) {
        return new b(str);
    }

    public abstract <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02);
}
