package defpackage;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

/* renamed from: xr  reason: default package */
public class xr {
    private static xr b = new xr();
    private wr a = null;

    @RecentlyNonNull
    public static wr a(@RecentlyNonNull Context context) {
        wr wrVar;
        xr xrVar = b;
        synchronized (xrVar) {
            if (xrVar.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                xrVar.a = new wr(context);
            }
            wrVar = xrVar.a;
        }
        return wrVar;
    }
}
