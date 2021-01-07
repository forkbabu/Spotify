package defpackage;

import com.google.common.collect.ImmutableBiMap;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;

/* renamed from: lz3  reason: default package */
class lz3 implements DownloadHeaderView.a {
    final /* synthetic */ w51 a;
    final /* synthetic */ s81 b;

    lz3(mz3 mz3, w51 w51, s81 s81) {
        this.a = w51;
        this.b = s81;
    }

    @Override // com.spotify.mobile.android.ui.view.DownloadHeaderView.a
    public void a() {
        this.a.b().a(n61.c("click", this.b, ImmutableBiMap.of("settings", Boolean.TRUE)));
    }

    @Override // com.spotify.mobile.android.ui.view.DownloadHeaderView.a
    public void b(boolean z) {
        this.a.b().a(n61.c("click", this.b, ImmutableBiMap.of("download", Boolean.valueOf(z))));
    }
}
