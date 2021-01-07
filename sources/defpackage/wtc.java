package defpackage;

/* renamed from: wtc  reason: default package */
public abstract class wtc {

    /* renamed from: wtc$a */
    public static final class a extends wtc {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "episodeUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && kotlin.jvm.internal.h.a(this.a, ((a) obj).a);
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
            return je.I0(je.V0("AcceptManageReply(episodeUri="), this.a, ")");
        }
    }

    /* renamed from: wtc$b */
    public static final class b extends wtc {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "episodeUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && kotlin.jvm.internal.h.a(this.a, ((b) obj).a);
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
            return je.I0(je.V0("AcceptTermsAndConditions(episodeUri="), this.a, ")");
        }
    }

    /* renamed from: wtc$c */
    public static final class c extends wtc {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "episodeUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.h.a(this.a, ((c) obj).a);
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
            return je.I0(je.V0("DeleteResponse(episodeUri="), this.a, ")");
        }
    }

    /* renamed from: wtc$d */
    public static final class d extends wtc {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "episodeUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && kotlin.jvm.internal.h.a(this.a, ((d) obj).a);
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
            return je.I0(je.V0("FetchPodcastQnA(episodeUri="), this.a, ")");
        }
    }

    /* renamed from: wtc$e */
    public static final class e extends wtc {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: wtc$f */
    public static final class f extends wtc {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: wtc$g */
    public static final class g extends wtc {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    /* renamed from: wtc$h */
    public static final class h extends wtc {
        private final String a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "textToSend");
            kotlin.jvm.internal.h.e(str2, "episodeUri");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.h.a(this.a, hVar.a) && kotlin.jvm.internal.h.a(this.b, hVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SendReply(textToSend=");
            V0.append(this.a);
            V0.append(", episodeUri=");
            return je.I0(V0, this.b, ")");
        }
    }

    public wtc(kotlin.jvm.internal.f fVar) {
    }
}
