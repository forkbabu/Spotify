package defpackage;

import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.v;
import com.spotify.playlist.models.offline.a;
import io.reactivex.functions.g;

/* renamed from: mx3  reason: default package */
public final /* synthetic */ class mx3 implements g {
    public final /* synthetic */ v a;

    public /* synthetic */ mx3(v vVar) {
        this.a = vVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ((DownloadHeaderView) this.a).r((a) obj);
    }
}
