package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import okio.o;

/* access modifiers changed from: package-private */
public class d extends a0 {
    private final Context a;
    private final Object b = new Object();
    private AssetManager c;

    d(Context context) {
        this.a = context;
    }

    @Override // com.squareup.picasso.a0
    public boolean c(y yVar) {
        Uri uri = yVar.c;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.a0
    public a0.a f(y yVar, int i) {
        if (this.c == null) {
            synchronized (this.b) {
                if (this.c == null) {
                    this.c = this.a.getAssets();
                }
            }
        }
        return new a0.a(o.i(this.c.open(yVar.c.toString().substring(22))), Picasso.LoadedFrom.DISK);
    }
}
