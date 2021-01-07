package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.c;
import kotlin.jvm.internal.h;

/* renamed from: yba  reason: default package */
public final class yba implements c {
    private final yu0 a;

    public yba(yu0 yu0) {
        h.e(yu0, "dataManager");
        this.a = yu0;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.c
    public void b() {
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.c
    public String name() {
        return "OnLogoutDeviceSortingDataCleaner";
    }
}
