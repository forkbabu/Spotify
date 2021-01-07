package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* renamed from: k1  reason: default package */
public final class k1 {
    private final n a;
    private final m b;
    private final ComponentName c;
    private final PendingIntent d;

    k1(n nVar, m mVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.a = nVar;
        this.b = mVar;
        this.c = componentName;
        this.d = pendingIntent;
    }

    /* access modifiers changed from: package-private */
    public IBinder a() {
        return this.b.asBinder();
    }

    /* access modifiers changed from: package-private */
    public ComponentName b() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public PendingIntent c() {
        return this.d;
    }

    public boolean d(Uri uri, Bundle bundle, List<Bundle> list) {
        Bundle bundle2 = new Bundle();
        PendingIntent pendingIntent = this.d;
        if (pendingIntent != null) {
            bundle2.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        try {
            return this.a.V1(this.b, uri, bundle2, null);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
