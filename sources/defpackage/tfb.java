package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import kotlin.jvm.internal.h;

/* renamed from: tfb  reason: default package */
public abstract class tfb {

    /* renamed from: tfb$a */
    public static final class a extends tfb {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: tfb$b */
    public static final class b extends tfb {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: tfb$c */
    public static final class c extends tfb {
        private final com.spotify.android.flags.c a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.spotify.android.flags.c cVar) {
            super(null);
            h.e(cVar, "flags");
            this.a = cVar;
        }

        public final com.spotify.android.flags.c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            com.spotify.android.flags.c cVar = this.a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("HandleFlagsChanged(flags=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: tfb$d */
    public static final class d extends tfb {
        private final SessionState a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(SessionState sessionState) {
            super(null);
            h.e(sessionState, "sessionState");
            this.a = sessionState;
        }

        public final SessionState a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && h.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            SessionState sessionState = this.a;
            if (sessionState != null) {
                return sessionState.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("HandleSessionStateChanged(sessionState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: tfb$e */
    public static final class e extends tfb {
        private final com.spotify.android.flags.c a;
        private final SessionState b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.spotify.android.flags.c cVar, SessionState sessionState) {
            super(null);
            h.e(cVar, "flags");
            h.e(sessionState, "sessionState");
            this.a = cVar;
            this.b = sessionState;
        }

        public final com.spotify.android.flags.c a() {
            return this.a;
        }

        public final SessionState b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return h.a(this.a, eVar.a) && h.a(this.b, eVar.b);
        }

        public int hashCode() {
            com.spotify.android.flags.c cVar = this.a;
            int i = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            SessionState sessionState = this.b;
            if (sessionState != null) {
                i = sessionState.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("StartLoggedInSession(flags=");
            V0.append(this.a);
            V0.append(", sessionState=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: tfb$f */
    public static final class f extends tfb {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: tfb$g */
    public static final class g extends tfb {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    public tfb(kotlin.jvm.internal.f fVar) {
    }
}
