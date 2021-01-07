package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: mo0  reason: default package */
public abstract class mo0 {

    /* renamed from: mo0$a */
    public static final class a extends mo0 {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NotYetLoaded{}";
        }
    }

    /* renamed from: mo0$b */
    public static final class b extends mo0 {
        private final ImmutableList<gp0> a;

        b(ImmutableList<gp0> immutableList) {
            immutableList.getClass();
            this.a = immutableList;
        }

        public final ImmutableList<gp0> a() {
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
            StringBuilder V0 = je.V0("WithData{triggers=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    mo0() {
    }
}
