package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.api.a;
import io.reactivex.z;

/* renamed from: rk3  reason: default package */
public class rk3 implements a {
    private final ul3 a;

    public rk3(ul3 ul3) {
        this.a = ul3;
    }

    @Override // com.spotify.music.features.ads.api.a
    public z<Response> a(double d) {
        return this.a.a(d).s(new dk3(d));
    }
}
