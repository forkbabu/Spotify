package com.spotify.encore.consumer.elements.follow;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.core.widget.c;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.follow.FollowButton;
import com.spotify.paste.widgets.internal.StateListAnimatorToggleButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class FollowButtonView extends StateListAnimatorToggleButton implements FollowButton {
    public FollowButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public FollowButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowButtonView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Boolean, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new FollowButtonView$onEvent$1(this, nmf));
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setBackground(a.d(context, R.drawable.encore_element_follow_button_background));
        c.n(this, com.spotify.encore.foundation.R.style.TextAppearance_Encore_MinuetBold);
        int dimension = (int) getResources().getDimension(R.dimen.follow_button_padding);
        setPadding(dimension, dimension, dimension, dimension);
        setGravity(17);
    }

    public void render(FollowButton.Model model) {
        CharSequence charSequence;
        h.e(model, "model");
        super.setChecked(model.isFollowed());
        if (model.isFollowed()) {
            charSequence = getContext().getText(R.string.follow_button_selected_state_text);
        } else {
            charSequence = getContext().getText(R.string.follow_button_unselected_state_text);
        }
        setText(charSequence);
        Resources resources = getResources();
        h.d(resources, "resources");
        setContentDescription(ContentDescriptionHelperKt.getContentDescription(resources, model.isFollowed(), model.getContentDescContext()));
    }
}
