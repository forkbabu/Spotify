package defpackage;

import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;

/* renamed from: elb  reason: default package */
public abstract class elb {

    /* renamed from: elb$a */
    public static final class a extends elb {
        a() {
        }

        @Override // defpackage.elb
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03) {
            return (R_) io.reactivex.internal.operators.completable.b.a;
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DoNothing{}";
        }
    }

    /* renamed from: elb$b */
    public static final class b extends elb {
        private final l0 a;

        b(l0 l0Var) {
            l0Var.getClass();
            this.a = l0Var;
        }

        @Override // defpackage.elb
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((rkb) ti03).apply(this);
        }

        public final l0 e() {
            return this.a;
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
            StringBuilder V0 = je.V0("NavigateToLink{link=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: elb$c */
    public static final class c extends elb {
        private final s a;

        c(s sVar) {
            sVar.getClass();
            this.a = sVar;
        }

        @Override // defpackage.elb
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((jkb) ti02).apply(this);
        }

        public final s e() {
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
            StringBuilder V0 = je.V0("PushFragmentIdentifier{fragmentIdentifier=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    elb() {
    }

    public static elb a() {
        return new a();
    }

    public static elb c(l0 l0Var) {
        return new b(l0Var);
    }

    public static elb d(s sVar) {
        return new c(sVar);
    }

    public abstract <R_> R_ b(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03);
}
