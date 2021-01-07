package defpackage;

import com.spotify.mobile.android.core.internal.AudioDriver;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.s;
import io.reactivex.v;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.h;

/* renamed from: l8d  reason: default package */
public final class l8d implements Callable<v<? extends r8d>> {
    private r8d a;
    final /* synthetic */ g8d b;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    l8d(g8d g8d) {
        this.b = g8d;
    }

    public final void a(r8d r8d) {
        this.a = r8d;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public v<? extends r8d> call() {
        s<Object> sVar = e0.a;
        g8d g8d = this.b;
        MobiusLoop.h o = g8d.o(g8d, g8d.c);
        r8d r8d = this.a;
        if (r8d == null) {
            r8d = new r8d(false, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, AudioDriver.SPOTIFY_MAX_VOLUME);
        }
        s<R> N = sVar.q(i.d(o, r8d)).N(new k8d(this));
        h.d(N, "Observable.never<SocialL…-> currentModel = model }");
        return N;
    }
}
