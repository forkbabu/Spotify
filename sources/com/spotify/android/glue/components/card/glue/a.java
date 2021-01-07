package com.spotify.android.glue.components.card.glue;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.spotify.android.glue.components.card.Card;
import com.spotify.android.glue.components.card.CardAppearance;
import com.spotify.android.glue.components.card.b;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable;

public class a implements b, com.spotify.android.glue.components.card.a {
    private final CardView a;

    a(View view, CardAppearance cardAppearance) {
        CardView cardView = (CardView) view;
        this.a = cardView;
        cardView.setAppearance(cardAppearance);
    }

    @Override // com.spotify.android.glue.components.card.Card
    public ImageView getImageView() {
        return this.a.getImageView();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.android.glue.components.card.Card
    public void m0(CharSequence charSequence, Drawable drawable) {
        if (drawable == null) {
            this.a.setTitle(charSequence);
        } else {
            this.a.setTitle(l70.n(charSequence, drawable));
        }
    }

    @Override // com.spotify.android.glue.components.card.Card
    public void setAccessoryDrawable(CardAccessoryDrawable cardAccessoryDrawable) {
        this.a.setAccessoryDrawable(cardAccessoryDrawable);
    }

    @Override // defpackage.f90
    public void setActive(boolean z) {
        this.a.setActive(z);
    }

    @Override // com.spotify.android.glue.components.card.b
    public void setSubtitle(CharSequence charSequence) {
        this.a.setSubtitle(charSequence);
    }

    @Override // com.spotify.android.glue.components.card.Card
    public void setTextLayout(Card.TextLayout textLayout) {
        this.a.setTextLayout(textLayout);
    }

    @Override // com.spotify.android.glue.components.card.Card
    public void setTitle(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }
}
