package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.inappmessaging.ActionType;
import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;

/* renamed from: io0  reason: default package */
public abstract class io0 {

    /* renamed from: io0$a */
    public static final class a extends io0 {
        private final u3<gp0, fp0> a;

        a(u3<gp0, fp0> u3Var) {
            u3Var.getClass();
            this.a = u3Var;
        }

        public final u3<gp0, fp0> a() {
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
            StringBuilder V0 = je.V0("DispatchMessage{messageTriggerPair=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: io0$b */
    public static final class b extends io0 {
        private final ImmutableList<FormatType> a;
        private final ImmutableList<TriggerType> b;

        b(ImmutableList<FormatType> immutableList, ImmutableList<TriggerType> immutableList2) {
            immutableList.getClass();
            this.a = immutableList;
            immutableList2.getClass();
            this.b = immutableList2;
        }

        public final ImmutableList<FormatType> a() {
            return this.a;
        }

        public final ImmutableList<TriggerType> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a.equals(this.a) || !bVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("FetchTriggerList{formatTypes=");
            V0.append(this.a);
            V0.append(", triggerTypes=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: io0$c */
    public static final class c extends io0 {
        private final String a;
        private final TriggerType b;
        private final ImmutableList<gp0> c;
        private final ImmutableList<FormatType> d;
        private final ImmutableList<ActionType> e;

        c(String str, TriggerType triggerType, ImmutableList<gp0> immutableList, ImmutableList<FormatType> immutableList2, ImmutableList<ActionType> immutableList3) {
            str.getClass();
            this.a = str;
            triggerType.getClass();
            this.b = triggerType;
            immutableList.getClass();
            this.c = immutableList;
            immutableList2.getClass();
            this.d = immutableList2;
            immutableList3.getClass();
            this.e = immutableList3;
        }

        public final ImmutableList<ActionType> a() {
            return this.e;
        }

        public final ImmutableList<FormatType> b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final TriggerType d() {
            return this.b;
        }

        public final ImmutableList<gp0> e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.b != this.b || !cVar.a.equals(this.a) || !cVar.c.equals(this.c) || !cVar.d.equals(this.d) || !cVar.e.equals(this.e)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.a, 0, 31);
            int hashCode = this.c.hashCode();
            int hashCode2 = this.d.hashCode();
            return this.e.hashCode() + ((hashCode2 + ((hashCode + ((this.b.hashCode() + Y0) * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("RequestMessage{pattern=");
            V0.append(this.a);
            V0.append(", triggerType=");
            V0.append(this.b);
            V0.append(", triggers=");
            V0.append(this.c);
            V0.append(", formatTypes=");
            V0.append(this.d);
            V0.append(", actionCapabilities=");
            V0.append(this.e);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: io0$d */
    public static final class d extends io0 {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StartTriggerListRefreshTimer{}";
        }
    }

    io0() {
    }
}
