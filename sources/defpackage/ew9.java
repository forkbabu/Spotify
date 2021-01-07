package defpackage;

import com.spotify.libs.instrumentation.performance.p;
import com.spotify.libs.instrumentation.performance.q;
import com.spotify.messages.ViewLoadSequence;

/* renamed from: ew9  reason: default package */
public final /* synthetic */ class ew9 implements q {
    public final /* synthetic */ zw9 a;

    public /* synthetic */ ew9(zw9 zw9) {
        this.a = zw9;
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public /* synthetic */ void a(ViewLoadSequence viewLoadSequence) {
        p.a(this, viewLoadSequence);
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public final void b(ViewLoadSequence viewLoadSequence) {
        this.a.l(viewLoadSequence);
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public /* synthetic */ void shutdown() {
        p.b(this);
    }
}
