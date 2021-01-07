package com.spotify.playlist.models.offline;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import kotlin.NoWhenBranchMatchedException;

public abstract class a {

    /* renamed from: com.spotify.playlist.models.offline.a$a  reason: collision with other inner class name */
    public static final class C0377a extends a {
        public static final C0377a a = new C0377a();

        private C0377a() {
            super(null);
        }
    }

    public static final class b extends a {
        private final int a;

        public b(int i) {
            super(null);
            this.a = i;
        }

        public final int c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.a == ((b) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("Downloading(syncProgress="), this.a, ")");
        }
    }

    public static final class c extends a {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends a {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends a {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    public static final class f extends a {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    public static final class g extends a {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    public static final class h extends a {
        private final WaitingReason a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(WaitingReason waitingReason, int i) {
            super(null);
            kotlin.jvm.internal.h.e(waitingReason, "waitingReason");
            this.a = waitingReason;
            this.b = i;
        }

        public final int c() {
            return this.b;
        }

        public final WaitingReason d() {
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
            return kotlin.jvm.internal.h.a(this.a, hVar.a) && this.b == hVar.b;
        }

        public int hashCode() {
            WaitingReason waitingReason = this.a;
            return ((waitingReason != null ? waitingReason.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Waiting(waitingReason=");
            V0.append(this.a);
            V0.append(", syncProgress=");
            return je.B0(V0, this.b, ")");
        }
    }

    private a() {
    }

    public final <R> R a(nmf<? super f, ? extends R> nmf, nmf<? super h, ? extends R> nmf2, nmf<? super b, ? extends R> nmf3, nmf<? super C0377a, ? extends R> nmf4, nmf<? super c, ? extends R> nmf5, nmf<? super e, ? extends R> nmf6, nmf<? super d, ? extends R> nmf7, nmf<? super g, ? extends R> nmf8) {
        kotlin.jvm.internal.h.e(nmf, "notAvailableOffline");
        kotlin.jvm.internal.h.e(nmf2, "waiting");
        kotlin.jvm.internal.h.e(nmf3, "downloading");
        kotlin.jvm.internal.h.e(nmf4, "availableOffline");
        kotlin.jvm.internal.h.e(nmf5, AppProtocol.LogMessage.SEVERITY_ERROR);
        kotlin.jvm.internal.h.e(nmf6, "expired");
        kotlin.jvm.internal.h.e(nmf7, "exceeded");
        kotlin.jvm.internal.h.e(nmf8, "resync");
        if (this instanceof f) {
            return (R) nmf.invoke(this);
        }
        if (this instanceof h) {
            return (R) nmf2.invoke(this);
        }
        if (this instanceof b) {
            return (R) nmf3.invoke(this);
        }
        if (this instanceof C0377a) {
            return (R) nmf4.invoke(this);
        }
        if (this instanceof c) {
            return (R) nmf5.invoke(this);
        }
        if (this instanceof e) {
            return (R) nmf6.invoke(this);
        }
        if (this instanceof d) {
            return (R) nmf7.invoke(this);
        }
        if (this instanceof g) {
            return (R) nmf8.invoke(this);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(nmf<? super f, kotlin.f> nmf, nmf<? super h, kotlin.f> nmf2, nmf<? super b, kotlin.f> nmf3, nmf<? super C0377a, kotlin.f> nmf4, nmf<? super c, kotlin.f> nmf5, nmf<? super e, kotlin.f> nmf6, nmf<? super d, kotlin.f> nmf7, nmf<? super g, kotlin.f> nmf8) {
        kotlin.jvm.internal.h.e(nmf, "notAvailableOffline");
        kotlin.jvm.internal.h.e(nmf2, "waiting");
        kotlin.jvm.internal.h.e(nmf3, "downloading");
        kotlin.jvm.internal.h.e(nmf4, "availableOffline");
        kotlin.jvm.internal.h.e(nmf5, AppProtocol.LogMessage.SEVERITY_ERROR);
        kotlin.jvm.internal.h.e(nmf6, "expired");
        kotlin.jvm.internal.h.e(nmf7, "exceeded");
        kotlin.jvm.internal.h.e(nmf8, "resync");
        if (this instanceof f) {
            nmf.invoke(this);
        } else if (this instanceof h) {
            nmf2.invoke(this);
        } else if (this instanceof b) {
            nmf3.invoke(this);
        } else if (this instanceof C0377a) {
            nmf4.invoke(this);
        } else if (this instanceof c) {
            nmf5.invoke(this);
        } else if (this instanceof e) {
            nmf6.invoke(this);
        } else if (this instanceof d) {
            nmf7.invoke(this);
        } else if (this instanceof g) {
            nmf8.invoke(this);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public a(kotlin.jvm.internal.f fVar) {
    }
}
