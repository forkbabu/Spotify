package defpackage;

import com.spotify.encore.ViewProvider;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.util.x;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.playlist.models.offline.a;
import defpackage.d39;

/* renamed from: p59  reason: default package */
public final /* synthetic */ class p59 implements d39.e {
    public final /* synthetic */ c69 a;

    public /* synthetic */ p59(c69 c69) {
        this.a = c69;
    }

    @Override // defpackage.d39.e
    public final void a(ViewProvider viewProvider, d39.b bVar, int i) {
        c69 c69 = this.a;
        MusicItem musicItem = (MusicItem) bVar;
        c69.getClass();
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) viewProvider.getView();
        downloadHeaderView.setSongsOnly(true);
        downloadHeaderView.setShowConfirmationDialogOnRemoveDownload(true);
        downloadHeaderView.setObserver(new a69(c69, musicItem, i));
        downloadHeaderView.r((a) x.n(musicItem.p(), a.f.a));
    }
}
