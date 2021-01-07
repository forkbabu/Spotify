package defpackage;

import com.spotify.libs.connect.sorting.data.DevicePickerSortingDatabase;
import com.spotify.libs.connect.sorting.data.b;
import kotlin.jvm.internal.h;

/* renamed from: tu0  reason: default package */
public final class tu0 implements fjf<b> {
    private final wlf<DevicePickerSortingDatabase> a;

    public tu0(wlf<DevicePickerSortingDatabase> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        DevicePickerSortingDatabase devicePickerSortingDatabase = this.a.get();
        h.e(devicePickerSortingDatabase, "database");
        b t = devicePickerSortingDatabase.t();
        yif.g(t, "Cannot return null from a non-@Nullable @Provides method");
        return t;
    }
}
