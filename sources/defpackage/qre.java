package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.buffer.j;
import io.netty.buffer.m;
import io.netty.channel.k;
import io.netty.handler.codec.a;
import java.util.List;

/* renamed from: qre  reason: default package */
class qre extends a {
    private final ObjectMapper r;

    qre(ObjectMapper objectMapper) {
        this.r = objectMapper;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.handler.codec.a
    public void h(k kVar, j jVar, List<Object> list) {
        if (jVar.K0()) {
            m mVar = new m(jVar);
            try {
                list.add(this.r.readTree(mVar));
            } finally {
                mVar.close();
            }
        }
    }
}
