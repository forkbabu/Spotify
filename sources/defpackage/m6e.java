package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: m6e  reason: default package */
public final class m6e implements fjf<Map.Entry<Integer, List<i6e>>> {
    private final wlf<x9e> a;
    private final wlf<y5e> b;
    private final wlf<e6e> c;
    private final wlf<f7e> d;

    public m6e(wlf<x9e> wlf, wlf<y5e> wlf2, wlf<e6e> wlf3, wlf<f7e> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static Map.Entry<Integer, List<i6e>> a(x9e x9e, y5e y5e, e6e e6e, f7e f7e) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_facebook_stories), Arrays.asList(f7e.a(x9e), e6e.a(x9e), y5e.a(x9e)));
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
