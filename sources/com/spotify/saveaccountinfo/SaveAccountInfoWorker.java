package com.spotify.saveaccountinfo;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import com.spotify.workmanager.DaggerRxWorker;
import io.reactivex.a;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.i;
import io.reactivex.internal.operators.maybe.h;
import io.reactivex.y;
import io.reactivex.z;

public class SaveAccountInfoWorker extends DaggerRxWorker {
    y p;
    y q;
    g<SessionState> r;
    g70 s;
    bqa t;
    ColdStartTracker u;
    private final String v;
    private final String w;

    public SaveAccountInfoWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.v = workerParameters.d().e("username");
        this.w = workerParameters.d().e("auth_method");
    }

    public static a q(SaveAccountInfoWorker saveAccountInfoWorker, IdentityV3$UserProfile identityV3$UserProfile) {
        g70 g70 = saveAccountInfoWorker.s;
        j70 j70 = new j70();
        j70.h(saveAccountInfoWorker.v);
        j70.e(saveAccountInfoWorker.w);
        j70.f(identityV3$UserProfile.n().i());
        j70.g(dqa.d(identityV3$UserProfile));
        return g70.f(j70).G(saveAccountInfoWorker.q);
    }

    @Override // com.spotify.workmanager.DaggerRxWorker, androidx.work.RxWorker
    public z<ListenableWorker.a> p() {
        super.p();
        this.u.o(getClass().getSimpleName());
        return new h(new i(this.r.C(c.a), 0)).d(this.t.a(this.v).o0(this.p).S().h(new b(this))).h(z.z(new ListenableWorker.a.c())).E(a.a);
    }
}
