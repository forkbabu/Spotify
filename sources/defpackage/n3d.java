package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: n3d  reason: default package */
class n3d extends BitmapDrawable {
    final /* synthetic */ o3d a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n3d(o3d o3d, Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.a = o3d;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.c;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.c;
    }
}
