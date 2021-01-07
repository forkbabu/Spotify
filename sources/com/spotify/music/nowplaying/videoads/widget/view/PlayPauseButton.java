package com.spotify.music.nowplaying.videoads.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.playpause.e;
import com.spotify.nowplaying.ui.components.controls.playpause.g;
import com.spotify.paste.graphics.drawable.c;

public final class PlayPauseButton extends AppCompatImageButton implements g {
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

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.g
    public void setListener(g.a aVar) {
        this.c = aVar;
    }

    public PlayPauseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = gqd.o(getContext(), 24, 0, 0.35f);
        this.b = gqd.l(getContext(), 24, 0, 0.35f);
        setBackgroundDrawable(null);
        setImageDrawable(this.a);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_play));
        setOnClickListener(new a(this));
    }
}
