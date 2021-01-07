package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.MoreObjects;
import com.spotify.music.features.browse.component.findcard.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;

/* renamed from: c74  reason: default package */
public class c74 implements f0 {
    private final d a;

    public c74(d dVar) {
        this.a = dVar;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        this.a.f();
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        MoreObjects.checkArgument(!bitmap.isRecycled());
        this.a.g(bitmap, loadedFrom != Picasso.LoadedFrom.MEMORY);
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
        this.a.f();
    }
}
