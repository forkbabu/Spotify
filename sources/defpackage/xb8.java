package defpackage;

import defpackage.uqe;

/* renamed from: xb8  reason: default package */
public abstract class xb8 {

    /* renamed from: xb8$a */
    public static final class a extends xb8 {
        private final uqe.b a;

        a(uqe.b bVar) {
            bVar.getClass();
            this.a = bVar;
        }

        public final uqe.b b() {
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
            StringBuilder V0 = je.V0("Action{actionFactory=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    xb8() {
    }

    public static xb8 a(uqe.b bVar) {
        return new a(bVar);
    }
}
