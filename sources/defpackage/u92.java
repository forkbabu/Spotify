package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: u92  reason: default package */
public class u92 implements ia2 {
    private final Handler a = new Handler(Looper.getMainLooper());
    private volatile boolean b;

    private u92() {
    }

    public static u92 b() {
        return new u92();
    }

    @Override // defpackage.ia2
    public void a(Runnable runnable) {
        if (!this.b) {
            this.a.post(runnable);
        }
    }

    @Override // defpackage.w92
    public void dispose() {
        this.a.removeCallbacksAndMessages(null);
        this.b = true;
    }
}
