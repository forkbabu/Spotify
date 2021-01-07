package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.MoreObjects;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;

/* renamed from: s94  reason: default package */
public class s94 implements f0 {
    private final n94 a;

    public s94(n94 n94) {
        this.a = n94;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        this.a.h(drawable);
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        MoreObjects.checkArgument(!bitmap.isRecycled());
        this.a.i(bitmap, loadedFrom == Picasso.LoadedFrom.MEMORY);
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
        this.a.j(drawable);
    }
}
