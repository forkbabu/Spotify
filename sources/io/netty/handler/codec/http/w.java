package io.netty.handler.codec.http;

import io.netty.buffer.j;
import io.netty.buffer.j0;
import io.netty.channel.k0;
import io.netty.handler.codec.http.t;
import io.netty.handler.codec.i;
import io.netty.util.internal.r;
import java.util.Iterator;
import java.util.Map;

public abstract class w<H extends t> extends i<Object> {
    static final byte[] f;
    private static final byte[] n = {48, 13, 10};
    private static final byte[] o;
    private static final j p;
    private static final j q;
    private int c = 0;

    static {
        byte[] bArr = {13, 10};
        f = bArr;
        byte[] bArr2 = {48, 13, 10, 13, 10};
        o = bArr2;
        p = j0.c(j0.b(bArr.length).U1(bArr));
        q = j0.c(j0.b(bArr2.length).U1(bArr2));
    }

    private static Object e(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).t1();
        }
        if (obj instanceof o) {
            return ((o) obj).content().t1();
        }
        if (obj instanceof k0) {
            return ((k0) obj).h();
        }
        StringBuilder V0 = je.V0("unexpected message type: ");
        V0.append(r.f(obj));
        throw new IllegalStateException(V0.toString());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a0  */
    @Override // io.netty.handler.codec.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(io.netty.channel.k r17, java.lang.Object r18, java.util.List<java.lang.Object> r19) {
        /*
        // Method dump skipped, instructions count: 592
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.codec.http.w.c(io.netty.channel.k, java.lang.Object, java.util.List):void");
    }

    /* access modifiers changed from: protected */
    public void f(r rVar, j jVar) {
        Iterator<Map.Entry<CharSequence, CharSequence>> o2 = rVar.o();
        while (o2.hasNext()) {
            Map.Entry<CharSequence, CharSequence> next = o2.next();
            s.g(next.getKey(), next.getValue(), jVar);
        }
    }
}
