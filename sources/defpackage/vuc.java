package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: vuc  reason: default package */
public final class vuc {
    private final g<SessionState> a;
    private final bqa b;

    /* access modifiers changed from: package-private */
    /* renamed from: vuc$a */
    public static final class a<T, R> implements l<SessionState, tpf<? extends IdentityV3$UserProfile>> {
        final /* synthetic */ vuc a;

        a(vuc vuc) {
            this.a = vuc;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public tpf<? extends IdentityV3$UserProfile> apply(SessionState sessionState) {
            SessionState sessionState2 = sessionState;
            h.e(sessionState2, "sessionState");
            return this.a.b.a(sessionState2.currentUser()).Y0(BackpressureStrategy.LATEST);
        }
    }

    public vuc(g<SessionState> gVar, bqa bqa) {
        h.e(gVar, "sessionStateFlowable");
        h.e(bqa, "coreProfile");
        this.a = gVar;
        this.b = bqa;
    }

    public final s<IdentityV3$UserProfile> b() {
        s<IdentityV3$UserProfile> E = new v(this.a.f0(new a(this))).E();
        h.d(E, "sessionStateFlowable.swi…().distinctUntilChanged()");
        return E;
    }
}
