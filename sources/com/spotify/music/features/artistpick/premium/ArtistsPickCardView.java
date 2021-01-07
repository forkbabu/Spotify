package com.spotify.music.features.artistpick.premium;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.glue.components.card.Card;
import com.spotify.android.glue.components.card.b;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable;
import com.spotify.paste.widgets.layouts.PasteLinearLayout;

public class ArtistsPickCardView extends PasteLinearLayout implements b {
    private final ImageView o;
    private final TextView p;
    private final TextView q;
    private final ImageView r;
    private final TextView s;
    private final e14 t;
    private final yud u;

    public ArtistsPickCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.paste.widgets.layouts.PasteLinearLayout, android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        int length = drawableState.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            z |= drawableState[i] == -16842910;
        }
        if (z) {
            setAlpha(0.4f);
        }
        this.u.a();
    }

    public ImageView getCommentImageView() {
        return this.r;
    }

    @Override // com.spotify.android.glue.components.card.Card
    public ImageView getImageView() {
        return this.o;
    }

    public TextView getSubtitleView() {
        return this.q;
    }

    public TextView getTitleView() {
        return this.p;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this;
    }

    @Override // com.spotify.paste.widgets.layouts.PasteLinearLayout, android.view.View, android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.u.c();
    }

    @Override // com.spotify.android.glue.components.card.Card
    public void m0(CharSequence charSequence, Drawable drawable) {
        setTitle(charSequence);
    }

    @Override // com.spotify.android.glue.components.card.Card
    public void setAccessoryDrawable(CardAccessoryDrawable cardAccessoryDrawable) {
        Assertion.g("This operation is not supported");
    }

    public void setComment(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    public void setImageResource(int i) {
        this.o.setImageResource(i);
    }

    @Override // com.spotify.android.glue.components.card.b
    public void setSubtitle(CharSequence charSequence) {
        this.q.setText(charSequence);
    }

    @Override // com.spotify.android.glue.components.card.Card
    public void setTextLayout(Card.TextLayout textLayout) {
    }

    @Override // com.spotify.android.glue.components.card.Card
    public void setTitle(CharSequence charSequence) {
        this.p.setText(charSequence);
    }

    public ArtistsPickCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new yud(this);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(C0707R.layout.artistspick_card, this);
        this.t = new e14(this);
        ImageView imageView = (ImageView) findViewById(16908294);
        this.o = imageView;
        TextView textView = (TextView) findViewById(C0707R.id.title);
        this.p = textView;
        TextView textView2 = (TextView) findViewById(C0707R.id.subtitle);
        this.q = textView2;
        ImageView imageView2 = (ImageView) findViewById(C0707R.id.artistspick_comment_image);
        this.r = imageView2;
        TextView textView3 = (TextView) findViewById(C0707R.id.artistspick_comment_text);
        this.s = textView3;
        TextView[] textViewArr = {textView, textView2};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(this);
        setClickable(true);
        bvd b = dvd.b(this);
        b.f(imageView, imageView2);
        b.g(textView, textView2, textView3);
        b.a();
    }
}
