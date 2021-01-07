package defpackage;

import com.spotify.signup.splitflow.e0;

/* renamed from: yie  reason: default package */
public abstract class yie {

    /* renamed from: yie$a */
    public static final class a extends yie {
        private final wie a;

        a(wie wie) {
            wie.getClass();
            this.a = wie;
        }

        @Override // defpackage.yie
        public final <R_> R_ b(ti0<a, R_> ti0) {
            return (R_) ((uie) ti0).apply(this);
        }

        @Override // defpackage.yie
        public final void c(si0<a> si0) {
            ((e0) si0).accept(this);
        }

        public final wie d() {
            return this.a;
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
            StringBuilder V0 = je.V0("GenderSelected{gender=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    yie() {
    }

    public static yie a(wie wie) {
        return new a(wie);
    }

    public abstract <R_> R_ b(ti0<a, R_> ti0);

    public abstract void c(si0<a> si0);
}
