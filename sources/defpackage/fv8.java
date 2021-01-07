package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: fv8  reason: default package */
public abstract class fv8 {

    /* renamed from: fv8$a */
    public static final class a extends fv8 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: fv8$b */
    public static final class b extends fv8 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: fv8$c */
    public static final class c extends fv8 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            h.e(str, "email");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
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
            return je.I0(je.V0("Success(email="), this.a, ")");
        }
    }

    private fv8() {
    }

    public fv8(f fVar) {
    }
}
