package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: hqe  reason: default package */
public abstract class hqe {

    /* renamed from: hqe$a */
    public static final class a extends hqe {
        private final String a;
        private final int b;
        private final gqe c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, int i, gqe gqe) {
            super(null);
            h.e(str, "utteranceId");
            h.e(gqe, "ttsErrorType");
            this.a = str;
            this.b = i;
            this.c = gqe;
        }

        @Override // defpackage.hqe
        public int a() {
            return this.b;
        }

        @Override // defpackage.hqe
        public String b() {
            return this.a;
        }

        public final gqe c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && h.a(this.c, aVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            gqe gqe = this.c;
            if (gqe != null) {
                i = gqe.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error(utteranceId=");
            V0.append(this.a);
            V0.append(", durationInMillis=");
            V0.append(this.b);
            V0.append(", ttsErrorType=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: hqe$b */
    public static final class b extends hqe {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, int i) {
            super(null);
            h.e(str, "utteranceId");
            this.a = str;
            this.b = i;
        }

        @Override // defpackage.hqe
        public int a() {
            return this.b;
        }

        @Override // defpackage.hqe
        public String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Success(utteranceId=");
            V0.append(this.a);
            V0.append(", durationInMillis=");
            return je.B0(V0, this.b, ")");
        }
    }

    /* renamed from: hqe$c */
    public static final class c extends hqe {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, int i) {
            super(null);
            h.e(str, "utteranceId");
            this.a = str;
            this.b = i;
        }

        @Override // defpackage.hqe
        public int a() {
            return this.b;
        }

        @Override // defpackage.hqe
        public String b() {
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
            return h.a(this.a, cVar.a) && this.b == cVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TtsPlaybackStarted(utteranceId=");
            V0.append(this.a);
            V0.append(", durationInMillis=");
            return je.B0(V0, this.b, ")");
        }
    }

    public hqe(f fVar) {
    }

    public abstract int a();

    public abstract String b();
}
