package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.Assertion;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;

@Deprecated
class h extends i<m90> {
    private final HubsGlueImageDelegate c;

    h(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN), m90.class);
        hubsGlueImageDelegate.getClass();
        this.c = hubsGlueImageDelegate;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g90, s81, w51, s51$b] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
    public void a(m90 m90, s81 s81, w51 w51, s51.b bVar) {
        m90 m902 = m90;
        String title = s81.text().title();
        boolean z = true;
        Assertion.l(!MoreObjects.isNullOrEmpty(title), "title is missing");
        x81 background = s81.images().background();
        if (background == null) {
            z = false;
        }
        Assertion.l(z, "background is missing");
        ImageView imageView = m902.getImageView();
        Picasso f = this.c.f();
        if (background != null) {
            Drawable e = this.c.e(background.placeholder(), HubsGlueImageConfig.CARD);
            z l = f.l(this.c.b(background.uri()));
            l.t(e);
            l.g(e);
            l.m(imageView);
        } else {
            f.b(imageView);
            imageView.setImageDrawable(null);
        }
        t51.a(w51, m902.getView(), s81);
        m902.setTitle(title);
        m902.m2(n71.a(s81.images().icon()).orNull());
    }

    /* Return type fixed from 'g90' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
    public m90 f(Context context, ViewGroup viewGroup, w51 w51) {
        m90 a = e90.b().a(context, viewGroup);
        a.t2(true);
        return a;
    }
}
