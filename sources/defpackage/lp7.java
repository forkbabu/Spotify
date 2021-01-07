package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: lp7  reason: default package */
public abstract class lp7 {

    /* renamed from: lp7$a */
    public static final class a extends lp7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            h.e(str, "username");
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
            return je.I0(je.V0("LoadBackendProfileData(username="), this.a, ")");
        }
    }

    /* renamed from: lp7$b */
    public static final class b extends lp7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            h.e(str, "username");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
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
            return je.I0(je.V0("LoadCoreProfileData(username="), this.a, ")");
        }
    }

    /* renamed from: lp7$c */
    public static final class c extends lp7 {
        private final String a;
        private final ct7 b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, ct7 ct7) {
            super(null);
            h.e(str, "username");
            h.e(ct7, "baseFollowState");
            this.a = str;
            this.b = ct7;
        }

        public final ct7 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.a(this.a, cVar.a) && h.a(this.b, cVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            ct7 ct7 = this.b;
            if (ct7 != null) {
                i = ct7.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LoadFollowState(username=");
            V0.append(this.a);
            V0.append(", baseFollowState=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: lp7$d */
    public static final class d extends lp7 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: lp7$e */
    public static final class e extends lp7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            h.e(str, "reportAbuseUrl");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && h.a(this.a, ((e) obj).a);
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
            return je.I0(je.V0("LoadReportAbuseWebTokenUrl(reportAbuseUrl="), this.a, ")");
        }
    }

    public lp7(f fVar) {
    }
}
