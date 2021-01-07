package defpackage;

import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.Queue;

/* renamed from: q2f  reason: default package */
public abstract class q2f {

    /* renamed from: q2f$a */
    public static final class a extends q2f {
        private final boolean a;

        a(boolean z) {
            this.a = z;
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti021.apply(this);
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

        public String toString() {
            return je.O0(je.V0("ButtonResultClick{accept="), this.a, '}');
        }

        public final boolean v() {
            return this.a;
        }
    }

    /* renamed from: q2f$b */
    public static final class b extends q2f {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti0.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Initialized{utteranceId="), this.a, '}');
        }

        public final String v() {
            return this.a;
        }
    }

    /* renamed from: q2f$c */
    public static final class c extends q2f {
        private final String a;
        private final Queue<VoiceInteractionResponse.Action> b;

        c(String str, Queue<VoiceInteractionResponse.Action> queue) {
            str.getClass();
            this.a = str;
            queue.getClass();
            this.b = queue;
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti010.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !cVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("InteractionManagerFulfillment{interactionId=");
            V0.append(this.a);
            V0.append(", actions=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }

        public final Queue<VoiceInteractionResponse.Action> v() {
            return this.b;
        }

        public final String w() {
            return this.a;
        }
    }

    /* renamed from: q2f$d */
    public static final class d extends q2f {
    }

    /* renamed from: q2f$e */
    public static final class e extends q2f {
        e() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti012.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OnDismiss{}";
        }
    }

    /* renamed from: q2f$f */
    public static final class f extends q2f {
        private final String a;

        f(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti017.apply(this);
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
            return je.H0(je.V0("OnFulfillmentAfterEarcon{ttsUrl="), this.a, '}');
        }

        public final String v() {
            return this.a;
        }
    }

    /* renamed from: q2f$g */
    public static final class g extends q2f {
        g() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti011.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OnNextAction{}";
        }
    }

    /* renamed from: q2f$h */
    public static final class h extends q2f {
        h() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti018.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof h;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OnPreviewPlaybackComplete{}";
        }
    }

    /* renamed from: q2f$i */
    public static final class i extends q2f {
        i() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti019.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof i;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OnPreviewPlaybackFailed{}";
        }
    }

    /* renamed from: q2f$j */
    public static final class j extends q2f {
    }

    /* renamed from: q2f$k */
    public static final class k extends q2f {
        private final ugf a;

        k(ugf ugf) {
            ugf.getClass();
            this.a = ugf;
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti016.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            return ((k) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayerStateChanged{playbackStatus=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: q2f$l */
    public static final class l extends q2f {
        private final String a;
        private final boolean b;

        l(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti04.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (lVar.b != this.b || !lVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("Response{transcript=");
            V0.append(this.a);
            V0.append(", isFinal=");
            return je.O0(V0, this.b, '}');
        }

        public final boolean v() {
            return this.b;
        }

        public final String w() {
            return this.a;
        }
    }

    /* renamed from: q2f$m */
    public static final class m extends q2f {
        m() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti09.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof m;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "RestartSessionRequested{}";
        }
    }

    /* renamed from: q2f$n */
    public static final class n extends q2f {
        n() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti022.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof n;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Save{}";
        }
    }

    /* renamed from: q2f$o */
    public static final class o extends q2f {
        private final Throwable a;

        o(Throwable th) {
            th.getClass();
            this.a = th;
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti03.apply(this);
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
            return je.K0(je.V0("SessionError{error="), this.a, '}');
        }

        public final Throwable v() {
            return this.a;
        }
    }

    /* renamed from: q2f$p */
    public static final class p extends q2f {
        p() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti02.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof p;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SessionStarted{}";
        }
    }

    /* renamed from: q2f$q */
    public static final class q extends q2f {
        q() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti08.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof q;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StopAllAndRestart{}";
        }
    }

    /* renamed from: q2f$r */
    public static final class r extends q2f {
        r() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti020.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof r;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StopPlayback{}";
        }
    }

    /* renamed from: q2f$s */
    public static final class s extends q2f {
        s() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti05.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof s;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TimerElapsed{}";
        }
    }

    /* renamed from: q2f$t */
    public static final class t extends q2f {
        t() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti06.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof t;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TimerElapsedWhileIdle{}";
        }
    }

    /* renamed from: q2f$u */
    public static final class u extends q2f {
        u() {
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti013.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof u;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TtsPlaybackCompleted{}";
        }
    }

    /* renamed from: q2f$v */
    public static final class v extends q2f {
        private final Throwable a;

        v(Throwable th) {
            th.getClass();
            this.a = th;
        }

        @Override // defpackage.q2f
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022) {
            return ti014.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            return ((v) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.K0(je.V0("TtsPlaybackFailed{throwable="), this.a, '}');
        }
    }

    q2f() {
    }

    public static q2f a(boolean z) {
        return new a(z);
    }

    public static q2f b(String str) {
        return new b(str);
    }

    public static q2f c(String str, Queue<VoiceInteractionResponse.Action> queue) {
        return new c(str, queue);
    }

    public static q2f e() {
        return new e();
    }

    public static q2f f(String str) {
        return new f(str);
    }

    public static q2f g() {
        return new g();
    }

    public static q2f h() {
        return new h();
    }

    public static q2f i() {
        return new i();
    }

    public static q2f j(ugf ugf) {
        return new k(ugf);
    }

    public static q2f k(String str, boolean z) {
        return new l(str, z);
    }

    public static q2f l() {
        return new m();
    }

    public static q2f m() {
        return new n();
    }

    public static q2f n(Throwable th) {
        return new o(th);
    }

    public static q2f o() {
        return new p();
    }

    public static q2f p() {
        return new q();
    }

    public static q2f q() {
        return new r();
    }

    public static q2f r() {
        return new s();
    }

    public static q2f s() {
        return new t();
    }

    public static q2f t() {
        return new u();
    }

    public static q2f u(Throwable th) {
        return new v(th);
    }

    public abstract <R_> R_ d(ti0<b, R_> ti0, ti0<p, R_> ti02, ti0<o, R_> ti03, ti0<l, R_> ti04, ti0<s, R_> ti05, ti0<t, R_> ti06, ti0<j, R_> ti07, ti0<q, R_> ti08, ti0<m, R_> ti09, ti0<c, R_> ti010, ti0<g, R_> ti011, ti0<e, R_> ti012, ti0<u, R_> ti013, ti0<v, R_> ti014, ti0<d, R_> ti015, ti0<k, R_> ti016, ti0<f, R_> ti017, ti0<h, R_> ti018, ti0<i, R_> ti019, ti0<r, R_> ti020, ti0<a, R_> ti021, ti0<n, R_> ti022);
}
