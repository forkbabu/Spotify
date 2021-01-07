package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: v6e  reason: default package */
public final class v6e implements fjf<Map.Entry<Integer, List<i6e>>> {
    private final wlf<k5e> a;
    private final wlf<b6e> b;
    private final wlf<t7e> c;

    public v6e(wlf<k5e> wlf, wlf<b6e> wlf2, wlf<t7e> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static Map.Entry<Integer, List<i6e>> a(k5e k5e, Object obj, t7e t7e) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_twitter), Arrays.asList(((b6e) obj).a(t7e), k5e));
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get());
    }
}
