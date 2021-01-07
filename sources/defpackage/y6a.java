package defpackage;

/* renamed from: y6a  reason: default package */
public abstract class y6a {

    /* renamed from: y6a$a */
    public static final class a extends y6a {
        a() {
        }

        @Override // defpackage.y6a
        public final <R_> R_ c(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti03.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Always{}";
        }
    }

    /* renamed from: y6a$b */
    public static final class b extends y6a {
        b() {
        }

        @Override // defpackage.y6a
        public final <R_> R_ c(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti02.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "InCar{}";
        }
    }

    /* renamed from: y6a$c */
    public static final class c extends y6a {
        c() {
        }

        @Override // defpackage.y6a
        public final <R_> R_ c(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti0.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Never{}";
        }
    }

    y6a() {
    }

    public static y6a a() {
        return new a();
    }

    public static y6a b() {
        return new b();
    }

    public static y6a d() {
        return new c();
    }

    public abstract <R_> R_ c(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03);
}
