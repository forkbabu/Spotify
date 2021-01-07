package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ur0  reason: default package */
public final /* synthetic */ class ur0 implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ ur0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "CMC - Failed to resolve command: %s, data: %s => Resolver probably not ready!", this.a, this.b);
    }
}
