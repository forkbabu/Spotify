package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.MoreObjects;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import io.reactivex.a0;

/* renamed from: ued  reason: default package */
final class ued implements f0 {
    final /* synthetic */ a0 a;
    final /* synthetic */ int b;

    ued(a0 a0Var, int i) {
        this.a = a0Var;
        this.b = i;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        this.a.onSuccess(Integer.valueOf(this.b));
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        MoreObjects.checkArgument(!bitmap.isRecycled());
        kvd.a(bitmap).b(new ked(this.a, this.b));
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
    }
}
