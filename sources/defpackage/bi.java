package defpackage;

import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import defpackage.li;

/* renamed from: bi  reason: default package */
final /* synthetic */ class bi implements li.b {
    private static final bi a = new bi();

    private bi() {
    }

    public static li.b a() {
        return a;
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        int i = li.o;
        throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
    }
}
