package com.spotify.music.features.quicksilver.v2.mobius;

public abstract class i {

    public static final class a extends i {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NotPresenting{}";
        }
    }

    public static final class b extends i {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
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
            return je.H0(je.V0("Presenting{messageId="), this.a, '}');
        }
    }

    i() {
    }

    public static i a() {
        return new a();
    }

    public static i b(String str) {
        return new b(str);
    }
}
