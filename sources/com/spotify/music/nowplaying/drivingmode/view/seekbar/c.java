package com.spotify.music.nowplaying.drivingmode.view.seekbar;

import android.widget.SeekBar;

/* access modifiers changed from: package-private */
public class c implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ DrivingSeekbarView a;

    c(DrivingSeekbarView drivingSeekbarView) {
        this.a = drivingSeekbarView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z && this.a.C != null) {
            ((bvb) this.a.C).c(i, true);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        DrivingSeekbarView.B(this.a);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.a.C != null) {
            DrivingSeekbarView.C(this.a);
            ((bvb) this.a.C).c(seekBar.getProgress(), false);
        }
    }
}
