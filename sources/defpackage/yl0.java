package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.json.JSONObject;

/* renamed from: yl0  reason: default package */
public abstract class yl0 {

    /* renamed from: yl0$a */
    public static final class a extends yl0 {
        private final String a;

        public a(String str) {
            super(null);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Failed(error="), this.a, ")");
        }
    }

    /* renamed from: yl0$b */
    public static final class b extends yl0 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: yl0$c */
    public static final class c extends yl0 {
        private final JSONObject a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(null);
            h.e(jSONObject, "data");
            this.a = jSONObject;
        }

        public final JSONObject a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            JSONObject jSONObject = this.a;
            if (jSONObject != null) {
                return jSONObject.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Successful(data=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private yl0() {
    }

    public yl0(f fVar) {
    }
}
