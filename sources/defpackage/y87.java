package defpackage;

import com.spotify.music.features.podcast.episode.datasource.n;
import com.spotify.music.features.podcast.episode.datasource.o;
import com.spotify.music.features.podcast.episode.datasource.q;

/* renamed from: y87  reason: default package */
public abstract class y87 {

    /* renamed from: y87$a */
    public static final class a extends y87 {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.y87
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((q) ti02).apply(this);
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

    /* renamed from: y87$b */
    public static final class b extends y87 {
        b() {
        }

        @Override // defpackage.y87
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((o) ti0).apply(this);
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

    /* renamed from: y87$c */
    public static final class c extends y87 {
        private final k87 a;

        c(k87 k87) {
            k87.getClass();
            this.a = k87;
        }

        @Override // defpackage.y87
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((n) ti03).apply(this);
        }

        public final k87 d() {
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
            StringBuilder V0 = je.V0("Success{trackListViewModel=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    y87() {
    }

    public static y87 a(String str) {
        return new a(str);
    }

    public static y87 b() {
        return new b();
    }

    public abstract <R_> R_ c(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03);
}
