package com.spotify.music.features.playlistentity.trackcloud;

public abstract class p {

    public static final class a extends p {
        a() {
        }

        @Override // com.spotify.music.features.playlistentity.trackcloud.p
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<d, R_> ti04) {
            ((k) ti0).apply(this);
            return "";
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SingleCloud{}";
        }
    }

    public static final class b extends p {
        b() {
        }

        @Override // com.spotify.music.features.playlistentity.trackcloud.p
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<d, R_> ti04) {
            return (R_) ((h) ti02).a.j(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TwoCloudsFeaturing{}";
        }
    }

    public static final class c extends p {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.music.features.playlistentity.trackcloud.p
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<d, R_> ti04) {
            return (R_) ((i) ti03).a.k(this);
        }

        public final String b() {
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
            return je.H0(je.V0("TwoCloudsUserAdded{user="), this.a, '}');
        }
    }

    public static final class d extends p {
        d() {
        }

        @Override // com.spotify.music.features.playlistentity.trackcloud.p
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<d, R_> ti04) {
            return (R_) ((j) ti04).a.u(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TwoCloudsYouAdded{}";
        }
    }

    p() {
    }

    public abstract <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03, ti0<d, R_> ti04);
}
