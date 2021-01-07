package defpackage;

/* renamed from: p21  reason: default package */
public abstract class p21 {

    /* renamed from: p21$a */
    public static final class a extends p21 {
        a() {
        }

        @Override // defpackage.p21
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<f, R_> ti02, ti0<b, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<e, R_> ti06, ti0<d, R_> ti07) {
            return ti0.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Empty{}";
        }
    }

    /* renamed from: p21$b */
    public static final class b extends p21 {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.p21
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<f, R_> ti02, ti0<b, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<e, R_> ti06, ti0<d, R_> ti07) {
            return ti03.apply(this);
        }

        public final String b() {
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
            return je.H0(je.V0("Invalid{password="), this.a, '}');
        }
    }

    /* renamed from: p21$c */
    public static final class c extends p21 {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.p21
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<f, R_> ti02, ti0<b, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<e, R_> ti06, ti0<d, R_> ti07) {
            return ti05.apply(this);
        }

        public final String b() {
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
            return je.H0(je.V0("Saving{password="), this.a, '}');
        }
    }

    /* renamed from: p21$d */
    public static final class d extends p21 {
    }

    /* renamed from: p21$e */
    public static final class e extends p21 {
        private final String a;

        e(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.p21
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<f, R_> ti02, ti0<b, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<e, R_> ti06, ti0<d, R_> ti07) {
            return ti06.apply(this);
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Storing{password="), this.a, '}');
        }
    }

    /* renamed from: p21$f */
    public static final class f extends p21 {
        private final String a;

        f(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.p21
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<f, R_> ti02, ti0<b, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<e, R_> ti06, ti0<d, R_> ti07) {
            return ti02.apply(this);
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Unverified{password="), this.a, '}');
        }
    }

    /* renamed from: p21$g */
    public static final class g extends p21 {
        private final String a;

        g(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.p21
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<f, R_> ti02, ti0<b, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<e, R_> ti06, ti0<d, R_> ti07) {
            return ti04.apply(this);
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Valid{password="), this.a, '}');
        }
    }

    p21() {
    }

    public abstract <R_> R_ a(ti0<a, R_> ti0, ti0<f, R_> ti02, ti0<b, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<e, R_> ti06, ti0<d, R_> ti07);
}
