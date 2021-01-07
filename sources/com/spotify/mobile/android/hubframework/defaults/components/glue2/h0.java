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
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;

public class h0 extends i<ba0> {
    private final HubsGlueImageDelegate c;

    public h0(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.of(GlueLayoutTraits.Trait.STACKABLE), ba0.class);
        hubsGlueImageDelegate.getClass();
        this.c = hubsGlueImageDelegate;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g90, s81, w51, s51$b] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
    public void a(ba0 ba0, s81 s81, w51 w51, s51.b bVar) {
        ba0 ba02 = ba0;
        String title = s81.text().title();
        String subtitle = s81.text().subtitle();
        String accessory = s81.text().accessory();
        x81 main = s81.images().main();
        boolean z = true;
        Assertion.l(!MoreObjects.isNullOrEmpty(title), "title not set");
        Assertion.l(!MoreObjects.isNullOrEmpty(subtitle), "subtitle not set");
        Assertion.l(!MoreObjects.isNullOrEmpty(accessory), "accesory not set");
        if (main == null) {
            z = false;
        }
        Assertion.l(z, "main image not set");
        ba02.setTitle(title);
        String subtitle2 = s81.text().subtitle();
        if (MoreObjects.isNullOrEmpty(subtitle2)) {
            ba02.setSubtitle(null);
        } else if (rw.equal(s81.custom().string("subtitleStyle", ""), "metadata")) {
            ba02.e(subtitle2);
        } else {
            ba02.setSubtitle(subtitle2);
        }
        ba02.H(accessory);
        ImageView imageView = ba02.getImageView();
        Picasso f = this.c.f();
        if (main != null) {
            Drawable e = this.c.e(main.placeholder(), HubsGlueImageConfig.THUMBNAIL);
            z l = f.l(this.c.b(main.uri()));
            l.t(e);
            l.g(e);
            l.m(imageView);
        } else {
            f.b(imageView);
            imageView.setImageDrawable(null);
        }
        ba02.setActive(s81.custom().boolValue("active", false));
        i91.a(ba02.getView());
        t51.a(w51, ba02.getView(), s81);
        if (s81.events().containsKey("longClick")) {
            i91.b(w51.b()).e("longClick").d(s81).c(ba02.getView()).b();
        }
        a.a(ba02, s81, w51);
    }

    /* Return type fixed from 'g90' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
    public ba0 f(Context context, ViewGroup viewGroup, w51 w51) {
        e90.d().getClass();
        ca0 ca0 = new ca0(l70.l(context, viewGroup, C0707R.layout.glue_listtile_2_landscape_image));
        ca0.getView().setTag(C0707R.id.glue_viewholder_tag, ca0);
        return ca0;
    }
}
