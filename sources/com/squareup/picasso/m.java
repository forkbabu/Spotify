package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;

/* access modifiers changed from: package-private */
public class m extends c<Object> {
    private final Object m = new Object();
    private g n;

    m(Picasso picasso, y yVar, int i, int i2, Object obj, String str, g gVar) {
        super(picasso, null, yVar, i, i2, 0, null, str, obj, false);
        this.n = gVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.c
    public void a() {
        this.l = true;
        this.n = null;
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.c
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        g gVar = this.n;
        if (gVar != null) {
            gVar.onSuccess();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.c
    public void c(Exception exc) {
        g gVar = this.n;
        if (gVar != null) {
            gVar.onError(exc);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.c
    public Object d() {
        return this.m;
    }
}
