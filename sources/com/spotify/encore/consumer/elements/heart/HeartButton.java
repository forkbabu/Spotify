package com.spotify.encore.consumer.elements.heart;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.heart.Heart;
import com.spotify.encore.consumer.elements.quickactions.ActionIconUtils;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class HeartButton extends StateListAnimatorImageButton implements Heart {
    private final Drawable activeHeart;
    private final Drawable heart;
    private boolean isHearted;

    public HeartButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public HeartButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeartButton(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Boolean, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new HeartButton$onEvent$1(this, nmf));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeartButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.encore_action_button_icon_size);
        int i2 = R.color.encore_accessory_white;
        int[] iArr = R.styleable.HeartButton;
        h.d(iArr, "R.styleable.HeartButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.HeartButton_iconSize, dimensionPixelSize);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.HeartButton_heartOutlineColor, i2);
        obtainStyledAttributes.recycle();
        SpotifyIconDrawable iconDrawable = ActionIconUtils.getIconDrawable(context, SpotifyIconV2.HEART_ACTIVE, R.color.encore_accessory_green, dimensionPixelSize2);
        h.d(iconDrawable, "getIconDrawable(context,…ccessory_green, iconSize)");
        this.activeHeart = iconDrawable;
        SpotifyIconDrawable iconDrawable2 = ActionIconUtils.getIconDrawable(context, SpotifyIconV2.HEART, resourceId, dimensionPixelSize2);
        h.d(iconDrawable2, "getIconDrawable(context,…utlineColorRes, iconSize)");
        this.heart = iconDrawable2;
    }

    public void render(Heart.Model model) {
        h.e(model, "model");
        boolean isLiked = model.isLiked();
        this.isHearted = isLiked;
        setImageDrawable(isLiked ? this.activeHeart : this.heart);
        Resources resources = getResources();
        h.d(resources, "resources");
        setContentDescription(ContentDescriptionHelperKt.getContentDescription(resources, this.isHearted, model.getContentDescContext()));
    }
}
