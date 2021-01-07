package defpackage;

import io.netty.channel.h0;
import io.netty.channel.i0;
import io.netty.channel.n0;
import io.netty.channel.s0;
import io.netty.util.concurrent.c0;
import io.netty.util.concurrent.d0;
import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.Executor;

/* renamed from: lkf  reason: default package */
public class lkf extends n0 {
    public lkf() {
        super(0, null, SelectorProvider.provider(), h0.a, d0.a());
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.n0
    /* renamed from: h */
    public i0 f(Executor executor, Object... objArr) {
        return new kkf(this, executor, (SelectorProvider) objArr[0], ((s0) objArr[1]).a(), (c0) objArr[2]);
    }
}
