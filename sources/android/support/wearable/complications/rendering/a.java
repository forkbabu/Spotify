package android.support.wearable.complications.rendering;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* access modifiers changed from: package-private */
public class a implements Icon.OnDrawableLoadedListener {
    final /* synthetic */ f a;

    a(f fVar) {
        this.a = fVar;
    }

    @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
    public void onDrawableLoaded(Drawable drawable) {
        if (drawable != null) {
            this.a.g = drawable;
            this.a.g.mutate();
            f.c(this.a);
        }
    }
}
