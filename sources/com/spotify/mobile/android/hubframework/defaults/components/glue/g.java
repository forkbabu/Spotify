package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.view.ViewGroup;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import defpackage.s51;
import java.util.EnumSet;

@Deprecated
class g extends h<m90> {
    private final HubsGlueImageDelegate c;

    g(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN), m90.class);
        hubsGlueImageDelegate.getClass();
        this.c = hubsGlueImageDelegate;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g90, s81, w51, s51$b] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
    public void a(m90 m90, s81 s81, w51 w51, s51.b bVar) {
        m90 m902 = m90;
        this.c.d(m902.getImageView(), s81.images().background(), HubsGlueImageConfig.CARD);
        t51.a(w51, m902.getView(), s81);
        m902.setTitle(s81.text().title());
        String icon = s81.images().icon();
        if (!MoreObjects.isNullOrEmpty(icon)) {
            m902.m2(n71.a(icon).or((Optional<SpotifyIconV2>) SpotifyIconV2.TRACK));
        }
        m902.t2(!rw.equal(s81.custom().string("glue:variant", "rounded"), "standard"));
    }

    /* Return type fixed from 'g90' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
    public m90 f(Context context, ViewGroup viewGroup, w51 w51) {
        return e90.b().a(context, viewGroup);
    }
}
