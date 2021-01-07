package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: vy4  reason: default package */
public abstract class vy4 {

    /* renamed from: vy4$a */
    public static final class a extends vy4 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: vy4$b */
    public static final class b extends vy4 {
        private final String a;

        public b(String str) {
            super(null);
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
            return je.I0(je.V0("ShowSnackbar(listName="), this.a, ")");
        }
    }

    public vy4(f fVar) {
    }
}
