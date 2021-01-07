package android.support.wearable.complications.rendering;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* access modifiers changed from: package-private */
public class b implements Icon.OnDrawableLoadedListener {
    final /* synthetic */ f a;

    b(f fVar) {
        this.a = fVar;
    }

    @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
    public void onDrawableLoaded(Drawable drawable) {
        if (drawable != null) {
            this.a.h = drawable;
            this.a.h.mutate();
            f.c(this.a);
        }
    }
}
