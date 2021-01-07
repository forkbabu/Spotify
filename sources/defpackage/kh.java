package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;

/* renamed from: kh  reason: default package */
public final class kh implements fjf<r> {
    private final wlf<Context> a;
    private final wlf<nh> b;
    private final wlf<SchedulerConfig> c;
    private final wlf<ti> d;

    public kh(wlf<Context> wlf, wlf<nh> wlf2, wlf<SchedulerConfig> wlf3, wlf<ti> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        nh nhVar = this.b.get();
        SchedulerConfig schedulerConfig = this.c.get();
        ti tiVar = this.d.get();
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(context, nhVar, schedulerConfig);
        }
        return new a(context, nhVar, tiVar, schedulerConfig);
    }
}
