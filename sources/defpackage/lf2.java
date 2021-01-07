package defpackage;

import com.spotify.music.appprotocol.api.a;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.device.model.DeviceRegistrationAppProtocol$Request;
import com.spotify.music.appprotocol.superbird.device.model.b;
import io.reactivex.s;

/* renamed from: lf2  reason: default package */
public class lf2 implements a {
    private final cqe a;
    private final nf2 b;

    public lf2(cqe cqe, nf2 nf2) {
        this.a = cqe;
        this.b = nf2;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        cf2 b2 = cf2.b(DeviceRegistrationAppProtocol$Request.class, AppProtocolBase.Empty.class);
        b2.d("com.spotify.superbird.register_device");
        b2.c(0);
        b2.e(new kf2(this));
        qg0.accept(b2.a());
    }

    /* access modifiers changed from: package-private */
    public s<AppProtocolBase.Empty> b(DeviceRegistrationAppProtocol$Request deviceRegistrationAppProtocol$Request) {
        return this.b.a(b.a(deviceRegistrationAppProtocol$Request.serial(), this.a.d(), deviceRegistrationAppProtocol$Request.versionSoftware(), deviceRegistrationAppProtocol$Request.versionOs())).g(s.i0(AppProtocolBase.a));
    }
}
