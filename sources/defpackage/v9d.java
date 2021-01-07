package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: v9d  reason: default package */
public final class v9d<T> implements g<Throwable> {
    final /* synthetic */ String a;
    final /* synthetic */ Object[] b;

    v9d(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        StringBuilder V0 = je.V0("social listening impl: ");
        V0.append(this.a);
        Logger.e(th, V0.toString(), this.b);
    }
}
