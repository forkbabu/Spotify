package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* access modifiers changed from: package-private */
public class p extends c<ImageView> {
    g m;

    p(Picasso picasso, ImageView imageView, y yVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, g gVar, boolean z) {
        super(picasso, imageView, yVar, i, i2, i3, drawable, str, obj, z);
        this.m = gVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.c
    public void a() {
        this.l = true;
        if (this.m != null) {
            this.m = null;
        }
    }

    @Override // com.squareup.picasso.c
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        T t = this.c.get();
        if (t != null) {
            Picasso picasso = this.a;
            w.b(t, picasso.e, bitmap, loadedFrom, this.d, picasso.m);
            g gVar = this.m;
            if (gVar != null) {
                gVar.onSuccess();
            }
        }
    }

    @Override // com.squareup.picasso.c
    public void c(Exception exc) {
        T t = this.c.get();
        if (t != null) {
            Drawable drawable = t.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i = this.g;
            if (i != 0) {
                t.setImageResource(i);
            } else {
                Drawable drawable2 = this.h;
                if (drawable2 != null) {
                    t.setImageDrawable(drawable2);
                }
            }
            g gVar = this.m;
            if (gVar != null) {
                gVar.onError(exc);
            }
        }
    }
}
