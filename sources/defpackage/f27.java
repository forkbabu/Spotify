package defpackage;

import com.spotify.music.features.podcast.episode.datasource.f;
import com.spotify.music.features.podcast.episode.datasource.g;
import com.spotify.music.features.podcast.episode.datasource.h;

/* renamed from: f27  reason: default package */
public abstract class f27 {

    /* renamed from: f27$a */
    public static final class a extends f27 {
        private final String a;

        a(String str) {
            this.a = str;
        }

        @Override // defpackage.f27
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((h) ti02).apply(this);
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

    /* renamed from: f27$b */
    public static final class b extends f27 {
        b() {
        }

        @Override // defpackage.f27
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((g) ti0).apply(this);
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

    /* renamed from: f27$c */
    public static final class c extends f27 {
        private final b91 a;

        c(b91 b91) {
            b91.getClass();
            this.a = b91;
        }

        @Override // defpackage.f27
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((f) ti03).apply(this);
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

    f27() {
    }

    public static f27 a(String str) {
        return new a(str);
    }

    public static f27 b() {
        return new b();
    }

    public abstract <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03);
}
