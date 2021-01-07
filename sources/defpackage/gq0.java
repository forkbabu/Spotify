package defpackage;

import com.spotify.inappmessaging.TriggerType;

/* renamed from: gq0  reason: default package */
public abstract class gq0 {

    /* renamed from: gq0$a */
    public static final class a extends gq0 {
        a() {
        }

        @Override // defpackage.gq0
        public final <R_> R_ d(ti0<f, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<b, R_> ti06, ti0<c, R_> ti07) {
            return (R_) ((aq0) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "CancelButtonPressed{}";
        }
    }

    /* renamed from: gq0$b */
    public static final class b extends gq0 {
        b() {
        }

        @Override // defpackage.gq0
        public final <R_> R_ d(ti0<f, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<b, R_> ti06, ti0<c, R_> ti07) {
            return (R_) ((yp0) ti06).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ErrorMessageShown{}";
        }
    }

    /* renamed from: gq0$c */
    public static final class c extends gq0 {
        private final TriggerType a;
        private final String b;

        c(TriggerType triggerType, String str) {
            triggerType.getClass();
            this.a = triggerType;
            str.getClass();
            this.b = str;
        }

        @Override // defpackage.gq0
        public final <R_> R_ d(ti0<f, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<b, R_> ti06, ti0<c, R_> ti07) {
            return (R_) ((cq0) ti07).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.a != this.a || !cVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public final String i() {
            return this.b;
        }

        public final TriggerType j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EventReceived{triggerType=");
            V0.append(this.a);
            V0.append(", pattern=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: gq0$d */
    public static final class d extends gq0 {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.gq0
        public final <R_> R_ d(ti0<f, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<b, R_> ti06, ti0<c, R_> ti07) {
            return (R_) ((zp0) ti05).apply(this);
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

        public final String i() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("MessageLoadingFailed{message="), this.a, '}');
        }
    }

    /* renamed from: gq0$e */
    public static final class e extends gq0 {
        private final gp0 a;
        private final fp0 b;

        e(gp0 gp0, fp0 fp0) {
            gp0.getClass();
            this.a = gp0;
            fp0.getClass();
            this.b = fp0;
        }

        @Override // defpackage.gq0
        public final <R_> R_ d(ti0<f, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<b, R_> ti06, ti0<c, R_> ti07) {
            return (R_) ((xp0) ti04).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!eVar.a.equals(this.a) || !eVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public final fp0 i() {
            return this.b;
        }

        public final gp0 j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("MessageReceived{trigger=");
            V0.append(this.a);
            V0.append(", message=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: gq0$f */
    public static final class f extends gq0 {
        f() {
        }

        @Override // defpackage.gq0
        public final <R_> R_ d(ti0<f, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<b, R_> ti06, ti0<c, R_> ti07) {
            return (R_) ((bq0) ti0).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PreviewButtonPressed{}";
        }
    }

    /* renamed from: gq0$g */
    public static final class g extends gq0 {
        private final TriggerType a;
        private final String b;

        g(TriggerType triggerType, String str) {
            triggerType.getClass();
            this.a = triggerType;
            this.b = str;
        }

        @Override // defpackage.gq0
        public final <R_> R_ d(ti0<f, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<b, R_> ti06, ti0<c, R_> ti07) {
            return (R_) ((wp0) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (gVar.a != this.a || !gf0.e(gVar.b, this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (this.a.hashCode() + 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String i() {
            return this.b;
        }

        public final TriggerType j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PreviewRequested{triggerType=");
            V0.append(this.a);
            V0.append(", creativeId=");
            return je.H0(V0, this.b, '}');
        }
    }

    gq0() {
    }

    public static gq0 a() {
        return new a();
    }

    public static gq0 b() {
        return new b();
    }

    public static gq0 c(TriggerType triggerType, String str) {
        return new c(triggerType, str);
    }

    public static gq0 e(String str) {
        return new d(str);
    }

    public static gq0 f(gp0 gp0, fp0 fp0) {
        return new e(gp0, fp0);
    }

    public static gq0 g() {
        return new f();
    }

    public static gq0 h(TriggerType triggerType, String str) {
        return new g(triggerType, str);
    }

    public abstract <R_> R_ d(ti0<f, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<b, R_> ti06, ti0<c, R_> ti07);
}
