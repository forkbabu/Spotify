package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: gqe  reason: default package */
public abstract class gqe {

    /* renamed from: gqe$a */
    public static final class a extends gqe {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            h.e(str, "errorDetail");
            this.a = str;
        }

        @Override // defpackage.gqe
        public String a() {
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
            return je.I0(je.V0("Network(errorDetail="), this.a, ")");
        }
    }

    /* renamed from: gqe$b */
    public static final class b extends gqe {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            h.e(str, "errorDetail");
            this.a = str;
        }

        @Override // defpackage.gqe
        public String a() {
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
            return je.I0(je.V0("Playback(errorDetail="), this.a, ")");
        }
    }

    /* renamed from: gqe$c */
    public static final class c extends gqe {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            h.e(str, "errorDetail");
            this.a = str;
        }

        @Override // defpackage.gqe
        public String a() {
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
            return je.I0(je.V0("Unknown(errorDetail="), this.a, ")");
        }
    }

    public gqe(f fVar) {
    }

    public abstract String a();
}
