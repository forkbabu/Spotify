package com.spotify.music.features.ads.audioplus.video.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class VideoPlayPauseButton extends AppCompatImageButton {
    private Drawable a;
    private Drawable b;
    private a c;

    public interface a {
        void a();
    }

    public VideoPlayPauseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void c() {
        setImageDrawable(this.a);
    }

    public void e() {
        setImageDrawable(this.b);
    }

    public void g(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setListener(a aVar) {
        this.c = aVar;
    }

    public VideoPlayPauseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SpotifyIconDrawable(getContext(), SpotifyIconV2.PLAY, 48.0f);
        this.b = new SpotifyIconDrawable(getContext(), SpotifyIconV2.PAUSE, 48.0f);
        setVisibility(0);
        setBackgroundDrawable(null);
        setImageDrawable(this.a);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setOnClickListener(new d(this));
    }
}
