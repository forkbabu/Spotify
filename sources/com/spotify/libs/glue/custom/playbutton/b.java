package com.spotify.libs.glue.custom.playbutton;

import android.view.View;
import android.widget.Button;
import com.spotify.music.C0707R;

final class b implements c {
    private final Button a;

    public b(Button button) {
        this.a = button;
        button.setId(C0707R.id.button_play);
    }

    private CharSequence c(int i) {
        return this.a.getContext().getString(i);
    }

    @Override // com.spotify.libs.glue.custom.playbutton.c
    public void a(boolean z) {
        this.a.setText(C0707R.string.play_button_pause);
        this.a.setContentDescription(c(C0707R.string.play_button_pause));
        this.a.requestLayout();
    }

    @Override // com.spotify.libs.glue.custom.playbutton.c
    public void b(boolean z) {
        if (z) {
            this.a.setText(C0707R.string.play_button_shuffle);
            this.a.setContentDescription(c(C0707R.string.play_button_shuffle));
        } else {
            this.a.setText(C0707R.string.play_button_play);
            this.a.setContentDescription(c(C0707R.string.play_button_play));
        }
        this.a.requestLayout();
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
