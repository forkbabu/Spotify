package com.spotify.music.playactionhandler.impl.playorqueue;

import android.os.Bundle;
import android.view.View;
import com.google.common.base.Optional;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.playactionhandler.impl.playorqueue.PlayOrQueueDialogFragment;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.queue.f;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.internal.operators.single.SingleDoOnDispose;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;
import io.reactivex.z;

public class o {
    private final f a;
    private final androidx.fragment.app.o b;
    private final PublishSubject<PlayOrQueueDialogFragment.DialogResult> c;
    private final f4d d;
    private final cfd e;
    private final SnackbarManager f;
    private final nsb g;
    private final y h;

    public o(f fVar, androidx.fragment.app.o oVar, PublishSubject<PlayOrQueueDialogFragment.DialogResult> publishSubject, f4d f4d, cfd cfd, SnackbarManager snackbarManager, nsb nsb, y yVar) {
        this.a = fVar;
        this.b = oVar;
        this.c = publishSubject;
        this.d = f4d;
        this.e = cfd;
        this.f = snackbarManager;
        this.g = nsb;
        this.h = yVar;
    }

    public static void a(o oVar, boolean z) {
        oVar.getClass();
        if (z) {
            oVar.f.show(SnackbarConfiguration.builder((int) C0707R.string.play_action_snack_added_to_queue_title).actionTextRes(C0707R.string.play_action_snack_added_to_queue_action).onClickListener(new c(oVar)).build());
        }
    }

    public /* synthetic */ void b(View view) {
        this.g.c();
    }

    public /* synthetic */ void c(PlayOrQueueDialogFragment playOrQueueDialogFragment, b bVar) {
        playOrQueueDialogFragment.Y4(this.b, "social-listening-play-or-queue");
    }

    public d0 d(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            return z.z(Optional.absent());
        }
        PlayOrQueueDialogFragment playOrQueueDialogFragment = new PlayOrQueueDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("uri", str);
        playOrQueueDialogFragment.r4(bundle);
        return new SingleDoOnDispose(this.c.j0(n.a).N0(1).B0().o(new e(this, playOrQueueDialogFragment)), new m(playOrQueueDialogFragment));
    }

    public /* synthetic */ d0 e(String str, Optional optional) {
        if (!optional.isPresent() || optional.get() != PlayOrQueueDialogFragment.DialogResult.QUEUE) {
            return z.z(optional);
        }
        return this.a.c(ContextTrack.builder(str).build()).A(l.a).H(this.h).p(new a(this)).A(new g(optional));
    }

    public z<Boolean> f(String str) {
        if (!this.e.h()) {
            return z.z(Boolean.TRUE);
        }
        com.spotify.music.sociallistening.models.b k = this.d.k();
        return z.z(Boolean.valueOf(k.g() && k.d().size() >= 2)).f(new f(this, str)).f(new b(this, str)).A(h.a);
    }
}
