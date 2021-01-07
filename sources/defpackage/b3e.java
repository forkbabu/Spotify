package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: b3e  reason: default package */
public final class b3e implements fjf<Map.Entry<Integer, x2e>> {
    private final wlf<o3e> a;

    public b3e(wlf<o3e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_facebook_messenger), this.a.get());
    }
}
