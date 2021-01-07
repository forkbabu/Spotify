package com.spotify.music.features.premiumdestination.domain;

public abstract class m {

    public static final class a extends m {
        private final ErrorReason a;

        a(ErrorReason errorReason) {
            errorReason.getClass();
            this.a = errorReason;
        }

        @Override // com.spotify.music.features.premiumdestination.domain.m
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return ti02.apply(this);
        }

        public final ErrorReason c() {
            return this.a;
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

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error{reason=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class b extends m {
        private final b91 a;

        b(b91 b91) {
            b91.getClass();
            this.a = b91;
        }

        @Override // com.spotify.music.features.premiumdestination.domain.m
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return ti0.apply(this);
        }

        public final b91 c() {
            return this.a;
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

        public String toString() {
            StringBuilder V0 = je.V0("Loaded{viewModel=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class c extends m {
        private final boolean a;

        c(boolean z) {
            this.a = z;
        }

        @Override // com.spotify.music.features.premiumdestination.domain.m
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return ti03.apply(this);
        }

        public final boolean c() {
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
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("Uninitialized{loading="), this.a, '}');
        }
    }

    m() {
    }

    public static m b(boolean z) {
        return new c(z);
    }

    public abstract <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03);
}
