package defpackage;

import com.spotify.dac.api.proto.ClientInfo;
import com.spotify.dac.api.proto.DacRequest;
import com.spotify.dac.api.proto.DacResponse;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: ej2  reason: default package */
public final class ej2 {
    private final fj2 a;
    private final ClientInfo b;

    public ej2(fj2 fj2, ClientInfo clientInfo) {
        h.e(fj2, "endpoint");
        h.e(clientInfo, "clientInfo");
        this.a = fj2;
        this.b = clientInfo;
    }

    public final z<DacResponse> a() {
        DacRequest.b i = DacRequest.i();
        i.m(this.b);
        DacRequest dacRequest = (DacRequest) i.build();
        fj2 fj2 = this.a;
        h.d(dacRequest, "dacRequest");
        return fj2.a(dacRequest);
    }
}
