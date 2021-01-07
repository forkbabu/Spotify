package com.spotify.music.features.pushnotifications;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.MoreObjects;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import java.util.List;

/* access modifiers changed from: package-private */
public class w0 implements f0 {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String f;
    final /* synthetic */ String n;
    final /* synthetic */ String o;
    final /* synthetic */ List p;
    final /* synthetic */ x0 q;

    w0(x0 x0Var, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.q = x0Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.n = str5;
        this.o = str6;
        this.p = list;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        this.q.e.h(this.f, this.n, this.o);
        this.q.k(this.a, this.b, this.c, this.f, this.n, this.o, this.p);
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        MoreObjects.checkArgument(!bitmap.isRecycled());
        x0.a(this.q, this.a, this.b, this.c, this.f, this.n, this.o, this.p, bitmap);
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
    }
}
