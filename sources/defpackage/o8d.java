package defpackage;

import com.spotify.music.sociallistening.models.JoinType;
import com.spotify.music.sociallistening.models.Session;
import com.spotify.music.sociallistening.models.SessionUpdate;
import retrofit2.v;

/* renamed from: o8d  reason: default package */
public abstract class o8d {

    /* renamed from: o8d$a */
    public static final class a extends o8d {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "username");
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
            return je.I0(je.V0("CurrentUsername(username="), this.a, ")");
        }
    }

    /* renamed from: o8d$b */
    public static final class b extends o8d {
        private final boolean a;

        public b(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.a == ((b) obj).a;
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
            return je.P0(je.V0("DeleteSessionResult(success="), this.a, ")");
        }
    }

    /* renamed from: o8d$c */
    public static final class c extends o8d {
        private final Session a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Session session) {
            super(null);
            kotlin.jvm.internal.h.e(session, "session");
            this.a = session;
        }

        public final Session a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Session session = this.a;
            if (session != null) {
                return session.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("GetCurrentOrNewSessionResult(session=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: o8d$d */
    public static final class d extends o8d {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: o8d$e */
    public static final class e extends o8d {
        private final Session a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Session session) {
            super(null);
            kotlin.jvm.internal.h.e(session, "session");
            this.a = session;
        }

        public final Session a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && kotlin.jvm.internal.h.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Session session = this.a;
            if (session != null) {
                return session.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("GetCurrentSessionResult(session=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: o8d$f */
    public static final class f extends o8d {
        private final String a;
        private final boolean b;
        private final JoinType c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z, JoinType joinType) {
            super(null);
            kotlin.jvm.internal.h.e(str, "token");
            kotlin.jvm.internal.h.e(joinType, "joinType");
            this.a = str;
            this.b = z;
            this.c = joinType;
        }

        public final JoinType a() {
            return this.c;
        }

        public final boolean b() {
            return this.b;
        }

        public final String c() {
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
            return kotlin.jvm.internal.h.a(this.a, fVar.a) && this.b == fVar.b && kotlin.jvm.internal.h.a(this.c, fVar.c);
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
            StringBuilder V0 = je.V0("JoinSessionRequest(token=");
            V0.append(this.a);
            V0.append(", listen=");
            V0.append(this.b);
            V0.append(", joinType=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: o8d$g */
    public static final class g extends o8d {
        private final v<Session> a;

        public g(v<Session> vVar) {
            super(null);
            this.a = vVar;
        }

        public final v<Session> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && kotlin.jvm.internal.h.a(this.a, ((g) obj).a);
            }
            return true;
        }

        public int hashCode() {
            v<Session> vVar = this.a;
            if (vVar != null) {
                return vVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("JoinSessionResult(sessionResponse=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: o8d$h */
    public static final class h extends o8d {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    /* renamed from: o8d$i */
    public static final class i extends o8d {
        private final boolean a;

        public i(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && this.a == ((i) obj).a;
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
            return je.P0(je.V0("LeaveSessionResult(success="), this.a, ")");
        }
    }

    /* renamed from: o8d$j */
    public static final class j extends o8d {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "token");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof j) && kotlin.jvm.internal.h.a(this.a, ((j) obj).a);
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
            return je.I0(je.V0("NotifySessionShared(token="), this.a, ")");
        }
    }

    /* renamed from: o8d$k */
    public static final class k extends o8d {
        private final boolean a;

        public k(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof k) && this.a == ((k) obj).a;
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
            return je.P0(je.V0("ObtainSessionRequest(startSession="), this.a, ")");
        }
    }

    /* renamed from: o8d$l */
    public static final class l extends o8d {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    /* renamed from: o8d$m */
    public static final class m extends o8d {
        private final SessionUpdate a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(SessionUpdate sessionUpdate) {
            super(null);
            kotlin.jvm.internal.h.e(sessionUpdate, "sessionUpdate");
            this.a = sessionUpdate;
        }

        public final SessionUpdate a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof m) && kotlin.jvm.internal.h.a(this.a, ((m) obj).a);
            }
            return true;
        }

        public int hashCode() {
            SessionUpdate sessionUpdate = this.a;
            if (sessionUpdate != null) {
                return sessionUpdate.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SessionUpdateReceived(sessionUpdate=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private o8d() {
    }

    public o8d(kotlin.jvm.internal.f fVar) {
    }
}
