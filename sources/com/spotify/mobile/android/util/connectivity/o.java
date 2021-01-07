package com.spotify.mobile.android.util.connectivity;

import android.content.ContentResolver;
import android.database.ContentObserver;

public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ ContentResolver a;
    public final /* synthetic */ ContentObserver b;

    public /* synthetic */ o(ContentResolver contentResolver, ContentObserver contentObserver) {
        this.a = contentResolver;
        this.b = contentObserver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.unregisterContentObserver(this.b);
    }
}
