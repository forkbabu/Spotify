package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: zu8  reason: default package */
public abstract class zu8 {

    /* renamed from: zu8$a */
    public static final class a extends zu8 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: zu8$b */
    public static final class b extends zu8 {
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
            return je.I0(je.V0("NotifyEmailChanged(email="), this.a, ")");
        }
    }

    /* renamed from: zu8$c */
    public static final class c extends zu8 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            h.e(str, "newEmail");
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
            return je.I0(je.V0("SaveEmail(newEmail="), this.a, ")");
        }
    }

    public zu8(f fVar) {
    }
}
