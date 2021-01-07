package defpackage;

import android.support.wearable.view.drawer.WearableNavigationDrawer;

/* renamed from: d0  reason: default package */
public class d0 implements f0 {
    private final a a;
    private final boolean b;
    private int c = 0;

    /* renamed from: d0$a */
    public interface a {
    }

    public d0(a aVar, boolean z) {
        this.b = z;
        this.a = aVar;
        ((e0) aVar).b(this);
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
        return false;
    }
}
