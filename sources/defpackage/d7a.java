package defpackage;

/* renamed from: d7a  reason: default package */
public abstract class d7a {

    /* renamed from: d7a$a */
    public static final class a extends d7a {
        a() {
        }

        @Override // defpackage.d7a
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti03.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Active{}";
        }
    }

    /* renamed from: d7a$b */
    public static final class b extends d7a {
        b() {
        }

        @Override // defpackage.d7a
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti02.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Available{}";
        }
    }

    /* renamed from: d7a$c */
    public static final class c extends d7a {
        c() {
        }

        @Override // defpackage.d7a
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti0.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Unavailable{}";
        }
    }

    d7a() {
    }

    public static d7a b() {
        return new c();
    }

    public abstract <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03);
}
