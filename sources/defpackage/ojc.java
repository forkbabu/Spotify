package defpackage;

import com.spotify.music.features.podcast.episode.n;
import com.spotify.music.features.podcast.episode.u;

/* renamed from: ojc  reason: default package */
public abstract class ojc {

    /* renamed from: ojc$a */
    public static final class a extends ojc {
        a() {
        }

        @Override // defpackage.ojc
        public final void c(si0<b> si0, si0<c> si02, si0<a> si03) {
            ((n) si03).a.c(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Clear{}";
        }
    }

    /* renamed from: ojc$b */
    public static final class b extends ojc {
        b() {
        }

        @Override // defpackage.ojc
        public final void c(si0<b> si0, si0<c> si02, si0<a> si03) {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Empty{}";
        }
    }

    /* renamed from: ojc$c */
    public static final class c extends ojc {
        private final String a;
        private final boolean b;
        private final long c;
        private final long d;

        c(String str, boolean z, long j, long j2) {
            str.getClass();
            this.a = str;
            this.b = z;
            this.c = j;
            this.d = j2;
        }

        @Override // defpackage.ojc
        public final void c(si0<b> si0, si0<c> si02, si0<a> si03) {
            ((u) si02).a.b(this);
        }

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.b == this.b && cVar.c == this.c && cVar.d == this.d && cVar.a.equals(this.a)) {
                return true;
            }
            return false;
        }

        public final long f() {
            return this.d;
        }

        public final long g() {
            return this.c;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.a, 0, 31);
            int hashCode = Long.valueOf(this.c).hashCode();
            return je.r0(this.d, (hashCode + ((Boolean.valueOf(this.b).hashCode() + Y0) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Update{episodeUri=");
            V0.append(this.a);
            V0.append(", isPlaying=");
            V0.append(this.b);
            V0.append(", progress=");
            V0.append(this.c);
            V0.append(", length=");
            return je.D0(V0, this.d, '}');
        }
    }

    ojc() {
    }

    public static ojc a() {
        return new a();
    }

    public static ojc b() {
        return new b();
    }

    public static ojc d(String str, boolean z, long j, long j2) {
        return new c(str, z, j, j2);
    }

    public abstract void c(si0<b> si0, si0<c> si02, si0<a> si03);
}
