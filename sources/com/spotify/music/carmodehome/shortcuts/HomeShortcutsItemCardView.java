package com.spotify.music.carmodehome.shortcuts;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.card.StateListAnimatorCardView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.c0;
import com.squareup.picasso.r;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;

public final class HomeShortcutsItemCardView extends StateListAnimatorCardView {
    private r t;
    private final ImageView u;
    private final TextView v;

    public HomeShortcutsItemCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final ImageView getImageView$apps_music_features_car_mode_home() {
        return this.u;
    }

    public final TextView getTitleView$apps_music_features_car_mode_home() {
        return this.v;
    }

    public final void p(Uri uri, Drawable drawable) {
        h.e(uri, "image");
        h.e(drawable, "placeholder");
        r rVar = this.t;
        if (rVar != null) {
            z c = rVar.c(uri);
            c.t(drawable);
            c.g(drawable);
            c.m(this.u);
            return;
        }
        h.k("instrumentingImageRequest");
        throw null;
    }

    public final void setPicasso(Picasso picasso) {
        h.e(picasso, "picasso");
        this.t = new r(new c0(picasso), getContext());
    }

    public final void setTitle(CharSequence charSequence) {
        h.e(charSequence, "titleText");
        this.v.setText(charSequence);
    }

    public final void setTitleActive(boolean z) {
        this.v.setActivated(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeShortcutsItemCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        LayoutInflater.from(context).inflate(C0707R.layout.home_shortcuts_item_card, this);
        setRadius((float) getResources().getDimensionPixelSize(C0707R.dimen.shortcut_item_background_transformation_radius_size));
        setCardElevation(0.0f);
        setCardBackgroundColor(a.b(context, R.color.white_10));
        View findViewById = findViewById(C0707R.id.shortcuts_item_image);
        h.d(findViewById, "findViewById(R.id.shortcuts_item_image)");
        ImageView imageView = (ImageView) findViewById;
        this.u = imageView;
        View findViewById2 = findViewById(C0707R.id.shortcuts_item_title);
        h.d(findViewById2, "findViewById(R.id.shortcuts_item_title)");
        TextView textView = (TextView) findViewById2;
        this.v = textView;
        setClickable(true);
        bvd c = dvd.c(this);
        c.g(textView);
        c.f(imageView);
        c.a();
    }
}
