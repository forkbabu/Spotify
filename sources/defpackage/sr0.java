package defpackage;

import com.google.common.base.Joiner;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: sr0  reason: default package */
public final /* synthetic */ class sr0 implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ String[] b;

    public /* synthetic */ sr0(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "CMC - Failed to resolve command: %s, data: %s => Resolver probably not ready!", this.a, Joiner.on(",").join(this.b));
    }
}
