package com.spotify.music.features.listeninghistory;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.b0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.listeninghistory.datasource.ListeningHistoryDataSource;
import com.spotify.music.features.listeninghistory.presenter.a;
import com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import defpackage.di9;
import kotlin.jvm.internal.h;

public final class ListeningHistoryFragment extends LifecycleListenableFragment implements c.a, s, mfd, ToolbarConfig.c, ToolbarConfig.d, d0, ToolbarConfig.a, FilterAndSortBottomSheetFragment.a {
    public a h0;
    public cbc<rm5> i0;
    public PageLoaderView.a<rm5> j0;
    public dn5 k0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return context.getString(C0707R.string.listening_history_title);
    }

    @Override // com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment.a
    public void J(ane ane, int i) {
        h.e(ane, "item");
    }

    @Override // com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment.a
    public void X0(di9.b bVar, int i) {
        h.e(bVar, "item");
        a aVar = this.h0;
        if (aVar == null) {
            h.k("presenter");
            throw null;
        } else if (!h.a(aVar.d().name(), bVar.e())) {
            String e = bVar.e();
            ListeningHistoryDataSource.HistoryType historyType = ListeningHistoryDataSource.HistoryType.ITEM;
            if (h.a(e, historyType.name())) {
                dn5 dn5 = this.k0;
                if (dn5 != null) {
                    dn5.c();
                } else {
                    h.k("listeningHistoryUbiLogger");
                    throw null;
                }
            } else {
                dn5 dn52 = this.k0;
                if (dn52 != null) {
                    dn52.b();
                    historyType = ListeningHistoryDataSource.HistoryType.GROUP;
                } else {
                    h.k("listeningHistoryUbiLogger");
                    throw null;
                }
            }
            a aVar2 = this.h0;
            if (aVar2 != null) {
                aVar2.f(historyType);
            } else {
                h.k("presenter");
                throw null;
            }
        }
    }

    @Override // com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment.a
    public void c0() {
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        h.e(a0Var, "toolbarMenu");
        String string = a0Var.getContext().getString(C0707R.string.options_menu_listening_history_filter);
        h.d(string, "menu.context.getString(R…listening_history_filter)");
        b0 d = a0Var.d(C0707R.id.actionbar_item_listening_history_filter, string);
        d.setIcon(C0707R.drawable.ic_listening_history_filter);
        d.a(new a(this));
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.LISTENINGHISTORY;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.b;
        h.d(cVar, "ViewUris.LISTENINGHISTORY");
        return cVar;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "listening-history";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        super.p3(context);
        dagger.android.support.a.a(this);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.LISTENINGHISTORY, null);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        h.e(menu, "menu");
        h.e(menuInflater, "inflater");
        ToolbarConfig.c(this, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        u4(true);
        PageLoaderView.a<rm5> aVar = this.j0;
        if (aVar != null) {
            PageLoaderView<rm5> a = aVar.a(l4());
            n b3 = b3();
            cbc<rm5> cbc = this.i0;
            if (cbc != null) {
                a.j0(b3, cbc.get());
                return a;
            }
            h.k("pageLoaderScope");
            throw null;
        }
        h.k("pageLoaderViewBuilder");
        throw null;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.SHOW;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.z0;
    }
}
