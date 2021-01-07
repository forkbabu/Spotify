package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: jfc  reason: default package */
public final class jfc<T> implements g<Throwable> {
    public static final jfc a = new jfc();

    jfc() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "throwable");
        Logger.o(th2, "Unable to observe position", new Object[0]);
    }
}
