package com.spotify.login;

public abstract class w0 {

    public static final class a extends w0 {
        private final int a;

        a(int i) {
            this.a = i;
        }

        @Override // com.spotify.login.w0
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02) {
            return ti02.apply(this);
        }

        @Override // com.spotify.login.w0
        public final void b(si0<b> si0, si0<a> si02) {
            si02.accept(this);
        }

        public final int c() {
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
            return je.b(this.a, 0);
        }

        public String toString() {
            return je.A0(je.V0("Failure{authErrorCode="), this.a, '}');
        }
    }

    public static final class b extends w0 {
        b() {
        }

        @Override // com.spotify.login.w0
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02) {
            return ti0.apply(this);
        }

        @Override // com.spotify.login.w0
        public final void b(si0<b> si0, si0<a> si02) {
            si0.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Success{}";
        }
    }

    w0() {
    }

    public abstract <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02);

    public abstract void b(si0<b> si0, si0<a> si02);
}
