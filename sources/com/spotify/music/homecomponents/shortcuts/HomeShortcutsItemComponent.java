package com.spotify.music.homecomponents.shortcuts;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.n;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.models.Episode;
import com.spotify.rxjava2.p;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import io.reactivex.g;
import io.reactivex.y;
import java.util.HashMap;
import java.util.Map;

public class HomeShortcutsItemComponent implements pk9<View>, e {
    private static final Episode r = Episode.a().build();
    public static final /* synthetic */ int s = 0;
    private final Context a;
    private final Picasso b;
    private final g<PlayerState> c;
    private final y f;
    private final m71 n;
    private final w50 o;
    private final wo9 p;
    final Map<String, p> q = new HashMap();

    public HomeShortcutsItemComponent(Context context, Picasso picasso, g<PlayerState> gVar, y yVar, m71 m71, w50 w50, n nVar, wo9 wo9) {
        this.a = context;
        this.b = picasso;
        this.c = gVar;
        this.f = yVar;
        this.n = m71;
        this.o = w50;
        this.p = wo9;
        nVar.A().a(this);
    }

    static void f(k kVar, String str, boolean z, s81 s81, w51 w51, u3 u3Var) {
        boolean z2;
        F f2 = u3Var.a;
        S s2 = u3Var.b;
        int i = 0;
        if (s2 != null) {
            z2 = ar9.b(s2, str);
            if (z2) {
                kVar.X0();
            }
        } else {
            z2 = false;
        }
        if (f2 != null && !f2.equals(r)) {
            int intValue = ((Integer) MoreObjects.firstNonNull(f2.x(), 0)).intValue();
            if (!f2.E() || intValue != f2.j()) {
                i = intValue;
            }
            float j = (float) (f2.j() - i);
            float max = (j / ((float) Math.max(f2.j(), 1))) * 100.0f;
            if (j >= 30.0f) {
                kVar.h0((int) max);
                kVar.setTitle(f2.n());
                if (s81.events().containsKey("secondaryClick")) {
                    g(w51, s81, kVar.getView(), "secondaryClick");
                }
            } else {
                kVar.setTitle(f2.w().h());
                kVar.h1();
                g(w51, s81, kVar.getView(), "click");
            }
            if (z2) {
                return;
            }
            if (!z || j >= 30.0f) {
                kVar.J1();
            } else {
                kVar.N0();
            }
        }
    }

    private static void g(w51 w51, s81 s81, View view, String str) {
        i91.a(view);
        i91.b(w51.b()).e(str).d(s81).c(view).a();
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void V(n nVar) {
        d.d(this, nVar);
    }

    public /* synthetic */ void a(View view, s81 s81) {
        if (view.getParent() instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view.getParent();
            if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                this.o.a(s81, view, new v50(((GridLayoutManager) recyclerView.getLayoutManager()).C2()));
            }
        }
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void a0(n nVar) {
        d.c(this, nVar);
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        Drawable drawable;
        k kVar = (k) l70.o(view, k.class);
        kVar.setTitle(MoreObjects.nullToEmpty(s81.text().title()));
        boolean boolValue = s81.custom().boolValue("freshnessBadge", false);
        String a2 = zq9.a(s81);
        l0 z = l0.z(a2);
        g(w51, s81, kVar.getView(), "click");
        if (!s81.custom().boolValue("progressBar", false) || z.q() != LinkType.SHOW_EPISODE) {
            kVar.h1();
            p pVar = this.q.get(a2);
            if (pVar != null) {
                pVar.a();
            }
            p pVar2 = new p();
            pVar2.b(this.c.Q(this.f).subscribe(new d(a2, kVar, boolValue), new a(kVar, boolValue)));
            this.q.put(a2, pVar2);
        } else {
            p pVar3 = this.q.get(a2);
            if (pVar3 != null) {
                pVar3.a();
            }
            p pVar4 = new p();
            pVar4.b(g.i(this.p.b(a2), this.c, f.a).Q(this.f).subscribe(new c(kVar, a2, boolValue, s81, w51), new e(kVar)));
            this.q.put(a2, pVar4);
        }
        x81 main = s81.images().main();
        Uri parse = main != null ? Uri.parse(MoreObjects.nullToEmpty(main.uri())) : Uri.EMPTY;
        if (main == null || MoreObjects.isNullOrEmpty(main.placeholder())) {
            drawable = a.d(this.a, C0707R.color.image_placeholder_color);
        } else {
            drawable = this.n.b(main.placeholder(), HubsGlueImageConfig.THUMBNAIL);
        }
        String str = "default";
        if (main != null) {
            str = main.custom().string("style", str);
        }
        kVar.a(parse, drawable, str);
        n4.a(view, new b(this, view, s81));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_shortcuts_item_component;
    }

    @Override // androidx.lifecycle.g
    public void d0(n nVar) {
        for (p pVar : this.q.values()) {
            pVar.a();
        }
        this.q.clear();
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        j jVar = new j(viewGroup.getContext(), viewGroup, this.b);
        jVar.getView().setTag(C0707R.id.glue_viewholder_tag, jVar);
        return jVar.getView();
    }

    @Override // androidx.lifecycle.g
    public void h0(n nVar) {
        nVar.A().c(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void n(n nVar) {
        d.a(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void o0(n nVar) {
        d.e(this, nVar);
    }
}
