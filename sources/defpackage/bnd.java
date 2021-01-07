package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.maybe.b;

/* renamed from: bnd  reason: default package */
public final /* synthetic */ class bnd implements l {
    public static final /* synthetic */ bnd a = new bnd();

    private /* synthetic */ bnd() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.d(((Throwable) obj).getMessage(), new Object[0]);
        return b.a;
    }
}
