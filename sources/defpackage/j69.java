package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.endpoint.model.BansResponse;
import io.reactivex.s;

/* renamed from: j69  reason: default package */
public class j69 {
    private final ha9 a;
    private s<BansResponse> b;

    public j69(ha9 ha9) {
        this.a = ha9;
    }

    public s<BansResponse> a() {
        s<BansResponse> sVar = this.b;
        if (sVar != null) {
            return sVar;
        }
        s<BansResponse> h1 = this.a.a(bne.b(new ane("addTime", true, null, 4))).r0(g69.a).v0(1).h1();
        this.b = h1;
        return h1;
    }
}
