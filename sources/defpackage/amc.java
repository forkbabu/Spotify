package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.l0;
import kotlin.jvm.internal.h;

/* renamed from: amc  reason: default package */
public final class amc implements zlc {
    private final cbc<wjc> a;
    private final PageLoaderView.a<wjc> b;
    private final ajf<olc> c;

    public amc(cbc<wjc> cbc, PageLoaderView.a<wjc> aVar, ajf<olc> ajf) {
        h.e(cbc, "pageLoaderScope");
        h.e(aVar, "pageLoaderViewBuilder");
        h.e(ajf, "loadedPresenter");
        this.a = cbc;
        this.b = aVar;
        this.c = ajf;
    }

    @Override // defpackage.zlc
    public View a(Context context, n nVar, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(context, "context");
        h.e(nVar, "lifecycleOwner");
        h.e(layoutInflater, "inflater");
        PageLoaderView<wjc> a2 = this.b.a(context);
        a2.j0(nVar, this.a.get());
        h.d(a2, "pageLoaderViewBuilder.cr… pageLoaderScope.get()) }");
        return a2;
    }

    @Override // defpackage.zlc
    public void c() {
        LiveData<l0<wjc>> a2 = this.a.get().a();
        h.d(a2, "pageLoaderScope.get().state()");
        l0<wjc> e = a2.e();
        boolean z = true;
        if (e == null || !(e instanceof l0.b)) {
            z = false;
        }
        if (z) {
            this.c.get().b();
        }
    }
}
