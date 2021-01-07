package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: cae  reason: default package */
public final class cae implements fjf<Map.Entry<Integer, w9e>> {
    private final wlf<aae> a;

    public cae(wlf<aae> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_instagram_stories), this.a.get());
    }
}
