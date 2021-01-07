package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.endpoint.model.BansResponse;
import io.reactivex.s;

/* renamed from: h69  reason: default package */
public class h69 {
    private final j69 a;
    private s<BansResponse> b;

    public h69(j69 j69) {
        this.a = j69;
    }

    private s<BansResponse> c() {
        if (this.b == null) {
            this.b = this.a.a().v0(1).h1();
        }
        return this.b;
    }

    public s<Boolean> a() {
        return c().j0(f69.a);
    }

    public s<Boolean> b() {
        return c().j0(e69.a);
    }
}
