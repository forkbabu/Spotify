package com.spotify.music.offlinetrials.limited.trackentity;

import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.music.offlinetrials.limited.trackentity.endpoint.OfflineTrack;
import com.spotify.music.offlinetrials.limited.trackentity.endpoint.OfflineTracks;
import io.reactivex.functions.g;
import java.util.List;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ DownloadHeaderView a;

    public /* synthetic */ d(DownloadHeaderView downloadHeaderView) {
        this.a = downloadHeaderView;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        OfflineTrack offlineTrack;
        DownloadHeaderView downloadHeaderView = this.a;
        List<OfflineTrack> tracks = ((OfflineTracks) obj).getTracks();
        if (!tracks.isEmpty() && (offlineTrack = tracks.get(0)) != null) {
            downloadHeaderView.r(offlineTrack.getOfflineState());
        }
    }
}
