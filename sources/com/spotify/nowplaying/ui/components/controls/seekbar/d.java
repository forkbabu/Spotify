package com.spotify.nowplaying.ui.components.controls.seekbar;

import android.widget.SeekBar;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;
import com.spotify.nowplaying.ui.components.controls.seekbar.g;

public final class d implements CancellableSeekBar.a {
    private final g.a a;
    private qg0<uqd> b;
    private boolean c;

    private d(g.a aVar) {
        this.a = aVar;
    }

    public static d b(g.a aVar) {
        return new d(aVar);
    }

    @Override // com.spotify.mobile.android.ui.view.CancellableSeekBar.a
    public void a(SeekBar seekBar) {
        this.a.a();
        uqd c2 = uqd.c(Integer.valueOf(seekBar.getProgress()));
        qg0<uqd> qg0 = this.b;
        if (qg0 != null) {
            qg0.accept(c2);
        }
        uqd a2 = uqd.a();
        qg0<uqd> qg02 = this.b;
        if (qg02 != null) {
            qg02.accept(a2);
        }
    }

    public d c(qg0<uqd> qg0) {
        this.b = qg0;
        return this;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.a.b(i, this.c);
            uqd c2 = uqd.c(Integer.valueOf(i));
            qg0<uqd> qg0 = this.b;
            if (qg0 != null) {
                qg0.accept(c2);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.c = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        this.c = false;
        this.a.b(seekBar.getProgress(), this.c);
        uqd c2 = uqd.c(Integer.valueOf(seekBar.getProgress()));
        qg0<uqd> qg0 = this.b;
        if (qg0 != null) {
            qg0.accept(c2);
        }
        uqd a2 = uqd.a();
        qg0<uqd> qg02 = this.b;
        if (qg02 != null) {
            qg02.accept(a2);
        }
    }
}
