package com.spotify.encore.consumer.elements.badge.lyrics;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.badge.util.TextBadgeDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageView;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class LyricsBadgeView extends StateListAnimatorImageView {
    public LyricsBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LyricsBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LyricsBadgeView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LyricsBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setImageDrawable(new TextBadgeDrawable(context, R.style.TextAppearance_Encore_Badge, "LYRICS"));
        setContentDescription(context.getString(R.string.lyrics_badge_content_description));
    }
}
