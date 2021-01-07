package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: s6e  reason: default package */
public final class s6e implements fjf<Map.Entry<Integer, List<i6e>>> {
    private final wlf<z6e> a;

    public s6e(wlf<z6e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_generic_sms), Collections.singletonList(this.a.get()));
    }
}
