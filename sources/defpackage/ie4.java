package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.g;

/* renamed from: ie4  reason: default package */
public class ie4 implements he4 {
    private final ee4 a;
    private final wlf<h81> b;

    ie4(ee4 ee4, wlf<h81> wlf) {
        this.a = ee4;
        this.b = wlf;
    }

    @Override // defpackage.he4
    public g<re4<b91>> a(ff4 ff4) {
        DebugFlag debugFlag = DebugFlag.FIND_USE_LOCAL_DATA_SOURCE;
        return this.a.a(ff4).N().O(new qc4(this));
    }

    public /* synthetic */ re4 b(b91 b91) {
        Logger.l("%s completed", this.a.toString());
        return re4.c(b91);
    }
}
