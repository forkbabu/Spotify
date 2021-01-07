package defpackage;

import com.google.common.base.Joiner;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: dm4  reason: default package */
public final /* synthetic */ class dm4 implements g {
    public final /* synthetic */ String[] a;

    public /* synthetic */ dm4(String[] strArr) {
        this.a = strArr;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "CMC - Failed to resolve command: %s, data: %s => Resolver probably not ready!", "sp://connect/v1/discover", Joiner.on(",").join(this.a));
    }
}
