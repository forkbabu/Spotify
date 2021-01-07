package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: af2  reason: default package */
public abstract class af2 {

    /* renamed from: af2$a */
    public static final class a extends af2 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: af2$b */
    public static final class b extends af2 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            h.e(str, "code");
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
            return je.I0(je.V0("Success(code="), this.a, ")");
        }
    }

    private af2() {
    }

    public af2(f fVar) {
    }
}
