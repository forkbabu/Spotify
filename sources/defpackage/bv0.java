package defpackage;

import com.spotify.libs.connect.sorting.data.DevicePickerSortingDatabase;
import com.spotify.libs.connect.sorting.data.b;
import com.spotify.libs.connect.sorting.hashing.a;
import io.reactivex.y;

/* renamed from: bv0  reason: default package */
public final class bv0 implements fjf<zu0> {
    private final wlf<DevicePickerSortingDatabase> a;
    private final wlf<b> b;
    private final wlf<a> c;
    private final wlf<aqe> d;
    private final wlf<y> e;

    public bv0(wlf<DevicePickerSortingDatabase> wlf, wlf<b> wlf2, wlf<a> wlf3, wlf<aqe> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zu0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
