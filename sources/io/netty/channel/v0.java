package io.netty.channel;

import io.netty.util.concurrent.e;
import io.netty.util.concurrent.l;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.s;

/* access modifiers changed from: package-private */
public final class v0 extends e implements g {
    private final d b;

    v0(d dVar, l lVar) {
        super(null);
        this.b = dVar;
    }

    @Override // io.netty.util.concurrent.e, io.netty.util.concurrent.r, io.netty.util.concurrent.y, io.netty.channel.v, io.netty.channel.g
    /* renamed from: d */
    public g mo86d(s sVar) {
        super.mo86d(sVar);
        return this;
    }

    @Override // io.netty.channel.g
    public d h() {
        return this.b;
    }

    @Override // io.netty.util.concurrent.r
    public Throwable r() {
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // io.netty.util.concurrent.r
    public /* bridge */ /* synthetic */ Void s() {
        return null;
    }

    /* Return type fixed from 'io.netty.util.concurrent.r' to match base method */
    @Override // io.netty.util.concurrent.e, io.netty.util.concurrent.r
    public r<Void> u() {
        return this;
    }

    @Override // io.netty.util.concurrent.r
    public boolean x() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.concurrent.e
    public l z() {
        l z = super.z();
        return z == null ? this.b.V() : z;
    }

    @Override // io.netty.util.concurrent.e, io.netty.util.concurrent.r, io.netty.util.concurrent.y, io.netty.channel.v, io.netty.channel.g
    /* renamed from: d  reason: collision with other method in class */
    public r mo88d(s sVar) {
        super.mo86d(sVar);
        return this;
    }
}
