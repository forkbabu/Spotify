package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: ev8  reason: default package */
public abstract class ev8 {

    /* renamed from: ev8$a */
    public static final class a extends ev8 {
        private final fv8 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(fv8 fv8) {
            super(null);
            h.e(fv8, "fetchState");
            this.a = fv8;
        }

        public final fv8 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            fv8 fv8 = this.a;
            if (fv8 != null) {
                return fv8.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EmailFetched(fetchState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ev8$b */
    public static final class b extends ev8 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            h.e(str, "email");
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
            return je.I0(je.V0("EmailInputChanged(email="), this.a, ")");
        }
    }

    /* renamed from: ev8$c */
    public static final class c extends ev8 {
        private final gv8 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(gv8 gv8) {
            super(null);
            h.e(gv8, "inputType");
            this.a = gv8;
        }

        public final gv8 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            gv8 gv8 = this.a;
            if (gv8 != null) {
                return gv8.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EmailInputTypeChanged(inputType=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ev8$d */
    public static final class d extends ev8 {
        private final hv8 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(hv8 hv8) {
            super(null);
            h.e(hv8, "saveState");
            this.a = hv8;
        }

        public final hv8 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && h.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            hv8 hv8 = this.a;
            if (hv8 != null) {
                return hv8.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EmailSaved(saveState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ev8$e */
    public static final class e extends ev8 {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    private ev8() {
    }

    public ev8(f fVar) {
    }
}
