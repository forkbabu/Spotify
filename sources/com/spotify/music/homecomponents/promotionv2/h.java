package com.spotify.music.homecomponents.promotionv2;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.C0707R;
import com.spotify.player.model.PlayerState;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import io.reactivex.g;
import io.reactivex.y;
import java.util.EnumSet;

public class h implements Object<View>, pk9 {
    private final Picasso a;
    private final y b;
    private final w50 c;
    private final io.reactivex.disposables.a f = new io.reactivex.disposables.a();
    private final g<PlayerState> n;
    private String o;

    class a extends m {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            Logger.b("Stopping PlayerState subscription in Playable card component", new Object[0]);
            h.this.f.f();
        }
    }

    public h(Picasso picasso, g<PlayerState> gVar, y yVar, k kVar, w50 w50) {
        this.a = picasso;
        this.n = gVar;
        this.b = yVar;
        this.c = w50;
        kVar.y0(new a());
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        m mVar = (m) l70.o(view, m.class);
        String string = s81.custom().string("accentColor");
        if (!TextUtils.isEmpty(string) && sq9.c(string)) {
            mVar.a0(Color.parseColor(s81.custom().string("accentColor")));
        } else {
            mVar.o1();
        }
        x81 background = s81.images().background();
        String str = null;
        mVar.B(background != null ? background.uri() : null, background != null ? background.placeholder() : null);
        mVar.setSubtitle(s81.text().subtitle());
        mVar.j(s81.custom().string("label"));
        i91.b(w51.b()).e("click").d(s81).c(mVar.getView()).a();
        x81 x81 = (x81) s81.images().custom().get("logo");
        if (x81 != null) {
            str = x81.uri();
        }
        mVar.p1(str, s81.text().title());
        if (s81.events().containsKey("promotionPlayClick")) {
            o81 o81 = (o81) s81.events().get("promotionPlayClick");
            if (o81 != null) {
                this.f.f();
                this.o = HomePromotionPlayClickCommandHandler.d(o81);
                this.f.b(this.n.Q(this.b).subscribe(new c(this, mVar), d.a));
            }
            i91.b(w51.b()).e("promotionPlayClick").d(s81).c(mVar.m()).a();
        } else {
            mVar.h();
            this.f.f();
        }
        n4.a(view, new b(this, s81, view));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_promotion_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.TOP_ITEM);
    }

    public /* synthetic */ void f(m mVar, PlayerState playerState) {
        if (HomePromotionPlayClickCommandHandler.e(playerState, this.o)) {
            mVar.p();
        } else {
            mVar.x();
        }
    }

    public /* synthetic */ void g(s81 s81, View view) {
        this.c.a(s81, view, h60.a);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        l lVar = new l(this.a, viewGroup);
        lVar.getView().setTag(C0707R.id.glue_viewholder_tag, lVar);
        return lVar.getView();
    }
}
