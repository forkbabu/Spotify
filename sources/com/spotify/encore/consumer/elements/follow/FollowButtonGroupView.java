package com.spotify.encore.consumer.elements.follow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.spotify.encore.consumer.elements.databinding.FollowButtonGroupLayoutBinding;
import com.spotify.encore.consumer.elements.follow.FollowButton;
import com.spotify.encore.consumer.elements.follow.FollowButtonGroup;
import com.spotify.encore.foundation.R;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class FollowButtonGroupView extends ConstraintLayout implements FollowButtonGroup {
    private final FollowButtonGroupLayoutBinding binding;

    public FollowButtonGroupView(Context context) {
        this(context, null, 0, 6, null);
    }

    public FollowButtonGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowButtonGroupView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Boolean, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new FollowButtonGroupView$onEvent$1(this, nmf));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowButtonGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        FollowButtonGroupLayoutBinding inflate = FollowButtonGroupLayoutBinding.inflate(LayoutInflater.from(context), this, true);
        h.d(inflate, "FollowButtonGroupLayoutB…rom(context), this, true)");
        this.binding = inflate;
    }

    public void render(FollowButtonGroup.Model model) {
        int i;
        h.e(model, "model");
        this.binding.followButtonGroupButton.render(new FollowButton.Model(model.isFollowed(), model.getContentDescContext()));
        if (model.isError()) {
            i = 17170445;
        } else {
            i = R.color.white;
        }
        ProgressBar progressBar = this.binding.followButtonGroupProgress;
        h.d(progressBar, "binding.followButtonGroupProgress");
        progressBar.setVisibility(model.isError() ? 0 : 8);
        this.binding.followButtonGroupButton.setTextColor(a.b(getContext(), i));
    }
}
