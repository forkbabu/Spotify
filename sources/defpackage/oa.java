package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.g;
import java.util.concurrent.Executor;

/* renamed from: oa  reason: default package */
public class oa implements na {
    private final g a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Executor c = new a();

    /* renamed from: oa$a */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            oa.this.d(runnable);
        }
    }

    public oa(Executor executor) {
        this.a = new g(executor);
    }

    public void a(Runnable runnable) {
        this.a.execute(runnable);
    }

    public g b() {
        return this.a;
    }

    public Executor c() {
        return this.c;
    }

    public void d(Runnable runnable) {
        this.b.post(runnable);
    }
}
