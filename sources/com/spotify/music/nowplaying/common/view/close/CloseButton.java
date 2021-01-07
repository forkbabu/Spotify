package com.spotify.music.nowplaying.common.view.close;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.close.d;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class CloseButton extends AppCompatImageView implements d {
    private d.a a;

    public CloseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(View view) {
        d.a aVar = this.a;
        if (aVar != null) {
            ((b) aVar).a();
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.close.d
    public void setListener(d.a aVar) {
        this.a = aVar;
    }

    public CloseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), SpotifyIcon.CHEVRON_DOWN_24);
        spotifyIconDrawable.s(a.c(getContext(), C0707R.color.btn_now_playing_white));
        setImageDrawable(spotifyIconDrawable);
        setBackgroundColor(0);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setOnClickListener(new a(this));
    }
}
