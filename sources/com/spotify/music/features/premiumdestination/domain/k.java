package com.spotify.music.features.premiumdestination.domain;

public abstract class k {

    public static final class a extends k {
        private final ErrorReason a;

        a(ErrorReason errorReason) {
            errorReason.getClass();
            this.a = errorReason;
        }

        @Override // com.spotify.music.features.premiumdestination.domain.k
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05) {
            return (R_) ((h) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof a) && ((a) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public final ErrorReason g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("BackendRequestFailed{reason=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class b extends k {
        private final b91 a;
        private final long b;

        b(b91 b91, long j) {
            b91.getClass();
            this.a = b91;
            this.b = j;
        }

        @Override // com.spotify.music.features.premiumdestination.domain.k
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05) {
            return (R_) ((f) ti0).apply(this);
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

        public final b91 g() {
            return this.a;
        }

        public int hashCode() {
            return je.r0(this.b, (this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("BackendViewModelReceived{viewModel=");
            V0.append(this.a);
            V0.append(", ttl=");
            return je.D0(V0, this.b, '}');
        }
    }

    public static final class c extends k {
        c() {
        }

        @Override // com.spotify.music.features.premiumdestination.domain.k
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05) {
            return (R_) ((d) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LoadingIsTakingTooLong{}";
        }
    }

    public static final class d extends k {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.music.features.premiumdestination.domain.k
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05) {
            return (R_) ((c) ti05).apply(this);
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

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("UserCountryReceived{countryCode="), this.a, '}');
        }
    }

    public static final class e extends k {
        private final String a;

        e(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.music.features.premiumdestination.domain.k
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05) {
            return (R_) ((e) ti04).apply(this);
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

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("UserProductChanged{productType="), this.a, '}');
        }
    }

    k() {
    }

    public static k a(ErrorReason errorReason) {
        return new a(errorReason);
    }

    public static k b(b91 b91, long j) {
        return new b(b91, j);
    }

    public static k c() {
        return new c();
    }

    public static k e(String str) {
        return new d(str);
    }

    public static k f(String str) {
        return new e(str);
    }

    public abstract <R_> R_ d(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05);
}
