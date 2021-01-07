package defpackage;

import com.spotify.music.nowplaying.core.modes.NowPlayingMode;

/* renamed from: ev5  reason: default package */
public abstract class ev5 {

    /* renamed from: ev5$a */
    public static final class a extends ev5 {
        a() {
        }

        @Override // defpackage.ev5
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02) {
            return (R_) ((wu5) ti0).a.f.get();
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Empty{}";
        }
    }

    /* renamed from: ev5$b */
    public static final class b extends ev5 {
        private final NowPlayingMode a;

        b(NowPlayingMode nowPlayingMode) {
            nowPlayingMode.getClass();
            this.a = nowPlayingMode;
        }

        @Override // defpackage.ev5
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02) {
            return (R_) ((uu5) ti02).apply(this);
        }

        public final NowPlayingMode b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof b) && ((b) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Loaded{nowPlayingMode=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    ev5() {
    }

    public abstract <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02);
}
