package defpackage;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: uw9  reason: default package */
public abstract class uw9 implements xw9 {
    private final Collection<xw9> a = new ArrayList();

    @Override // defpackage.xw9
    public final void a(xw9 xw9) {
        synchronized (this.a) {
            this.a.remove(xw9);
        }
    }

    @Override // defpackage.xw9
    public void b(FirebaseCrashlytics firebaseCrashlytics, boolean z) {
        synchronized (this.a) {
            for (xw9 xw9 : this.a) {
                xw9.b(firebaseCrashlytics, z);
            }
        }
    }

    @Override // defpackage.xw9
    public final void c(xw9 xw9) {
        synchronized (this.a) {
            this.a.add(xw9);
        }
    }
}
