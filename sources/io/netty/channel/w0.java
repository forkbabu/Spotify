package io.netty.channel;

import io.netty.util.concurrent.c;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.y;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class w0 extends c<Void> implements v {
    private final d a;
    private final boolean b;

    w0(d dVar, boolean z) {
        this.a = dVar;
        this.b = z;
    }

    private void A(Throwable th) {
        if (this.b && this.a.g0()) {
            this.a.o().v(th);
        }
    }

    @Override // io.netty.util.concurrent.r, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // io.netty.channel.v
    /* renamed from: g */
    public v mo85g(Throwable th) {
        A(th);
        return this;
    }

    @Override // io.netty.channel.v, io.netty.channel.g
    public d h() {
        return this.a;
    }

    @Override // io.netty.util.concurrent.r
    public boolean i(long j, TimeUnit timeUnit) {
        throw new IllegalStateException("void future");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    @Override // io.netty.util.concurrent.y
    public boolean k() {
        return true;
    }

    @Override // io.netty.channel.v
    public v m() {
        return this;
    }

    @Override // io.netty.util.concurrent.y
    public boolean n(Throwable th) {
        A(th);
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.netty.util.concurrent.y
    public /* bridge */ /* synthetic */ boolean p(Void r1) {
        return false;
    }

    @Override // io.netty.channel.v
    public boolean q() {
        return false;
    }

    @Override // io.netty.util.concurrent.r
    public Throwable r() {
        return null;
    }

    @Override // io.netty.util.concurrent.r
    public /* bridge */ /* synthetic */ Object s() {
        return null;
    }

    @Override // io.netty.util.concurrent.r
    public r u() {
        if (!Thread.interrupted()) {
            return this;
        }
        throw new InterruptedException();
    }

    /* Return type fixed from 'io.netty.util.concurrent.y' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.netty.util.concurrent.y
    public y<Void> v(Void r1) {
        return this;
    }

    @Override // io.netty.util.concurrent.r
    public boolean x() {
        return false;
    }

    /* JADX WARN: Incorrect args count in method signature: (Lio/netty/util/concurrent/s<+Lio/netty/util/concurrent/r<-Ljava/lang/Void;>;>;)Lio/netty/channel/w0; */
    public w0 z() {
        throw new IllegalStateException("void future");
    }

    @Override // io.netty.channel.v
    /* renamed from: g  reason: collision with other method in class */
    public y mo89g(Throwable th) {
        A(th);
        return this;
    }
}
