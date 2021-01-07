package defpackage;

import com.spotify.login.AuthenticationMetadata;
import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import com.spotify.signup.api.services.model.FacebookSignupRequest;
import com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody;

/* renamed from: hee  reason: default package */
public abstract class hee {

    /* renamed from: hee$a */
    public static final class a extends hee {
        private final rae a;

        a(rae rae) {
            rae.getClass();
            this.a = rae;
        }

        public final rae c() {
            return this.a;
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

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AgeEffect{effect=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$b */
    public static final class b extends hee {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "AssessRecaptcha{}";
        }
    }

    /* renamed from: hee$c */
    public static final class c extends hee {
        private final nhe a;

        c(nhe nhe) {
            nhe.getClass();
            this.a = nhe;
        }

        public final nhe c() {
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
            StringBuilder V0 = je.V0("EmailEffect{effect=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$d */
    public static final class d extends hee {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ExitApp{}";
        }
    }

    /* renamed from: hee$e */
    public static final class e extends hee {
        private final boolean a;

        e(boolean z) {
            this.a = z;
        }

        public final boolean c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof e) && ((e) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("FetchSignupConfiguration{required="), this.a, '}');
        }
    }

    /* renamed from: hee$f */
    public static final class f extends hee {
        private final int a;

        f(int i) {
            this.a = i;
        }

        public final int c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof f) && ((f) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public String toString() {
            return je.A0(je.V0("FinishActivity{resultCode="), this.a, '}');
        }
    }

    /* renamed from: hee$g */
    public static final class g extends hee {
        private final String a;

        g(String str) {
            str.getClass();
            this.a = str;
        }

        public final String c() {
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
            return je.H0(je.V0("FinishWithRedirectToLogin{email="), this.a, '}');
        }
    }

    /* renamed from: hee$h */
    public static final class h extends hee {
        private final xie a;

        h(xie xie) {
            xie.getClass();
            this.a = xie;
        }

        public final xie c() {
            return this.a;
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

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("GenderEffect{effect=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$i */
    public static final class i extends hee {
        private final String a;
        private final String b;

        i(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (!iVar.a.equals(this.a) || !iVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("LoginEmail{username=");
            V0.append(this.a);
            V0.append(", password=");
            V0.append("***");
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$j */
    public static final class j extends hee {
        private final com.spotify.loginflow.navigation.a a;

        j(com.spotify.loginflow.navigation.a aVar) {
            aVar.getClass();
            this.a = aVar;
        }

        public final com.spotify.loginflow.navigation.a c() {
            return this.a;
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

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LoginFacebook{facebookUser=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$k */
    public static final class k extends hee {
        private final String a;
        private final AuthenticationMetadata.AuthSource b;

        k(String str, AuthenticationMetadata.AuthSource authSource) {
            str.getClass();
            this.a = str;
            this.b = authSource;
        }

        public final AuthenticationMetadata.AuthSource c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (kVar.b != this.b || !kVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            int Y0 = je.Y0(this.a, 0, 31);
            AuthenticationMetadata.AuthSource authSource = this.b;
            if (authSource != null) {
                i = authSource.hashCode();
            }
            return Y0 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LoginOneTimeToken{token=");
            V0.append(this.a);
            V0.append(", authSource=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$l */
    public static final class l extends hee {
        private final qje a;

        l(qje qje) {
            qje.getClass();
            this.a = qje;
        }

        public final qje c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            return ((l) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NameEffect{effect=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$m */
    public static final class m extends hee {
        private final nke a;

        m(nke nke) {
            nke.getClass();
            this.a = nke;
        }

        public final nke c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            return ((m) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PasswordEffect{effect=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$n */
    public static final class n extends hee {
        private final String a;
        private final String b;

        n(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (!nVar.a.equals(this.a) || !nVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("SaveCredentials{email=");
            V0.append(this.a);
            V0.append(", password=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: hee$o */
    public static final class o extends hee {
        o() {
        }

        public boolean equals(Object obj) {
            return obj instanceof o;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ShowEmailAlreadyRegisteredErrorDialog{}";
        }
    }

    /* renamed from: hee$p */
    public static final class p extends hee {
        p() {
        }

        public boolean equals(Object obj) {
            return obj instanceof p;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ShowGenericErrorDialog{}";
        }
    }

    /* renamed from: hee$q */
    public static final class q extends hee {
        q() {
        }

        public boolean equals(Object obj) {
            return obj instanceof q;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ShowInvalidAgeErrorDialog{}";
        }
    }

    /* renamed from: hee$r */
    public static final class r extends hee {
        private final String a;
        private final String b;

        r(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            if (!rVar.a.equals(this.a) || !rVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShowLoginErrorDialog{username=");
            V0.append(this.a);
            V0.append(", password=");
            V0.append("***");
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$s */
    public static final class s extends hee {
        s() {
        }

        public boolean equals(Object obj) {
            return obj instanceof s;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ShowNoConnectionErrorDialog{}";
        }
    }

    /* renamed from: hee$t */
    public static final class t extends hee {
        t() {
        }

        public boolean equals(Object obj) {
            return obj instanceof t;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ShowNoSignupConfigurationError{}";
        }
    }

    /* renamed from: hee$u */
    public static final class u extends hee {
        private final String a;

        u(String str) {
            str.getClass();
            this.a = str;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            return ((u) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("ShowRegistrationFromDataCenter{message="), this.a, '}');
        }
    }

    /* renamed from: hee$v */
    public static final class v extends hee {
        private final com.spotify.termsandconditions.model.b a;

        v(com.spotify.termsandconditions.model.b bVar) {
            bVar.getClass();
            this.a = bVar;
        }

        public final com.spotify.termsandconditions.model.b c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            return ((v) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShowTermsAndConditions{termsAndConditionsModel=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$w */
    public static final class w extends hee {
        private final EmailSignupRequestBody a;

        w(EmailSignupRequestBody emailSignupRequestBody) {
            emailSignupRequestBody.getClass();
            this.a = emailSignupRequestBody;
        }

        public final EmailSignupRequestBody c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            return ((w) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SignupEmail{request=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$x */
    public static final class x extends hee {
        private final FacebookSignupRequest a;

        x(FacebookSignupRequest facebookSignupRequest) {
            facebookSignupRequest.getClass();
            this.a = facebookSignupRequest;
        }

        public final FacebookSignupRequest c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            return ((x) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SignupFacebook{request=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: hee$y */
    public static final class y extends hee {
        private final IdentifierTokenSignupRequestBody a;

        y(IdentifierTokenSignupRequestBody identifierTokenSignupRequestBody) {
            identifierTokenSignupRequestBody.getClass();
            this.a = identifierTokenSignupRequestBody;
        }

        public final IdentifierTokenSignupRequestBody c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            return ((y) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SignupIdentifier{request=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    hee() {
    }

    public static hee a() {
        return new s();
    }

    public static hee b() {
        return new t();
    }
}
