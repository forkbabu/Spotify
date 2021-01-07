package com.spotify.music.nowplaying.common.view.contextmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.contextmenu.n;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class ContextMenuButton extends AppCompatImageView implements n {
    private n.a a;

    public ContextMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        context2.getClass();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context2, SpotifyIconV2.MORE_ANDROID, (float) nud.g(24.0f, context2.getResources()));
        spotifyIconDrawable.s(a.c(context2, C0707R.color.btn_now_playing_white));
        setImageDrawable(spotifyIconDrawable);
        setBackgroundColor(0);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setOnClickListener(new a(this));
    }

    public void a(View view) {
        n.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.contextmenu.n
    public void setListener(n.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.music.nowplaying.common.view.contextmenu.n
    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 4);
    }
}
