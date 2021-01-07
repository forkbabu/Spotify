package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

/* renamed from: tr0  reason: default package */
public final /* synthetic */ class tr0 implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ tr0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("CMC - Executed gaia command: %s, data: %s => %d", this.a, this.b, Integer.valueOf(((Response) obj).getStatus()));
    }
}
