package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: u6e  reason: default package */
public final class u6e implements fjf<Map.Entry<Integer, List<i6e>>> {
    private final wlf<c7e> a;

    public u6e(wlf<c7e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_more), Collections.singletonList(this.a.get()));
    }
}
