package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: o6e  reason: default package */
public final class o6e implements fjf<Map.Entry<Integer, List<i6e>>> {
    private final wlf<k5e> a;

    public o6e(wlf<k5e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_line), Collections.singletonList(this.a.get()));
    }
}
