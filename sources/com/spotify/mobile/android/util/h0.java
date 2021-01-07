package com.spotify.mobile.android.util;

import android.content.res.Resources;
import java.lang.ref.WeakReference;

public class h0 {
    private final WeakReference<Resources> a;

    public h0(Resources resources) {
        resources.getClass();
        this.a = new WeakReference<>(resources);
    }

    /* access modifiers changed from: protected */
    public String b(int i, int i2, Object... objArr) {
        Resources resources = this.a.get();
        if (resources == null) {
            return "";
        }
        return resources.getQuantityString(i, i2, objArr);
    }

    /* access modifiers changed from: protected */
    public String c(int i, Object... objArr) {
        Resources resources = this.a.get();
        if (resources == null) {
            return "";
        }
        return resources.getString(i, objArr);
    }
}
