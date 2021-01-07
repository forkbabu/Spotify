package com.spotify.music.features.phonenumbersignup;

public abstract class f {

    public static final class a extends f {
        a() {
        }

        @Override // com.spotify.music.features.phonenumbersignup.f
        public final void b(si0<a> si0, si0<b> si02) {
            ((vw5) si0).a.D(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LoggedIn{}";
        }
    }

    public static final class b extends f {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.music.features.phonenumbersignup.f
        public final void b(si0<a> si0, si0<b> si02) {
            ((sw5) si02).a.E(this);
        }

        public final String d() {
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
            return je.H0(je.V0("Validated{identifierToken="), this.a, '}');
        }
    }

    f() {
    }

    public static f a() {
        return new a();
    }

    public static f c(String str) {
        return new b(str);
    }

    public abstract void b(si0<a> si0, si0<b> si02);
}
