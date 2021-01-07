package defpackage;

import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import defpackage.li;

/* access modifiers changed from: package-private */
/* renamed from: fi  reason: default package */
public final /* synthetic */ class fi implements li.b {
    private static final fi a = new fi();

    private fi() {
    }

    public static li.b a() {
        return a;
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        int i = li.o;
        throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
    }
}
