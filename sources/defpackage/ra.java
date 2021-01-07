package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ra  reason: default package */
public class ra {
    private List<ib> a = new ArrayList();

    /* access modifiers changed from: package-private */
    public void a(ib ibVar) {
        this.a.add(ibVar);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            ib ibVar = this.a.get(size);
            int i = ee.g;
            if (ibVar != null && !ibVar.j()) {
                ee.a(path, ((lb) ibVar.h()).m() / 100.0f, ((lb) ibVar.d()).m() / 100.0f, ((lb) ibVar.f()).m() / 360.0f);
            }
        }
    }
}
