package com.spotify.music.features.yourlibraryx.view;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerFilterRowLibraryExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.quickscroll.QuickScrollConnectable;
import com.spotify.music.features.yourlibraryx.view.entities.swipe.b;
import com.spotify.music.yourlibrary.quickscroll.QuickScrollView;

public final class YourLibraryXViews implements g<f, YourLibraryXEvent> {
    private final vg9 a;
    private final int b;
    private final YourLibraryXPagingScrollListener c;
    private final YourLibraryXAdapter f;
    private final QuickScrollConnectable n;
    private final b0 o;

    public static final class a implements h<f> {
        final /* synthetic */ YourLibraryXViews a;
        final /* synthetic */ h b;

        a(YourLibraryXViews yourLibraryXViews, h hVar) {
            this.a = yourLibraryXViews;
            this.b = hVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            f fVar = (f) obj;
            kotlin.jvm.internal.h.e(fVar, "model");
            this.b.accept(fVar);
            boolean z = true;
            YourLibraryXViews.c(this.a, !fVar.c().b().isEmpty());
            YourLibraryXViews yourLibraryXViews = this.a;
            kotlin.jvm.internal.h.e(fVar, "model");
            kotlin.jvm.internal.h.e(fVar, "model");
            if (!(fVar.f().e() && fVar.l().b()) || fVar.f().g() != 0) {
                z = false;
            }
            YourLibraryXViews.b(yourLibraryXViews, z);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
            this.a.d().c.g(this.a.d().d);
        }
    }

    public YourLibraryXViews(YourLibraryXAdapter yourLibraryXAdapter, QuickScrollConnectable quickScrollConnectable, b0 b0Var, ViewGroup viewGroup, LayoutInflater layoutInflater, eh9 eh9, EncoreConsumerEntryPoint encoreConsumerEntryPoint) {
        kotlin.jvm.internal.h.e(yourLibraryXAdapter, "adapter");
        kotlin.jvm.internal.h.e(quickScrollConnectable, "quickScrollConnectable");
        kotlin.jvm.internal.h.e(b0Var, "settingsButtonViewBinder");
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        kotlin.jvm.internal.h.e(eh9, "logger");
        kotlin.jvm.internal.h.e(encoreConsumerEntryPoint, "endpoint");
        this.f = yourLibraryXAdapter;
        this.n = quickScrollConnectable;
        this.o = b0Var;
        vg9 b2 = vg9.b(layoutInflater, viewGroup, false);
        kotlin.jvm.internal.h.d(b2, "FragmentYourLibraryXBind…(inflater, parent, false)");
        this.a = b2;
        AppBarLayout appBarLayout = b2.c;
        kotlin.jvm.internal.h.d(appBarLayout, "binding.filterRowContainer");
        this.b = appBarLayout.getLayoutParams().height;
        YourLibraryXPagingScrollListener yourLibraryXPagingScrollListener = new YourLibraryXPagingScrollListener(new YourLibraryXViews$pagingListener$1(yourLibraryXAdapter));
        this.c = yourLibraryXPagingScrollListener;
        LinearLayout a2 = b2.a();
        kotlin.jvm.internal.h.d(a2, "binding.root");
        int integer = a2.getResources().getInteger(C0707R.integer.your_library_span_size);
        LinearLayout a3 = b2.a();
        kotlin.jvm.internal.h.d(a3, "binding.root");
        int dimensionPixelSize = a3.getResources().getDimensionPixelSize(C0707R.dimen.your_library_grid_padding);
        LinearLayout a4 = b2.a();
        kotlin.jvm.internal.h.d(a4, "binding.root");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(a4.getContext(), integer);
        gridLayoutManager.K2(new o(yourLibraryXAdapter, integer));
        RecyclerView recyclerView = b2.g;
        kotlin.jvm.internal.h.d(recyclerView, "binding.recyclerView");
        recyclerView.setLayoutManager(gridLayoutManager);
        b2.g.k(new n(integer, dimensionPixelSize), -1);
        b2.g.n(yourLibraryXPagingScrollListener);
        b2.g.setHasFixedSize(true);
        LinearLayout a5 = b2.a();
        kotlin.jvm.internal.h.d(a5, "binding.root");
        k.a(a5, new nmf<b5, kotlin.f>(this) {
            /* class com.spotify.music.features.yourlibraryx.view.YourLibraryXViews.AnonymousClass1 */
            final /* synthetic */ YourLibraryXViews this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public kotlin.f invoke(b5 b5Var) {
                b5 b5Var2 = b5Var;
                kotlin.jvm.internal.h.e(b5Var2, "insets");
                this.this$0.d().a().setPadding(0, b5Var2.j(), 0, 0);
                return kotlin.f.a;
            }
        });
        b2.e.setProfileIconView$apps_music_features_your_library_x(b0Var.d());
        b2.e.setLogger$apps_music_features_your_library_x(eh9);
        b2.d.setLogger$apps_music_features_your_library_x(eh9);
        b2.d.setFilterRowLibraryFactory$apps_music_features_your_library_x(EncoreConsumerFilterRowLibraryExtensions.filterRowLibraryFactory(encoreConsumerEntryPoint.getRows()));
        yourLibraryXAdapter.q0(new cmf<kotlin.f>(this) {
            /* class com.spotify.music.features.yourlibraryx.view.YourLibraryXViews.AnonymousClass2 */
            final /* synthetic */ YourLibraryXViews this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // defpackage.cmf
            public kotlin.f invoke() {
                RecyclerView recyclerView = this.this$0.d().g;
                kotlin.jvm.internal.h.d(recyclerView, "binding.recyclerView");
                recyclerView.setAdapter(this.this$0.f);
                return kotlin.f.a;
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            AppBarLayout appBarLayout2 = b2.c;
            kotlin.jvm.internal.h.d(appBarLayout2, "binding.filterRowContainer");
            appBarLayout2.setOutlineProvider(null);
        }
    }

    public static final void b(YourLibraryXViews yourLibraryXViews, boolean z) {
        ConstraintLayout constraintLayout = yourLibraryXViews.a.b;
        kotlin.jvm.internal.h.d(constraintLayout, "binding.emptyView");
        int i = 8;
        constraintLayout.setVisibility(z ? 0 : 8);
        RecyclerView recyclerView = yourLibraryXViews.a.g;
        kotlin.jvm.internal.h.d(recyclerView, "binding.recyclerView");
        if (!z) {
            i = 0;
        }
        recyclerView.setVisibility(i);
    }

    public static final void c(YourLibraryXViews yourLibraryXViews, boolean z) {
        int i = z ? yourLibraryXViews.b : 0;
        AppBarLayout appBarLayout = yourLibraryXViews.a.c;
        kotlin.jvm.internal.h.d(appBarLayout, "binding.filterRowContainer");
        if (appBarLayout.getLayoutParams().height != i) {
            AppBarLayout appBarLayout2 = yourLibraryXViews.a.c;
            kotlin.jvm.internal.h.d(appBarLayout2, "binding.filterRowContainer");
            appBarLayout2.getLayoutParams().height = i;
            yourLibraryXViews.a.c.requestLayout();
        }
    }

    public final vg9 d() {
        return this.a;
    }

    public final void e(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "bundle");
        RecyclerView recyclerView = this.a.g;
        kotlin.jvm.internal.h.d(recyclerView, "binding.recyclerView");
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.h1(bundle.getParcelable("YourLibraryXViews.layoutState"));
        }
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        RecyclerView recyclerView = this.a.g;
        kotlin.jvm.internal.h.d(recyclerView, "binding.recyclerView");
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            bundle.putParcelable("YourLibraryXViews.layoutState", layoutManager.i1());
        }
        return bundle;
    }

    public final void g() {
        this.a.g.I0(0);
    }

    @Override // com.spotify.mobius.g
    public h<f> t(da2<YourLibraryXEvent> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        LinearLayout a2 = this.a.a();
        kotlin.jvm.internal.h.d(a2, "binding.root");
        Context context = a2.getContext();
        kotlin.jvm.internal.h.d(context, "binding.root.context");
        new p(new b(context)).g(this.a.g);
        QuickScrollConnectable quickScrollConnectable = this.n;
        QuickScrollView quickScrollView = this.a.f;
        kotlin.jvm.internal.h.d(quickScrollView, "binding.quickscrollView");
        RecyclerView recyclerView = this.a.g;
        kotlin.jvm.internal.h.d(recyclerView, "binding.recyclerView");
        quickScrollConnectable.n(quickScrollView, recyclerView);
        vg9 vg9 = this.a;
        vg9.c.a(vg9.d);
        YourLibraryXHeaderView yourLibraryXHeaderView = this.a.e;
        kotlin.jvm.internal.h.d(yourLibraryXHeaderView, "binding.headerView");
        YourLibraryXFilterRowView yourLibraryXFilterRowView = this.a.d;
        kotlin.jvm.internal.h.d(yourLibraryXFilterRowView, "binding.filterRowView");
        return new a(this, new ih9(yourLibraryXHeaderView, yourLibraryXFilterRowView, this.f, this.c, this.n, this.o).t(da2));
    }
}
