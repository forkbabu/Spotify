package com.spotify.music.internal.receiver;

import android.content.Context;
import com.spotify.mobile.android.service.o;
import io.reactivex.y;

public final class c {
    public static void a(MediaButtonReceiver mediaButtonReceiver, o oVar) {
        mediaButtonReceiver.a = oVar;
    }

    public static void b(MediaButtonReceiver mediaButtonReceiver, y yVar) {
        mediaButtonReceiver.e = yVar;
    }

    public static void c(MediaButtonReceiver mediaButtonReceiver, e6 e6Var) {
        mediaButtonReceiver.c = e6Var;
    }

    public static void d(MediaButtonReceiver mediaButtonReceiver, Object obj) {
        mediaButtonReceiver.d = (e) obj;
    }

    public static void e(MediaButtonReceiver mediaButtonReceiver, h2e h2e) {
        mediaButtonReceiver.b = h2e;
    }

    public static e f(Context context) {
        return new e(context);
    }
}
