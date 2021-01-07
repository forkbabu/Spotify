package defpackage;

/* renamed from: eve  reason: default package */
public abstract class eve {

    /* renamed from: eve$a */
    public static final class a extends eve {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti09.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Error{}";
        }
    }

    /* renamed from: eve$b */
    public static final class b extends eve {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
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

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti04.apply(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String n() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("FinalResponse{transcript="), this.a, '}');
        }
    }

    /* renamed from: eve$c */
    public static final class c extends eve {
        private final com.spotify.voice.results.model.e a;

        c(com.spotify.voice.results.model.e eVar) {
            eVar.getClass();
            this.a = eVar;
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

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti05.apply(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final com.spotify.voice.results.model.e n() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Fulfillment{model=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: eve$d */
    public static final class d extends eve {
        private final int a;

        d(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof d) && ((d) obj).a == this.a) {
                return true;
            }
            return false;
        }

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti012.apply(this);
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public final int n() {
            return this.a;
        }

        public String toString() {
            return je.A0(je.V0("Idle{suggestions="), this.a, '}');
        }
    }

    /* renamed from: eve$e */
    public static final class e extends eve {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti0.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Init{}";
        }
    }

    /* renamed from: eve$f */
    public static final class f extends eve {
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

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti03.apply(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String n() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("IntermediateResponse{transcript="), this.a, '}');
        }
    }

    /* renamed from: eve$g */
    public static final class g extends eve {
        private final boolean a;

        g(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof g) && ((g) obj).a == this.a) {
                return true;
            }
            return false;
        }

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti02.apply(this);
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean n() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("Listening{showSuggestions="), this.a, '}');
        }
    }

    /* renamed from: eve$h */
    public static final class h extends eve {
        h() {
        }

        public boolean equals(Object obj) {
            return obj instanceof h;
        }

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti06.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "MicPermissionsError{}";
        }
    }

    /* renamed from: eve$i */
    public static final class i extends eve {
        i() {
        }

        public boolean equals(Object obj) {
            return obj instanceof i;
        }

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti07.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OfflineError{}";
        }
    }

    /* renamed from: eve$j */
    public static final class j extends eve {
        private final String a;

        j(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            return ((j) obj).a.equals(this.a);
        }

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti010.apply(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String n() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("ResponseError{reason="), this.a, '}');
        }
    }

    /* renamed from: eve$k */
    public static final class k extends eve {
        private final String a;
        private final String b;
        private final com.spotify.voice.results.model.e c;

        k(String str, String str2, com.spotify.voice.results.model.e eVar) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            eVar.getClass();
            this.c = eVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (!kVar.a.equals(this.a) || !kVar.b.equals(this.b) || !kVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti011.apply(this);
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public final String n() {
            return this.b;
        }

        public final String o() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Restrictions{header=");
            V0.append(this.a);
            V0.append(", detail=");
            V0.append(this.b);
            V0.append(", resultsPageModel=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: eve$l */
    public static final class l extends eve {
        l() {
        }

        public boolean equals(Object obj) {
            return obj instanceof l;
        }

        @Override // defpackage.eve
        public final <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012) {
            return ti08.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "UnsupportedAction{}";
        }
    }

    eve() {
    }

    public static eve a() {
        return new a();
    }

    public static eve b(String str) {
        return new b(str);
    }

    public static eve c(com.spotify.voice.results.model.e eVar) {
        return new c(eVar);
    }

    public static eve d(int i2) {
        return new d(i2);
    }

    public static eve e() {
        return new e();
    }

    public static eve f(String str) {
        return new f(str);
    }

    public static eve g(boolean z) {
        return new g(z);
    }

    public static eve i() {
        return new h();
    }

    public static eve j() {
        return new i();
    }

    public static eve k(String str) {
        return new j(str);
    }

    public static eve l(String str, String str2, com.spotify.voice.results.model.e eVar) {
        return new k(str, str2, eVar);
    }

    public static eve m() {
        return new l();
    }

    public abstract <R_> R_ h(ti0<e, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<b, R_> ti04, ti0<c, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<l, R_> ti08, ti0<a, R_> ti09, ti0<j, R_> ti010, ti0<k, R_> ti011, ti0<d, R_> ti012);
}
