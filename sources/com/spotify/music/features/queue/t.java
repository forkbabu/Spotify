package com.spotify.music.features.queue;

import androidx.fragment.app.o;
import com.spotify.android.flags.c;
import com.spotify.music.libs.adaptiveui.di.OrientationMode;
import com.spotify.remoteconfig.u6;
import io.reactivex.g;
import io.reactivex.y;

public final class t {
    public static void a(QueueActivity queueActivity, g<c> gVar) {
        queueActivity.H = gVar;
    }

    public static void b(QueueActivity queueActivity, o oVar) {
        queueActivity.G = oVar;
    }

    public static void c(QueueActivity queueActivity, y yVar) {
        queueActivity.I = yVar;
    }

    public static void d(QueueActivity queueActivity, OrientationMode orientationMode) {
        queueActivity.J = orientationMode;
    }

    public static void e(QueueActivity queueActivity, u6 u6Var) {
        queueActivity.K = u6Var;
    }

    public static void f(QueueNoPLFragment queueNoPLFragment, z zVar) {
        queueNoPLFragment.h0 = zVar;
    }
}
