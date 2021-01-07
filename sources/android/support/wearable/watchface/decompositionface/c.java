package android.support.wearable.watchface.decompositionface;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.RotateDrawable;

/* access modifiers changed from: package-private */
public class c implements Icon.OnDrawableLoadedListener {
    final /* synthetic */ Icon a;
    final /* synthetic */ b b;

    c(b bVar, Icon icon) {
        this.b = bVar;
        this.a = icon;
    }

    @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
    public void onDrawableLoaded(Drawable drawable) {
        RotateDrawable rotateDrawable = new RotateDrawable();
        rotateDrawable.setDrawable(drawable);
        rotateDrawable.setPivotXRelative(false);
        rotateDrawable.setPivotYRelative(false);
        this.b.i.put(this.a, rotateDrawable);
        this.b.invalidateSelf();
    }
}
