package com.spotify.music.features.queue.service;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.util.o0;
import com.spotify.player.queue.f;

public final class r implements fjf<q> {
    public static void a(QueueService queueService, Object obj) {
        queueService.a = (s) obj;
    }

    public static q b(Context context, SnackbarManager snackbarManager) {
        return new q(context, snackbarManager);
    }

    public static s c(f fVar, p pVar, Object obj, Object obj2, Object obj3, v vVar) {
        return new s(fVar, pVar, (u) obj, (t) obj2, (q) obj3, vVar);
    }

    public static t d(SnackbarManager snackbarManager) {
        return new t(snackbarManager);
    }

    public static u e(o0 o0Var) {
        return new u(o0Var);
    }
}
