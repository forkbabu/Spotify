package com.spotify.music.carmode.nowplaying.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.playpause.e;
import com.spotify.nowplaying.ui.components.controls.playpause.g;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class CarModePlayPauseButton extends AppCompatImageButton implements g, fqd {
    private final SpotifyIconDrawable a;
    private final SpotifyIconDrawable b;
    private g.a c;

    public CarModePlayPauseButton(Context context, AttributeSet attributeSet) {
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
        setColorFilter(s2.h(i, (int) 76.5f));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.g
    public void setListener(g.a aVar) {
        this.c = aVar;
    }

    public CarModePlayPauseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SpotifyIconDrawable g = mo2.g(context);
        this.a = g;
        SpotifyIconDrawable f = mo2.f(context);
        this.b = f;
        int b2 = a.b(context, C0707R.color.car_mode_paint_layer_under_extracted_color);
        g.r(b2);
        f.r(b2);
        setScaleType(ImageView.ScaleType.CENTER);
        setOnClickListener(new a(this));
        setImageDrawable(g);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_play));
    }
}
