package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.spotify.libs.pse.model.e;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import defpackage.re0;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* renamed from: ix0  reason: default package */
public class ix0 implements hx0 {
    private final by0 a;
    private final hz0 b;
    private final ky0 c;
    private final y d;
    private final te0 e;
    private final kx0 f;
    private final ny0 g;

    public ix0(by0 by0, hz0 hz0, ky0 ky0, y yVar, te0 te0, kx0 kx0, ny0 ny0) {
        this.a = by0;
        this.b = hz0;
        this.c = ky0;
        this.d = yVar;
        this.e = te0;
        this.f = kx0;
        this.g = ny0;
    }

    @Override // defpackage.hx0
    public e a() {
        ConfigurationResponse configurationResponse;
        Optional<ConfigurationResponse> optional = this.c.get();
        if (optional.isPresent()) {
            configurationResponse = optional.get();
        } else {
            configurationResponse = (ConfigurationResponse) ConfigurationResponse.s().build();
        }
        return new e(this.g.a(configurationResponse));
    }

    @Override // defpackage.hx0
    public z<e> b(int i) {
        z<R> J = this.a.a().f(this.e.b(re0.d.b)).H(this.d).J((long) i, TimeUnit.MILLISECONDS, this.d);
        ky0 ky0 = this.c;
        ky0.getClass();
        return J.p(new zw0(ky0)).A(ax0.a).E(new fx0(this)).p(new bx0(this)).A(new dx0(this));
    }

    public tx0 c(Throwable th) {
        Optional<ConfigurationResponse> optional = this.c.get();
        if (optional.isPresent()) {
            return new ey0(optional.get());
        }
        return new fy0((ConfigurationResponse) ConfigurationResponse.s().build());
    }

    public /* synthetic */ e d(tx0 tx0) {
        return new e(this.g.a(tx0.a()));
    }

    public /* synthetic */ void e(tx0 tx0) {
        if (tx0 instanceof dy0) {
            this.b.a(new ez0(Collections2.asMap(Collections2.newHashSet(tx0.a().n()), gx0.a), false));
            this.f.b(tx0.a().r());
        } else if (tx0 instanceof ey0) {
            this.b.a(new ez0(Collections2.asMap(Collections2.newHashSet(tx0.a().n()), cx0.a), true));
            this.f.b("-1");
        } else if (tx0 instanceof fy0) {
            this.b.a(new fz0(Collections2.asMap(Collections2.newHashSet(tx0.a().n()), ex0.a)));
            this.f.b("-1");
        }
    }
}
