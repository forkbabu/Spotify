package com.spotify.libs.glue.custom.playbutton;

import android.content.Context;
import android.view.View;
import com.spotify.libs.glue.custom.playbutton.RoundPlayButtonView;
import com.spotify.music.C0707R;

final class g implements c {
    private final RoundPlayButtonView a;

    g(Context context) {
        RoundPlayButtonView roundPlayButtonView = new RoundPlayButtonView(context);
        this.a = roundPlayButtonView;
        roundPlayButtonView.setId(C0707R.id.button_play);
    }

    private CharSequence c(int i) {
        return this.a.getContext().getText(i);
    }

    @Override // com.spotify.libs.glue.custom.playbutton.c
    public void a(boolean z) {
        this.a.setMainIconState(RoundPlayButtonView.IconState.PAUSE);
        this.a.setShowShuffleIcon(z);
        this.a.setContentDescription(c(C0707R.string.play_button_pause));
    }

    @Override // com.spotify.libs.glue.custom.playbutton.c
    public void b(boolean z) {
        this.a.setMainIconState(RoundPlayButtonView.IconState.PLAY);
        this.a.setShowShuffleIcon(z);
        if (z) {
            this.a.setContentDescription(c(C0707R.string.play_button_shuffle));
        } else {
            this.a.setContentDescription(c(C0707R.string.play_button_play));
        }
    }

    @Override // com.spotify.libs.glue.custom.playbutton.c
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.libs.glue.custom.playbutton.c
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
