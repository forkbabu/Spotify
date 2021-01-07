package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.pageloader.NetworkErrorReason;
import kotlin.jvm.internal.h;

/* renamed from: hud  reason: default package */
public abstract class hud {

    /* renamed from: hud$a */
    public static final class a extends hud {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: hud$b */
    public static final class b extends hud {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: hud$c */
    public static final class c extends hud {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: hud$d */
    public static final class d extends hud {
        private final Throwable a;
        private final NetworkErrorReason b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Throwable th, NetworkErrorReason networkErrorReason) {
            super(null);
            h.e(th, AppProtocol.LogMessage.SEVERITY_ERROR);
            h.e(networkErrorReason, "reason");
            this.a = th;
            this.b = networkErrorReason;
        }

        public final Throwable a() {
            return this.a;
        }

        public final NetworkErrorReason b() {
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
            return h.a(this.a, dVar.a) && h.a(this.b, dVar.b);
        }

        public int hashCode() {
            Throwable th = this.a;
            int i = 0;
            int hashCode = (th != null ? th.hashCode() : 0) * 31;
            NetworkErrorReason networkErrorReason = this.b;
            if (networkErrorReason != null) {
                i = networkErrorReason.hashCode();
            }
            return hashCode + i;
        }

        @Override // defpackage.hud
        public String toString() {
            StringBuilder V0 = je.V0("NetworkError(error=");
            V0.append(this.a);
            V0.append(", reason=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: hud$e */
    public static final class e extends hud {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: hud$f */
    public static final class f extends hud {
        private final Throwable a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Throwable th) {
            super(null);
            h.e(th, AppProtocol.LogMessage.SEVERITY_ERROR);
            this.a = th;
        }

        public final Throwable a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && h.a(this.a, ((f) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // defpackage.hud
        public String toString() {
            StringBuilder V0 = je.V0("SomethingWentWrong(error=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private hud() {
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public hud(kotlin.jvm.internal.f fVar) {
    }
}
