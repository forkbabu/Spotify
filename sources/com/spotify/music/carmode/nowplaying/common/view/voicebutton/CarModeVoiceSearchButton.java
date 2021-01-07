package com.spotify.music.carmode.nowplaying.common.view.voicebutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.common.view.voicebutton.e;

public class CarModeVoiceSearchButton extends AppCompatImageButton implements e {
    private e.a a;

    public CarModeVoiceSearchButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        e.a aVar = this.a;
        if (aVar != null) {
            ((c) aVar).d();
        }
    }

    @Override // com.spotify.music.carmode.nowplaying.common.view.voicebutton.e
    public void setListener(e.a aVar) {
        this.a = aVar;
    }

    public CarModeVoiceSearchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(mo2.q(getContext()));
        setScaleType(ImageView.ScaleType.CENTER);
        setContentDescription(getResources().getString(C0707R.string.voice_mic_button_content_desc));
        setOnClickListener(new a(this));
    }
}
