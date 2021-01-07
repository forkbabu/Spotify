package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.WorkInfo;
import androidx.work.e;
import androidx.work.f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.d;
import androidx.work.impl.foreground.c;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

public class l implements f {
    private final na a;
    final androidx.work.impl.foreground.a b;
    final ha c;

    class a implements Runnable {
        final /* synthetic */ androidx.work.impl.utils.futures.a a;
        final /* synthetic */ UUID b;
        final /* synthetic */ e c;
        final /* synthetic */ Context f;

        a(androidx.work.impl.utils.futures.a aVar, UUID uuid, e eVar, Context context) {
            this.a = aVar;
            this.b = uuid;
            this.c = eVar;
            this.f = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.a.isCancelled()) {
                    String uuid = this.b.toString();
                    WorkInfo.State n2 = ((ia) l.this.c).n(uuid);
                    if (n2 == null || n2.d()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    ((d) l.this.b).h(uuid, this.c);
                    this.f.startService(c.a(this.f, uuid, this.c));
                }
                this.a.t(null);
            } catch (Throwable th) {
                this.a.z(th);
            }
        }
    }

    public l(WorkDatabase workDatabase, androidx.work.impl.foreground.a aVar, na naVar) {
        this.b = aVar;
        this.a = naVar;
        this.c = workDatabase.z();
    }

    public ListenableFuture<Void> a(Context context, UUID uuid, e eVar) {
        androidx.work.impl.utils.futures.a y = androidx.work.impl.utils.futures.a.y();
        ((oa) this.a).a(new a(y, uuid, eVar, context));
        return y;
    }
}
