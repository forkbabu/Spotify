package com.spotify.android.glue.patterns.prettylist.compat;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.spotify.android.glue.patterns.prettylist.StickyRecyclerView;
import com.spotify.android.glue.patterns.prettylist.g;
import com.spotify.android.glue.patterns.prettylist.h;
import com.spotify.android.glue.patterns.prettylist.i;
import com.spotify.android.glue.patterns.prettylist.j;
import com.spotify.android.glue.patterns.prettylist.k;
import com.spotify.android.glue.patterns.prettylist.l;
import com.spotify.android.glue.patterns.prettylist.m;
import com.spotify.android.glue.patterns.prettylist.n;
import com.spotify.android.glue.patterns.prettylist.p;
import com.spotify.android.glue.patterns.prettylist.q;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.paste.app.d;
import com.spotify.music.C0707R;

public final class b {
    public static i a(Fragment fragment, View view) {
        c i = i(fragment);
        j jVar = new j(i, view, d.c(i));
        j(i, jVar);
        return jVar;
    }

    static i b(e eVar, Fragment fragment, View view, View view2, n nVar) {
        i iVar;
        int i = eVar.a;
        if (i == 0) {
            iVar = nVar.e(fragment, view);
        } else if (i == 1) {
            iVar = nVar.d(fragment, view);
        } else if (i != 2) {
            iVar = nVar.e(fragment, view);
        } else {
            iVar = nVar.b(fragment);
        }
        iVar.setHeaderAccessory(view2);
        iVar.setHeaderSticky(eVar.j);
        iVar.setFilterView(eVar.g);
        if (iVar.getPrettyHeaderView() != null) {
            iVar.getPrettyHeaderView().setFooter(null);
        }
        return iVar;
    }

    static k c(e eVar, Fragment fragment, View view, View view2, n nVar) {
        k kVar;
        int i = eVar.a;
        if (i == 0) {
            kVar = nVar.f(fragment, view);
        } else if (i == 1) {
            kVar = nVar.a(fragment, view);
            kVar.getStickyRecyclerView().setAutoHideHeader(true);
        } else if (i != 2) {
            kVar = nVar.f(fragment, view);
        } else {
            kVar = nVar.c(fragment);
            kVar.getStickyRecyclerView().setAutoHideHeader(true);
        }
        kVar.setHeaderAccessory(view2);
        kVar.setHeaderSticky(eVar.j);
        kVar.setFilterView(eVar.g);
        if (kVar.getPrettyHeaderView() != null) {
            kVar.getPrettyHeaderView().setFooter(null);
        }
        kVar.getRecyclerView().setLayoutManager(new StickyRecyclerView.DynamicBottomPaddingLinearLayoutManager(fragment.B2(), 1, false));
        return kVar;
    }

    public static k d(Fragment fragment, View view) {
        c i = i(fragment);
        l lVar = new l(i, view, d.c(i));
        j(i, lVar);
        return lVar;
    }

    public static k e(Fragment fragment, View view) {
        c i = i(fragment);
        h hVar = new h(i, view);
        j(i, hVar);
        return hVar;
    }

    public static i f(Fragment fragment, View view) {
        c i = i(fragment);
        g gVar = new g(i, view);
        j(i, gVar);
        return gVar;
    }

    public static k g(Fragment fragment) {
        c i = i(fragment);
        q qVar = new q(i);
        j(i, qVar);
        return qVar;
    }

    public static i h(Fragment fragment) {
        c i = i(fragment);
        p pVar = new p(i);
        j(i, pVar);
        return pVar;
    }

    private static c i(Fragment fragment) {
        if (fragment.e3()) {
            return fragment.B2();
        }
        throw new IllegalStateException("PrettyLists can only be created for attached fragments");
    }

    private static <T extends m> void j(Activity activity, T t) {
        t.getView().setId(C0707R.id.legacy_header_recycler_layout);
        t.setHeaderBackgroundColor(nud.h(activity, 16842836));
        t.setToolbarUpdater(l70.k(activity));
        if (activity instanceof f) {
            t.setToolbarUpdater(l70.k(activity));
        } else {
            t.setToolbarUpdater(u.g);
        }
    }
}
