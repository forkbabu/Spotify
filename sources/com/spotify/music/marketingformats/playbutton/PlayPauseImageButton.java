package com.spotify.music.marketingformats.playbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.h;

public final class PlayPauseImageButton extends StateListAnimatorImageButton implements cib {
    private static final int[] b = {C0707R.attr.state_playback_action_play};
    private static final int[] c = {C0707R.attr.state_playback_action_pause};
    private boolean a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayPauseImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
    }

    public final boolean g() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] mergeDrawableStates = ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + 1), this.a ? c : b);
        h.d(mergeDrawableStates, "mergeDrawableStates(drawableState, newState)");
        return mergeDrawableStates;
    }

    @Override // defpackage.cib
    public void setPlaybackState(boolean z) {
        this.a = z;
        refreshDrawableState();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayPauseImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}
