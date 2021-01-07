package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import com.spotify.libs.signup.validators.c;
import com.spotify.signup.splitflow.j;
import com.spotify.signup.splitflow.o;

/* renamed from: oke  reason: default package */
public abstract class oke {

    /* renamed from: oke$a */
    public static final class a extends oke {
        private final String a;
        private final PasswordValidator.PasswordValidation b;

        a(String str, PasswordValidator.PasswordValidation passwordValidation) {
            str.getClass();
            this.a = str;
            passwordValidation.getClass();
            this.b = passwordValidation;
        }

        @Override // defpackage.oke
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<d, R_> ti03, ti0<c, R_> ti04) {
            return (R_) ((jke) ti02).apply(this);
        }

        @Override // defpackage.oke
        public final void c(si0<b> si0, si0<a> si02, si0<d> si03, si0<c> si04) {
            ((j) si02).a.o(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.b != this.b || !aVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public final String g() {
            return this.a;
        }

        public final PasswordValidator.PasswordValidation h() {
            return this.b;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder a1 = je.a1("LocalPasswordValidationReceived{password=", "***", ", validation=");
            a1.append(this.b);
            a1.append('}');
            return a1.toString();
        }
    }

    /* renamed from: oke$b */
    public static final class b extends oke {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.oke
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<d, R_> ti03, ti0<c, R_> ti04) {
            return (R_) ((hke) ti0).apply(this);
        }

        @Override // defpackage.oke
        public final void c(si0<b> si0, si0<a> si02, si0<d> si03, si0<c> si04) {
            ((o) si0).a.n(this);
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

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return "PasswordInputChanged{password=***}";
        }
    }

    /* renamed from: oke$c */
    public static final class c extends oke {
        c() {
        }

        @Override // defpackage.oke
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<d, R_> ti03, ti0<c, R_> ti04) {
            return (R_) ((ike) ti04).apply(this);
        }

        @Override // defpackage.oke
        public final void c(si0<b> si0, si0<a> si02, si0<d> si03, si0<c> si04) {
            com.spotify.signup.splitflow.b bVar = (com.spotify.signup.splitflow.b) si04;
            bVar.a.q(bVar.b, this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PasswordSubmitted{}";
        }
    }

    /* renamed from: oke$d */
    public static final class d extends oke {
        private final String a;
        private final c.a b;

        d(String str, c.a aVar) {
            str.getClass();
            this.a = str;
            aVar.getClass();
            this.b = aVar;
        }

        @Override // defpackage.oke
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<d, R_> ti03, ti0<c, R_> ti04) {
            return (R_) ((gke) ti03).apply(this);
        }

        @Override // defpackage.oke
        public final void c(si0<b> si0, si0<a> si02, si0<d> si03, si0<c> si04) {
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a.equals(this.a) || !dVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public final String g() {
            return this.a;
        }

        public final c.a h() {
            return this.b;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder a1 = je.a1("RemotePasswordValidationReceived{password=", "***", ", validationResult=");
            a1.append(this.b);
            a1.append('}');
            return a1.toString();
        }
    }

    oke() {
    }

    public static oke a(String str, PasswordValidator.PasswordValidation passwordValidation) {
        return new a(str, passwordValidation);
    }

    public static oke d(String str) {
        return new b(str);
    }

    public static oke e() {
        return new c();
    }

    public static oke f(String str, c.a aVar) {
        return new d(str, aVar);
    }

    public abstract <R_> R_ b(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<d, R_> ti03, ti0<c, R_> ti04);

    public abstract void c(si0<b> si0, si0<a> si02, si0<d> si03, si0<c> si04);
}
