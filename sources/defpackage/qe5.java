package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.go.socket.SocketIo;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;

/* renamed from: qe5  reason: default package */
public final /* synthetic */ class qe5 implements l {
    public static final /* synthetic */ qe5 a = new qe5();

    private /* synthetic */ qe5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof SocketIo.ConnectionException) {
            return o.a;
        }
        Logger.e(th, "Go: Error in Session", new Object[0]);
        return s.P(th);
    }
}
