package com.spotify.music.preview;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;

public class t implements f0 {
    private final ImageView a;
    private q b;
    private String c;
    private String f;
    private PreviewOverlayDrawable n;
    private boolean o;
    private final boolean p;
    private final int q;

    t(ImageView imageView, q qVar, String str, String str2, boolean z, boolean z2, int i) {
        this.a = imageView;
        this.b = qVar;
        this.c = str;
        this.f = str2;
        this.o = z;
        this.p = z2;
        this.q = i;
    }

    public static t a(ImageView imageView, q qVar, String str) {
        return c(imageView, qVar, str, "", false);
    }

    public static t b(ImageView imageView, q qVar, String str, String str2) {
        return c(imageView, qVar, str, str2, false);
    }

    public static t c(ImageView imageView, q qVar, String str, String str2, boolean z) {
        return d(imageView, qVar, str, str2, z, true, 0);
    }

    public static t d(ImageView imageView, q qVar, String str, String str2, boolean z, boolean z2, int i) {
        Object tag = imageView.getTag(C0707R.id.preview_overlay_target);
        if (tag instanceof t) {
            t tVar = (t) tag;
            String str3 = (String) x.n(str, "");
            String str4 = (String) x.n(str2, "");
            tVar.b = qVar;
            if (!TextUtils.equals(tVar.c, str3) || !TextUtils.equals(tVar.f, str4) || tVar.o != z) {
                tVar.c = str3;
                tVar.f = str4;
                tVar.n = null;
                tVar.o = z;
            }
            return tVar;
        }
        t tVar2 = new t(imageView, qVar, (String) x.n(str, ""), (String) x.n(str2, ""), z, z2, i);
        imageView.setTag(C0707R.id.preview_overlay_target, tVar2);
        return tVar2;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        MoreObjects.checkArgument(!bitmap.isRecycled());
        PreviewOverlayDrawable previewOverlayDrawable = this.n;
        if (previewOverlayDrawable != null) {
            previewOverlayDrawable.g(bitmap);
        } else {
            this.n = this.b.b(bitmap, this.c, this.f, this.o, this.p, this.q);
        }
        this.a.setImageDrawable(this.n);
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }
}
