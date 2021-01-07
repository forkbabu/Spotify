package io.netty.channel;

import io.netty.util.l;

final class g0 implements r0 {
    static final r0 a = new g0();

    private g0() {
    }

    @Override // io.netty.channel.r0
    public int a(l lVar, boolean z) {
        if (z) {
            return lVar.get();
        }
        return -1;
    }
}
