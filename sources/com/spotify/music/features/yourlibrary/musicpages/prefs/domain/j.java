package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

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
            return je.H0(je.V0("LoadPrefsModel{username="), this.a, '}');
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
            return "LoadUsername{}";
        }
    }

    j() {
    }
}
