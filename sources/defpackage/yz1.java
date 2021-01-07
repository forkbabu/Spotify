package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.v;
import com.spotify.music.spotlets.optintrial.StartTrialRequest;
import io.reactivex.g;
import io.reactivex.s;

/* renamed from: yz1  reason: default package */
public class yz1 {
    private final n02 a;
    private final Runnable b;
    private final v c;
    private final xz1 d;
    private final g<SessionState> e;

    public yz1(n02 n02, Runnable runnable, g<SessionState> gVar, xz1 xz1, v vVar) {
        this.a = n02;
        runnable.getClass();
        this.b = new wz1(runnable);
        this.e = gVar;
        this.c = vVar;
        this.d = xz1;
    }

    public static StartTrialRequest b(yz1 yz1, SessionState sessionState) {
        yz1.getClass();
        return StartTrialRequest.create(yz1.c.b(), sessionState.countryCode());
    }

    public s<Boolean> a() {
        g<SessionState> gVar = this.e;
        gVar.getClass();
        return new io.reactivex.internal.operators.observable.v(gVar).N0(1).j0(new uz1(this)).J0(new vz1(this)).j0(sz1.a).N(new tz1(this));
    }

    public /* synthetic */ io.reactivex.v c(StartTrialRequest startTrialRequest) {
        return this.d.a(startTrialRequest).P();
    }

    public /* synthetic */ void d(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.a();
            this.b.run();
        }
    }
}
