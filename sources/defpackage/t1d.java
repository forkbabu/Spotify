package defpackage;

import com.spotify.music.C0707R;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: t1d  reason: default package */
public final class t1d implements fjf<Map.Entry<Integer, p1d>> {
    private final wlf<q1d> a;

    public t1d(wlf<q1d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_snapchat_stories), new p1d(this.a.get(), "snapchat"));
    }
}
