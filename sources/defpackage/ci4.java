package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ci4  reason: default package */
final class ci4<T> implements g<Throwable> {
    public static final ci4 a = new ci4();

    ci4() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        StringBuilder V0 = je.V0("CarePackage: error on add playlist to library ");
        V0.append(th.getMessage());
        Logger.b(V0.toString(), new Object[0]);
    }
}
