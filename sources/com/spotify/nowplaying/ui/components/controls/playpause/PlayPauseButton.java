package com.spotify.nowplaying.ui.components.controls.playpause;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.playpause.g;
import com.spotify.paste.graphics.drawable.c;

public final class PlayPauseButton extends AppCompatImageButton implements g, fqd {
    private c a;
    private c b;
    private g.a c;

    public PlayPauseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.g
    public void c() {
        setImageDrawable(this.a);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_play));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.g
    public void e() {
        setImageDrawable(this.b);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_pause));
    }

    public void g(View view) {
        g.a aVar = this.c;
        if (aVar != null) {
            ((e) aVar).c();
        }
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        this.a.d(i);
        this.b.d(i);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.g
    public void setListener(g.a aVar) {
        this.c = aVar;
    }

    public PlayPauseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = gqd.g(getContext(), 32, 0, 0.45f);
        this.b = gqd.f(getContext(), 32, 0, 0.45f);
        this.a.c(a.c(getContext(), C0707R.color.btn_now_playing_white));
        this.b.c(a.c(getContext(), C0707R.color.btn_now_playing_white));
        setBackgroundDrawable(null);
        setImageDrawable(this.a);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_play));
        setOnClickListener(new a(this));
    }
}
