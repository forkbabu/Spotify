package defpackage;

import com.spotify.music.features.podcast.episode.datasource.m;
import com.spotify.music.features.podcast.episode.datasource.r;

/* renamed from: qe7  reason: default package */
public abstract class qe7 {

    /* renamed from: qe7$a */
    public static final class a extends qe7 {
        private final String a;

        a(String str) {
            this.a = str;
        }

        @Override // defpackage.qe7
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((r) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return gf0.e(((a) obj).a, this.a);
        }

        public int hashCode() {
            String str = this.a;
            return 0 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return je.H0(je.V0("Failure{message="), this.a, '}');
        }
    }

    /* renamed from: qe7$b */
    public static final class b extends qe7 {
        b() {
        }

        @Override // defpackage.qe7
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((com.spotify.music.features.podcast.episode.datasource.c) ti0).apply(this);
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

    /* renamed from: qe7$c */
    public static final class c extends qe7 {
        private final b91 a;

        c(b91 b91) {
            b91.getClass();
            this.a = b91;
        }

        @Override // defpackage.qe7
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((m) ti03).apply(this);
        }

        public final b91 d() {
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

    qe7() {
    }

    public static qe7 a(String str) {
        return new a(str);
    }

    public static qe7 b() {
        return new b();
    }

    public abstract <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03);
}
