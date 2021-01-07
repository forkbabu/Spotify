package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import com.spotify.magiclink.setpassword.g;
import com.spotify.magiclink.setpassword.i;
import com.spotify.magiclink.setpassword.j;

/* renamed from: r21  reason: default package */
public abstract class r21 {

    /* renamed from: r21$a */
    public static final class a extends r21 {
        a() {
        }

        @Override // defpackage.r21
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ((w11) ti06).apply(this);
        }

        @Override // defpackage.r21
        public final void c(si0<b> si0, si0<c> si02, si0<f> si03, si0<e> si04, si0<d> si05, si0<a> si06) {
            ((com.spotify.magiclink.setpassword.f) si06).a.k(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "CredentialSaved{}";
        }
    }

    /* renamed from: r21$b */
    public static final class b extends r21 {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.r21
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ((v11) ti0).apply(this);
        }

        @Override // defpackage.r21
        public final void c(si0<b> si0, si0<c> si02, si0<f> si03, si0<e> si04, si0<d> si05, si0<a> si06) {
            ((j) si0).a.h(this);
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

        public final String i() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("PasswordChanged{password="), this.a, '}');
        }
    }

    /* renamed from: r21$c */
    public static final class c extends r21 {
        private final String a;
        private final PasswordValidator.PasswordValidation b;

        c(String str, PasswordValidator.PasswordValidation passwordValidation) {
            str.getClass();
            this.a = str;
            passwordValidation.getClass();
            this.b = passwordValidation;
        }

        @Override // defpackage.r21
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ((y11) ti02).apply(this);
        }

        @Override // defpackage.r21
        public final void c(si0<b> si0, si0<c> si02, si0<f> si03, si0<e> si04, si0<d> si05, si0<a> si06) {
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.b != this.b || !cVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public final String i() {
            return this.a;
        }

        public final PasswordValidator.PasswordValidation j() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PasswordValidated{password=");
            V0.append(this.a);
            V0.append(", valid=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: r21$d */
    public static final class d extends r21 {
        d() {
        }

        @Override // defpackage.r21
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ((t11) ti05).apply(this);
        }

        @Override // defpackage.r21
        public final void c(si0<b> si0, si0<c> si02, si0<f> si03, si0<e> si04, si0<d> si05, si0<a> si06) {
            ((g) si05).a.j(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SavePasswordClicked{}";
        }
    }

    /* renamed from: r21$e */
    public static final class e extends r21 {
        private final String a;
        private final String b;
        private final s21 c;

        e(String str, String str2, s21 s21) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            s21.getClass();
            this.c = s21;
        }

        @Override // defpackage.r21
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ((x11) ti04).apply(this);
        }

        @Override // defpackage.r21
        public final void c(si0<b> si0, si0<c> si02, si0<f> si03, si0<e> si04, si0<d> si05, si0<a> si06) {
            ((i) si04).accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!eVar.a.equals(this.a) || !eVar.b.equals(this.b) || !eVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public final String i() {
            return this.a;
        }

        public final s21 j() {
            return this.c;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SavePasswordFailed{password=");
            V0.append(this.a);
            V0.append(", username=");
            V0.append(this.b);
            V0.append(", reason=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: r21$f */
    public static final class f extends r21 {
        private final String a;
        private final String b;

        f(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        @Override // defpackage.r21
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ((b21) ti03).apply(this);
        }

        @Override // defpackage.r21
        public final void c(si0<b> si0, si0<c> si02, si0<f> si03, si0<e> si04, si0<d> si05, si0<a> si06) {
            ((com.spotify.magiclink.setpassword.e) si03).a.i(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (!fVar.a.equals(this.a) || !fVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public final String i() {
            return this.a;
        }

        public final String j() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SavePasswordSuccessful{password=");
            V0.append(this.a);
            V0.append(", username=");
            return je.H0(V0, this.b, '}');
        }
    }

    r21() {
    }

    public static r21 a() {
        return new a();
    }

    public static r21 d(String str) {
        return new b(str);
    }

    public static r21 e(String str, PasswordValidator.PasswordValidation passwordValidation) {
        return new c(str, passwordValidation);
    }

    public static r21 f() {
        return new d();
    }

    public static r21 g(String str, String str2, s21 s21) {
        return new e(str, str2, s21);
    }

    public static r21 h(String str, String str2) {
        return new f(str, str2);
    }

    public abstract <R_> R_ b(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<a, R_> ti06);

    public abstract void c(si0<b> si0, si0<c> si02, si0<f> si03, si0<e> si04, si0<d> si05, si0<a> si06);
}
