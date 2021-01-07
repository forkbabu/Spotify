package defpackage;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: jh  reason: default package */
public final class jh implements fjf<SchedulerConfig> {
    private final wlf<ti> a;

    public jh(wlf<ti> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        SchedulerConfig.a aVar = new SchedulerConfig.a();
        Priority priority = Priority.DEFAULT;
        SchedulerConfig.b.a a2 = SchedulerConfig.b.a();
        a2.b(30000);
        a2.d(86400000);
        aVar.a(priority, a2.a());
        Priority priority2 = Priority.HIGHEST;
        SchedulerConfig.b.a a3 = SchedulerConfig.b.a();
        a3.b(1000);
        a3.d(86400000);
        aVar.a(priority2, a3.a());
        Priority priority3 = Priority.VERY_LOW;
        SchedulerConfig.b.a a4 = SchedulerConfig.b.a();
        a4.b(86400000);
        a4.d(86400000);
        a4.c(Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.NETWORK_UNMETERED, SchedulerConfig.Flag.DEVICE_IDLE))));
        aVar.a(priority3, a4.a());
        aVar.c(this.a.get());
        return aVar.b();
    }
}
