package defpackage;

import com.spotify.player.model.Context;
import defpackage.wsa;

/* renamed from: bc8  reason: default package */
public class bc8 {
    private final rqe a;

    public bc8(rqe rqe) {
        this.a = rqe;
    }

    public p81 a(int i) {
        wsa.a a2 = wsa.a();
        a2.e(this.a);
        a2.a(i);
        a2.d(Context.Metadata.SHUFFLE_ALGORITHM_HISTORY);
        return pqa.a(a2.build());
    }
}
