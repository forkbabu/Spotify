package defpackage;

import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.Queue;

/* renamed from: uue  reason: default package */
public abstract class uue {

    /* renamed from: uue$a */
    public static final class a extends uue {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Dismiss{}";
        }
    }

    /* renamed from: uue$a0 */
    public static final class a0 extends uue {
        a0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StopDucking{}";
        }
    }

    /* renamed from: uue$b */
    public static final class b extends uue {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "Like{uri=null}";
        }
    }

    /* renamed from: uue$b0 */
    public static final class b0 extends uue {
        b0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StopTts{}";
        }
    }

    /* renamed from: uue$c */
    public static final class c extends uue {
        private final cve a;

        c(cve cve) {
            cve.getClass();
            this.a = cve;
        }

        public final cve a() {
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
            StringBuilder V0 = je.V0("LogVoiceExperienceSource{model=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: uue$c0 */
    public static final class c0 extends uue {
        c0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VolumeDown{}";
        }
    }

    /* renamed from: uue$d */
    public static final class d extends uue {
        private final String a;

        d(String str) {
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
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Navigate{uri="), this.a, '}');
        }
    }

    /* renamed from: uue$d0 */
    public static final class d0 extends uue {
        d0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VolumeUp{}";
        }
    }

    /* renamed from: uue$e */
    public static final class e extends uue {
        private final String a;
        private final VoiceInteractionResponse.ClientActions b;

        e(String str, VoiceInteractionResponse.ClientActions clientActions) {
            str.getClass();
            this.a = str;
            this.b = clientActions;
        }

        public final VoiceInteractionResponse.ClientActions a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!eVar.a.equals(this.a) || !gf0.e(eVar.b, this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            int Y0 = je.Y0(this.a, 0, 31);
            VoiceInteractionResponse.ClientActions clientActions = this.b;
            if (clientActions != null) {
                i = clientActions.hashCode();
            }
            return Y0 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NavigateToExperimentation{uri=");
            V0.append(this.a);
            V0.append(", clientActions=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: uue$e0 */
    public static final class e0 extends uue {
        private final int a;
        private final Queue<VoiceInteractionResponse.Action> b;

        e0(int i, Queue<VoiceInteractionResponse.Action> queue) {
            this.a = i;
            queue.getClass();
            this.b = queue;
        }

        public final Queue<VoiceInteractionResponse.Action> a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e0)) {
                return false;
            }
            e0 e0Var = (e0) obj;
            if (e0Var.a != this.a || !e0Var.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.K(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Wait{seconds=");
            V0.append(this.a);
            V0.append(", actions=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: uue$f */
    public static final class f extends uue {
        f() {
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateToNowPlayingView{}";
        }
    }

    /* renamed from: uue$g */
    public static final class g extends uue {
        private final String a;

        g(String str) {
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
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Next{utteranceId="), this.a, '}');
        }
    }

    /* renamed from: uue$h */
    public static final class h extends uue {
        private final Queue<VoiceInteractionResponse.Action> a;

        h(Queue<VoiceInteractionResponse.Action> queue) {
            queue.getClass();
            this.a = queue;
        }

        public final Queue<VoiceInteractionResponse.Action> a() {
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
            StringBuilder V0 = je.V0("NextAction{actions=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: uue$i */
    public static final class i extends uue {
        private final boolean a;

        i(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof i) && ((i) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("OfflineError{hasOfflineTracks="), this.a, '}');
        }
    }

    /* renamed from: uue$j */
    public static final class j extends uue {
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

    /* renamed from: uue$k */
    public static final class k extends uue {
        private final String a;
        private final String b;
        private final String c;

        k(String str, String str2, String str3) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (!kVar.a.equals(this.a) || !kVar.b.equals(this.b) || !kVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayAndNavigate{utteranceId=");
            V0.append(this.a);
            V0.append(", uri=");
            V0.append(this.b);
            V0.append(", navUri=");
            return je.H0(V0, this.c, '}');
        }
    }

    /* renamed from: uue$l */
    public static final class l extends uue {
        private final int a;

        l(int i) {
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof l) && ((l) obj).a == this.a) {
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

    /* renamed from: uue$m */
    public static final class m extends uue {
        private final int a;
        private final Queue<VoiceInteractionResponse.Action> b;

        m(int i, Queue<VoiceInteractionResponse.Action> queue) {
            this.a = i;
            queue.getClass();
            this.b = queue;
        }

        public final Queue<VoiceInteractionResponse.Action> a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (mVar.a != this.a || !mVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.K(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayEarconAndFulfill{rawRes=");
            V0.append(this.a);
            V0.append(", actions=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: uue$n */
    public static final class n extends uue {
        private final String a;
        private final int b;
        private final Queue<VoiceInteractionResponse.Action> c;

        n(String str, int i, Queue<VoiceInteractionResponse.Action> queue) {
            str.getClass();
            this.a = str;
            this.b = i;
            queue.getClass();
            this.c = queue;
        }

        public final Queue<VoiceInteractionResponse.Action> a() {
            return this.c;
        }

        public final int b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (nVar.b != this.b || !nVar.a.equals(this.a) || !nVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.K(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayLocalTts{utteranceId=");
            V0.append(this.a);
            V0.append(", resId=");
            V0.append(this.b);
            V0.append(", actions=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: uue$o */
    public static final class o extends uue {
        private final String a;
        private final String b;
        private final Queue<VoiceInteractionResponse.Action> c;

        o(String str, String str2, Queue<VoiceInteractionResponse.Action> queue) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            queue.getClass();
            this.c = queue;
        }

        public final Queue<VoiceInteractionResponse.Action> a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            if (!oVar.a.equals(this.a) || !oVar.b.equals(this.b) || !oVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayTts{utteranceId=");
            V0.append(this.a);
            V0.append(", ttsUrl=");
            V0.append(this.b);
            V0.append(", actions=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: uue$p */
    public static final class p extends uue {
        private final String a;

        p(String str) {
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
            if (!(obj instanceof p)) {
                return false;
            }
            return ((p) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Previous{utteranceId="), this.a, '}');
        }
    }

    /* renamed from: uue$q */
    public static final class q extends uue {
        private final boolean a;

        q(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
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
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("Repeat{enabled="), this.a, '}');
        }
    }

    /* renamed from: uue$r */
    public static final class r extends uue {
        r() {
        }

        public boolean equals(Object obj) {
            return obj instanceof r;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "RepeatOne{}";
        }
    }

    /* renamed from: uue$s */
    public static final class s extends uue {
        s() {
        }

        public boolean equals(Object obj) {
            return obj instanceof s;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "RestartSession{}";
        }
    }

    /* renamed from: uue$t */
    public static final class t extends uue {
        private final String a;

        t(String str) {
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
            if (!(obj instanceof t)) {
                return false;
            }
            return ((t) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Resume{utteranceId="), this.a, '}');
        }
    }

    /* renamed from: uue$u */
    public static final class u extends uue {
        private final boolean a;

        u(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof u) && ((u) obj).a == this.a) {
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

    /* renamed from: uue$v */
    public static final class v extends uue {
        private final String a;
        private final String b;

        v(String str, String str2) {
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
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            if (!vVar.a.equals(this.a) || !vVar.b.equals(this.b)) {
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

    /* renamed from: uue$w */
    public static final class w extends uue {
        private final int a;

        w(int i) {
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof w) && ((w) obj).a == this.a) {
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

    /* renamed from: uue$x */
    public static final class x extends uue {
        x() {
        }

        public boolean equals(Object obj) {
            return obj instanceof x;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StartDucking{}";
        }
    }

    /* renamed from: uue$y */
    public static final class y extends uue {
        y() {
        }

        public boolean equals(Object obj) {
            return obj instanceof y;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StartSession{}";
        }
    }

    /* renamed from: uue$z */
    public static final class z extends uue {
        z() {
        }

        public boolean equals(Object obj) {
            return obj instanceof z;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Stop{}";
        }
    }

    uue() {
    }
}
