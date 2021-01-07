package defpackage;

/* renamed from: yya  reason: default package */
public abstract class yya {

    /* renamed from: yya$a */
    public static final class a extends yya {
        a() {
        }

        @Override // defpackage.yya
        public final <R_> R_ b(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti03.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "History{}";
        }
    }

    /* renamed from: yya$b */
    public static final class b extends yya {
        b() {
        }

        @Override // defpackage.yya
        public final <R_> R_ b(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti02.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Offline{}";
        }
    }

    /* renamed from: yya$c */
    public static final class c extends yya {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.yya
        public final <R_> R_ b(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti0.apply(this);
        }

        public final String e() {
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
            return je.H0(je.V0("Online{requestId="), this.a, '}');
        }
    }

    yya() {
    }

    public static yya a() {
        return new a();
    }

    public static yya c() {
        return new b();
    }

    public static yya d(String str) {
        return new c(str);
    }

    public abstract <R_> R_ b(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03);
}
