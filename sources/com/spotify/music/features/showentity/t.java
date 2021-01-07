package com.spotify.music.features.showentity;

public abstract class t {

    public static final class a extends t {
        private final String a;
        private final Throwable b;

        a(String str, Throwable th) {
            str.getClass();
            this.a = str;
            th.getClass();
            this.b = th;
        }

        @Override // com.spotify.music.features.showentity.t
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03) {
            return (R_) ((l) ti03).apply(this);
        }

        public final Throwable b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a.equals(this.a) || !aVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error{uri=");
            V0.append(this.a);
            V0.append(", throwable=");
            return je.K0(V0, this.b, '}');
        }
    }

    public static final class b extends t {
        b() {
        }

        @Override // com.spotify.music.features.showentity.t
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03) {
            return (R_) ((j) ti0).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LoadingTimeoutCheck{}";
        }
    }

    public static final class c extends t {
        private final int a;

        c(int i) {
            this.a = i;
        }

        @Override // com.spotify.music.features.showentity.t
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03) {
            return (R_) y.a(((k) ti02).a, this);
        }

        public final int b() {
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
            return je.b(this.a, 0);
        }

        public String toString() {
            return je.A0(je.V0("MetadataLookupCompleted{mediaType="), this.a, '}');
        }
    }

    t() {
    }

    public abstract <R_> R_ a(ti0<b, R_> ti0, ti0<c, R_> ti02, ti0<a, R_> ti03);
}
