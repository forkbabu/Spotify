package com.spotify.music.carmode.nowplaying.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.seekbar.d;
import com.spotify.nowplaying.ui.components.controls.seekbar.g;
import com.spotify.nowplaying.ui.components.controls.seekbar.i;

public class CarModeSeekBarView extends FrameLayout implements g {
    private final CancellableSeekBar a;
    private final i b;

    public CarModeSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setDuration(int i) {
        this.b.b(i);
        this.a.setMax(i);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setListener(g.a aVar) {
        if (aVar == null) {
            this.a.setOnSeekBarChangeListener((CancellableSeekBar.a) null);
        } else {
            this.a.setOnSeekBarChangeListener((CancellableSeekBar.a) d.b(aVar));
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setPosition(int i) {
        this.a.setProgress(i);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setPositionText(int i) {
        this.b.c(i);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setSeekingEnabled(boolean z) {
        this.a.setEnabled(z);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setTimestampsVisible(boolean z) {
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void u() {
        this.a.a();
    }

    public CarModeSeekBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.inflate(getContext(), C0707R.layout.car_mode_seek_bar, this);
        this.a = (CancellableSeekBar) findViewById(C0707R.id.seek_bar);
        this.b = new i((SuppressLayoutTextView) findViewById(C0707R.id.position), (TextView) findViewById(C0707R.id.duration));
    }
}
