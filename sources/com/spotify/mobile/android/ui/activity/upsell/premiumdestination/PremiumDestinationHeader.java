package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.music.C0707R;

public class PremiumDestinationHeader extends GlueHeaderView {
    private o p;

    public PremiumDestinationHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o getContent() {
        return this.p;
    }

    public PremiumDestinationHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c c = l70.c(getContext(), this);
        ((e) c).setTitle(getResources().getString(C0707R.string.in_app_premium_destination_nav_title_go_premium));
        setGlueToolbar(c);
        this.p = new o(getContext(), this);
        oc0 b = rc0.b(this);
        b.F1(this.p);
        setAccessoryMargin(getResources().getDimensionPixelSize(C0707R.dimen.std_16dp) + (getResources().getDimensionPixelSize(C0707R.dimen.cat_button_height) / 2));
        setContentViewBinder(b);
        getBackgroundImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        getBackgroundImageView().setImageResource(C0707R.drawable.bg_premium_destination);
    }
}
