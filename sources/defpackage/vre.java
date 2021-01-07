package defpackage;

import io.netty.buffer.j0;
import io.netty.channel.d;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.s;
import io.reactivex.functions.g;
import java.nio.ByteBuffer;

/* renamed from: vre  reason: default package */
public class vre implements g<u3<d, ByteBuffer>> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(u3<d, ByteBuffer> u3Var) {
        u3<d, ByteBuffer> u3Var2 = u3Var;
        F f = u3Var2.a;
        f.getClass();
        F f2 = f;
        if (!f2.isActive()) {
            f2.close().mo86d((s<? extends r<? super Void>>) jre.c);
        } else {
            f2.z(j0.d(u3Var2.b)).mo86d((s<? extends r<? super Void>>) new ure(this, f2));
        }
    }
}
