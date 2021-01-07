package defpackage;

import com.spotify.superbird.earcon.EarconType;

/* renamed from: kef  reason: default package */
public abstract class kef {

    /* renamed from: kef$a */
    public static final class a extends kef {
        private final boolean a;

        a(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof a) && ((a) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean t() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("Dismiss{wasPlayerPaused="), this.a, '}');
        }
    }

    /* renamed from: kef$b */
    public static final class b extends kef {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Duck{}";
        }
    }

    /* renamed from: kef$c */
    public static final class c extends kef {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
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

        public final String t() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("FollowArtist{uri="), this.a, '}');
        }
    }

    /* renamed from: kef$d */
    public static final class d extends kef {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String t() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("FollowPodcast{uri="), this.a, '}');
        }
    }

    /* renamed from: kef$e */
    public static final class e extends kef {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Next{}";
        }
    }

    /* renamed from: kef$f */
    public static final class f extends kef {
        private final String a;
        private final l9f b;

        f(String str, l9f l9f) {
            str.getClass();
            this.a = str;
            l9f.getClass();
            this.b = l9f;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (!fVar.a.equals(this.a) || !fVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public final l9f t() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NotifySubscribers{utteranceId=");
            V0.append(this.a);
            V0.append(", state=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }

        public final String u() {
            return this.a;
        }
    }

    /* renamed from: kef$g */
    public static final class g extends kef {
        private final String a;

        g(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String t() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("Play{uri="), this.a, '}');
        }
    }

    /* renamed from: kef$h */
    public static final class h extends kef {
        private final EarconType a;

        h(EarconType earconType) {
            earconType.getClass();
            this.a = earconType;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof h) && ((h) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final EarconType t() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayEarcon{type=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: kef$i */
    public static final class i extends kef {
        private final String a;

        i(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            return ((i) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String t() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("PlayTts{ttsUrl="), this.a, '}');
        }
    }

    /* renamed from: kef$j */
    public static final class j extends kef {
        j() {
        }

        public boolean equals(Object obj) {
            return obj instanceof j;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Previous{}";
        }
    }

    /* renamed from: kef$k */
    public static final class k extends kef {
        private final boolean a;

        k(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof k) && ((k) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean t() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("Repeat{enabled="), this.a, '}');
        }
    }

    /* renamed from: kef$l */
    public static final class l extends kef {
        l() {
        }

        public boolean equals(Object obj) {
            return obj instanceof l;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "RepeatOne{}";
        }
    }

    /* renamed from: kef$m */
    public static final class m extends kef {
        m() {
        }

        public boolean equals(Object obj) {
            return obj instanceof m;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Resume{}";
        }
    }

    /* renamed from: kef$n */
    public static final class n extends kef {
        private final String a;

        n(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            return ((n) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String t() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("SaveAlbum{albumUri="), this.a, '}');
        }
    }

    /* renamed from: kef$o */
    public static final class o extends kef {
        private final String a;

        o(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            return ((o) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String t() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("SavePlaylist{uri="), this.a, '}');
        }
    }

    /* renamed from: kef$p */
    public static final class p extends kef {
        private final Integer a;
        private final String b;

        p(Integer num, String str) {
            num.getClass();
            this.a = num;
            str.getClass();
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (!pVar.a.equals(this.a) || !pVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public final String t() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SaveToPreset{slotIndex=");
            V0.append(this.a);
            V0.append(", contextUri=");
            return je.H0(V0, this.b, '}');
        }

        public final Integer u() {
            return this.a;
        }
    }

    /* renamed from: kef$q */
    public static final class q extends kef {
        private final long a;

        q(long j) {
            this.a = j;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof q) && ((q) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.r0(this.a, 0);
        }

        public final long t() {
            return this.a;
        }

        public String toString() {
            return je.D0(je.V0("SeekToRelativePosition{skipDeltaMs="), this.a, '}');
        }
    }

    /* renamed from: kef$r */
    public static final class r extends kef {
        private final int a;

        r(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof r) && ((r) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public final int t() {
            return this.a;
        }

        public String toString() {
            return je.A0(je.V0("SetVolume{volume="), this.a, '}');
        }
    }

    /* renamed from: kef$s */
    public static final class s extends kef {
        private final boolean a;

        s(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof s) && ((s) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean t() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("Shuffle{enabled="), this.a, '}');
        }
    }

    /* renamed from: kef$t */
    public static final class t extends kef {
        private final String a;

        t(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            return ((t) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String t() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("ShufflePlay{uri="), this.a, '}');
        }
    }

    /* renamed from: kef$u */
    public static final class u extends kef {
        u() {
        }

        public boolean equals(Object obj) {
            return obj instanceof u;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StartSession{}";
        }
    }

    /* renamed from: kef$v */
    public static final class v extends kef {
        v() {
        }

        public boolean equals(Object obj) {
            return obj instanceof v;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Stop{}";
        }
    }

    /* renamed from: kef$w */
    public static final class w extends kef {
        private final String a;

        w(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            return ((w) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String t() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("ThumbsUp{uri="), this.a, '}');
        }
    }

    /* renamed from: kef$x */
    public static final class x extends kef {
        x() {
        }

        public boolean equals(Object obj) {
            return obj instanceof x;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Unduck{}";
        }
    }

    /* renamed from: kef$y */
    public static final class y extends kef {
        y() {
        }

        public boolean equals(Object obj) {
            return obj instanceof y;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VolumeDown{}";
        }
    }

    /* renamed from: kef$z */
    public static final class z extends kef {
        z() {
        }

        public boolean equals(Object obj) {
            return obj instanceof z;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VolumeUp{}";
        }
    }

    kef() {
    }

    public static kef a(String str) {
        return new c(str);
    }

    public static kef b(String str) {
        return new d(str);
    }

    public static kef c() {
        return new e();
    }

    public static kef d(String str) {
        return new g(str);
    }

    public static kef e(EarconType earconType) {
        return new h(earconType);
    }

    public static kef f() {
        return new j();
    }

    public static kef g(boolean z2) {
        return new k(z2);
    }

    public static kef h() {
        return new l();
    }

    public static kef i() {
        return new m();
    }

    public static kef j(String str) {
        return new n(str);
    }

    public static kef k(String str) {
        return new o(str);
    }

    public static kef l(Integer num, String str) {
        return new p(num, str);
    }

    public static kef m(int i2) {
        return new r(i2);
    }

    public static kef n(boolean z2) {
        return new s(z2);
    }

    public static kef o(String str) {
        return new t(str);
    }

    public static kef p() {
        return new v();
    }

    public static kef q(String str) {
        return new w(str);
    }

    public static kef r() {
        return new y();
    }

    public static kef s() {
        return new z();
    }
}
