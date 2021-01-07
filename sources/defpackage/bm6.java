package defpackage;

import android.view.View;
import com.spotify.music.offlinetrials.limited.uicomponents.TrackDownloadButton;
import com.spotify.music.offlinetrials.limited.uicomponents.u;

/* renamed from: bm6  reason: default package */
public final /* synthetic */ class bm6 implements u.b {
    public final /* synthetic */ TrackDownloadButton a;
    public final /* synthetic */ View.OnClickListener b;

    public /* synthetic */ bm6(TrackDownloadButton trackDownloadButton, View.OnClickListener onClickListener) {
        this.a = trackDownloadButton;
        this.b = onClickListener;
    }

    @Override // com.spotify.music.offlinetrials.limited.uicomponents.u.b
    public final void a() {
        TrackDownloadButton trackDownloadButton = this.a;
        View.OnClickListener onClickListener = this.b;
        trackDownloadButton.setDownloadState(false);
        onClickListener.onClick(trackDownloadButton);
    }
}
