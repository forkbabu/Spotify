package io.netty.handler.codec.http;

import io.netty.buffer.j;
import io.netty.channel.k0;

public class y extends w<x> {
    @Override // io.netty.handler.codec.i
    public boolean b(Object obj) {
        if (!((obj instanceof v) || (obj instanceof j) || (obj instanceof k0)) || (obj instanceof z)) {
            return false;
        }
        return true;
    }
}
