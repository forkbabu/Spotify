package defpackage;

import com.spotify.voice.api.model.VoiceInteractionResponse;
import com.spotify.voice.results.model.e;
import java.util.Queue;

/* renamed from: vue  reason: default package */
public abstract class vue {

    /* renamed from: vue$a */
    public static final class a extends vue {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti02.apply(this);
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

        public final String s() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("Initialized{utteranceId="), this.a, '}');
        }
    }

    /* renamed from: vue$b */
    public static final class b extends vue {
        private final VoiceInteractionResponse a;

        b(VoiceInteractionResponse voiceInteractionResponse) {
            voiceInteractionResponse.getClass();
            this.a = voiceInteractionResponse;
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti09.apply(this);
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

        public final VoiceInteractionResponse s() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("InteractionManagerFulfillment{response=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: vue$c */
    public static final class c extends vue {
        private final String a;
        private final VoiceInteractionResponse.ClientActions b;

        c(String str, VoiceInteractionResponse.ClientActions clientActions) {
            str.getClass();
            this.a = str;
            this.b = clientActions;
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti013.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !gf0.e(cVar.b, this.b)) {
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

        public final VoiceInteractionResponse.ClientActions s() {
            return this.b;
        }

        public final String t() {
            return this.a;
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

    /* renamed from: vue$d */
    public static final class d extends vue {
        private final boolean a;

        d(boolean z) {
            this.a = z;
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti017.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof d) && ((d) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean s() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("OfflineStateChanged{hasOfflineContent="), this.a, '}');
        }
    }

    /* renamed from: vue$e */
    public static final class e extends vue {
        e() {
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti0.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OnAudioDucked{}";
        }
    }

    /* renamed from: vue$f */
    public static final class f extends vue {
        f() {
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti010.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OnDismiss{}";
        }
    }

    /* renamed from: vue$g */
    public static final class g extends vue {
        private final Queue<VoiceInteractionResponse.Action> a;

        g(Queue<VoiceInteractionResponse.Action> queue) {
            queue.getClass();
            this.a = queue;
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti015.apply(this);
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

        public final Queue<VoiceInteractionResponse.Action> s() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("OnNextAction{actions=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: vue$h */
    public static final class h extends vue {
        h() {
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti07.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof h;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PermissionsClicked{}";
        }
    }

    /* renamed from: vue$i */
    public static final class i extends vue {
        private final ugf a;

        i(ugf ugf) {
            ugf.getClass();
            this.a = ugf;
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti014.apply(this);
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

        public final ugf s() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayerStateChanged{playbackStatus=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: vue$j */
    public static final class j extends vue {
        private final String a;
        private final boolean b;

        j(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti05.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (jVar.b != this.b || !jVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.b, je.Y0(this.a, 0, 31));
        }

        public final boolean s() {
            return this.b;
        }

        public final String t() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Response{transcript=");
            V0.append(this.a);
            V0.append(", isFinal=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: vue$k */
    public static final class k extends vue {
        k() {
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti08.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof k;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "RestartSessionRequested{}";
        }
    }

    /* renamed from: vue$l */
    public static final class l extends vue {
        private final e.a a;

        l(e.a aVar) {
            aVar.getClass();
            this.a = aVar;
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti016.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            return ((l) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final e.a s() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ResultClicked{result=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: vue$m */
    public static final class m extends vue {
        private final Throwable a;

        m(Throwable th) {
            th.getClass();
            this.a = th;
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti04.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            return ((m) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final Throwable s() {
            return this.a;
        }

        public String toString() {
            return je.K0(je.V0("SessionError{error="), this.a, '}');
        }
    }

    /* renamed from: vue$n */
    public static final class n extends vue {
        n() {
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti03.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof n;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SessionStarted{}";
        }
    }

    /* renamed from: vue$o */
    public static final class o extends vue {
        o() {
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti06.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof o;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TimerElapsed{}";
        }
    }

    /* renamed from: vue$p */
    public static final class p extends vue {
        private final Queue<VoiceInteractionResponse.Action> a;

        p(Queue<VoiceInteractionResponse.Action> queue) {
            queue.getClass();
            this.a = queue;
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti011.apply(this);
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

        public final Queue<VoiceInteractionResponse.Action> s() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TtsPlaybackCompleted{actions=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: vue$q */
    public static final class q extends vue {
        private final Throwable a;
        private final Queue<VoiceInteractionResponse.Action> b;

        q(Throwable th, Queue<VoiceInteractionResponse.Action> queue) {
            th.getClass();
            this.a = th;
            queue.getClass();
            this.b = queue;
        }

        @Override // defpackage.vue
        public final <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017) {
            return ti012.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (!qVar.a.equals(this.a) || !qVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public final Queue<VoiceInteractionResponse.Action> s() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TtsPlaybackFailed{throwable=");
            V0.append(this.a);
            V0.append(", actions=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    vue() {
    }

    public static vue a(String str) {
        return new a(str);
    }

    public static vue b(VoiceInteractionResponse voiceInteractionResponse) {
        return new b(voiceInteractionResponse);
    }

    public static vue d(String str, VoiceInteractionResponse.ClientActions clientActions) {
        return new c(str, clientActions);
    }

    public static vue e(boolean z) {
        return new d(z);
    }

    public static vue f() {
        return new e();
    }

    public static vue g() {
        return new f();
    }

    public static vue h(Queue<VoiceInteractionResponse.Action> queue) {
        return new g(queue);
    }

    public static vue i() {
        return new h();
    }

    public static vue j(ugf ugf) {
        return new i(ugf);
    }

    public static vue k(String str, boolean z) {
        return new j(str, z);
    }

    public static vue l() {
        return new k();
    }

    public static vue m(e.a aVar) {
        return new l(aVar);
    }

    public static vue n(Throwable th) {
        return new m(th);
    }

    public static vue o() {
        return new n();
    }

    public static vue p() {
        return new o();
    }

    public static vue q(Queue<VoiceInteractionResponse.Action> queue) {
        return new p(queue);
    }

    public static vue r(Throwable th, Queue<VoiceInteractionResponse.Action> queue) {
        return new q(th, queue);
    }

    public abstract <R_> R_ c(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<n, R_> ti03, ti0<m, R_> ti04, ti0<j, R_> ti05, ti0<o, R_> ti06, ti0<h, R_> ti07, ti0<k, R_> ti08, ti0<b, R_> ti09, ti0<f, R_> ti010, ti0<p, R_> ti011, ti0<q, R_> ti012, ti0<c, R_> ti013, ti0<i, R_> ti014, ti0<g, R_> ti015, ti0<l, R_> ti016, ti0<d, R_> ti017);
}
