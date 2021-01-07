package com.spotify.music.features.premiumdestination.domain;

public abstract class j {

    public static final class a extends j {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
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
            return je.H0(je.V0("FetchViewModelFromBackend{productType="), this.a, '}');
        }
    }

    public static final class b extends j {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "HideBadge{}";
        }
    }

    public static final class c extends j {
        private final m a;

        c(m mVar) {
            mVar.getClass();
            this.a = mVar;
        }

        public final m a() {
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
            StringBuilder V0 = je.V0("LogImpression{state=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class d extends j {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateToHome{}";
        }
    }

    public static final class e extends j {
        private final long a;

        e(long j) {
            this.a = j;
        }

        public final long a() {
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
            return je.r0(this.a, 0);
        }

        public String toString() {
            return je.D0(je.V0("WaitToShowLoading{waitTimeMs="), this.a, '}');
        }
    }

    j() {
    }
}
