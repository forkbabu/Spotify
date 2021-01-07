package com.spotify.music.homecomponents.card;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder;
import com.squareup.picasso.Picasso;

public class g extends fo9 {
    public static final q81 o = z81.d("home:cardSmall", HubsComponentCategory.CARD.d());

    protected g(Context context, Picasso picasso, po9 po9, m71 m71, w50 w50) {
        super(context, picasso, po9, m71, w50);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_card_small_component;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.fo9
    public HomeCardViewBinder.CardSize f() {
        return HomeCardViewBinder.CardSize.SMALL;
    }
}
