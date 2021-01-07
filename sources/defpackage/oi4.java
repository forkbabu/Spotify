package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: oi4  reason: default package */
public final class oi4<T> implements g<Throwable> {
    public static final oi4 a = new oi4();

    oi4() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        StringBuilder V0 = je.V0("CarePackage: error on playlist endpoint ");
        V0.append(th.getMessage());
        Logger.b(V0.toString(), new Object[0]);
    }
}
