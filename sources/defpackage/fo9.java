package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder;
import com.spotify.music.homecomponents.card.i;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: fo9  reason: default package */
public abstract class fo9 implements Object<View>, pk9 {
    private final Context a;
    private final Picasso b;
    private final po9 c;
    private final m71 f;
    private final w50 n;

    protected fo9(Context context, Picasso picasso, po9 po9, m71 m71, w50 w50) {
        this.a = context;
        this.b = picasso;
        this.c = po9;
        this.f = m71;
        this.n = w50;
    }

    /* access modifiers changed from: protected */
    public void a(HomeCardViewBinder homeCardViewBinder, s81 s81) {
        x81 main = s81.images().main();
        Uri parse = (main == null || main.uri() == null) ? Uri.EMPTY : Uri.parse(main.uri());
        Drawable g = g(main);
        String str = "default";
        if (main != null) {
            str = main.custom().string("style", str);
        }
        homeCardViewBinder.a(parse, g, str);
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        HomeCardViewBinder homeCardViewBinder = (HomeCardViewBinder) l70.o(view, HomeCardViewBinder.class);
        homeCardViewBinder.n1(f());
        a(homeCardViewBinder, s81);
        homeCardViewBinder.setTitle(s81.text().title());
        homeCardViewBinder.setSubtitle(s81.text().subtitle());
        if (s81.custom().boolValue("downloadedBadge", false)) {
            String title = s81.text().title();
            String subtitle = s81.text().subtitle();
            if (!MoreObjects.isNullOrEmpty(title)) {
                homeCardViewBinder.Q1();
            } else if (!MoreObjects.isNullOrEmpty(subtitle)) {
                homeCardViewBinder.a1();
            }
        }
        boolean z = !TextUtils.isEmpty(s81.text().title());
        boolean z2 = !TextUtils.isEmpty(s81.text().subtitle());
        if (!z || !z2) {
            homeCardViewBinder.v1(HomeCardViewBinder.CardTextLines.TWO_LINES);
        } else {
            homeCardViewBinder.v1(HomeCardViewBinder.CardTextLines.ONE_LINE);
        }
        i91.b(w51.b()).e("click").d(s81).c(homeCardViewBinder.getView()).a();
        p81 bundle = s81.custom().bundle("accessibility");
        if (bundle != null) {
            p81 bundle2 = bundle.bundle("main");
            if (bundle2 != null) {
                homeCardViewBinder.setContentDescription(bundle2.string("label", ""));
            }
        } else {
            homeCardViewBinder.setContentDescription(null);
        }
        homeCardViewBinder.P(s81.text().accessory());
        homeCardViewBinder.f1(s81.custom().string("accessoryStyle", ""));
        n4.a(view, new eo9(this, s81, view));
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN);
    }

    /* access modifiers changed from: protected */
    public abstract HomeCardViewBinder.CardSize f();

    /* access modifiers changed from: protected */
    public Drawable g(x81 x81) {
        if (x81 == null || TextUtils.isEmpty(x81.placeholder())) {
            return a.d(this.a, C0707R.color.image_placeholder_color);
        }
        return this.f.b(x81.placeholder(), HubsGlueImageConfig.CARD);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        i iVar = new i(viewGroup.getContext(), viewGroup, this.b, this.c);
        iVar.getView().setTag(C0707R.id.glue_viewholder_tag, iVar);
        return iVar.getView();
    }

    public /* synthetic */ void i(s81 s81, View view) {
        this.n.a(s81, view, h60.a);
    }
}
