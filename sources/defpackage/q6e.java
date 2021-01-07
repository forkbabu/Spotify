package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: q6e  reason: default package */
public final class q6e implements fjf<Map.Entry<Integer, List<i6e>>> {
    private final wlf<v5e> a;

    public q6e(wlf<v5e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_facebook_messenger), Collections.singletonList(this.a.get()));
    }
}
