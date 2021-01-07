package com.spotify.music.features.entityselector.container.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.entityselector.container.b;

public final class EntitySelectorViews implements Object {
    private final View a;
    private final TabLayout b;
    private final ViewPager2 c;
    private final View f;
    private final pj0<wy4> n;

    public static final class a implements h<xy4> {
        final /* synthetic */ oj0 a;

        a(oj0 oj0) {
            this.a = oj0;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            kotlin.jvm.internal.h.e((xy4) obj, "model");
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.a.dispose();
        }
    }

    public EntitySelectorViews(LayoutInflater layoutInflater, ViewGroup viewGroup, b bVar, dz4 dz4) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        kotlin.jvm.internal.h.e(bVar, "entitySelectorViewPagerAdapter");
        kotlin.jvm.internal.h.e(dz4, "entitySelectorLogger");
        View inflate = layoutInflater.inflate(C0707R.layout.entity_selector_view, viewGroup, false);
        kotlin.jvm.internal.h.d(inflate, "inflater.inflate(R.layou…ctor_view, parent, false)");
        this.a = inflate;
        View G = q4.G(inflate, C0707R.id.tab_layout);
        kotlin.jvm.internal.h.d(G, "requireViewById<TabLayout>(root, R.id.tab_layout)");
        TabLayout tabLayout = (TabLayout) G;
        this.b = tabLayout;
        View G2 = q4.G(inflate, C0707R.id.entity_view_pager);
        kotlin.jvm.internal.h.d(G2, "requireViewById<ViewPage…, R.id.entity_view_pager)");
        ViewPager2 viewPager2 = (ViewPager2) G2;
        this.c = viewPager2;
        View G3 = q4.G(inflate, C0707R.id.close);
        kotlin.jvm.internal.h.d(G3, "requireViewById<View>(root, R.id.close)");
        this.f = G3;
        this.n = new pj0<>(pj0.b(b.a, bj0.a(G3)));
        dz4.c();
        viewPager2.setAdapter(bVar);
        new com.google.android.material.tabs.b(tabLayout, viewPager2, new a(this)).a();
    }

    public final View a() {
        return this.a;
    }

    public h<xy4> t(da2<wy4> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        return new a(this.n.a(new c(new EntitySelectorViews$connect$disposable$1(da2))));
    }
}
