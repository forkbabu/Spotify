package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.MoreObjects;
import com.squareup.picasso.Picasso;
import defpackage.urc;

/* renamed from: s74  reason: default package */
public class s74 implements urc.b {
    private final r74 a;

    public s74(r74 r74) {
        this.a = r74;
    }

    @Override // defpackage.urc.b
    public void a(Drawable drawable) {
        this.a.b(drawable);
    }

    @Override // defpackage.urc.b
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom, e7 e7Var) {
        int b = t74.b(e7Var);
        MoreObjects.checkArgument(!bitmap.isRecycled());
        this.a.c(bitmap, b);
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // defpackage.urc.b
    public void onPrepareLoad(Drawable drawable) {
        this.a.d(drawable);
    }
}
