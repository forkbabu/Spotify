package com.spotify.music.carmode.nowplaying.podcast.view.speedmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.f;

public class PlaybackSpeedCloseButton extends AppCompatImageButton implements f {
    private f.a a;

    public PlaybackSpeedCloseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        f.a aVar = this.a;
        if (aVar != null) {
            ((h) aVar).b();
        }
    }

    @Override // com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.f
    public void setListener(f.a aVar) {
        this.a = aVar;
    }

    public PlaybackSpeedCloseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.CENTER);
        setImageDrawable(i0.b(getContext(), C0707R.drawable.ic_x_32));
        setOnClickListener(new a(this));
    }
}
