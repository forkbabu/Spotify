package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.MoreObjects;
import com.squareup.picasso.Picasso;
import defpackage.urc;

/* renamed from: q94  reason: default package */
public class q94 implements urc.b {
    private final n94 a;

    public q94(n94 n94) {
        this.a = n94;
    }

    @Override // defpackage.urc.b
    public void a(Drawable drawable) {
        this.a.b(drawable);
    }

    @Override // defpackage.urc.b
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom, e7 e7Var) {
        int b = t94.b(e7Var);
        MoreObjects.checkArgument(!bitmap.isRecycled());
        this.a.c(bitmap, loadedFrom == Picasso.LoadedFrom.MEMORY, b);
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // defpackage.urc.b
    public void onPrepareLoad(Drawable drawable) {
        this.a.d(drawable);
    }
}
