package defpackage;

import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.Queue;

/* renamed from: p2f  reason: default package */
public abstract class p2f {

    /* renamed from: p2f$a */
    public static final class a extends p2f {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
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
            return je.H0(je.V0("AnswerTimeout{interactionId="), this.a, '}');
        }
    }

    /* renamed from: p2f$a0 */
    public static final class a0 extends p2f {
        a0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StartSession{}";
        }
    }

    /* renamed from: p2f$b */
    public static final class b extends p2f {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Dismiss{}";
        }
    }

    /* renamed from: p2f$b0 */
    public static final class b0 extends p2f {
        b0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StopPlayback{}";
        }
    }

    /* renamed from: p2f$c */
    public static final class c extends p2f {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
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
            return je.H0(je.V0("FetchResult{value="), this.a, '}');
        }
    }

    /* renamed from: p2f$c0 */
    public static final class c0 extends p2f {
        c0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StopPlaybackAndNavigate{}";
        }
    }

    /* renamed from: p2f$d */
    public static final class d extends p2f {
        private final String a;
        private final Queue<VoiceInteractionResponse.Action> b;

        d(String str, Queue<VoiceInteractionResponse.Action> queue) {
            str.getClass();
            this.a = str;
            queue.getClass();
            this.b = queue;
        }

        public final Queue<VoiceInteractionResponse.Action> a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a.equals(this.a) || !dVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("InitializeSession{interactionId=");
            V0.append(this.a);
            V0.append(", actions=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: p2f$d0 */
    public static final class d0 extends p2f {
        d0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StopPreview{}";
        }
    }

    /* renamed from: p2f$e */
    public static final class e extends p2f {
        private final v2f a;

        e(v2f v2f) {
            v2f.getClass();
            this.a = v2f;
        }

        public final v2f a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogVoiceExperienceSource{model=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: p2f$e0 */
    public static final class e0 extends p2f {
        e0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StopTts{}";
        }
    }

    /* renamed from: p2f$f */
    public static final class f extends p2f {
        private final String a;

        f(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Navigate{uri="), this.a, '}');
        }
    }

    /* renamed from: p2f$f0 */
    public static final class f0 extends p2f {
        f0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof f0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VolumeDown{}";
        }
    }

    /* renamed from: p2f$g */
    public static final class g extends p2f {
        g() {
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateToNowPlayingView{}";
        }
    }

    /* renamed from: p2f$g0 */
    public static final class g0 extends p2f {
        g0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof g0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VolumeUp{}";
        }
    }

    /* renamed from: p2f$h */
    public static final class h extends p2f {
        private final String a;

        h(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Next{utteranceId="), this.a, '}');
        }
    }

    /* renamed from: p2f$i */
    public static final class i extends p2f {
        i() {
        }

        public boolean equals(Object obj) {
            return obj instanceof i;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NextAction{}";
        }
    }

    /* renamed from: p2f$j */
    public static final class j extends p2f {
        private final String a;
        private final String b;

        j(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (!jVar.a.equals(this.a) || !jVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Play{utteranceId=");
            V0.append(this.a);
            V0.append(", uri=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: p2f$k */
    public static final class k extends p2f {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            ((k) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "PlayAndDelay{utteranceId=null, uri=null, delay=0}";
        }
    }

    /* renamed from: p2f$l */
    public static final class l extends p2f {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            ((l) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "PlayAndNavigate{utteranceId=null, uri=null, navUri=null}";
        }
    }

    /* renamed from: p2f$m */
    public static final class m extends p2f {
        private final int a;

        m(int i) {
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof m) && ((m) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public String toString() {
            return je.A0(je.V0("PlayEarcon{rawRes="), this.a, '}');
        }
    }

    /* renamed from: p2f$n */
    public static final class n extends p2f {
        private final int a;
        private final boolean b;
        private final String c;

        n(int i, boolean z, String str) {
            this.a = i;
            this.b = z;
            this.c = str;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (nVar.a == this.a && nVar.b == this.b && gf0.e(nVar.c, this.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (Boolean.valueOf(this.b).hashCode() + je.K(this.a, 0, 31)) * 31;
            String str = this.c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayEarconAndFulfill{rawRes=");
            V0.append(this.a);
            V0.append(", ttsEnabled=");
            V0.append(this.b);
            V0.append(", ttsUrl=");
            return je.H0(V0, this.c, '}');
        }
    }

    /* renamed from: p2f$o */
    public static final class o extends p2f {
        private final VoiceInteractionResponse.Preview a;

        o(VoiceInteractionResponse.Preview preview) {
            preview.getClass();
            this.a = preview;
        }

        public final VoiceInteractionResponse.Preview a() {
            return this.a;
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

        public String toString() {
            StringBuilder V0 = je.V0("PlayPreview{preview=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: p2f$p */
    public static final class p extends p2f {
        private final String a;
        private final String b;

        p(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
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
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayTts{utteranceId=");
            V0.append(this.a);
            V0.append(", ttsUrl=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: p2f$q */
    public static final class q extends p2f {
        private final String a;

        q(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            return ((q) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Previous{utteranceId="), this.a, '}');
        }
    }

    /* renamed from: p2f$r */
    public static final class r extends p2f {
        private final boolean a;

        r(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
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
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("Repeat{enabled="), this.a, '}');
        }
    }

    /* renamed from: p2f$s */
    public static final class s extends p2f {
        s() {
        }

        public boolean equals(Object obj) {
            return obj instanceof s;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "RepeatOne{}";
        }
    }

    /* renamed from: p2f$t */
    public static final class t extends p2f {
        t() {
        }

        public boolean equals(Object obj) {
            return obj instanceof t;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "RequestSessionInitialization{}";
        }
    }

    /* renamed from: p2f$u */
    public static final class u extends p2f {
        u() {
        }

        public boolean equals(Object obj) {
            return obj instanceof u;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "RestartSession{}";
        }
    }

    /* renamed from: p2f$v */
    public static final class v extends p2f {
        private final String a;
        private final boolean b;

        v(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            if (vVar.b != this.b || !vVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("Resume{utteranceId=");
            V0.append(this.a);
            V0.append(", shouldDismiss=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: p2f$w */
    public static final class w extends p2f {
        w() {
        }

        public boolean equals(Object obj) {
            return obj instanceof w;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SaveSession{}";
        }
    }

    /* renamed from: p2f$x */
    public static final class x extends p2f {
        private final boolean a;

        x(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof x) && ((x) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("Shuffle{enabled="), this.a, '}');
        }
    }

    /* renamed from: p2f$y */
    public static final class y extends p2f {
        private final String a;
        private final String b;

        y(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            if (!yVar.a.equals(this.a) || !yVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShufflePlay{utteranceId=");
            V0.append(this.a);
            V0.append(", uri=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: p2f$z */
    public static final class z extends p2f {
        private final int a;

        z(int i) {
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof z) && ((z) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public String toString() {
            return je.A0(je.V0("StartAutoDismissTimer{seconds="), this.a, '}');
        }
    }

    p2f() {
    }
}
