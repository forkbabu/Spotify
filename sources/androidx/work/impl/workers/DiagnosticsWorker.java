package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.l;
import androidx.work.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DiagnosticsWorker extends Worker {
    private static final String o = j.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String q(ba baVar, ka kaVar, y9 y9Var, List<ga> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (ga gaVar : list) {
            Integer num = null;
            x9 a = ((z9) y9Var).a(gaVar.a);
            if (a != null) {
                num = Integer.valueOf(a.b);
            }
            sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", gaVar.a, gaVar.c, num, gaVar.b.name(), TextUtils.join(",", ((ca) baVar).a(gaVar.a)), TextUtils.join(",", ((la) kaVar).a(gaVar.a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a p() {
        WorkDatabase o2 = l.k(a()).o();
        ha z = o2.z();
        ba x = o2.x();
        ka A = o2.A();
        y9 w = o2.w();
        ia iaVar = (ia) z;
        List<ga> k = iaVar.k(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List<ga> l = iaVar.l();
        List<ga> g = iaVar.g();
        if (!((ArrayList) k).isEmpty()) {
            j c = j.c();
            String str = o;
            c.d(str, "Recently completed work:\n\n", new Throwable[0]);
            j.c().d(str, q(x, A, w, k), new Throwable[0]);
        }
        if (!((ArrayList) l).isEmpty()) {
            j c2 = j.c();
            String str2 = o;
            c2.d(str2, "Running work:\n\n", new Throwable[0]);
            j.c().d(str2, q(x, A, w, l), new Throwable[0]);
        }
        if (!((ArrayList) g).isEmpty()) {
            j c3 = j.c();
            String str3 = o;
            c3.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            j.c().d(str3, q(x, A, w, g), new Throwable[0]);
        }
        return new ListenableWorker.a.c();
    }
}
