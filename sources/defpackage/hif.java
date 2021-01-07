package defpackage;

import io.reactivex.functions.g;
import java.nio.ByteBuffer;

/* renamed from: hif  reason: default package */
public final /* synthetic */ class hif implements g {
    public final /* synthetic */ iif a;

    public /* synthetic */ hif(iif iif) {
        this.a = iif;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        iif.b(this.a, (ByteBuffer) obj);
    }
}
