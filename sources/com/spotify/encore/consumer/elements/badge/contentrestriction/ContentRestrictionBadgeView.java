package com.spotify.encore.consumer.elements.badge.contentrestriction;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.badge.contentrestriction.AgeRestrictionDrawable;
import com.spotify.encore.consumer.elements.badge.util.TextBadgeDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageView;
import kotlin.f;

public class ContentRestrictionBadgeView extends StateListAnimatorImageView implements ContentRestrictionBadge {
    private static final String EXPLICIT_TEXT = "E";

    /* renamed from: com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$spotify$encore$consumer$elements$badge$contentrestriction$ContentRestriction;

        static {
            ContentRestriction.values();
            int[] iArr = new int[3];
            $SwitchMap$com$spotify$encore$consumer$elements$badge$contentrestriction$ContentRestriction = iArr;
            try {
                ContentRestriction contentRestriction = ContentRestriction.Over19Only;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$spotify$encore$consumer$elements$badge$contentrestriction$ContentRestriction;
                ContentRestriction contentRestriction2 = ContentRestriction.Explicit;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ContentRestrictionBadgeView(Context context) {
        super(context);
    }

    private AgeRestrictionDrawable getOrCreateAgeRestrictionDrawable() {
        Drawable drawable = getDrawable();
        if (drawable instanceof AgeRestrictionDrawable) {
            return (AgeRestrictionDrawable) drawable;
        }
        return new AgeRestrictionDrawable(getContext(), R.style.TextAppearance_Encore_Badge, AgeRestrictionDrawable.Restriction.OVER_19);
    }

    private TextBadgeDrawable getOrCreateTextBadgeDrawable(String str) {
        Drawable drawable = getDrawable();
        if (drawable instanceof TextBadgeDrawable) {
            return (TextBadgeDrawable) drawable;
        }
        return new TextBadgeDrawable(getContext(), R.style.TextAppearance_Encore_Badge, str);
    }

    private void hideBadge() {
        setImageDrawable(null);
        setVisibility(8);
    }

    private void show19() {
        setImageDrawable(getOrCreateAgeRestrictionDrawable());
        setContentDescription(getContext().getString(R.string.over_19_badge_content_description));
        setVisibility(0);
    }

    private void showExplicit() {
        setImageDrawable(getOrCreateTextBadgeDrawable(EXPLICIT_TEXT));
        setContentDescription(getContext().getString(R.string.explicit_badge_content_description));
        setVisibility(0);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Void, f> nmf) {
    }

    public ContentRestrictionBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void render(ContentRestriction contentRestriction) {
        int ordinal = contentRestriction.ordinal();
        if (ordinal == 0) {
            show19();
        } else if (ordinal != 1) {
            hideBadge();
        } else {
            showExplicit();
        }
    }

    public ContentRestrictionBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
