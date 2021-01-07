package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import com.spotify.music.podcast.freetierlikes.tabs.followed.h;
import com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.d;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.l0;
import io.reactivex.s;

/* renamed from: ilc  reason: default package */
public final class ilc implements hlc {
    private final cbc<s<ryd>> a;
    private final PageLoaderView.a<s<ryd>> b;
    private final ajf<d> c;

    public ilc(cbc<s<ryd>> cbc, PageLoaderView.a<s<ryd>> aVar, ajf<d> ajf, h hVar) {
        kotlin.jvm.internal.h.e(cbc, "pageLoaderScope");
        kotlin.jvm.internal.h.e(aVar, "pageLoaderViewBuilder");
        kotlin.jvm.internal.h.e(ajf, "loadedPresenter");
        kotlin.jvm.internal.h.e(hVar, "followedPodcastsTabAutoFactory");
        this.a = cbc;
        this.b = aVar;
        this.c = ajf;
    }

    @Override // defpackage.hlc
    public View a(Context context, n nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(nVar, "lifecycleOwner");
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        PageLoaderView<s<ryd>> a2 = this.b.a(context);
        a2.j0(nVar, this.a.get());
        kotlin.jvm.internal.h.d(a2, "pageLoaderViewBuilder.cr…eLoaderScope.get())\n    }");
        return a2;
    }

    @Override // defpackage.hlc
    public void c() {
        LiveData<l0<s<ryd>>> a2 = this.a.get().a();
        kotlin.jvm.internal.h.d(a2, "pageLoaderScope.get().state()");
        l0<s<ryd>> e = a2.e();
        boolean z = true;
        if (e == null || !(e instanceof l0.b)) {
            z = false;
        }
        if (z) {
            this.c.get().b();
        }
    }
}
