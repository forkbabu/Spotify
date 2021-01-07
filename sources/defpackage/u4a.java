package defpackage;

/* renamed from: u4a  reason: default package */
public abstract class u4a {

    /* renamed from: u4a$a */
    public static final class a extends u4a {
        private final boolean a;

        a(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
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
            return je.O0(je.V0("PublishCarDetectionState{isCarDetected="), this.a, '}');
        }
    }

    u4a() {
    }
}
