package com.spotify.music.homecomponents.card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder;
import com.squareup.picasso.Picasso;

public class j extends fo9 {
    private final Context o;

    protected j(Context context, Picasso picasso, po9 po9, m71 m71, w50 w50) {
        super(context, picasso, po9, m71, w50);
        this.o = context;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.fo9
    public void a(HomeCardViewBinder homeCardViewBinder, s81 s81) {
        x81 main = s81.images().main();
        Drawable g = oi0.g(this.o);
        Drawable g2 = g(main);
        String str = "default";
        if (main != null) {
            str = main.custom().string("style", str);
        }
        homeCardViewBinder.D(g, g2, str);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_card_your_episodes_component;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.fo9
    public HomeCardViewBinder.CardSize f() {
        return HomeCardViewBinder.CardSize.SMALL;
    }
}
