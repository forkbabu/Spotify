package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.n;
import com.spotify.music.features.podcast.entity.loadedpage.data.a;
import com.spotify.pageloader.PageLoaderView;
import kotlin.jvm.internal.h;

/* renamed from: u67  reason: default package */
public final class u67 implements t67, s67 {
    private final cbc<a> a;
    private final PageLoaderView.a<a> b;

    public u67(cbc<a> cbc, PageLoaderView.a<a> aVar) {
        h.e(cbc, "pageLoaderScope");
        h.e(aVar, "pageLoaderViewBuilder");
        this.a = cbc;
        this.b = aVar;
    }

    public View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, n nVar) {
        h.e(context, "context");
        h.e(layoutInflater, "inflater");
        h.e(nVar, "lifecycleOwner");
        PageLoaderView<a> a2 = this.b.a(context);
        a2.j0(nVar, this.a.get());
        h.d(a2, "pageLoaderViewBuilder.cr…derScope.get())\n        }");
        return a2;
    }
}
