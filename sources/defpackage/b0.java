package defpackage;

import android.support.wearable.view.drawer.WearableNavigationDrawer;

/* renamed from: b0  reason: default package */
public class b0 implements f0 {
    private final a a;
    private final WearableNavigationDrawer b;
    private final boolean c;

    /* renamed from: b0$a */
    public interface a {
    }

    public b0(WearableNavigationDrawer wearableNavigationDrawer, a aVar, boolean z) {
        this.b = wearableNavigationDrawer;
        this.a = aVar;
        ((c0) aVar).a(wearableNavigationDrawer, this);
        this.c = z;
    }

    @Override // defpackage.f0
    public void a(WearableNavigationDrawer.c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Received null adapter.");
        }
        throw null;
    }

    @Override // defpackage.f0
    public boolean b() {
        if (!this.b.f()) {
            return false;
        }
        if (this.c) {
            this.b.l();
            return true;
        }
        this.b.b();
        return true;
    }
}
