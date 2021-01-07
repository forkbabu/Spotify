package com.spotify.music.nowplaying.ads.view.nextbutton;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.nowplaying.ui.components.controls.next.NextButton;

public class AudioAdsNextButton extends NextButton {
    private int b = getResources().getInteger(17694721);

    public AudioAdsNextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.NextButton, com.spotify.nowplaying.ui.components.controls.next.i
    public void setNextVisible(boolean z) {
        if (!z) {
            setVisibility(4);
        } else if (getVisibility() != 0) {
            setAlpha(0.0f);
            setVisibility(0);
            animate().alpha(1.0f).setDuration((long) this.b).setListener(null);
        }
    }

    public AudioAdsNextButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
