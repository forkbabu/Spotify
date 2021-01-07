package defpackage;

import com.spotify.playlist.models.j;

/* renamed from: mg5  reason: default package */
public abstract class mg5 {

    /* renamed from: mg5$a */
    public static final class a extends mg5 {
        private final com.spotify.playlist.models.a a;

        a(com.spotify.playlist.models.a aVar) {
            aVar.getClass();
            this.a = aVar;
        }

        @Override // defpackage.mg5
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((eg5) ti02).apply(this);
        }

        public final com.spotify.playlist.models.a b() {
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
            StringBuilder V0 = je.V0("Album{album=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: mg5$b */
    public static final class b extends mg5 {
        b() {
        }

        @Override // defpackage.mg5
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((fg5) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LikedSongs{}";
        }
    }

    /* renamed from: mg5$c */
    public static final class c extends mg5 {
        private final j a;

        c(j jVar) {
            jVar.getClass();
            this.a = jVar;
        }

        @Override // defpackage.mg5
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((gg5) ti0).apply(this);
        }

        public final j b() {
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
            StringBuilder V0 = je.V0("Playlist{playlist=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    mg5() {
    }

    public abstract <R_> R_ a(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03);
}
