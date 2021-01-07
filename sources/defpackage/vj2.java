package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.spotify.dac.api.proto.ClientInfo;
import com.spotify.mobile.android.util.t;
import kotlin.jvm.internal.h;

/* renamed from: vj2  reason: default package */
public final class vj2 implements fjf<ClientInfo> {
    private final uj2 a;
    private final wlf<t> b;

    public vj2(uj2 uj2, wlf<t> wlf) {
        this.a = uj2;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        uj2 uj2 = this.a;
        t tVar = this.b.get();
        uj2.getClass();
        h.e(tVar, "clientInfo");
        ClientInfo.b l = ClientInfo.l();
        l.m(ClientInfo.Client.ANDROID_MUSIC_APP);
        l.n(tVar.c());
        GeneratedMessageLite build = l.build();
        h.d(build, "DacClientInfo.newBuilder…ame)\n            .build()");
        return (ClientInfo) build;
    }
}
