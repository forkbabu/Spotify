package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.k;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;

/* renamed from: rv1  reason: default package */
public abstract class rv1 {

    /* renamed from: rv1$a */
    public static final class a extends rv1 {
        a() {
        }

        @Override // defpackage.rv1
        public final <R_> R_ e(ti0<e, R_> ti0, ti0<f, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<b, R_> ti06) {
            return (R_) ((mv1) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "AuthorizationTimeoutSignal{}";
        }
    }

    /* renamed from: rv1$b */
    public static final class b extends rv1 {
        private final k a;

        b(k kVar) {
            kVar.getClass();
            this.a = kVar;
        }

        @Override // defpackage.rv1
        public final <R_> R_ e(ti0<e, R_> ti0, ti0<f, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<b, R_> ti06) {
            return (R_) ((ov1) ti06).apply(this);
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

        public final k h() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("GotAuthorizationResponse{authorizationResponse=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: rv1$c */
    public static final class c extends rv1 {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.rv1
        public final <R_> R_ e(ti0<e, R_> ti0, ti0<f, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<b, R_> ti06) {
            return (R_) ((jv1) ti05).apply(this);
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
            return je.H0(je.V0("GotBakeryError{bakeryError="), this.a, '}');
        }
    }

    /* renamed from: rv1$d */
    public static final class d extends rv1 {
        private final com.spotify.mobile.android.sso.bakery.d a;

        d(com.spotify.mobile.android.sso.bakery.d dVar) {
            dVar.getClass();
            this.a = dVar;
        }

        @Override // defpackage.rv1
        public final <R_> R_ e(ti0<e, R_> ti0, ti0<f, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<b, R_> ti06) {
            return (R_) ((lv1) ti04).apply(this);
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

        public final com.spotify.mobile.android.sso.bakery.d h() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("GotBakeryResponse{cookie=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: rv1$e */
    public static final class e extends rv1 {
        private final AuthorizationRequest a;
        private final ProtocolVersion b;
        private final boolean c;
        private final boolean d;

        e(AuthorizationRequest authorizationRequest, ProtocolVersion protocolVersion, boolean z, boolean z2) {
            authorizationRequest.getClass();
            this.a = authorizationRequest;
            protocolVersion.getClass();
            this.b = protocolVersion;
            this.c = z;
            this.d = z2;
        }

        @Override // defpackage.rv1
        public final <R_> R_ e(ti0<e, R_> ti0, ti0<f, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<b, R_> ti06) {
            return (R_) ((fv1) ti0).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (eVar.b == this.b && eVar.c == this.c && eVar.d == this.d && eVar.a.equals(this.a)) {
                return true;
            }
            return false;
        }

        public final boolean h() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Boolean.valueOf(this.c).hashCode();
            return je.n(this.d, (hashCode2 + ((hashCode + ((this.a.hashCode() + 0) * 31)) * 31)) * 31);
        }

        public final boolean i() {
            return this.d;
        }

        public final ProtocolVersion j() {
            return this.b;
        }

        public final AuthorizationRequest k() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("RequestReceived{request=");
            V0.append(this.a);
            V0.append(", protocolVersion=");
            V0.append(this.b);
            V0.append(", isConnectedToInternet=");
            V0.append(this.c);
            V0.append(", isDebug=");
            return je.O0(V0, this.d, '}');
        }
    }

    /* renamed from: rv1$f */
    public static final class f extends rv1 {
        private final SessionState a;

        f(SessionState sessionState) {
            sessionState.getClass();
            this.a = sessionState;
        }

        @Override // defpackage.rv1
        public final <R_> R_ e(ti0<e, R_> ti0, ti0<f, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<b, R_> ti06) {
            return (R_) ((iv1) ti02).apply(this);
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

        public final SessionState h() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SessionStateChanged{sessionState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    rv1() {
    }

    public static rv1 a() {
        return new a();
    }

    public static rv1 b(k kVar) {
        return new b(kVar);
    }

    public static rv1 c(String str) {
        return new c(str);
    }

    public static rv1 d(com.spotify.mobile.android.sso.bakery.d dVar) {
        return new d(dVar);
    }

    public static rv1 f(AuthorizationRequest authorizationRequest, ProtocolVersion protocolVersion, boolean z, boolean z2) {
        return new e(authorizationRequest, protocolVersion, z, z2);
    }

    public static rv1 g(SessionState sessionState) {
        return new f(sessionState);
    }

    public abstract <R_> R_ e(ti0<e, R_> ti0, ti0<f, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<b, R_> ti06);
}
