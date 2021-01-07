package com.spotify.music.offlinetrials.limited.trackentity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;

class OfflineSwitchHubsComponentBinder$1 implements m {
    final /* synthetic */ DownloadHeaderView a;
    final /* synthetic */ j b;

    OfflineSwitchHubsComponentBinder$1(j jVar, DownloadHeaderView downloadHeaderView) {
        this.b = jVar;
        this.a = downloadHeaderView;
    }

    @w(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.b.b.A().c(this);
    }

    @w(Lifecycle.Event.ON_START)
    public void onStart() {
        this.b.a.a(this.a);
        j jVar = this.b;
        jVar.q = jVar.n.a(this.b.f).B(this.b.o).subscribe(new d(this.a));
    }

    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.b.a.b();
        if (this.b.q != null) {
            this.b.q.dispose();
        }
    }
}
