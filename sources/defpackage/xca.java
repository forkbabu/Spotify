package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.volume.l;
import com.spotify.music.libs.mediasession.m0;
import com.spotify.rxjava2.q;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: xca  reason: default package */
public class xca {
    private final hba a;
    private final l b;
    private final vca c;
    private final m0 d;
    private final bda e;
    private final hv0 f;
    private final q g;
    private final y h;
    private final y i;
    private String j;
    Optional<uca> k = Optional.absent();

    public xca(hba hba, l lVar, vca vca, m0 m0Var, bda bda, hv0 hv0, y yVar, y yVar2) {
        this.a = hba;
        this.b = lVar;
        this.c = vca;
        this.d = m0Var;
        this.e = bda;
        this.f = hv0;
        this.h = yVar;
        this.i = yVar2;
        this.g = new q();
    }

    private void a() {
        this.k = Optional.absent();
        this.d.h().q(3);
        this.e.c();
        Logger.b("Connect volume controls disabled", new Object[0]);
    }

    public void b(int i2, Float f2) {
        uca b2 = this.c.b(this.j, f2.floatValue(), i2);
        this.k = Optional.of(b2);
        this.d.h().r(this.k.get());
        Logger.b("Connect volume controls enabled with volume %f and volumeSteps %d", f2, Integer.valueOf(i2));
        this.e.b(b2);
    }

    public void c(GaiaDevice gaiaDevice) {
        this.j = gaiaDevice.getLoggingIdentifier();
        a();
        if (!gaiaDevice.isSelf()) {
            this.g.a(this.b.a().Q0(500, TimeUnit.MILLISECONDS, this.i).T().subscribe(new pca(this, gaiaDevice.getVolumeSteps())));
        }
    }

    public void d() {
        if (this.f.isEnabled()) {
            this.g.a(this.a.c().Q(oca.a).F(rca.a).Q(nca.a).o0(this.h).subscribe(new qca(this)));
        } else {
            a();
        }
    }

    public void e() {
        a();
        this.g.c();
        this.e.c();
    }
}
