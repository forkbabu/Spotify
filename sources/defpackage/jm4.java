package defpackage;

import com.google.common.base.Joiner;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

/* renamed from: jm4  reason: default package */
public final /* synthetic */ class jm4 implements g {
    public final /* synthetic */ String[] a;

    public /* synthetic */ jm4(String[] strArr) {
        this.a = strArr;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("CMC - Executed gaia command: %s, data: %s => %d", "sp://connect/v1/discover", Joiner.on(",").join(this.a), Integer.valueOf(((Response) obj).getStatus()));
    }
}
