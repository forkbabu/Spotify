package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.sociallistening.models.b;
import io.reactivex.functions.a;

/* renamed from: i8d  reason: default package */
final class i8d implements a {
    final /* synthetic */ g8d a;

    i8d(g8d g8d) {
        this.a = g8d;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        Logger.b("social listening impl: Ending mobius loop", new Object[0]);
        this.a.b.onNext(b.n);
    }
}
