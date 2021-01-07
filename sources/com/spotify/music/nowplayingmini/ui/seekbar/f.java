package com.spotify.music.nowplayingmini.ui.seekbar;

import android.widget.SeekBar;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;

/* access modifiers changed from: package-private */
public class f implements CancellableSeekBar.a {
    final /* synthetic */ FadingSeekBarView a;

    f(FadingSeekBarView fadingSeekBarView) {
        this.a = fadingSeekBarView;
    }

    @Override // com.spotify.mobile.android.ui.view.CancellableSeekBar.a
    public void a(SeekBar seekBar) {
        if (this.a.n != null) {
            this.a.n.a();
        }
        this.a.setTimestampsVisible(false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z && this.a.n != null) {
            this.a.n.b(i, true);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.a.setTimestampsVisible(true);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.a.n != null) {
            this.a.n.b(seekBar.getProgress(), false);
        }
        this.a.setTimestampsVisible(false);
    }
}
