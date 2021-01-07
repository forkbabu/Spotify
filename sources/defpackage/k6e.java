package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: k6e  reason: default package */
public final class k6e implements fjf<Map.Entry<Integer, List<i6e>>> {
    private final wlf<r5e> a;

    public k6e(wlf<r5e> wlf) {
        this.a = wlf;
    }

    public static Map.Entry<Integer, List<i6e>> a(r5e r5e) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_download), Collections.singletonList(r5e));
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
