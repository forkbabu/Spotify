package com.spotify.encore.consumer.elements.badge.premium;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.badge.util.TextBadgeDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageView;
import kotlin.f;

public class PremiumBadgeView extends StateListAnimatorImageView implements PremiumBadge {
    private static final String TEXT = "PREMIUM";
    private TextBadgeDrawable mTextDrawable;

    public PremiumBadgeView(Context context) {
        this(context, null);
    }

    private void updateTextDrawable(boolean z) {
        if (z && this.mTextDrawable == null) {
            TextBadgeDrawable textBadgeDrawable = new TextBadgeDrawable(getContext(), R.style.TextAppearance_Encore_Badge, TEXT);
            this.mTextDrawable = textBadgeDrawable;
            setImageDrawable(textBadgeDrawable);
            setContentDescription(getContext().getString(R.string.premium_badge_content_description));
        }
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Void, f> nmf) {
    }

    public PremiumBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void render(Boolean bool) {
        updateTextDrawable(bool.booleanValue());
        setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public PremiumBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        updateTextDrawable(getVisibility() == 0);
    }
}
