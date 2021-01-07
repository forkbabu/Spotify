package defpackage;

import io.reactivex.functions.g;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;

/* renamed from: qd0  reason: default package */
public final /* synthetic */ class qd0 implements g {
    public final /* synthetic */ BlockingDeque a;

    public /* synthetic */ qd0(BlockingDeque blockingDeque) {
        this.a = blockingDeque;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.putLast((ByteBuffer) obj);
    }
}
