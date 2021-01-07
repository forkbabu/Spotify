package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.api.g;
import io.reactivex.s;
import io.reactivex.v;
import java.util.Map;

/* renamed from: fl3  reason: default package */
public class fl3 implements g {
    private final pl3 a;

    public fl3(pl3 pl3) {
        this.a = pl3;
    }

    @Override // com.spotify.music.features.ads.api.g
    public s<Response> a(String str, Map<String, String> map) {
        return s.B(new nk3(this, str, map));
    }

    public /* synthetic */ v b(String str, Map map) {
        if (str == null) {
            return this.a.a(map).P();
        }
        return this.a.b(map, str).P();
    }
}
