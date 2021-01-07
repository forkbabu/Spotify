package com.spotify.music.offlinetrials.limited.trackentity;

import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.v;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ v a;

    public /* synthetic */ a(v vVar) {
        this.a = vVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ((DownloadHeaderView) this.a).r((com.spotify.playlist.models.offline.a) obj);
    }
}
