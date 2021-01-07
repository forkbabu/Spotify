package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.google.protobuf.u;
import com.spotify.messages.AndroidClientReport;
import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: fs2  reason: default package */
public class fs2 implements d {
    private final es2 a;

    public fs2(es2 es2) {
        this.a = es2;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        es2 es2 = this.a;
        gl0<u> gl0 = es2.a;
        AndroidClientReport.b m = AndroidClientReport.m();
        m.o(es2.b.y());
        m.m(Collections2.newArrayList(es2.b.g().split(":")));
        m.n(MoreObjects.nullToEmpty(es2.b.d()));
        gl0.c(m.build());
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "ClientInfoPublisher";
    }
}
