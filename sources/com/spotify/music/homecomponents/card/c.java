package com.spotify.music.homecomponents.card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.android.glue.gradients.factory.GlueGradients;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder;
import com.spotify.paste.graphics.drawable.e;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;

public class c extends fo9 {
    private final Context o;

    private static class a extends LayerDrawable {
        a(Drawable[] drawableArr) {
            super(drawableArr);
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return -1;
        }
    }

    protected c(Context context, Picasso picasso, po9 po9, m71 m71, w50 w50) {
        super(context, picasso, po9, m71, w50);
        this.o = context;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.fo9
    public void a(HomeCardViewBinder homeCardViewBinder, s81 s81) {
        x81 main = s81.images().main();
        int g = nud.g(150.0f, this.o.getResources());
        float g2 = (float) nud.g(50.0f, this.o.getResources());
        a aVar = new a(new Drawable[]{GlueGradients.a(this.o, GlueGradients.Style.AQUATIC, false), new e(new SpotifyIconDrawable(this.o, SpotifyIconV2.HEART_ACTIVE, g2), g2 / ((float) g), 0)});
        Drawable g3 = g(main);
        String str = "default";
        if (main != null) {
            str = main.custom().string("style", str);
        }
        homeCardViewBinder.D(aVar, g3, str);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_card_liked_songs_component;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.fo9
    public HomeCardViewBinder.CardSize f() {
        return HomeCardViewBinder.CardSize.SMALL;
    }
}
