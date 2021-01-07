package com.spotify.music.carmode.nowplaying.podcast.view.speedbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.podcast.view.speedbutton.f;

public class PlaybackSpeedButton extends AppCompatImageButton implements f {
    private f.a a;

    public PlaybackSpeedButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        f.a aVar = this.a;
        if (aVar != null) {
            ((d) aVar).c();
        }
    }

    @Override // com.spotify.music.carmode.nowplaying.podcast.view.speedbutton.f
    public void setListener(f.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.music.carmode.nowplaying.podcast.view.speedbutton.f
    public void setSpeedIcon(int i) {
        setImageDrawable(mo2.h(getContext(), i));
    }

    public PlaybackSpeedButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.CENTER);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_speed_control));
        setOnClickListener(new a(this));
    }
}
