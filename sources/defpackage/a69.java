package defpackage;

import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: a69  reason: default package */
class a69 implements DownloadHeaderView.a {
    final /* synthetic */ MusicItem a;
    final /* synthetic */ int b;
    final /* synthetic */ c69 c;

    a69(c69 c69, MusicItem musicItem, int i) {
        this.c = c69;
        this.a = musicItem;
        this.b = i;
    }

    @Override // com.spotify.mobile.android.ui.view.DownloadHeaderView.a
    public void a() {
        this.c.c.a();
    }

    @Override // com.spotify.mobile.android.ui.view.DownloadHeaderView.a
    public void b(boolean z) {
        this.c.f.a(this.a, this.b, z);
    }
}
