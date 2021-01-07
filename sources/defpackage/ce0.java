package defpackage;

/* renamed from: ce0  reason: default package */
public abstract class ce0 {

    /* renamed from: ce0$a */
    public static final class a extends ce0 {
        private final boolean a;

        public a(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }
    }

    /* renamed from: ce0$b */
    public static final class b extends ce0 {
        private final je0 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(je0 je0) {
            super(null);
            kotlin.jvm.internal.h.e(je0, "screen");
            this.a = je0;
        }

        public final je0 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && kotlin.jvm.internal.h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            je0 je0 = this.a;
            if (je0 != null) {
                return je0.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Authentication(screen=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ce0$c */
    public static final class c extends ce0 {
        private final je0 a;
        private final fe0 b;
        private final ge0 c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(je0 je0, fe0 fe0, ge0 ge0) {
            super(null);
            kotlin.jvm.internal.h.e(je0, "screen");
            kotlin.jvm.internal.h.e(fe0, "button");
            kotlin.jvm.internal.h.e(ge0, "dialog");
            this.a = je0;
            this.b = fe0;
            this.c = ge0;
        }

        public final fe0 a() {
            return this.b;
        }

        public final ge0 b() {
            return this.c;
        }

        public final je0 c() {
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
            return kotlin.jvm.internal.h.a(this.a, cVar.a) && kotlin.jvm.internal.h.a(this.b, cVar.b) && kotlin.jvm.internal.h.a(this.c, cVar.c);
        }

        public int hashCode() {
            je0 je0 = this.a;
            int i = 0;
            int hashCode = (je0 != null ? je0.hashCode() : 0) * 31;
            fe0 fe0 = this.b;
            int hashCode2 = (hashCode + (fe0 != null ? fe0.hashCode() : 0)) * 31;
            ge0 ge0 = this.c;
            if (ge0 != null) {
                i = ge0.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ButtonInteraction(screen=");
            V0.append(this.a);
            V0.append(", button=");
            V0.append(this.b);
            V0.append(", dialog=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ce0$d */
    public static final class d extends ce0 {
        private final int a;

        public d(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && this.a == ((d) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("DeviceYearClass(year="), this.a, ")");
        }
    }

    /* renamed from: ce0$e */
    public static final class e extends ce0 {
        private final je0 a;
        private final ge0 b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(je0 je0, ge0 ge0) {
            super(null);
            kotlin.jvm.internal.h.e(je0, "screen");
            kotlin.jvm.internal.h.e(ge0, "dialog");
            this.a = je0;
            this.b = ge0;
        }

        public final ge0 a() {
            return this.b;
        }

        public final je0 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.h.a(this.a, eVar.a) && kotlin.jvm.internal.h.a(this.b, eVar.b);
        }

        public int hashCode() {
            je0 je0 = this.a;
            int i = 0;
            int hashCode = (je0 != null ? je0.hashCode() : 0) * 31;
            ge0 ge0 = this.b;
            if (ge0 != null) {
                i = ge0.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DialogImpression(screen=");
            V0.append(this.a);
            V0.append(", dialog=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ce0$f */
    public static final class f extends ce0 {
        private final je0 a;
        private final he0 b;
        private final ie0 c;
        private final String d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(je0 je0, he0 he0, ie0 ie0, String str) {
            super(null);
            kotlin.jvm.internal.h.e(je0, "screen");
            kotlin.jvm.internal.h.e(he0, "errorType");
            kotlin.jvm.internal.h.e(ie0, "input");
            this.a = je0;
            this.b = he0;
            this.c = ie0;
            this.d = str;
        }

        public final String a() {
            return this.d;
        }

        public final he0 b() {
            return this.b;
        }

        public final ie0 c() {
            return this.c;
        }

        public final je0 d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.h.a(this.a, fVar.a) && kotlin.jvm.internal.h.a(this.b, fVar.b) && kotlin.jvm.internal.h.a(this.c, fVar.c) && kotlin.jvm.internal.h.a(this.d, fVar.d);
        }

        public int hashCode() {
            je0 je0 = this.a;
            int i = 0;
            int hashCode = (je0 != null ? je0.hashCode() : 0) * 31;
            he0 he0 = this.b;
            int hashCode2 = (hashCode + (he0 != null ? he0.hashCode() : 0)) * 31;
            ie0 ie0 = this.c;
            int hashCode3 = (hashCode2 + (ie0 != null ? ie0.hashCode() : 0)) * 31;
            String str = this.d;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error(screen=");
            V0.append(this.a);
            V0.append(", errorType=");
            V0.append(this.b);
            V0.append(", input=");
            V0.append(this.c);
            V0.append(", errorCode=");
            return je.I0(V0, this.d, ")");
        }
    }

    /* renamed from: ce0$g */
    public static final class g extends ce0 {
        private final je0 a;
        private final String b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(je0 je0, String str, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(je0, "screen");
            kotlin.jvm.internal.h.e(str, "event");
            kotlin.jvm.internal.h.e(str2, "value");
            this.a = je0;
            this.b = str;
            this.c = str2;
        }

        public final String a() {
            return this.b;
        }

        public final je0 b() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.h.a(this.a, gVar.a) && kotlin.jvm.internal.h.a(this.b, gVar.b) && kotlin.jvm.internal.h.a(this.c, gVar.c);
        }

        public int hashCode() {
            je0 je0 = this.a;
            int i = 0;
            int hashCode = (je0 != null ? je0.hashCode() : 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("GenericEvent(screen=");
            V0.append(this.a);
            V0.append(", event=");
            V0.append(this.b);
            V0.append(", value=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: ce0$h */
    public static final class h extends ce0 {
        private final je0 a;
        private final ie0 b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(je0 je0, ie0 ie0) {
            super(null);
            kotlin.jvm.internal.h.e(je0, "screen");
            kotlin.jvm.internal.h.e(ie0, "input");
            this.a = je0;
            this.b = ie0;
        }

        public final ie0 a() {
            return this.b;
        }

        public final je0 b() {
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
            je0 je0 = this.a;
            int i = 0;
            int hashCode = (je0 != null ? je0.hashCode() : 0) * 31;
            ie0 ie0 = this.b;
            if (ie0 != null) {
                i = ie0.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("InputInteraction(screen=");
            V0.append(this.a);
            V0.append(", input=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ce0$i */
    public static final class i extends ce0 {
        private final re0 a;
        private final String b;
        private final long c;
        private final Integer d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(re0 re0, String str, long j, Integer num) {
            super(null);
            kotlin.jvm.internal.h.e(re0, "request");
            kotlin.jvm.internal.h.e(str, "requestId");
            this.a = re0;
            this.b = str;
            this.c = j;
            this.d = num;
        }

        public final Integer a() {
            return this.d;
        }

        public final re0 b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public final long d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.h.a(this.a, iVar.a) && kotlin.jvm.internal.h.a(this.b, iVar.b) && this.c == iVar.c && kotlin.jvm.internal.h.a(this.d, iVar.d);
        }

        public int hashCode() {
            re0 re0 = this.a;
            int i = 0;
            int hashCode = (re0 != null ? re0.hashCode() : 0) * 31;
            String str = this.b;
            int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + e.a(this.c)) * 31;
            Integer num = this.d;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("RequestCompleted(request=");
            V0.append(this.a);
            V0.append(", requestId=");
            V0.append(this.b);
            V0.append(", timestamp=");
            V0.append(this.c);
            V0.append(", errorCode=");
            V0.append(this.d);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ce0$j */
    public static final class j extends ce0 {
        private final re0 a;
        private final String b;
        private final long c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(re0 re0, String str, long j) {
            super(null);
            kotlin.jvm.internal.h.e(re0, "request");
            kotlin.jvm.internal.h.e(str, "requestId");
            this.a = re0;
            this.b = str;
            this.c = j;
        }

        public final re0 a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.h.a(this.a, jVar.a) && kotlin.jvm.internal.h.a(this.b, jVar.b) && this.c == jVar.c;
        }

        public int hashCode() {
            re0 re0 = this.a;
            int i = 0;
            int hashCode = (re0 != null ? re0.hashCode() : 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return ((hashCode + i) * 31) + e.a(this.c);
        }

        public String toString() {
            StringBuilder V0 = je.V0("RequestStarted(request=");
            V0.append(this.a);
            V0.append(", requestId=");
            V0.append(this.b);
            V0.append(", timestamp=");
            return je.E0(V0, this.c, ")");
        }
    }

    /* renamed from: ce0$k */
    public static final class k extends ce0 {
        private final je0 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(je0 je0) {
            super(null);
            kotlin.jvm.internal.h.e(je0, "screen");
            this.a = je0;
        }

        public final je0 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof k) && kotlin.jvm.internal.h.a(this.a, ((k) obj).a);
            }
            return true;
        }

        public int hashCode() {
            je0 je0 = this.a;
            if (je0 != null) {
                return je0.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ScreenImpression(screen=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ce0$l */
    public static final class l extends ce0 {
        private final je0 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(je0 je0) {
            super(null);
            kotlin.jvm.internal.h.e(je0, "screen");
            this.a = je0;
        }

        public final je0 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof l) && kotlin.jvm.internal.h.a(this.a, ((l) obj).a);
            }
            return true;
        }

        public int hashCode() {
            je0 je0 = this.a;
            if (je0 != null) {
                return je0.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ScreenReturnImpression(screen=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ce0$m */
    public static final class m extends ce0 {
        private final je0 a;
        private final de0 b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(je0 je0, de0 de0) {
            super(null);
            kotlin.jvm.internal.h.e(je0, "screen");
            kotlin.jvm.internal.h.e(de0, "smartlockEvent");
            this.a = je0;
            this.b = de0;
        }

        public final je0 a() {
            return this.a;
        }

        public final de0 b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return kotlin.jvm.internal.h.a(this.a, mVar.a) && kotlin.jvm.internal.h.a(this.b, mVar.b);
        }

        public int hashCode() {
            je0 je0 = this.a;
            int i = 0;
            int hashCode = (je0 != null ? je0.hashCode() : 0) * 31;
            de0 de0 = this.b;
            if (de0 != null) {
                i = de0.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SmartlockEvent(screen=");
            V0.append(this.a);
            V0.append(", smartlockEvent=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ce0$n */
    public static final class n extends ce0 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "installationId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof n) && kotlin.jvm.internal.h.a(this.a, ((n) obj).a);
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
            return je.I0(je.V0("SpotifyIdMapping(installationId="), this.a, ")");
        }
    }

    /* renamed from: ce0$o */
    public static final class o extends ce0 {
        private final ee0 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(ee0 ee0) {
            super(null);
            kotlin.jvm.internal.h.e(ee0, "startScreenImageEvent");
            this.a = ee0;
        }

        public final ee0 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof o) && kotlin.jvm.internal.h.a(this.a, ((o) obj).a);
            }
            return true;
        }

        public int hashCode() {
            ee0 ee0 = this.a;
            if (ee0 != null) {
                return ee0.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("StartScreenImage(startScreenImageEvent=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ce0$p */
    public static final class p extends ce0 {
        private final je0 a;
        private final be0 b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(je0 je0, be0 be0) {
            super(null);
            kotlin.jvm.internal.h.e(je0, "screen");
            kotlin.jvm.internal.h.e(be0, "viewState");
            this.a = je0;
            this.b = be0;
        }

        public final je0 a() {
            return this.a;
        }

        public final be0 b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return kotlin.jvm.internal.h.a(this.a, pVar.a) && kotlin.jvm.internal.h.a(this.b, pVar.b);
        }

        public int hashCode() {
            je0 je0 = this.a;
            int i = 0;
            int hashCode = (je0 != null ? je0.hashCode() : 0) * 31;
            be0 be0 = this.b;
            if (be0 != null) {
                i = be0.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ViewState(screen=");
            V0.append(this.a);
            V0.append(", viewState=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    public ce0(kotlin.jvm.internal.f fVar) {
    }
}
