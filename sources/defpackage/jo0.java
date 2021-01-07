package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.inappmessaging.TriggerType;

/* renamed from: jo0  reason: default package */
public abstract class jo0 {

    /* renamed from: jo0$a */
    public static final class a extends jo0 {
        a() {
        }

        @Override // defpackage.jo0
        public final <R_> R_ a(ti0<e, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ((ao0) ti06).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "MessageFetchFailed{}";
        }
    }

    /* renamed from: jo0$b */
    public static final class b extends jo0 {
        private final u3<gp0, fp0> a;

        b(u3<gp0, fp0> u3Var) {
            u3Var.getClass();
            this.a = u3Var;
        }

        @Override // defpackage.jo0
        public final <R_> R_ a(ti0<e, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ((co0) ti05).apply(this);
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

        public final u3<gp0, fp0> h() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("MessageFetchSuccess{messageTriggerPair=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: jo0$c */
    public static final class c extends jo0 {
        private final String a;
        private final TriggerType b;

        c(String str, TriggerType triggerType) {
            str.getClass();
            this.a = str;
            triggerType.getClass();
            this.b = triggerType;
        }

        @Override // defpackage.jo0
        public final <R_> R_ a(ti0<e, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ko0.c(((do0) ti04).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.b != this.b || !cVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public final TriggerType i() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TriggerEvent{pattern=");
            V0.append(this.a);
            V0.append(", triggerType=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: jo0$d */
    public static final class d extends jo0 {
        d() {
        }

        @Override // defpackage.jo0
        public final <R_> R_ a(ti0<e, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ((eo0) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TriggerListFetchFailed{}";
        }
    }

    /* renamed from: jo0$e */
    public static final class e extends jo0 {
        private final ImmutableList<gp0> a;

        e(ImmutableList<gp0> immutableList) {
            immutableList.getClass();
            this.a = immutableList;
        }

        @Override // defpackage.jo0
        public final <R_> R_ a(ti0<e, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ko0.b(((bo0) ti0).a, this);
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

        public final ImmutableList<gp0> h() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TriggerListFetchSuccess{triggerList=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: jo0$f */
    public static final class f extends jo0 {
        f() {
        }

        @Override // defpackage.jo0
        public final <R_> R_ a(ti0<e, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<a, R_> ti06) {
            return (R_) ((zn0) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TriggerListRefreshTimerElapsed{}";
        }
    }

    jo0() {
    }

    public static jo0 b() {
        return new a();
    }

    public static jo0 c(u3<gp0, fp0> u3Var) {
        return new b(u3Var);
    }

    public static jo0 d(String str, TriggerType triggerType) {
        return new c(str, triggerType);
    }

    public static jo0 e() {
        return new d();
    }

    public static jo0 f(ImmutableList<gp0> immutableList) {
        return new e(immutableList);
    }

    public static jo0 g() {
        return new f();
    }

    public abstract <R_> R_ a(ti0<e, R_> ti0, ti0<d, R_> ti02, ti0<f, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<a, R_> ti06);
}
