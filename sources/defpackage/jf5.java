package defpackage;

import com.spotify.music.features.hiddencontent.model.BansResponse;
import io.reactivex.s;

/* renamed from: jf5  reason: default package */
public class jf5 {
    private final gf5 a;
    private s<BansResponse> b;

    public jf5(gf5 gf5) {
        this.a = gf5;
    }

    public s<BansResponse> a() {
        if (this.b == null) {
            this.b = this.a.a().r0(if5.a).v0(1).h1();
        }
        return this.b;
    }
}
