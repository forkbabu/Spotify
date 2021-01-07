package defpackage;

import com.google.common.base.Joiner;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

/* renamed from: rr0  reason: default package */
public final /* synthetic */ class rr0 implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ String[] b;

    public /* synthetic */ rr0(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("CMC - Executed gaia command: %s, data: %s => %d", this.a, Joiner.on(",").join(this.b), Integer.valueOf(((Response) obj).getStatus()));
    }
}
