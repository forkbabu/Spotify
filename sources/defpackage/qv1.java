package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ErrorMessage;

/* renamed from: qv1  reason: default package */
public abstract class qv1 {

    /* renamed from: qv1$a */
    public static final class a extends qv1 {
        private final String a;
        private final String b;
        private final String c;

        a(String str, String str2, String str3) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
        }

        public final String a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a.equals(this.a) || !aVar.b.equals(this.b) || !aVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("DeliverAccessToken{token=");
            V0.append(this.a);
            V0.append(", responseRedirectUri=");
            V0.append(this.b);
            V0.append(", state=");
            return je.H0(V0, this.c, '}');
        }
    }

    /* renamed from: qv1$b */
    public static final class b extends qv1 {
        private final String a;
        private final String b;
        private final String c;

        b(String str, String str2, String str3) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
        }

        public final String a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a.equals(this.a) || !bVar.b.equals(this.b) || !bVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("DeliverAuthCode{code=");
            V0.append(this.a);
            V0.append(", responseRedirectUri=");
            V0.append(this.b);
            V0.append(", state=");
            return je.H0(V0, this.c, '}');
        }
    }

    /* renamed from: qv1$c */
    public static final class c extends qv1 {
        private final Uri a;
        private final String b;
        private final com.spotify.mobile.android.sso.bakery.d c;

        c(Uri uri, String str, com.spotify.mobile.android.sso.bakery.d dVar) {
            uri.getClass();
            this.a = uri;
            str.getClass();
            this.b = str;
            dVar.getClass();
            this.c = dVar;
        }

        public final Uri a() {
            return this.a;
        }

        public final com.spotify.mobile.android.sso.bakery.d b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !cVar.b.equals(this.b) || !cVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, (this.a.hashCode() + 0) * 31, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("RequestUserAuthorization{accountsRequestUri=");
            V0.append(this.a);
            V0.append(", requestRedirectUri=");
            V0.append(this.b);
            V0.append(", cookie=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: qv1$d */
    public static final class d extends qv1 {
        private final AuthorizationRequest a;
        private final com.spotify.mobile.android.sso.bakery.d b;

        d(AuthorizationRequest authorizationRequest, com.spotify.mobile.android.sso.bakery.d dVar) {
            authorizationRequest.getClass();
            this.a = authorizationRequest;
            dVar.getClass();
            this.b = dVar;
        }

        public final com.spotify.mobile.android.sso.bakery.d a() {
            return this.b;
        }

        public final AuthorizationRequest b() {
            return this.a;
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

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("SendAccountsRequest{request=");
            V0.append(this.a);
            V0.append(", cookie=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: qv1$e */
    public static final class e extends qv1 {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SendBakeryRequest{}";
        }
    }

    /* renamed from: qv1$f */
    public static final class f extends qv1 {
        private final ErrorMessage a;
        private final String b;

        f(ErrorMessage errorMessage, String str) {
            errorMessage.getClass();
            this.a = errorMessage;
            str.getClass();
            this.b = str;
        }

        public final ErrorMessage a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (fVar.a != this.a || !fVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("SendErrorAndFinish{errorMessage=");
            V0.append(this.a);
            V0.append(", state=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: qv1$g */
    public static final class g extends qv1 {
        private final ErrorMessage a;
        private final String b;
        private final String c;

        g(ErrorMessage errorMessage, String str, String str2) {
            errorMessage.getClass();
            this.a = errorMessage;
            str.getClass();
            this.b = str;
            str2.getClass();
            this.c = str2;
        }

        public final String a() {
            return this.b;
        }

        public final ErrorMessage b() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (gVar.a != this.a || !gVar.b.equals(this.b) || !gVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, (this.a.hashCode() + 0) * 31, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("SendErrorWithDescriptionAndFinish{errorMessage=");
            V0.append(this.a);
            V0.append(", description=");
            V0.append(this.b);
            V0.append(", state=");
            return je.H0(V0, this.c, '}');
        }
    }

    /* renamed from: qv1$h */
    public static final class h extends qv1 {
        private final ErrorMessage a;
        private final int b;
        private final String c;

        h(ErrorMessage errorMessage, int i, String str) {
            errorMessage.getClass();
            this.a = errorMessage;
            this.b = i;
            str.getClass();
            this.c = str;
        }

        public final int a() {
            return this.b;
        }

        public final ErrorMessage b() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (hVar.a == this.a && hVar.b == this.b && hVar.c.equals(this.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode() + je.K(this.b, (this.a.hashCode() + 0) * 31, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("SendErrorWithDescriptionResAndFinish{errorMessage=");
            V0.append(this.a);
            V0.append(", description=");
            V0.append(this.b);
            V0.append(", state=");
            return je.H0(V0, this.c, '}');
        }
    }

    /* renamed from: qv1$i */
    public static final class i extends qv1 {
        i() {
        }

        public boolean equals(Object obj) {
            return obj instanceof i;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StartAuthorizationTimeoutTimer{}";
        }
    }

    /* renamed from: qv1$j */
    public static final class j extends qv1 {
        j() {
        }

        public boolean equals(Object obj) {
            return obj instanceof j;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StartLoginActivity{}";
        }
    }

    /* renamed from: qv1$k */
    public static final class k extends qv1 {
        k() {
        }

        public boolean equals(Object obj) {
            return obj instanceof k;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SubscribeToStateChanges{}";
        }
    }

    qv1() {
    }
}
