package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import io.reactivex.d0;
import io.reactivex.z;
import java.util.Map;

/* renamed from: zv3  reason: default package */
public class zv3 {
    private final vv3 a;
    private final rf3 b;

    public zv3(vv3 vv3, rf3 rf3) {
        this.a = vv3;
        this.b = rf3;
    }

    public z<b91> a(String str) {
        l0 z = l0.z(str);
        MoreObjects.checkArgument(z.q() == LinkType.ALBUM, "SpotifyLink needs to be of link type Album");
        return this.b.a().E().s(new uv3(this, z)).e(b91.class);
    }

    public /* synthetic */ d0 b(l0 l0Var, Map map) {
        return this.a.a(l0Var.i(), map);
    }
}
