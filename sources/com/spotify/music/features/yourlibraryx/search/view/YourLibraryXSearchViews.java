package com.spotify.music.features.yourlibraryx.search.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.yourlibrary.api.searchheader.SearchHeaderLibrary;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerSearchHeaderLibraryExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.view.YourLibraryXAdapter;
import com.spotify.music.features.yourlibraryx.view.YourLibraryXPagingScrollListener;
import com.spotify.music.features.yourlibraryx.view.entities.swipe.b;
import com.spotify.music.features.yourlibraryx.view.k;
import kotlin.text.e;

public final class YourLibraryXSearchViews implements g<f, YourLibraryXEvent> {
    private final wg9 a;
    private final Component<SearchHeaderLibrary.Model, SearchHeaderLibrary.Events> b;
    private final YourLibraryXPagingScrollListener c;
    private final YourLibraryXAdapter f;
    private final eh9 n;

    public static final class a implements h<f> {
        private com.spotify.music.features.yourlibraryx.domain.a a;
        final /* synthetic */ YourLibraryXSearchViews b;
        final /* synthetic */ h c;
        final /* synthetic */ b d;

        a(YourLibraryXSearchViews yourLibraryXSearchViews, h hVar, b bVar) {
            this.b = yourLibraryXSearchViews;
            this.c = hVar;
            this.d = bVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            f fVar = (f) obj;
            kotlin.jvm.internal.h.e(fVar, "model");
            this.c.accept(fVar);
            b bVar = this.d;
            String e = fVar.c().e();
            bVar.s(!(e == null || e.n(e)));
            if (!kotlin.jvm.internal.h.a(fVar.e(), this.a)) {
                this.a = fVar.e();
                YourLibraryXSearchViews.c(this.b, fVar);
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.c.dispose();
        }
    }

    public YourLibraryXSearchViews(ViewGroup viewGroup, LayoutInflater layoutInflater, EncoreConsumerEntryPoint encoreConsumerEntryPoint, YourLibraryXAdapter yourLibraryXAdapter, eh9 eh9) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        kotlin.jvm.internal.h.e(encoreConsumerEntryPoint, "encoreConsumerEntryPoint");
        kotlin.jvm.internal.h.e(yourLibraryXAdapter, "adapter");
        kotlin.jvm.internal.h.e(eh9, "logger");
        this.f = yourLibraryXAdapter;
        this.n = eh9;
        wg9 b2 = wg9.b(layoutInflater, viewGroup, false);
        kotlin.jvm.internal.h.d(b2, "FragmentYourLibraryXSear…(inflater, parent, false)");
        this.a = b2;
        Component<SearchHeaderLibrary.Model, SearchHeaderLibrary.Events> make = EncoreConsumerSearchHeaderLibraryExtensions.searchHeaderLibraryFactory(encoreConsumerEntryPoint.getHeaders()).make();
        this.b = make;
        YourLibraryXPagingScrollListener yourLibraryXPagingScrollListener = new YourLibraryXPagingScrollListener(null, 1);
        this.c = yourLibraryXPagingScrollListener;
        b2.d.addView(make.getView());
        RecyclerView recyclerView = b2.f;
        kotlin.jvm.internal.h.d(recyclerView, "binding.recyclerView");
        ConstraintLayout a2 = b2.a();
        kotlin.jvm.internal.h.d(a2, "binding.root");
        recyclerView.setLayoutManager(new LinearLayoutManager(a2.getContext()));
        b2.f.n(yourLibraryXPagingScrollListener);
        b2.f.setHasFixedSize(true);
        ConstraintLayout a3 = b2.a();
        kotlin.jvm.internal.h.d(a3, "binding.root");
        k.a(a3, new nmf<b5, kotlin.f>(this) {
            /* class com.spotify.music.features.yourlibraryx.search.view.YourLibraryXSearchViews.AnonymousClass1 */
            final /* synthetic */ YourLibraryXSearchViews this$0;

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
        yourLibraryXAdapter.q0(new cmf<kotlin.f>(this) {
            /* class com.spotify.music.features.yourlibraryx.search.view.YourLibraryXSearchViews.AnonymousClass2 */
            final /* synthetic */ YourLibraryXSearchViews this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // defpackage.cmf
            public kotlin.f invoke() {
                RecyclerView recyclerView = this.this$0.d().f;
                kotlin.jvm.internal.h.d(recyclerView, "binding.recyclerView");
                recyclerView.setAdapter(this.this$0.f);
                return kotlin.f.a;
            }
        });
    }

    public static final void c(YourLibraryXSearchViews yourLibraryXSearchViews, f fVar) {
        yourLibraryXSearchViews.getClass();
        if (fVar.f().e()) {
            if (!fVar.f().c().isEmpty()) {
                RecyclerView recyclerView = yourLibraryXSearchViews.a.f;
                kotlin.jvm.internal.h.d(recyclerView, "binding.recyclerView");
                recyclerView.setVisibility(0);
                Group group = yourLibraryXSearchViews.a.b;
                kotlin.jvm.internal.h.d(group, "binding.groupEmpty");
                group.setVisibility(8);
                Group group2 = yourLibraryXSearchViews.a.c;
                kotlin.jvm.internal.h.d(group2, "binding.groupNoResults");
                group2.setVisibility(8);
                return;
            }
            String e = fVar.c().e();
            if (e == null || e.n(e)) {
                Group group3 = yourLibraryXSearchViews.a.b;
                kotlin.jvm.internal.h.d(group3, "binding.groupEmpty");
                group3.setVisibility(0);
                Group group4 = yourLibraryXSearchViews.a.c;
                kotlin.jvm.internal.h.d(group4, "binding.groupNoResults");
                group4.setVisibility(8);
                RecyclerView recyclerView2 = yourLibraryXSearchViews.a.f;
                kotlin.jvm.internal.h.d(recyclerView2, "binding.recyclerView");
                recyclerView2.setVisibility(8);
                return;
            }
            TextView textView = yourLibraryXSearchViews.a.e;
            kotlin.jvm.internal.h.d(textView, "binding.noResultsViewTitle");
            ConstraintLayout a2 = yourLibraryXSearchViews.a.a();
            kotlin.jvm.internal.h.d(a2, "binding.root");
            textView.setText(a2.getContext().getString(C0707R.string.your_library_search_no_results_view_title, fVar.c().e()));
            Group group5 = yourLibraryXSearchViews.a.c;
            kotlin.jvm.internal.h.d(group5, "binding.groupNoResults");
            group5.setVisibility(0);
            Group group6 = yourLibraryXSearchViews.a.b;
            kotlin.jvm.internal.h.d(group6, "binding.groupEmpty");
            group6.setVisibility(8);
            RecyclerView recyclerView3 = yourLibraryXSearchViews.a.f;
            kotlin.jvm.internal.h.d(recyclerView3, "binding.recyclerView");
            recyclerView3.setVisibility(8);
        }
    }

    public final wg9 d() {
        return this.a;
    }

    @Override // com.spotify.mobius.g
    public h<f> t(da2<YourLibraryXEvent> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        ConstraintLayout a2 = this.a.a();
        kotlin.jvm.internal.h.d(a2, "binding.root");
        Context context = a2.getContext();
        kotlin.jvm.internal.h.d(context, "binding.root.context");
        b bVar = new b(context);
        new p(bVar).g(this.a.f);
        h t = new ih9(this.f, this.c).t(da2);
        this.b.onEvent(new YourLibraryXSearchViews$connect$1(this, da2));
        return new a(this, t, bVar);
    }
}
