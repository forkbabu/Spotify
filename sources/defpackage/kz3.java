package defpackage;

import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.util.ui.m;

/* renamed from: kz3  reason: default package */
class kz3 extends m {
    final /* synthetic */ DownloadHeaderView a;
    final /* synthetic */ mz3 b;

    kz3(mz3 mz3, DownloadHeaderView downloadHeaderView) {
        this.b = mz3;
        this.a = downloadHeaderView;
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onDestroy() {
        this.b.a.e1(this);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStart() {
        this.b.b.a(this.a);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStop() {
        this.b.b.b();
    }
}
