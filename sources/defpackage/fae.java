package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: fae  reason: default package */
public final class fae implements fjf<Map.Entry<Integer, w9e>> {
    private final wlf<dae> a;

    public fae(wlf<dae> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_snapchat_stories), this.a.get());
    }
}
