package defpackage;

import androidx.fragment.app.c;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.share.logging.ShareMenuLogger;
import io.reactivex.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: y0d  reason: default package */
public class y0d {
    private final c a;
    private final a1d b;
    private final v0d c;
    private final ShareMenuLogger d;
    private final Map<rzc, u0d> e = new HashMap();

    public y0d(c cVar, a1d a1d, v0d v0d, ShareMenuLogger shareMenuLogger) {
        this.a = cVar;
        this.b = a1d;
        this.c = v0d;
        this.d = shareMenuLogger;
    }

    public r3 a(z<List<o8e>> zVar, t0d t0d, pzc pzc, z7e z7e, d8e d8e, l0 l0Var, qzc qzc) {
        y3 a2 = y3.a(PageIdentifiers.CONTEXTMENU_SENDTO, pzc.k().g(), pzc.h(), pzc.k().a(), pzc.k().a() != null, l0Var);
        u0d a3 = this.c.a(this.a, t0d, pzc, z7e, d8e, this.b, qzc);
        x0d x0d = new x0d(this.a, a3, a3, a2, pzc.g(), pzc.f(), zVar, z7e, this.d);
        if (this.e.get(t0d) != null) {
            this.e.get(t0d).cancel();
        }
        this.e.put(t0d, a3);
        return r3.f(x0d);
    }

    public /* synthetic */ void b(rzc rzc) {
        u0d u0d = this.e.get(rzc);
        if (u0d != null) {
            u0d.cancel();
            this.e.remove(rzc);
        }
    }
}
