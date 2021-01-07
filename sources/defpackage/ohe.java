package defpackage;

import com.spotify.signup.splitflow.h1;
import com.spotify.signup.splitflow.i0;
import com.spotify.signup.splitflow.k1;
import com.spotify.signup.splitflow.q;

/* renamed from: ohe  reason: default package */
public abstract class ohe {

    /* renamed from: ohe$a */
    public static final class a extends ohe {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        @Override // defpackage.ohe
        public final <R_> R_ i(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<g, R_> ti05, ti0<f, R_> ti06, ti0<e, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((zge) ti03).apply(this);
        }

        @Override // defpackage.ohe
        public final void j(si0<b> si0, si0<c> si02, si0<a> si03, si0<d> si04, si0<g> si05, si0<f> si06, si0<e> si07, si0<h> si08) {
        }

        public String toString() {
            return "EmailHintDismissed{}";
        }
    }

    /* renamed from: ohe$b */
    public static final class b extends ohe {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        @Override // defpackage.ohe
        public final <R_> R_ i(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<g, R_> ti05, ti0<f, R_> ti06, ti0<e, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((che) ti0).apply(this);
        }

        @Override // defpackage.ohe
        public final void j(si0<b> si0, si0<c> si02, si0<a> si03, si0<d> si04, si0<g> si05, si0<f> si06, si0<e> si07, si0<h> si08) {
        }

        public String toString() {
            return "EmailHintPickerRequested{}";
        }
    }

    /* renamed from: ohe$c */
    public static final class c extends ohe {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
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

        @Override // defpackage.ohe
        public final <R_> R_ i(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<g, R_> ti05, ti0<f, R_> ti06, ti0<e, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((bhe) ti02).apply(this);
        }

        @Override // defpackage.ohe
        public final void j(si0<b> si0, si0<c> si02, si0<a> si03, si0<d> si04, si0<g> si05, si0<f> si06, si0<e> si07, si0<h> si08) {
            ((i0) si02).a.m(this);
        }

        public final String k() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("EmailHintSelected{email="), this.a, '}');
        }
    }

    /* renamed from: ohe$d */
    public static final class d extends ohe {
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

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        @Override // defpackage.ohe
        public final <R_> R_ i(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<g, R_> ti05, ti0<f, R_> ti06, ti0<e, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((yge) ti04).apply(this);
        }

        @Override // defpackage.ohe
        public final void j(si0<b> si0, si0<c> si02, si0<a> si03, si0<d> si04, si0<g> si05, si0<f> si06, si0<e> si07, si0<h> si08) {
            ((h1) si04).a.t(this);
        }

        public final String k() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("EmailInputChanged{email="), this.a, '}');
        }
    }

    /* renamed from: ohe$e */
    public static final class e extends ohe {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        @Override // defpackage.ohe
        public final <R_> R_ i(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<g, R_> ti05, ti0<f, R_> ti06, ti0<e, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((ahe) ti07).apply(this);
        }

        @Override // defpackage.ohe
        public final void j(si0<b> si0, si0<c> si02, si0<a> si03, si0<d> si04, si0<g> si05, si0<f> si06, si0<e> si07, si0<h> si08) {
            ((k1) si07).a.H(this);
        }

        public String toString() {
            return "EmailSubmitted{}";
        }
    }

    /* renamed from: ohe$f */
    public static final class f extends ohe {
        private final hie a;
        private final boolean b;

        f(hie hie, boolean z) {
            hie.getClass();
            this.a = hie;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (fVar.b != this.b || !fVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.b, (this.a.hashCode() + 0) * 31);
        }

        @Override // defpackage.ohe
        public final <R_> R_ i(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<g, R_> ti05, ti0<f, R_> ti06, ti0<e, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((vge) ti06).apply(this);
        }

        @Override // defpackage.ohe
        public final void j(si0<b> si0, si0<c> si02, si0<a> si03, si0<d> si04, si0<g> si05, si0<f> si06, si0<e> si07, si0<h> si08) {
            ((q) si06).accept(this);
        }

        public final boolean k() {
            return this.b;
        }

        public final hie l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EmailVerificationReceived{response=");
            V0.append(this.a);
            V0.append(", navigateToNextWhenValidated=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: ohe$g */
    public static final class g extends ohe {
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

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        @Override // defpackage.ohe
        public final <R_> R_ i(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<g, R_> ti05, ti0<f, R_> ti06, ti0<e, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((xge) ti05).apply(this);
        }

        @Override // defpackage.ohe
        public final void j(si0<b> si0, si0<c> si02, si0<a> si03, si0<d> si04, si0<g> si05, si0<f> si06, si0<e> si07, si0<h> si08) {
        }

        public final String k() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("EmailVerificationRequested{email="), this.a, '}');
        }
    }

    /* renamed from: ohe$h */
    public static final class h extends ohe {
        private final boolean a;

        h(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof h) && ((h) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        @Override // defpackage.ohe
        public final <R_> R_ i(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<g, R_> ti05, ti0<f, R_> ti06, ti0<e, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((wge) ti08).apply(this);
        }

        @Override // defpackage.ohe
        public final void j(si0<b> si0, si0<c> si02, si0<a> si03, si0<d> si04, si0<g> si05, si0<f> si06, si0<e> si07, si0<h> si08) {
        }

        public final boolean k() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("InternetConnectionStateChanged{hasConnection="), this.a, '}');
        }
    }

    ohe() {
    }

    public static ohe a() {
        return new a();
    }

    public static ohe b() {
        return new b();
    }

    public static ohe c(String str) {
        return new c(str);
    }

    public static ohe d(String str) {
        return new d(str);
    }

    public static ohe e() {
        return new e();
    }

    public static ohe f(hie hie, boolean z) {
        return new f(hie, z);
    }

    public static ohe g(String str) {
        return new g(str);
    }

    public static ohe h(boolean z) {
        return new h(z);
    }

    public abstract <R_> R_ i(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<g, R_> ti05, ti0<f, R_> ti06, ti0<e, R_> ti07, ti0<h, R_> ti08);

    public abstract void j(si0<b> si0, si0<c> si02, si0<a> si03, si0<d> si04, si0<g> si05, si0<f> si06, si0<e> si07, si0<h> si08);
}
