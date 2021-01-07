package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: t6e  reason: default package */
public final class t6e implements fjf<Map.Entry<Integer, List<i6e>>> {
    private final wlf<dae> a;
    private final wlf<y5e> b;
    private final wlf<e6e> c;

    public t6e(wlf<dae> wlf, wlf<y5e> wlf2, wlf<e6e> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static Map.Entry<Integer, List<i6e>> a(dae dae, y5e y5e, e6e e6e) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_snapchat_stories), Arrays.asList(e6e.a(dae), y5e.a(dae)));
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get());
    }
}
