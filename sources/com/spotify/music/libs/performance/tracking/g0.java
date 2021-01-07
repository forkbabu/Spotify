package com.spotify.music.libs.performance.tracking;

import com.google.protobuf.u;
import com.spotify.libs.instrumentation.performance.p;
import com.spotify.libs.instrumentation.performance.q;
import com.spotify.messages.ViewLoadSequence;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class g0 implements q {
    private final gl0<u> a;

    public g0(gl0<u> gl0) {
        this.a = gl0;
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public /* synthetic */ void a(ViewLoadSequence viewLoadSequence) {
        p.a(this, viewLoadSequence);
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public void b(ViewLoadSequence viewLoadSequence) {
        gl0<u> gl0 = this.a;
        Map<String, Long> u = viewLoadSequence.u();
        long longValue = ((Long) Collections.min(u.values())).longValue();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Long> entry : u.entrySet()) {
            hashMap.put(entry.getKey(), Long.valueOf(entry.getValue().longValue() - longValue));
        }
        ViewLoadSequence.b y = ViewLoadSequence.y(viewLoadSequence);
        y.n(hashMap);
        gl0.c((ViewLoadSequence) y.build());
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public /* synthetic */ void shutdown() {
        p.b(this);
    }
}
