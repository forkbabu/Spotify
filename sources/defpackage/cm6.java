package defpackage;

import android.view.View;
import com.spotify.music.offlinetrials.limited.uicomponents.TrackDownloadButton;
import com.spotify.music.offlinetrials.limited.uicomponents.t;

/* renamed from: cm6  reason: default package */
public final /* synthetic */ class cm6 implements t.a {
    public final /* synthetic */ om6 a;
    public final /* synthetic */ TrackDownloadButton b;
    public final /* synthetic */ View.OnClickListener c;

    public /* synthetic */ cm6(om6 om6, TrackDownloadButton trackDownloadButton, View.OnClickListener onClickListener) {
        this.a = om6;
        this.b = trackDownloadButton;
        this.c = onClickListener;
    }

    @Override // com.spotify.music.offlinetrials.limited.uicomponents.t.a
    public final void a() {
        this.a.b(this.b, this.c);
    }
}
