package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: z9e  reason: default package */
public final class z9e implements fjf<Map.Entry<Integer, w9e>> {
    private final wlf<x9e> a;

    public z9e(wlf<x9e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_facebook_stories), this.a.get());
    }
}
