package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: a3e  reason: default package */
public final class a3e implements fjf<Map.Entry<Integer, x2e>> {
    private final wlf<m3e> a;

    public a3e(wlf<m3e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_facebook_feed), this.a.get());
    }
}
