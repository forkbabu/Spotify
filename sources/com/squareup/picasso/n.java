package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import okio.o;

/* access modifiers changed from: package-private */
public class n extends i {
    n(Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.i, com.squareup.picasso.a0
    public boolean c(y yVar) {
        return "file".equals(yVar.c.getScheme());
    }

    @Override // com.squareup.picasso.i, com.squareup.picasso.a0
    public a0.a f(y yVar, int i) {
        return new a0.a(null, o.i(this.a.getContentResolver().openInputStream(yVar.c)), Picasso.LoadedFrom.DISK, new v5(yVar.c.getPath()).k("Orientation", 1));
    }
}
