package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: n6e  reason: default package */
public final class n6e implements fjf<Map.Entry<Integer, List<i6e>>> {
    private final wlf<aae> a;
    private final wlf<y5e> b;
    private final wlf<e6e> c;
    private final wlf<f7e> d;

    public n6e(wlf<aae> wlf, wlf<y5e> wlf2, wlf<e6e> wlf3, wlf<f7e> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static Map.Entry<Integer, List<i6e>> a(aae aae, y5e y5e, e6e e6e, f7e f7e) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_instagram_stories), Arrays.asList(f7e.a(aae), e6e.a(aae), y5e.a(aae)));
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
