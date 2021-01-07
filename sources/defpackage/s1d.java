package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: s1d  reason: default package */
public final class s1d implements fjf<Map.Entry<Integer, p1d>> {
    private final wlf<q1d> a;

    public s1d(wlf<q1d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_instagram_stories), new p1d(this.a.get(), "igstory"));
    }
}
