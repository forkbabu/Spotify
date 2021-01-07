package com.spotify.music.offlinetrials.limited.trackentity;

import com.google.common.collect.ImmutableBiMap;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;

class i implements DownloadHeaderView.a {
    final /* synthetic */ w51 a;
    final /* synthetic */ s81 b;
    final /* synthetic */ DownloadHeaderView c;
    final /* synthetic */ j d;

    i(j jVar, w51 w51, s81 s81, DownloadHeaderView downloadHeaderView) {
        this.d = jVar;
        this.a = w51;
        this.b = s81;
        this.c = downloadHeaderView;
    }

    @Override // com.spotify.mobile.android.ui.view.DownloadHeaderView.a
    public void a() {
        this.a.b().a(n61.c("click", this.b, ImmutableBiMap.of("settings", Boolean.TRUE)));
    }

    @Override // com.spotify.mobile.android.ui.view.DownloadHeaderView.a
    public void b(boolean z) {
        this.d.p.d(this.d.f, -1, z);
        if (!z) {
            this.d.c.f(new b(this.c), new c(this.a, this.b, z));
        } else {
            this.a.b().a(n61.c("click", this.b, ImmutableBiMap.of("download", Boolean.valueOf(z))));
        }
    }
}
