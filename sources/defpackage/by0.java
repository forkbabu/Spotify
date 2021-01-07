package defpackage;

import com.google.common.base.Optional;
import com.spotify.http.u;
import com.spotify.pses.v1.proto.ConfigurationRequest;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import io.reactivex.d0;
import io.reactivex.z;

/* renamed from: by0  reason: default package */
public class by0 {
    private final ay0 a;
    private final ux0 b;
    private final ox0 c;

    public by0(u uVar, ux0 ux0, ox0 ox0) {
        this.a = (ay0) uVar.c(ay0.class);
        this.b = ux0;
        this.c = ox0;
    }

    public z<ConfigurationResponse> a() {
        ux0 ux0 = this.b;
        ux0.getClass();
        return z.y(new mx0(ux0)).s(new nx0(this));
    }

    public d0 b(Optional optional) {
        if (optional.isPresent()) {
            return z.z(optional.get());
        }
        ay0 ay0 = this.a;
        ConfigurationRequest.b i = ConfigurationRequest.i();
        i.m(this.c.get());
        return ay0.a((ConfigurationRequest) i.build());
    }
}
