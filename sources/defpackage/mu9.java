package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* renamed from: mu9  reason: default package */
final class mu9<T> implements g<Throwable> {
    final /* synthetic */ nu9 a;

    mu9(nu9 nu9) {
        this.a = nu9;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "throwable");
        Logger.e(th2, "Failed to create preview image", new Object[0]);
        this.a.i.f(null);
    }
}
