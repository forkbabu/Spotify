package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: kx4  reason: default package */
public class kx4 {
    private final Context a;

    public kx4(Context context) {
        this.a = context;
    }

    public boolean a() {
        return Build.VERSION.SDK_INT >= 23 && new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(this.a.getPackageManager()) != null;
    }
}
