package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.api.d;
import io.reactivex.s;
import io.reactivex.v;
import java.util.Map;

/* renamed from: xk3  reason: default package */
public class xk3 implements d {
    private final rl3 a;

    public xk3(rl3 rl3) {
        this.a = rl3;
    }

    @Override // com.spotify.music.features.ads.api.d
    public s<Response> a(Map<String, Object> map) {
        return s.B(new hk3(this, map));
    }

    public /* synthetic */ v b(Map map) {
        return this.a.a(map).P();
    }
}
