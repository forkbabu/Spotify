package com.spotify.encore.consumer.elements.backbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class BackButtonView extends StateListAnimatorImageButton implements BackButton {
    public BackButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BackButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BackButtonView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super kotlin.f, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new BackButtonView$onEvent$1(nmf));
    }

    public void render(Void r1) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.ARROW_LEFT, context.getResources().getDimension(R.dimen.encore_back_button_icon_size));
        spotifyIconDrawable.s(a.c(context, R.color.encore_accessory_white));
        setImageDrawable(spotifyIconDrawable);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setContentDescription(context.getResources().getString(R.string.back_button_content_description));
    }
}
