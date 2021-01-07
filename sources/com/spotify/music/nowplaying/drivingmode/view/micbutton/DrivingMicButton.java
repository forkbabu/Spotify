package com.spotify.music.nowplaying.drivingmode.view.micbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.j;
import com.spotify.music.nowplaying.drivingmode.view.micbutton.b;

public class DrivingMicButton extends AppCompatImageButton implements b {
    private b.a a;

    public DrivingMicButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    private void g() {
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setImageDrawable(fvb.u(getContext(), R.color.black, R.color.gray_70, C0707R.dimen.driving_voice_mic_icon_scale));
        setOnClickListener(new a(this));
    }

    public void h(View view) {
        b.a aVar = this.a;
        if (aVar != null) {
            ((j) aVar).j();
        }
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.micbutton.b
    public void setListener(b.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.micbutton.b
    public void setMicButtonEnabled(boolean z) {
        setClickable(z);
        setActivated(z);
        setEnabled(z);
    }

    public DrivingMicButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
    }
}
