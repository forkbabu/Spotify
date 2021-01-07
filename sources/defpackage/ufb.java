package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: ufb  reason: default package */
public abstract class ufb {

    /* renamed from: ufb$a */
    public static final class a extends ufb {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: ufb$b */
    public static final class b extends ufb {
        private final com.spotify.android.flags.c a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.spotify.android.flags.c cVar) {
            super(null);
            h.e(cVar, "flags");
            this.a = cVar;
        }

        public final com.spotify.android.flags.c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
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
            StringBuilder V0 = je.V0("FlagsChanged(flags=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: ufb$c */
    public static final class c extends ufb {
        private final SessionState a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(SessionState sessionState) {
            super(null);
            h.e(sessionState, "sessionState");
            this.a = sessionState;
        }

        public final SessionState a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
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
            StringBuilder V0 = je.V0("SessionStateChanged(sessionState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private ufb() {
    }

    public ufb(f fVar) {
    }
}
