package com.spotify.music.carmode.nowplaying.podcast.view.speedmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.g;

public class PlaybackSpeedMenuButton extends AppCompatImageButton implements g {
    private g.a a;

    public PlaybackSpeedMenuButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        g.a aVar = this.a;
        if (aVar != null) {
            ((h) aVar).c(this);
        }
    }

    @Override // com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.g
    public void setDescription(int i) {
        setContentDescription(getContext().getString(i));
    }

    @Override // com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.g
    public void setListener(g.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.g
    public void setSpeedIcon(int i) {
        setImageDrawable(mo2.h(getContext(), i));
    }

    public PlaybackSpeedMenuButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.CENTER);
        setOnClickListener(new b(this));
    }
}
