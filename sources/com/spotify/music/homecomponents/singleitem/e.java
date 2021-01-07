package com.spotify.music.homecomponents.singleitem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.C0707R;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import io.reactivex.g;
import io.reactivex.y;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class e implements Object<View>, pk9 {
    private final Context a;
    private final Picasso b;
    private final m71 c;
    private final y f;
    private final w50 n;
    private final g<PlayerState> o;
    final Map<String, p> p = new HashMap();

    class a extends m {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            Logger.b("Stopping PlayerState subscription in HomeSingleItemComponent", new Object[0]);
            for (p pVar : e.this.p.values()) {
                pVar.a();
            }
            e.this.p.clear();
        }
    }

    public e(Context context, Picasso picasso, g<PlayerState> gVar, k kVar, y yVar, m71 m71, w50 w50) {
        this.a = context;
        this.b = picasso;
        this.c = m71;
        this.o = gVar;
        this.f = yVar;
        this.n = w50;
        kVar.y0(new a());
    }

    public /* synthetic */ void a(s81 s81, View view) {
        this.n.a(s81, view, h60.a);
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        Drawable drawable;
        j jVar = (j) l70.o(view, j.class);
        jVar.setTitle(s81.text().title());
        jVar.setSubtitle(s81.text().subtitle());
        x81 main = s81.images().main();
        Uri parse = main != null ? Uri.parse(MoreObjects.nullToEmpty(main.uri())) : Uri.EMPTY;
        if (main == null || MoreObjects.isNullOrEmpty(main.placeholder())) {
            drawable = androidx.core.content.a.d(this.a, C0707R.color.image_placeholder_color);
        } else {
            drawable = this.c.b(main.placeholder(), HubsGlueImageConfig.THUMBNAIL);
        }
        String str = "default";
        if (main != null) {
            str = main.custom().string("style", str);
        }
        jVar.a(parse, drawable, str);
        i91.b(w51.b()).e("click").d(s81).c(jVar.getView()).a();
        String string = s81.metadata().string("uri", "");
        p pVar = this.p.get(string);
        o81 o81 = (o81) s81.events().get("singleItemButtonClick");
        if (pVar != null) {
            pVar.a();
        }
        if (o81 != null) {
            p pVar2 = new p();
            pVar2.b(this.o.Q(this.f).subscribe(new a(string, jVar), new b(jVar)));
            this.p.put(string, pVar2);
        }
        i91.b(w51.b()).e("singleItemButtonClick").d(s81).c(jVar.m()).a();
        n4.a(view, new c(this, s81, view));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_single_item_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        i iVar = new i(viewGroup.getContext(), viewGroup, this.b);
        iVar.getView().setTag(C0707R.id.glue_viewholder_tag, iVar);
        return iVar.getView();
    }
}
