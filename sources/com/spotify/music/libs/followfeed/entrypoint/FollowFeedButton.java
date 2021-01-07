package com.spotify.music.libs.followfeed.entrypoint;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.h;

public final class FollowFeedButton extends StateListAnimatorImageButton implements b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFeedButton(Context context) {
        super(context);
        h.e(context, "context");
        setBackground(null);
        g(false);
    }

    private final void g(boolean z) {
        setImageDrawable(i0.b(getContext(), z ? C0707R.drawable.ic_followfeed_badged : C0707R.drawable.ic_followfeed));
    }

    @Override // com.spotify.music.libs.followfeed.entrypoint.b
    public void setBadged(boolean z) {
        g(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFeedButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        setBackground(null);
        g(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFeedButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setBackground(null);
        g(false);
    }
}
