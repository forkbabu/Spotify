package androidx.appcompat.app;

import android.graphics.Rect;
import androidx.appcompat.widget.s;

/* access modifiers changed from: package-private */
public class l implements s.a {
    final /* synthetic */ j a;

    l(j jVar) {
        this.a = jVar;
    }

    @Override // androidx.appcompat.widget.s.a
    public void a(Rect rect) {
        rect.top = this.a.e0(null, rect);
    }
}
