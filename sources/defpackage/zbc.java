package defpackage;

import com.spotify.pageloader.NetworkErrorReason;
import io.reactivex.z;

/* renamed from: zbc  reason: default package */
public final class zbc implements fjf<z<NetworkErrorReason>> {
    private final wlf<tbc> a;

    public zbc(wlf<tbc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a();
    }
}
