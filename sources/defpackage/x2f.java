package defpackage;

import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.Queue;

/* renamed from: x2f  reason: default package */
public abstract class x2f {

    /* renamed from: x2f$a */
    public static final class a extends x2f {
        private final VoiceInteractionResponse.Action a;
        private final Queue<VoiceInteractionResponse.Action> b;

        a(VoiceInteractionResponse.Action action, Queue<VoiceInteractionResponse.Action> queue) {
            this.a = action;
            queue.getClass();
            this.b = queue;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!gf0.e(aVar.a, this.a) || !aVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            VoiceInteractionResponse.Action action = this.a;
            return this.b.hashCode() + ((0 + (action != null ? action.hashCode() : 0)) * 31);
        }

        @Override // defpackage.x2f
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<f, R_> ti02, ti0<h, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<a, R_> ti06, ti0<i, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<j, R_> ti010, ti0<e, R_> ti011) {
            return (R_) ((i8f) ti06).a.b(this);
        }

        public final Queue<VoiceInteractionResponse.Action> k() {
            return this.b;
        }

        public final VoiceInteractionResponse.Action l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DialogResponse{current=");
            V0.append(this.a);
            V0.append(", actions=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: x2f$b */
    public static final class b extends x2f {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        @Override // defpackage.x2f
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<f, R_> ti02, ti0<h, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<a, R_> ti06, ti0<i, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<j, R_> ti010, ti0<e, R_> ti011) {
            return (R_) ((h8f) ti09).a.e(this);
        }

        public String toString() {
            return "Error{}";
        }
    }

    /* renamed from: x2f$c */
    public static final class c extends x2f {
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

        @Override // defpackage.x2f
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<f, R_> ti02, ti0<h, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<a, R_> ti06, ti0<i, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<j, R_> ti010, ti0<e, R_> ti011) {
            return (R_) ((d8f) ti05).apply(this);
        }

        public final String k() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("FinalResponse{transcript="), this.a, '}');
        }
    }

    /* renamed from: x2f$d */
    public static final class d extends x2f {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        @Override // defpackage.x2f
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<f, R_> ti02, ti0<h, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<a, R_> ti06, ti0<i, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<j, R_> ti010, ti0<e, R_> ti011) {
            return (R_) ((c8f) ti0).apply(this);
        }

        public String toString() {
            return "FullRestart{}";
        }
    }

    /* renamed from: x2f$e */
    public static final class e extends x2f {
        private final int a;

        e(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof e) && ((e) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        @Override // defpackage.x2f
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<f, R_> ti02, ti0<h, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<a, R_> ti06, ti0<i, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<j, R_> ti010, ti0<e, R_> ti011) {
            return (R_) ((f8f) ti011).apply(this);
        }

        public final int k() {
            return this.a;
        }

        public String toString() {
            return je.A0(je.V0("Idle{timerValue="), this.a, '}');
        }
    }

    /* renamed from: x2f$f */
    public static final class f extends x2f {
        f() {
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        @Override // defpackage.x2f
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<f, R_> ti02, ti0<h, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<a, R_> ti06, ti0<i, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<j, R_> ti010, ti0<e, R_> ti011) {
            return (R_) ((g8f) ti02).apply(this);
        }

        public String toString() {
            return "Init{}";
        }
    }

    /* renamed from: x2f$g */
    public static final class g extends x2f {
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

        @Override // defpackage.x2f
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<f, R_> ti02, ti0<h, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<a, R_> ti06, ti0<i, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<j, R_> ti010, ti0<e, R_> ti011) {
            return (R_) ((e8f) ti04).apply(this);
        }

        public final String k() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("IntermediateResponse{transcript="), this.a, '}');
        }
    }

    /* renamed from: x2f$h */
    public static final class h extends x2f {
        private final boolean a;

        h(boolean z) {
            this.a = z;
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
            return je.n(this.a, 0);
        }

        @Override // defpackage.x2f
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<f, R_> ti02, ti0<h, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<a, R_> ti06, ti0<i, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<j, R_> ti010, ti0<e, R_> ti011) {
            return (R_) ((l8f) ti03).a.a(this);
        }

        public final boolean k() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("Listening{showSuggestions="), this.a, '}');
        }
    }

    /* renamed from: x2f$i */
    public static final class i extends x2f {
        i() {
        }

        public boolean equals(Object obj) {
            return obj instanceof i;
        }

        public int hashCode() {
            return 0;
        }

        @Override // defpackage.x2f
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<f, R_> ti02, ti0<h, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<a, R_> ti06, ti0<i, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<j, R_> ti010, ti0<e, R_> ti011) {
            return (R_) ((m8f) ti07).a.c(this);
        }

        public String toString() {
            return "OfflineError{}";
        }
    }

    /* renamed from: x2f$j */
    public static final class j extends x2f {
    }

    /* renamed from: x2f$k */
    public static final class k extends x2f {
    }

    x2f() {
    }

    public static x2f a(VoiceInteractionResponse.Action action, Queue<VoiceInteractionResponse.Action> queue) {
        return new a(action, queue);
    }

    public static x2f b() {
        return new b();
    }

    public static x2f c(String str) {
        return new c(str);
    }

    public static x2f d() {
        return new d();
    }

    public static x2f e(int i2) {
        return new e(i2);
    }

    public static x2f f() {
        return new f();
    }

    public static x2f g(String str) {
        return new g(str);
    }

    public static x2f h(boolean z) {
        return new h(z);
    }

    public static x2f j() {
        return new i();
    }

    public abstract <R_> R_ i(ti0<d, R_> ti0, ti0<f, R_> ti02, ti0<h, R_> ti03, ti0<g, R_> ti04, ti0<c, R_> ti05, ti0<a, R_> ti06, ti0<i, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<j, R_> ti010, ti0<e, R_> ti011);
}
