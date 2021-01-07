package defpackage;

import com.spotify.inappmessaging.TriggerType;

/* renamed from: fq0  reason: default package */
public abstract class fq0 {

    /* renamed from: fq0$a */
    public static final class a extends fq0 {
        private final TriggerType a;
        private final String b;
        private final String c;
        private final boolean d;

        a(TriggerType triggerType, String str, String str2, boolean z) {
            triggerType.getClass();
            this.a = triggerType;
            this.b = str;
            str2.getClass();
            this.c = str2;
            this.d = z;
        }

        public final String a() {
            return this.c;
        }

        public final boolean b() {
            return this.d;
        }

        public final TriggerType c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a != this.a || aVar.d != this.d || !gf0.e(aVar.b, this.b) || !aVar.c.equals(this.c)) {
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
            return je.n(this.d, je.Y0(this.c, (hashCode + i) * 31, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("FetchMessage{triggerType=");
            V0.append(this.a);
            V0.append(", uri=");
            V0.append(this.b);
            V0.append(", creativeId=");
            V0.append(this.c);
            V0.append(", devEnabled=");
            return je.O0(V0, this.d, '}');
        }
    }

    /* renamed from: fq0$b */
    public static final class b extends fq0 {
        private final gp0 a;
        private final fp0 b;

        b(gp0 gp0, fp0 fp0) {
            gp0.getClass();
            this.a = gp0;
            fp0.getClass();
            this.b = fp0;
        }

        public final fp0 a() {
            return this.b;
        }

        public final gp0 b() {
            return this.a;
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
            StringBuilder V0 = je.V0("PublishMessage{trigger=");
            V0.append(this.a);
            V0.append(", message=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    fq0() {
    }
}
