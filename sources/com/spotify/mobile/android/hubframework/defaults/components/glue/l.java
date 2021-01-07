package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import defpackage.s51;
import java.util.EnumSet;
import java.util.List;

public class l extends h<gb0> {
    private final HubsGlueImageDelegate c;

    public l(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.noneOf(GlueLayoutTraits.Trait.class), gb0.class);
        hubsGlueImageDelegate.getClass();
        this.c = hubsGlueImageDelegate;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g90, s81, w51, s51$b] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
    public void a(gb0 gb0, s81 s81, w51 w51, s51.b bVar) {
        gb0 gb02 = gb0;
        gb02.setTitle(s81.text().title());
        gb02.setSubtitle(s81.text().description());
        ImageView imageView = gb02.D2().getImageView();
        if (imageView != null) {
            String icon = s81.images().icon();
            x81 main = s81.images().main();
            if (icon != null) {
                this.c.a(imageView);
                SpotifyIconV2 orNull = n71.a(icon).orNull();
                SpotifyIconDrawable spotifyIconDrawable = null;
                r2 = null;
                Integer num = null;
                if (orNull != null) {
                    SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(gb02.getView().getContext(), orNull, (float) nud.g(64.0f, gb02.getView().getResources()));
                    String string = s81.custom().string("iconColor");
                    if (string != null) {
                        try {
                            num = Integer.valueOf(Color.parseColor(string));
                        } catch (IllegalArgumentException unused) {
                            Logger.d("Could not parse color for icon in EmptyView", new Object[0]);
                        }
                    }
                    if (num != null) {
                        spotifyIconDrawable2.r(num.intValue());
                    }
                    spotifyIconDrawable = spotifyIconDrawable2;
                }
                gb02.D2().c(spotifyIconDrawable);
            } else if (main != null) {
                gb02.D2().b(true);
                this.c.d(imageView, main, HubsGlueImageConfig.CARD);
            }
        }
        List<? extends s81> children = s81.children();
        if (children.size() >= 1) {
            gb02.b2(true);
            Button i = gb02.i();
            s81 s812 = (s81) children.get(0);
            i.setText(s812.text().title());
            t51.a(w51, i, s812);
        } else {
            gb02.b2(false);
        }
        if (children.size() >= 2) {
            gb02.D2().a(true);
            Button d = gb02.D2().d();
            s81 s813 = (s81) children.get(1);
            d.setText(s813.text().title());
            t51.a(w51, d, s813);
            return;
        }
        gb02.D2().a(false);
    }

    /* Return type fixed from 'g90' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
    public gb0 f(Context context, ViewGroup viewGroup, w51 w51) {
        return e90.c().a(viewGroup.getContext(), viewGroup);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g90, s81, s51$a, int[]] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
    public void g(gb0 gb0, s81 s81, s51.a aVar, int[] iArr) {
        Button button;
        gb0 gb02 = gb0;
        int length = iArr.length;
        if (length == 0) {
            g91.a(gb02.getView(), s81, aVar, iArr);
        } else if (length == 1) {
            int i = iArr[0];
            if (i == 0) {
                button = gb02.i();
            } else if (i != 1) {
                button = null;
            } else {
                button = gb02.D2().d();
            }
            if (button != null) {
                g91.a(button, (s81) s81.children().get(i), aVar, h91.a);
                return;
            }
            throw new IllegalArgumentException(je.q0("No child at ", i, " position"));
        } else {
            throw new UnsupportedOperationException("Empty states have at most one generation of children");
        }
    }
}
