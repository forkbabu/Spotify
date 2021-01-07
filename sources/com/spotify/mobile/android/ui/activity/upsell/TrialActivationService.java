package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Intent;
import android.os.IBinder;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.container.app.foregroundstate.d;
import dagger.android.g;
import io.reactivex.y;

public class TrialActivationService extends g {
    public static final /* synthetic */ int t = 0;
    yz1 a;
    d b;
    jz1 c;
    cqe f;
    h n;
    y o;
    y p;
    io.reactivex.g<SessionState> q;
    private boolean r;
    private TrialActivationPresenter s;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        TrialActivationPresenter trialActivationPresenter = this.s;
        if (trialActivationPresenter != null) {
            trialActivationPresenter.a();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.r) {
            return 2;
        }
        this.r = true;
        TrialActivationPresenter trialActivationPresenter = new TrialActivationPresenter(this.a, this.n.a(this), this.b, this.c, this.f, new a(this), this.o, this.p, this.q);
        this.s = trialActivationPresenter;
        trialActivationPresenter.d();
        return 2;
    }
}
