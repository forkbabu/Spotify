package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public abstract class c<T> {
    final Picasso a;
    final y b;
    final WeakReference<T> c;
    final boolean d;
    final int e;
    final int f;
    final int g;
    final Drawable h;
    final String i;
    final Object j;
    boolean k;
    boolean l;

    static class a<M> extends WeakReference<M> {
        final c a;

        a(c cVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.a = cVar;
        }
    }

    c(Picasso picasso, T t, y yVar, int i2, int i3, int i4, Drawable drawable, String str, Object obj, boolean z) {
        a aVar;
        this.a = picasso;
        this.b = yVar;
        if (t == null) {
            aVar = null;
        } else {
            aVar = new a(this, t, picasso.k);
        }
        this.c = aVar;
        this.e = i2;
        this.f = i3;
        this.d = z;
        this.g = i4;
        this.h = drawable;
        this.i = str;
        this.j = obj == null ? this : obj;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.l = true;
    }

    /* access modifiers changed from: package-private */
    public abstract void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    /* access modifiers changed from: package-private */
    public abstract void c(Exception exc);

    /* access modifiers changed from: package-private */
    public T d() {
        WeakReference<T> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
