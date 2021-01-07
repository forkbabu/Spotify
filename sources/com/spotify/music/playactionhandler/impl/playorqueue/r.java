package com.spotify.music.playactionhandler.impl.playorqueue;

import androidx.fragment.app.o;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.playactionhandler.impl.playorqueue.PlayOrQueueDialogFragment;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;

public final class r implements fjf<q> {
    private final wlf<o> a;
    private final wlf<PublishSubject<PlayOrQueueDialogFragment.DialogResult>> b;
    private final wlf<f4d> c;
    private final wlf<cfd> d;
    private final wlf<SnackbarManager> e;
    private final wlf<nsb> f;
    private final wlf<y> g;

    public r(wlf<o> wlf, wlf<PublishSubject<PlayOrQueueDialogFragment.DialogResult>> wlf2, wlf<f4d> wlf3, wlf<cfd> wlf4, wlf<SnackbarManager> wlf5, wlf<nsb> wlf6, wlf<y> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
