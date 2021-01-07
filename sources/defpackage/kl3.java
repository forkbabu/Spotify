package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.api.i;
import io.reactivex.z;

/* renamed from: kl3  reason: default package */
public class kl3 implements i {
    private final vl3 a;

    public kl3(vl3 vl3) {
        this.a = vl3;
    }

    @Override // com.spotify.music.features.ads.api.i
    public z<Response> a() {
        return this.a.a().T().s(pk3.a);
    }
}
