package com.google.android.gms.cast.framework.media.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.internal.cast.h;

public final class d extends AsyncTask<Uri, Long, Bitmap> {
    private static final b c = new b("FetchBitmapTask");
    private final e a;
    private final b b;

    public d(Context context, b bVar) {
        this(context, 0, 0, false, 2097152, 5, 333, 10000, bVar);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final Bitmap doInBackground(Uri[] uriArr) {
        Uri[] uriArr2 = uriArr;
        if (uriArr2.length != 1 || uriArr2[0] == null) {
            return null;
        }
        try {
            return this.a.C1(uriArr2[0]);
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        b bVar = this.b;
        if (bVar != null) {
            bVar.b(bitmap2);
        }
    }

    public d(Context context, int i, int i2, b bVar) {
        this(context, i, i2, false, 2097152, 5, 333, 10000, bVar);
    }

    private d(Context context, int i, int i2, boolean z, long j, int i3, int i4, int i5, b bVar) {
        this.a = h.a(context.getApplicationContext(), this, new f(this, null), i, i2, false);
        this.b = bVar;
    }
}
