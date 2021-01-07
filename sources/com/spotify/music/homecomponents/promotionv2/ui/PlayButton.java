package com.spotify.music.homecomponents.promotionv2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;

public class PlayButton extends StateListAnimatorImageButton {
    private static final int[] b = {C0707R.attr.state_player_playing};
    private static final int[] c = {C0707R.attr.state_player_pausing};
    private boolean a;

    public PlayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        updateContentDescription();
    }

    private void updateContentDescription() {
        if (this.a) {
            setContentDescription(getContext().getString(C0707R.string.content_description_pause_button));
        } else {
            setContentDescription(getContext().getString(C0707R.string.content_description_play_button));
        }
    }

    public void f(boolean z) {
        this.a = z;
        updateContentDescription();
        refreshDrawableState();
    }

    public boolean g() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + 1), this.a ? c : b);
    }

    public PlayButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        updateContentDescription();
    }
}
