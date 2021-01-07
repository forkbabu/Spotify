package defpackage;

import com.google.common.base.Optional;
import com.spotify.voice.api.model.ClientAction;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.List;

/* renamed from: u8f  reason: default package */
public abstract class u8f {

    /* renamed from: u8f$a */
    public static final class a extends u8f {
        private final String a;
        private final String b;
        private final boolean c;
        private final ClientAction d;
        private final List<VoiceInteractionResponse.Display.Result> e;

        a(String str, String str2, boolean z, ClientAction clientAction, List<VoiceInteractionResponse.Display.Result> list) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = clientAction;
            list.getClass();
            this.e = list;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.c != this.c || aVar.d != this.d || !gf0.e(aVar.a, this.a) || !gf0.e(aVar.b, this.b) || !aVar.e.equals(this.e)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.u8f
        public final void g(si0<e> si0, si0<i> si02, si0<f> si03, si0<j> si04, si0<a> si05, si0<h> si06, si0<b> si07, si0<d> si08, si0<c> si09, si0<g> si010) {
            si05.accept(this);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
            String str2 = this.b;
            int hashCode2 = (Boolean.valueOf(this.c).hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
            ClientAction clientAction = this.d;
            if (clientAction != null) {
                i = clientAction.hashCode();
            }
            return this.e.hashCode() + ((hashCode2 + i) * 31);
        }

        public final ClientAction l() {
            return this.d;
        }

        public final String m() {
            return this.b;
        }

        public final List<VoiceInteractionResponse.Display.Result> n() {
            return this.e;
        }

        public final String o() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Dialog{title=");
            V0.append(this.a);
            V0.append(", description=");
            V0.append(this.b);
            V0.append(", isInterruptable=");
            V0.append(this.c);
            V0.append(", currentAction=");
            V0.append(this.d);
            V0.append(", results=");
            V0.append(this.e);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: u8f$b */
    public static final class b extends u8f {
        private final int a;
        private final String b;
        private final String c;

        b(int i, String str, String str2) {
            this.a = i;
            str.getClass();
            this.b = str;
            str2.getClass();
            this.c = str2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.a != this.a || !bVar.b.equals(this.b) || !bVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.u8f
        public final void g(si0<e> si0, si0<i> si02, si0<f> si03, si0<j> si04, si0<a> si05, si0<h> si06, si0<b> si07, si0<d> si08, si0<c> si09, si0<g> si010) {
            si07.accept(this);
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.K(this.a, 0, 31), 31);
        }

        public final String l() {
            return this.c;
        }

        public final String m() {
            return this.b;
        }

        public final int n() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DialogResult{totalPoints=");
            V0.append(this.a);
            V0.append(", imageUri=");
            V0.append(this.b);
            V0.append(", answerText=");
            return je.H0(V0, this.c, '}');
        }
    }

    /* renamed from: u8f$c */
    public static final class c extends u8f {
        private final r8f a;

        c(r8f r8f) {
            r8f.getClass();
            this.a = r8f;
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

        @Override // defpackage.u8f
        public final void g(si0<e> si0, si0<i> si02, si0<f> si03, si0<j> si04, si0<a> si05, si0<h> si06, si0<b> si07, si0<d> si08, si0<c> si09, si0<g> si010) {
            si09.accept(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final r8f l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error{voiceErrorState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: u8f$d */
    public static final class d extends u8f {
        private final int a;

        d(int i) {
            this.a = i;
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

        @Override // defpackage.u8f
        public final void g(si0<e> si0, si0<i> si02, si0<f> si03, si0<j> si04, si0<a> si05, si0<h> si06, si0<b> si07, si0<d> si08, si0<c> si09, si0<g> si010) {
            si08.accept(this);
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public final int l() {
            return this.a;
        }

        public String toString() {
            return je.A0(je.V0("Idle{timerValue="), this.a, '}');
        }
    }

    /* renamed from: u8f$e */
    public static final class e extends u8f {
        private final boolean a;

        e(boolean z) {
            this.a = z;
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

        @Override // defpackage.u8f
        public final void g(si0<e> si0, si0<i> si02, si0<f> si03, si0<j> si04, si0<a> si05, si0<h> si06, si0<b> si07, si0<d> si08, si0<c> si09, si0<g> si010) {
            si0.accept(this);
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean l() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("Init{enableMicIcon="), this.a, '}');
        }
    }

    /* renamed from: u8f$f */
    public static final class f extends u8f {
        private final String a;

        f(String str) {
            str.getClass();
            this.a = str;
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

        @Override // defpackage.u8f
        public final void g(si0<e> si0, si0<i> si02, si0<f> si03, si0<j> si04, si0<a> si05, si0<h> si06, si0<b> si07, si0<d> si08, si0<c> si09, si0<g> si010) {
            si03.accept(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String l() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("Listening{transcription="), this.a, '}');
        }
    }

    /* renamed from: u8f$g */
    public static final class g extends u8f {
        private final ClientAction a;

        g(ClientAction clientAction) {
            this.a = clientAction;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof g) && ((g) obj).a == this.a) {
                return true;
            }
            return false;
        }

        @Override // defpackage.u8f
        public final void g(si0<e> si0, si0<i> si02, si0<f> si03, si0<j> si04, si0<a> si05, si0<h> si06, si0<b> si07, si0<d> si08, si0<c> si09, si0<g> si010) {
            si010.accept(this);
        }

        public int hashCode() {
            ClientAction clientAction = this.a;
            return 0 + (clientAction != null ? clientAction.hashCode() : 0);
        }

        public final ClientAction l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NoChange{currentAction=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: u8f$h */
    public static final class h extends u8f {
        private final int a;

        h(int i) {
            this.a = i;
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

        @Override // defpackage.u8f
        public final void g(si0<e> si0, si0<i> si02, si0<f> si03, si0<j> si04, si0<a> si05, si0<h> si06, si0<b> si07, si0<d> si08, si0<c> si09, si0<g> si010) {
            si06.accept(this);
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public final int l() {
            return this.a;
        }

        public String toString() {
            return je.A0(je.V0("ScoreUpdate{totalPoints="), this.a, '}');
        }
    }

    /* renamed from: u8f$i */
    public static final class i extends u8f {
        private final Optional<String> a;

        i(Optional<String> optional) {
            optional.getClass();
            this.a = optional;
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

        @Override // defpackage.u8f
        public final void g(si0<e> si0, si0<i> si02, si0<f> si03, si0<j> si04, si0<a> si05, si0<h> si06, si0<b> si07, si0<d> si08, si0<c> si09, si0<g> si010) {
            si02.accept(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final Optional<String> l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("StartListening{suggestion=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: u8f$j */
    public static final class j extends u8f {
        private final String a;

        j(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            return ((j) obj).a.equals(this.a);
        }

        @Override // defpackage.u8f
        public final void g(si0<e> si0, si0<i> si02, si0<f> si03, si0<j> si04, si0<a> si05, si0<h> si06, si0<b> si07, si0<d> si08, si0<c> si09, si0<g> si010) {
            si04.accept(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String l() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("Thinking{transcription="), this.a, '}');
        }
    }

    u8f() {
    }

    public static u8f a(String str, String str2, boolean z, ClientAction clientAction, List<VoiceInteractionResponse.Display.Result> list) {
        return new a(str, str2, z, clientAction, list);
    }

    public static u8f b(int i2, String str, String str2) {
        return new b(i2, str, str2);
    }

    public static u8f c(r8f r8f) {
        return new c(r8f);
    }

    public static u8f d(int i2) {
        return new d(i2);
    }

    public static u8f e(boolean z) {
        return new e(z);
    }

    public static u8f f(String str) {
        return new f(str);
    }

    public static u8f h(ClientAction clientAction) {
        return new g(clientAction);
    }

    public static u8f i(int i2) {
        return new h(i2);
    }

    public static u8f j(Optional<String> optional) {
        return new i(optional);
    }

    public static u8f k(String str) {
        return new j(str);
    }

    public abstract void g(si0<e> si0, si0<i> si02, si0<f> si03, si0<j> si04, si0<a> si05, si0<h> si06, si0<b> si07, si0<d> si08, si0<c> si09, si0<g> si010);
}
