package com.spotify.android.glue.components.card.glue;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.android.glue.components.card.Card;
import com.spotify.android.glue.components.card.CardAppearance;
import com.spotify.android.glue.components.card.a;

public class b {
    public Card a(Context context, ViewGroup viewGroup) {
        return new a(new CardView(context, null), CardAppearance.NO_TEXT);
    }

    public com.spotify.android.glue.components.card.b b(Context context) {
        return new a(new CardView(context, null), CardAppearance.TITLE_AND_METADATA);
    }

    public com.spotify.android.glue.components.card.b c(Context context) {
        return new a(new CardView(context, null), CardAppearance.TITLE_AND_SUBTITLE);
    }

    public a d(Context context) {
        return new a(new CardView(context, null), CardAppearance.TITLE_ONLY);
    }

    public Card e(Context context) {
        return new a(new CardView(context, null), CardAppearance.DESCRIPTION_ONLY);
    }

    public Card f(Context context) {
        return new a(new CardView(context, null), CardAppearance.LARGE_DESCRIPTION_ONLY);
    }

    public Card g(Context context) {
        return new a(new CardView(context, null), CardAppearance.LARGE_NO_TEXT);
    }
}
