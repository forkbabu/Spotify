package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import okio.o;

/* access modifiers changed from: package-private */
public class i extends a0 {
    final Context a;

    i(Context context) {
        this.a = context;
    }

    @Override // com.squareup.picasso.a0
    public boolean c(y yVar) {
        return "content".equals(yVar.c.getScheme());
    }

    @Override // com.squareup.picasso.a0
    public a0.a f(y yVar, int i) {
        return new a0.a(o.i(this.a.getContentResolver().openInputStream(yVar.c)), Picasso.LoadedFrom.DISK);
    }
}
