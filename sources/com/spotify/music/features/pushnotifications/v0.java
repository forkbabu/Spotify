package com.spotify.music.features.pushnotifications;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.MoreObjects;
import com.spotify.music.features.pushnotifications.model.RichPushData;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import java.util.List;

/* access modifiers changed from: package-private */
public class v0 implements f0 {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ RichPushData f;
    final /* synthetic */ String n;
    final /* synthetic */ String o;
    final /* synthetic */ String p;
    final /* synthetic */ List q;
    final /* synthetic */ x0 r;

    v0(x0 x0Var, String str, String str2, String str3, RichPushData richPushData, String str4, String str5, String str6, List list) {
        this.r = x0Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = richPushData;
        this.n = str4;
        this.o = str5;
        this.p = str6;
        this.q = list;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        this.r.e.h(this.n, this.o, this.p);
        this.r.k(this.a, this.b, this.c, this.n, this.o, this.p, this.q);
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        MoreObjects.checkArgument(!bitmap.isRecycled());
        x0.d(this.r, this.a, this.b, this.c, this.f.getFields(), this.n, this.o, this.p, this.q, bitmap);
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
    }
}
