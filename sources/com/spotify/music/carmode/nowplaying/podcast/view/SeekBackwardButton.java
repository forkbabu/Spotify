package com.spotify.music.carmode.nowplaying.podcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.seekbackward.h;
import com.spotify.nowplaying.ui.components.controls.seekbackward.j;

public class SeekBackwardButton extends AppCompatImageButton implements j {
    private j.a a;

    public SeekBackwardButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        j.a aVar = this.a;
        if (aVar != null) {
            ((h) aVar).c();
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbackward.j
    public void setListener(j.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbackward.j
    public void setSeekBackwardEnabled(boolean z) {
        setEnabled(z);
    }

    public SeekBackwardButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(mo2.m(getContext()));
        setScaleType(ImageView.ScaleType.CENTER);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_skip_back_15));
        setOnClickListener(new a(this));
    }
}
