package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.s;
import java.util.Map;

/* renamed from: mx6  reason: default package */
public final class mx6 implements fjf<lx6> {
    private final wlf<c> a;
    private final wlf<wt6> b;
    private final wlf<e0> c;
    private final wlf<s<Map<String, String>>> d;

    public mx6(wlf<c> wlf, wlf<wt6> wlf2, wlf<e0> wlf3, wlf<s<Map<String, String>>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lx6(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
