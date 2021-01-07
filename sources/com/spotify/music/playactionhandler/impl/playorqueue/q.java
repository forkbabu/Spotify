package com.spotify.music.playactionhandler.impl.playorqueue;

import androidx.fragment.app.o;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.playactionhandler.impl.playorqueue.PlayOrQueueDialogFragment;
import com.spotify.player.queue.f;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;

public final class q {
    private final wlf<o> a;
    private final wlf<PublishSubject<PlayOrQueueDialogFragment.DialogResult>> b;
    private final wlf<f4d> c;
    private final wlf<cfd> d;
    private final wlf<SnackbarManager> e;
    private final wlf<nsb> f;
    private final wlf<y> g;

    public q(wlf<o> wlf, wlf<PublishSubject<PlayOrQueueDialogFragment.DialogResult>> wlf2, wlf<f4d> wlf3, wlf<cfd> wlf4, wlf<SnackbarManager> wlf5, wlf<nsb> wlf6, wlf<y> wlf7) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public o b(f fVar) {
        a(fVar, 1);
        f fVar2 = fVar;
        o oVar = this.a.get();
        a(oVar, 2);
        o oVar2 = oVar;
        PublishSubject<PlayOrQueueDialogFragment.DialogResult> publishSubject = this.b.get();
        a(publishSubject, 3);
        PublishSubject<PlayOrQueueDialogFragment.DialogResult> publishSubject2 = publishSubject;
        f4d f4d = this.c.get();
        a(f4d, 4);
        f4d f4d2 = f4d;
        cfd cfd = this.d.get();
        a(cfd, 5);
        cfd cfd2 = cfd;
        SnackbarManager snackbarManager = this.e.get();
        a(snackbarManager, 6);
        SnackbarManager snackbarManager2 = snackbarManager;
        nsb nsb = this.f.get();
        a(nsb, 7);
        nsb nsb2 = nsb;
        y yVar = this.g.get();
        a(yVar, 8);
        return new o(fVar2, oVar2, publishSubject2, f4d2, cfd2, snackbarManager2, nsb2, yVar);
    }
}
