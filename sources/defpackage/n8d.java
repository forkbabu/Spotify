package defpackage;

import com.spotify.music.sociallistening.models.JoinType;

/* renamed from: n8d  reason: default package */
public abstract class n8d {

    /* renamed from: n8d$a */
    public static final class a extends n8d {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "sessionId");
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
            return je.I0(je.V0("DeleteSession(sessionId="), this.a, ")");
        }
    }

    /* renamed from: n8d$b */
    public static final class b extends n8d {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: n8d$c */
    public static final class c extends n8d {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: n8d$d */
    public static final class d extends n8d {
        private final String a;
        private final boolean b;
        private final JoinType c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, boolean z, JoinType joinType) {
            super(null);
            kotlin.jvm.internal.h.e(str, "joinToken");
            kotlin.jvm.internal.h.e(joinType, "joinType");
            this.a = str;
            this.b = z;
            this.c = joinType;
        }

        public final String a() {
            return this.a;
        }

        public final JoinType b() {
            return this.c;
        }

        public final boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.h.a(this.a, dVar.a) && this.b == dVar.b && kotlin.jvm.internal.h.a(this.c, dVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode + i2) * 31;
            JoinType joinType = this.c;
            if (joinType != null) {
                i = joinType.hashCode();
            }
            return i5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("JoinSession(joinToken=");
            V0.append(this.a);
            V0.append(", listen=");
            V0.append(this.b);
            V0.append(", joinType=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: n8d$e */
    public static final class e extends n8d {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "sessionId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && kotlin.jvm.internal.h.a(this.a, ((e) obj).a);
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
            return je.I0(je.V0("LeaveSession(sessionId="), this.a, ")");
        }
    }

    /* renamed from: n8d$f */
    public static final class f extends n8d {
        private final boolean a;

        public f(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && this.a == ((f) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("NotifyCoreGroupSessionActive(groupSessionActive="), this.a, ")");
        }
    }

    /* renamed from: n8d$g */
    public static final class g extends n8d {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    /* renamed from: n8d$h */
    public static final class h extends n8d {
        private final boolean a;

        public h(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof h) && this.a == ((h) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("NotifyFailedToJoinSession(sessionFull="), this.a, ")");
        }
    }

    /* renamed from: n8d$i */
    public static final class i extends n8d {
        public static final i a = new i();

        private i() {
            super(null);
        }
    }

    /* renamed from: n8d$j */
    public static final class j extends n8d {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    /* renamed from: n8d$k */
    public static final class k extends n8d {
        public static final k a = new k();

        private k() {
            super(null);
        }
    }

    public n8d(kotlin.jvm.internal.f fVar) {
    }
}
