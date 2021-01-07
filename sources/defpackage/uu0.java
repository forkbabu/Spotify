package defpackage;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.spotify.libs.connect.sorting.data.DevicePickerSortingDatabase;
import kotlin.jvm.internal.h;

/* renamed from: uu0  reason: default package */
public final class uu0 implements fjf<DevicePickerSortingDatabase> {
    private final wlf<Context> a;

    public uu0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        h.e(context, "context");
        RoomDatabase d = androidx.room.h.a(context, DevicePickerSortingDatabase.class, "DevicePickerSortingDatabase").d();
        h.d(d, "Room.databaseBuilder(\n  …DB_NAME\n        ).build()");
        return (DevicePickerSortingDatabase) d;
    }
}
