package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: j6e  reason: default package */
public final class j6e implements fjf<Map.Entry<Integer, List<i6e>>> {
    private final wlf<i5e> a;

    public j6e(wlf<i5e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_copy_link), Collections.singletonList(this.a.get()));
    }
}
