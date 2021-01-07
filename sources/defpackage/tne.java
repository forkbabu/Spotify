package defpackage;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.connectivity.v;
import com.spotify.music.settings.a;
import com.spotify.superbird.ota.model.g;
import io.reactivex.z;
import java.util.List;

/* renamed from: tne  reason: default package */
public class tne {
    private final v a;
    private final a b;

    public tne(v vVar, a aVar) {
        this.a = vVar;
        this.b = aVar;
    }

    public z<Boolean> a(List<g> list, boolean z) {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        if (list.isEmpty()) {
            return z.z(bool);
        }
        boolean z2 = false;
        g gVar = list.get(0);
        if (gVar.critical() && !z) {
            return z.z(bool2);
        }
        if (this.a.c() == ConnectionType.CONNECTION_TYPE_WLAN) {
            z2 = true;
        }
        if (z2) {
            return z.z(bool2);
        }
        if (gVar.sizeBytes() < 10485760) {
            return z.z(bool2);
        }
        return this.b.a().j0(sne.a).N0(1).B0().p(jne.a).F(bool);
    }
}
