package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.a;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.b;
import androidx.work.impl.utils.e;
import androidx.work.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f {
    private static final String a = j.f("Schedulers");

    static e a(Context context, l lVar) {
        e eVar;
        if (Build.VERSION.SDK_INT >= 23) {
            b bVar = new b(context, lVar);
            e.a(context, SystemJobService.class, true);
            j.c().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        try {
            eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            j.c().a(a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
        } catch (Throwable th) {
            j.c().a(a, "Unable to create GCM Scheduler", th);
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
        e.a(context, SystemAlarmService.class, true);
        j.c().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    /* JADX INFO: finally extract failed */
    public static void b(a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list != null && list.size() != 0) {
            ha z = workDatabase.z();
            workDatabase.c();
            try {
                ia iaVar = (ia) z;
                List<ga> i = iaVar.i(aVar.e());
                List<ga> g = iaVar.g();
                ArrayList arrayList = (ArrayList) i;
                if (arrayList.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        iaVar.u(((ga) it.next()).a, currentTimeMillis);
                    }
                }
                workDatabase.s();
                workDatabase.h();
                ArrayList arrayList2 = (ArrayList) i;
                if (arrayList2.size() > 0) {
                    ga[] gaVarArr = (ga[]) arrayList2.toArray(new ga[arrayList2.size()]);
                    for (e eVar : list) {
                        if (eVar.d()) {
                            eVar.c(gaVarArr);
                        }
                    }
                }
                ArrayList arrayList3 = (ArrayList) g;
                if (arrayList3.size() > 0) {
                    ga[] gaVarArr2 = (ga[]) arrayList3.toArray(new ga[arrayList3.size()]);
                    for (e eVar2 : list) {
                        if (!eVar2.d()) {
                            eVar2.c(gaVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.h();
                throw th;
            }
        }
    }
}
