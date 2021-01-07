package defpackage;

/* renamed from: qhe  reason: default package */
public abstract class qhe {

    /* renamed from: qhe$a */
    public static final class a extends qhe {
        a() {
        }

        @Override // defpackage.qhe
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<f, R_> ti04, ti0<d, R_> ti05, ti0<e, R_> ti06) {
            ((ghe) ti0).apply(this);
            return "";
        }

        @Override // defpackage.qhe
        public final void d(si0<a> si0, si0<b> si02, si0<c> si03, si0<f> si04, si0<d> si05, si0<e> si06) {
            si0.accept(this);
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

    /* renamed from: qhe$b */
    public static final class b extends qhe {
        private final String a;
        private final int b;

        b(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        @Override // defpackage.qhe
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<f, R_> ti04, ti0<d, R_> ti05, ti0<e, R_> ti06) {
            return (R_) ((sge) ti02).apply(this);
        }

        @Override // defpackage.qhe
        public final void d(si0<a> si0, si0<b> si02, si0<c> si03, si0<f> si04, si0<d> si05, si0<e> si06) {
            si02.accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.b != this.b || !bVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            return je.b(this.b, je.Y0(this.a, 0, 31));
        }

        public final int i() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Invalid{email=");
            V0.append(this.a);
            V0.append(", status=");
            return je.A0(V0, this.b, '}');
        }
    }

    /* renamed from: qhe$c */
    public static final class c extends qhe {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.qhe
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<f, R_> ti04, ti0<d, R_> ti05, ti0<e, R_> ti06) {
            return (R_) ((jhe) ti03).apply(this);
        }

        @Override // defpackage.qhe
        public final void d(si0<a> si0, si0<b> si02, si0<c> si03, si0<f> si04, si0<d> si05, si0<e> si06) {
            si03.accept(this);
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

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("ValidUnverified{email="), this.a, '}');
        }
    }

    /* renamed from: qhe$d */
    public static final class d extends qhe {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.qhe
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<f, R_> ti04, ti0<d, R_> ti05, ti0<e, R_> ti06) {
            return (R_) ((uge) ti05).apply(this);
        }

        @Override // defpackage.qhe
        public final void d(si0<a> si0, si0<b> si02, si0<c> si03, si0<f> si04, si0<d> si05, si0<e> si06) {
            si05.accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("ValidVerified{email="), this.a, '}');
        }
    }

    /* renamed from: qhe$e */
    public static final class e extends qhe {
        private final String a;
        private final String b;

        e(String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.qhe
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<f, R_> ti04, ti0<d, R_> ti05, ti0<e, R_> ti06) {
            return (R_) ((khe) ti06).apply(this);
        }

        @Override // defpackage.qhe
        public final void d(si0<a> si0, si0<b> si02, si0<c> si03, si0<f> si04, si0<d> si05, si0<e> si06) {
            si06.accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!eVar.a.equals(this.a) || !gf0.e(eVar.b, this.b)) {
                return false;
            }
            return true;
        }

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            int i = 0;
            int Y0 = je.Y0(this.a, 0, 31);
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return Y0 + i;
        }

        public final String i() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ValidationFailed{email=");
            V0.append(this.a);
            V0.append(", error=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: qhe$f */
    public static final class f extends qhe {
        private final String a;

        f(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.qhe
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<f, R_> ti04, ti0<d, R_> ti05, ti0<e, R_> ti06) {
            return (R_) ((hhe) ti04).apply(this);
        }

        @Override // defpackage.qhe
        public final void d(si0<a> si0, si0<b> si02, si0<c> si03, si0<f> si04, si0<d> si05, si0<e> si06) {
            si04.accept(this);
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

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Verifying{email="), this.a, '}');
        }
    }

    qhe() {
    }

    public static qhe a() {
        return new a();
    }

    public static qhe b(String str, int i) {
        return new b(str, i);
    }

    public static qhe e(String str) {
        return new c(str);
    }

    public static qhe f(String str) {
        return new d(str);
    }

    public static qhe g(String str) {
        return new f(str);
    }

    public abstract <R_> R_ c(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<f, R_> ti04, ti0<d, R_> ti05, ti0<e, R_> ti06);

    public abstract void d(si0<a> si0, si0<b> si02, si0<c> si03, si0<f> si04, si0<d> si05, si0<e> si06);
}
