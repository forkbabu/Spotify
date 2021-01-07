package com.spotify.music.nowplaying.drivingmode.view.playpause;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.playpause.e;
import com.spotify.nowplaying.ui.components.controls.playpause.g;

public final class DrivingPlayPauseButton extends AppCompatImageButton implements g, fqd {
    private g.a a;

    public DrivingPlayPauseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    private void g() {
        setContentDescription(getResources().getString(C0707R.string.player_content_description_play));
        setOnClickListener(new a(this));
        setLayerType(1, null);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.g
    public void c() {
        setActivated(false);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_play));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.g
    public void e() {
        setActivated(true);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_pause));
    }

    public void h(View view) {
        g.a aVar = this.a;
        if (aVar != null) {
            ((e) aVar).c();
        }
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.g
    public void setListener(g.a aVar) {
        this.a = aVar;
    }

    public DrivingPlayPauseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
    }
}
