package defpackage;

import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: tr  reason: default package */
public class tr implements ThreadFactory {
    private final String a;
    private final ThreadFactory b = Executors.defaultThreadFactory();

    public tr(@RecentlyNonNull String str) {
        g.k(str, "Name must not be null");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @RecentlyNonNull
    public Thread newThread(@RecentlyNonNull Runnable runnable) {
        Thread newThread = this.b.newThread(new ur(runnable));
        newThread.setName(this.a);
        return newThread;
    }
}
