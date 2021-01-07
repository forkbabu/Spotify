package androidx.appcompat.app;

import android.content.Context;
import android.location.LocationManager;

/* access modifiers changed from: package-private */
public class s {
    private static s d;
    private final Context a;
    private final LocationManager b;
    private final a c = new a();

    /* access modifiers changed from: private */
    public static class a {
        boolean a;
        long b;

        a() {
        }
    }

    s(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    static s a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new s(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.s.b():boolean");
    }
}
