package com.spotify.mobile.android.util.connectivity;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import io.reactivex.t;
import io.reactivex.u;

public final /* synthetic */ class n implements u {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ContentResolver c;
    public final /* synthetic */ Uri d;

    public /* synthetic */ n(Handler handler, Context context, ContentResolver contentResolver, Uri uri) {
        this.a = handler;
        this.b = context;
        this.c = contentResolver;
        this.d = uri;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        i0.e(this.a, this.b, this.c, this.d, tVar);
    }
}
