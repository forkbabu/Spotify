package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.g;
import io.reactivex.k;
import okhttp3.e0;
import retrofit2.v;

/* renamed from: mf4  reason: default package */
public class mf4 {
    private final cf4 a;
    private final k<v<e0>, b91> b;
    private final wlf<h81> c;
    private final boolean d;

    mf4(cf4 cf4, k<v<e0>, b91> kVar, wlf<h81> wlf, boolean z) {
        this.a = cf4;
        this.b = kVar;
        this.c = wlf;
        this.d = z;
    }

    public g<re4<b91>> a(ne4 ne4) {
        Logger.l("Trying to resolve online browse request: %s", ne4.toString());
        DebugFlag debugFlag = DebugFlag.FIND_USE_LOCAL_DATA_SOURCE;
        if (this.d) {
            return ne4.b(this.a).N().l(this.b).O(yd4.a);
        }
        return ne4.a(this.a).N().O(new qd4(ne4));
    }
}
