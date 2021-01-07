package defpackage;

/* renamed from: qke  reason: default package */
public abstract class qke {

    /* renamed from: qke$a */
    public static final class a extends qke {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
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

        @Override // defpackage.qke
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<h, R_> ti07, ti0<c, R_> ti08, ti0<a, R_> ti09) {
            return (R_) ((cke) ti09).apply(this);
        }

        @Override // defpackage.qke
        public final void g(si0<b> si0, si0<d> si02, si0<f> si03, si0<e> si04, si0<g> si05, si0<i> si06, si0<h> si07, si0<c> si08, si0<a> si09) {
            si09.accept(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String l() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("ConnectionError{password="), this.a, '}');
        }
    }

    /* renamed from: qke$b */
    public static final class b extends qke {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        @Override // defpackage.qke
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<h, R_> ti07, ti0<c, R_> ti08, ti0<a, R_> ti09) {
            ((kke) ti0).apply(this);
            return "";
        }

        @Override // defpackage.qke
        public final void g(si0<b> si0, si0<d> si02, si0<f> si03, si0<e> si04, si0<g> si05, si0<i> si06, si0<h> si07, si0<c> si08, si0<a> si09) {
            si0.accept(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Empty{}";
        }
    }

    /* renamed from: qke$c */
    public static final class c extends qke {
        private final String a;
        private final String b;

        c(String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !gf0.e(cVar.b, this.b)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.qke
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<h, R_> ti07, ti0<c, R_> ti08, ti0<a, R_> ti09) {
            return (R_) ((dke) ti08).apply(this);
        }

        @Override // defpackage.qke
        public final void g(si0<b> si0, si0<d> si02, si0<f> si03, si0<e> si04, si0<g> si05, si0<i> si06, si0<h> si07, si0<c> si08, si0<a> si09) {
            si08.accept(this);
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

        public final String l() {
            return this.b;
        }

        public final String m() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ErrorFromRemote{password=");
            V0.append(this.a);
            V0.append(", errorMessage=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: qke$d */
    public static final class d extends qke {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
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

        @Override // defpackage.qke
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<h, R_> ti07, ti0<c, R_> ti08, ti0<a, R_> ti09) {
            return (R_) ((ake) ti02).apply(this);
        }

        @Override // defpackage.qke
        public final void g(si0<b> si0, si0<d> si02, si0<f> si03, si0<e> si04, si0<g> si05, si0<i> si06, si0<h> si07, si0<c> si08, si0<a> si09) {
            si02.accept(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String l() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("LocalUnverified{password="), this.a, '}');
        }
    }

    /* renamed from: qke$e */
    public static final class e extends qke {
        private final String a;

        e(String str) {
            str.getClass();
            this.a = str;
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

        @Override // defpackage.qke
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<h, R_> ti07, ti0<c, R_> ti08, ti0<a, R_> ti09) {
            return (R_) ((zje) ti04).apply(this);
        }

        @Override // defpackage.qke
        public final void g(si0<b> si0, si0<d> si02, si0<f> si03, si0<e> si04, si0<g> si05, si0<i> si06, si0<h> si07, si0<c> si08, si0<a> si09) {
            si04.accept(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String l() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("LocalValid{password="), this.a, '}');
        }
    }

    /* renamed from: qke$f */
    public static final class f extends qke {
        private final String a;

        f(String str) {
            str.getClass();
            this.a = str;
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

        @Override // defpackage.qke
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<h, R_> ti07, ti0<c, R_> ti08, ti0<a, R_> ti09) {
            return (R_) ((lke) ti03).apply(this);
        }

        @Override // defpackage.qke
        public final void g(si0<b> si0, si0<d> si02, si0<f> si03, si0<e> si04, si0<g> si05, si0<i> si06, si0<h> si07, si0<c> si08, si0<a> si09) {
            si03.accept(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String l() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("RemoteUnverified{password="), this.a, '}');
        }
    }

    /* renamed from: qke$g */
    public static final class g extends qke {
        private final String a;

        g(String str) {
            str.getClass();
            this.a = str;
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

        @Override // defpackage.qke
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<h, R_> ti07, ti0<c, R_> ti08, ti0<a, R_> ti09) {
            return (R_) ((fke) ti05).apply(this);
        }

        @Override // defpackage.qke
        public final void g(si0<b> si0, si0<d> si02, si0<f> si03, si0<e> si04, si0<g> si05, si0<i> si06, si0<h> si07, si0<c> si08, si0<a> si09) {
            si05.accept(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String l() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("RemoteValid{password="), this.a, '}');
        }
    }

    /* renamed from: qke$h */
    public static final class h extends qke {
        private final String a;

        h(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        @Override // defpackage.qke
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<h, R_> ti07, ti0<c, R_> ti08, ti0<a, R_> ti09) {
            return (R_) ((bke) ti07).apply(this);
        }

        @Override // defpackage.qke
        public final void g(si0<b> si0, si0<d> si02, si0<f> si03, si0<e> si04, si0<g> si05, si0<i> si06, si0<h> si07, si0<c> si08, si0<a> si09) {
            si07.accept(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String l() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("TooShort{password="), this.a, '}');
        }
    }

    /* renamed from: qke$i */
    public static final class i extends qke {
        private final String a;

        i(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            return ((i) obj).a.equals(this.a);
        }

        @Override // defpackage.qke
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<h, R_> ti07, ti0<c, R_> ti08, ti0<a, R_> ti09) {
            return (R_) ((eke) ti06).apply(this);
        }

        @Override // defpackage.qke
        public final void g(si0<b> si0, si0<d> si02, si0<f> si03, si0<e> si04, si0<g> si05, si0<i> si06, si0<h> si07, si0<c> si08, si0<a> si09) {
            si06.accept(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String l() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("TooWeak{password="), this.a, '}');
        }
    }

    qke() {
    }

    public static qke a(String str) {
        return new a(str);
    }

    public static qke b() {
        return new b();
    }

    public static qke c(String str, String str2) {
        return new c(str, str2);
    }

    public static qke d(String str) {
        return new d(str);
    }

    public static qke e(String str) {
        return new e(str);
    }

    public static qke h(String str) {
        return new f(str);
    }

    public static qke i(String str) {
        return new g(str);
    }

    public static qke j(String str) {
        return new h(str);
    }

    public static qke k(String str) {
        return new i(str);
    }

    public abstract <R_> R_ f(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<h, R_> ti07, ti0<c, R_> ti08, ti0<a, R_> ti09);

    public abstract void g(si0<b> si0, si0<d> si02, si0<f> si03, si0<e> si04, si0<g> si05, si0<i> si06, si0<h> si07, si0<c> si08, si0<a> si09);
}
