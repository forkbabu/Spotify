package com.spotify.music.features.podcast.episode.datasource;

public abstract class x {

    public static final class a extends x {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.music.features.podcast.episode.datasource.x
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((j) ti02).apply(this);
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
            return je.H0(je.V0("Failure{message="), this.a, '}');
        }
    }

    public static final class b extends x {
        b() {
        }

        @Override // com.spotify.music.features.podcast.episode.datasource.x
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((p) ti0).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Loading{}";
        }
    }

    public static final class c extends x {
        private final b91 a;

        c(b91 b91) {
            b91.getClass();
            this.a = b91;
        }

        @Override // com.spotify.music.features.podcast.episode.datasource.x
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((i) ti03).apply(this);
        }

        public final b91 b() {
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
            StringBuilder V0 = je.V0("Success{hubsViewModel=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    x() {
    }

    public abstract <R_> R_ a(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03);
}
