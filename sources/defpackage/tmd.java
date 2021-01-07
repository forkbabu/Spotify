package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.maybe.b;

/* renamed from: tmd  reason: default package */
public final /* synthetic */ class tmd implements l {
    public static final /* synthetic */ tmd a = new tmd();

    private /* synthetic */ tmd() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.d(((Throwable) obj).getMessage(), new Object[0]);
        return b.a;
    }
}
