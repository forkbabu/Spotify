package defpackage;

import com.google.android.datatransport.g;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: gh  reason: default package */
public class gh implements ih {
    private static final Logger f = Logger.getLogger(yg.class.getName());
    private final r a;
    private final Executor b;
    private final e c;
    private final nh d;
    private final a e;

    public gh(Executor executor, e eVar, r rVar, nh nhVar, a aVar) {
        this.b = executor;
        this.c = eVar;
        this.a = rVar;
        this.d = nhVar;
        this.e = aVar;
    }

    static /* synthetic */ Object b(gh ghVar, tg tgVar, pg pgVar) {
        ghVar.d.W1(tgVar, pgVar);
        ghVar.a.a(tgVar, 1);
        return null;
    }

    static /* synthetic */ void c(gh ghVar, tg tgVar, g gVar, pg pgVar) {
        try {
            l lVar = ghVar.c.get(tgVar.b());
            if (lVar == null) {
                String format = String.format("Transport backend '%s' is not registered", tgVar.b());
                f.warning(format);
                gVar.a(new IllegalArgumentException(format));
                return;
            }
            ghVar.e.a(fh.a(ghVar, tgVar, lVar.a(pgVar)));
            gVar.a(null);
        } catch (Exception e2) {
            Logger logger = f;
            StringBuilder V0 = je.V0("Error scheduling event ");
            V0.append(e2.getMessage());
            logger.warning(V0.toString());
            gVar.a(e2);
        }
    }

    @Override // defpackage.ih
    public void a(tg tgVar, pg pgVar, g gVar) {
        this.b.execute(eh.a(this, tgVar, gVar, pgVar));
    }
}
