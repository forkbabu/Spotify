package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: w6e  reason: default package */
public final class w6e implements fjf<Map.Entry<Integer, List<i6e>>> {
    private final wlf<k5e> a;

    public w6e(wlf<k5e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_whats_app), Collections.singletonList(this.a.get()));
    }
}
