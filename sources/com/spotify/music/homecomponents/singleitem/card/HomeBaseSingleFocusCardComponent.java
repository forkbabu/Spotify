package com.spotify.music.homecomponents.singleitem.card;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.n;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder;
import com.spotify.music.libs.home.common.contentapi.b;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import io.reactivex.android.schedulers.a;
import io.reactivex.disposables.c;
import io.reactivex.g;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.h;

public abstract class HomeBaseSingleFocusCardComponent implements Object<View>, e, e {
    private final HashMap<Integer, q> a = new HashMap<>();
    private final int b;
    private final int c;
    private final Context f;
    private final Picasso n;
    private final m71 o;
    private final b p;
    private final b q;
    private final g<PlayerState> r;

    protected HomeBaseSingleFocusCardComponent(Context context, Picasso picasso, m71 m71, b bVar, b bVar2, g<PlayerState> gVar) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        h.e(m71, "iconCache");
        h.e(bVar, "savedAlbums");
        h.e(bVar2, "savedPlaylists");
        h.e(gVar, "playerStates");
        this.f = context;
        this.n = picasso;
        this.o = m71;
        this.p = bVar;
        this.q = bVar2;
        this.r = gVar;
        this.b = context.getResources().getDimensionPixelSize(C0707R.dimen.single_item_container_max_width);
        this.c = context.getResources().getDimensionPixelSize(C0707R.dimen.single_item_container_min_width);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void V(n nVar) {
        d.d(this, nVar);
    }

    public abstract HomeSingleFocusCardViewBinder.Size a();

    @Override // androidx.lifecycle.g
    public /* synthetic */ void a0(n nVar) {
        d.c(this, nVar);
    }

    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        h.e(view, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
    }

    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        Uri uri;
        String str;
        io.reactivex.disposables.b bVar2;
        String uri2;
        h.e(view, "view");
        h.e(s81, "data");
        h.e(w51, "config");
        h.e(bVar, "state");
        HomeSingleFocusCardViewBinder homeSingleFocusCardViewBinder = (HomeSingleFocusCardViewBinder) l70.o(view, HomeSingleFocusCardViewBinder.class);
        homeSingleFocusCardViewBinder.reset();
        homeSingleFocusCardViewBinder.setTitle(s81.text().title());
        homeSingleFocusCardViewBinder.setSubtitle(s81.text().subtitle());
        homeSingleFocusCardViewBinder.f0(a());
        Resources resources = this.f.getResources();
        h.d(resources, "context.resources");
        homeSingleFocusCardViewBinder.o2(knf.c(anf.b(((float) resources.getDisplayMetrics().widthPixels) * 0.9f), this.c, this.b));
        h.d(homeSingleFocusCardViewBinder, "viewBinder");
        r81 images = s81.images();
        x81 main = images.main();
        if (main == null || (uri2 = main.uri()) == null || (uri = Uri.parse(uri2)) == null) {
            uri = Uri.EMPTY;
        }
        x81 main2 = images.main();
        if (main2 == null || (str = main2.placeholder()) == null) {
            str = "";
        }
        h.d(uri, "uri");
        homeSingleFocusCardViewBinder.w1(uri, str);
        q qVar = this.a.get(Integer.valueOf(homeSingleFocusCardViewBinder.getView().hashCode()));
        if (qVar != null) {
            qVar.c();
        }
        int hashCode = homeSingleFocusCardViewBinder.getView().hashCode();
        for (Map.Entry<String, ? extends o81> entry : s81.events().entrySet()) {
            String key = entry.getKey();
            int hashCode2 = key.hashCode();
            boolean z = false;
            if (hashCode2 != 1146009782) {
                if (hashCode2 != 1904419042) {
                    if (hashCode2 == 2006452987 && key.equals("singleItemButtonClick")) {
                        String a2 = zq9.a(s81);
                        q qVar2 = this.a.get(Integer.valueOf(hashCode));
                        if (qVar2 == null) {
                            qVar2 = new q();
                            this.a.put(Integer.valueOf(hashCode), qVar2);
                        }
                        qVar2.a(this.r.Q(a.b()).subscribe(new c(a2, homeSingleFocusCardViewBinder), new d(homeSingleFocusCardViewBinder)));
                        homeSingleFocusCardViewBinder.C1(new HomeBaseSingleFocusCardComponent$playButtonSetUp$1(homeSingleFocusCardViewBinder, w51, s81));
                    }
                } else if (key.equals("heartClick")) {
                    String a3 = zq9.a(s81);
                    l0 z2 = l0.z(a3);
                    q qVar3 = this.a.get(Integer.valueOf(hashCode));
                    if (qVar3 == null) {
                        qVar3 = new q();
                        this.a.put(Integer.valueOf(hashCode), qVar3);
                    }
                    h.d(z2, "link");
                    LinkType q2 = z2.q();
                    if (q2 != null) {
                        int ordinal = q2.ordinal();
                        if (ordinal == 6 || ordinal == 54) {
                            bVar2 = this.p.c(a3).o0(a.b()).subscribe(new b(1, homeSingleFocusCardViewBinder), new a(1, homeSingleFocusCardViewBinder));
                            qVar3.a(bVar2);
                            homeSingleFocusCardViewBinder.O0(new HomeBaseSingleFocusCardComponent$heartButtonSetUp$1(homeSingleFocusCardViewBinder, s81, w51));
                        } else if (ordinal == 185) {
                            bVar2 = this.q.c(a3).o0(a.b()).subscribe(new b(0, homeSingleFocusCardViewBinder), new a(0, homeSingleFocusCardViewBinder));
                            qVar3.a(bVar2);
                            homeSingleFocusCardViewBinder.O0(new HomeBaseSingleFocusCardComponent$heartButtonSetUp$1(homeSingleFocusCardViewBinder, s81, w51));
                        }
                    }
                    bVar2 = c.a();
                    qVar3.a(bVar2);
                    homeSingleFocusCardViewBinder.O0(new HomeBaseSingleFocusCardComponent$heartButtonSetUp$1(homeSingleFocusCardViewBinder, s81, w51));
                }
            } else if (key.equals("showMoreClick")) {
                p81 data = ((o81) entry.getValue()).data();
                String string = data.string("title");
                if (string == null) {
                    string = "";
                }
                String[] stringArray = data.stringArray("uris");
                if (stringArray == null) {
                    stringArray = new String[0];
                }
                if (!kotlin.text.e.n(string)) {
                    if (stringArray.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        homeSingleFocusCardViewBinder.L1(string);
                        homeSingleFocusCardViewBinder.x2(new HomeBaseSingleFocusCardComponent$showMoreButtonSetUp$1(s81, stringArray, w51));
                    }
                }
            }
        }
        i91.b(w51.b()).e("click").d(s81).c(homeSingleFocusCardViewBinder.getView()).a();
    }

    @Override // androidx.lifecycle.g
    public void d0(n nVar) {
        h.e(nVar, "owner");
        for (Map.Entry<Integer, q> entry : this.a.entrySet()) {
            entry.getValue().c();
        }
        this.a.clear();
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.STACKABLE)");
        return of;
    }

    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        g gVar = new g(this.f, this.o, this.n, viewGroup);
        gVar.getView().setTag(C0707R.id.glue_viewholder_tag, gVar);
        return gVar.getView();
    }

    @Override // androidx.lifecycle.g
    public void h0(n nVar) {
        h.e(nVar, "owner");
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
