package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j0 implements a {
    static final a a = new j0();

    private j0() {
    }

    @Override // com.google.android.gms.tasks.a
    public final Object a(g gVar) {
        if (gVar.r()) {
            return (Bundle) gVar.n();
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(gVar.m()).length();
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
