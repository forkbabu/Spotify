package com.spotify.mobile.android.sso;

public abstract class k {

    public static final class a extends k {
        private final String a;
        private final String b;
        private final int c;
        private final String d;

        a(String str, String str2, int i, String str3) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            this.c = i;
            this.d = str3;
        }

        @Override // com.spotify.mobile.android.sso.k
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<e, R_> ti04, ti0<c, R_> ti05) {
            return ti0.apply(this);
        }

        @Override // com.spotify.mobile.android.sso.k
        public final void c(si0<a> si0, si0<b> si02, si0<d> si03, si0<e> si04, si0<c> si05) {
            b bVar = (b) si0;
            bVar.a.i1(bVar.b, this);
        }

        public final String d() {
            return this.a;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.c != this.c || !aVar.a.equals(this.a) || !aVar.b.equals(this.b) || !gf0.e(aVar.d, this.d)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.b;
        }

        public final String g() {
            return this.d;
        }

        public int hashCode() {
            int i = 0;
            int K = je.K(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31), 31);
            String str = this.d;
            if (str != null) {
                i = str.hashCode();
            }
            return K + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AuthorizationAccessTokenResponse{accessToken=");
            V0.append(this.a);
            V0.append(", responseRedirectUri=");
            V0.append(this.b);
            V0.append(", expiresIn=");
            V0.append(this.c);
            V0.append(", state=");
            return je.H0(V0, this.d, '}');
        }
    }

    public static final class b extends k {
        private final String a;
        private final String b;
        private final String c;

        b(String str, String str2, String str3) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            this.c = str3;
        }

        @Override // com.spotify.mobile.android.sso.k
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<e, R_> ti04, ti0<c, R_> ti05) {
            return ti02.apply(this);
        }

        @Override // com.spotify.mobile.android.sso.k
        public final void c(si0<a> si0, si0<b> si02, si0<d> si03, si0<e> si04, si0<c> si05) {
            e eVar = (e) si02;
            eVar.a.j1(eVar.b, this);
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
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
            if (!bVar.a.equals(this.a) || !bVar.b.equals(this.b) || !gf0.e(bVar.c, this.c)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.c;
        }

        public int hashCode() {
            int i = 0;
            int Y0 = je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
            String str = this.c;
            if (str != null) {
                i = str.hashCode();
            }
            return Y0 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AuthorizationCodeResponse{code=");
            V0.append(this.a);
            V0.append(", responseRedirectUri=");
            V0.append(this.b);
            V0.append(", state=");
            return je.H0(V0, this.c, '}');
        }
    }

    public static final class c extends k {
        private final ErrorMessage a;

        c(ErrorMessage errorMessage) {
            errorMessage.getClass();
            this.a = errorMessage;
        }

        @Override // com.spotify.mobile.android.sso.k
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<e, R_> ti04, ti0<c, R_> ti05) {
            return ti05.apply(this);
        }

        @Override // com.spotify.mobile.android.sso.k
        public final void c(si0<a> si0, si0<b> si02, si0<d> si03, si0<e> si04, si0<c> si05) {
            ((c) si05).accept(this);
        }

        public final ErrorMessage d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AuthorizationEmptyResponse{errorMessage=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class d extends k {
        private final ErrorMessage a;
        private final String b;
        private final String c;

        d(ErrorMessage errorMessage, String str, String str2) {
            errorMessage.getClass();
            this.a = errorMessage;
            this.b = str;
            this.c = str2;
        }

        @Override // com.spotify.mobile.android.sso.k
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<e, R_> ti04, ti0<c, R_> ti05) {
            return ti03.apply(this);
        }

        @Override // com.spotify.mobile.android.sso.k
        public final void c(si0<a> si0, si0<b> si02, si0<d> si03, si0<e> si04, si0<c> si05) {
            ((d) si03).accept(this);
        }

        public final String d() {
            return this.b;
        }

        public final ErrorMessage e() {
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
            if (dVar.a != this.a || !gf0.e(dVar.b, this.b) || !gf0.e(dVar.c, this.c)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.c;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (this.a.hashCode() + 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AuthorizationErrorResponse{errorMessage=");
            V0.append(this.a);
            V0.append(", errorDescription=");
            V0.append(this.b);
            V0.append(", state=");
            return je.H0(V0, this.c, '}');
        }
    }

    public static final class e extends k {
        private final ErrorMessage a;
        private final String b;
        private final String c;

        e(ErrorMessage errorMessage, String str, String str2) {
            errorMessage.getClass();
            this.a = errorMessage;
            this.b = str;
            this.c = str2;
        }

        @Override // com.spotify.mobile.android.sso.k
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<e, R_> ti04, ti0<c, R_> ti05) {
            return ti04.apply(this);
        }

        @Override // com.spotify.mobile.android.sso.k
        public final void c(si0<a> si0, si0<b> si02, si0<d> si03, si0<e> si04, si0<c> si05) {
            ((a) si04).accept(this);
        }

        public final ErrorMessage d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (eVar.a != this.a || !gf0.e(eVar.b, this.b) || !gf0.e(eVar.c, this.c)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.c;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (this.a.hashCode() + 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AuthorizationUnknownResponse{errorMessage=");
            V0.append(this.a);
            V0.append(", responseRedirectUri=");
            V0.append(this.b);
            V0.append(", state=");
            return je.H0(V0, this.c, '}');
        }
    }

    k() {
    }

    public static k a(ErrorMessage errorMessage, String str, String str2) {
        return new d(errorMessage, str, null);
    }

    public abstract <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<e, R_> ti04, ti0<c, R_> ti05);

    public abstract void c(si0<a> si0, si0<b> si02, si0<d> si03, si0<e> si04, si0<c> si05);
}
