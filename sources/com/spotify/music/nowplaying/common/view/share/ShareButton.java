package com.spotify.music.nowplaying.common.view.share;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.share.g;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class ShareButton extends AppCompatImageView implements g {
    private g.a a;

    public ShareButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(View view) {
        g.a aVar = this.a;
        if (aVar != null) {
            ((e) aVar).b();
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.share.g
    public void setListener(g.a aVar) {
        this.a = aVar;
    }

    public ShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), SpotifyIcon.SHARE_ANDROID_24);
        spotifyIconDrawable.s(a.c(getContext(), C0707R.color.btn_now_playing_white));
        setImageDrawable(spotifyIconDrawable);
        setBackgroundColor(0);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_share));
        setOnClickListener(new a(this));
    }
}
