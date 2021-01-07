package androidx.mediarouter.app;

import android.view.ViewTreeObserver;
import java.util.Map;

/* access modifiers changed from: package-private */
public class e implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Map a;
    final /* synthetic */ Map b;
    final /* synthetic */ b c;

    e(b bVar, Map map, Map map2) {
        this.c = bVar;
        this.a = map;
        this.b = map2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.c.L.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.c.f(this.a, this.b);
    }
}
