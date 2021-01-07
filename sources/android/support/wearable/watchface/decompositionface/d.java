package android.support.wearable.watchface.decompositionface;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.support.wearable.watchface.decomposition.FontComponent;

/* access modifiers changed from: package-private */
public class d implements Icon.OnDrawableLoadedListener {
    final /* synthetic */ FontComponent a;
    final /* synthetic */ b b;

    d(b bVar, FontComponent fontComponent) {
        this.b = bVar;
        this.a = fontComponent;
    }

    @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
    public void onDrawableLoaded(Drawable drawable) {
        e eVar = new e();
        eVar.c(drawable);
        eVar.b(this.a.f());
        this.b.j.put(this.a.e(), eVar);
        this.b.invalidateSelf();
    }
}
