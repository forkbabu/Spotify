package com.spotify.libs.otp.ui;

public abstract class m0<R> {

    public static final class a extends m0<Object> {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Mismatch{}";
        }
    }

    public static final class b<R> extends m0<R> {
        private final R a;

        b(R r) {
            r.getClass();
            this.a = r;
        }

        public final R c() {
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
            StringBuilder V0 = je.V0("Success{response=");
            V0.append((Object) this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    m0() {
    }

    public static <R> m0<R> a() {
        return new a();
    }

    public static <R> m0<R> b(R r) {
        return new b(r);
    }
}
