package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.c;
import com.google.android.exoplayer2.util.g;

public class i {
    private final Object a;

    public i(@RecentlyNonNull Activity activity) {
        g.k(activity, "Activity must not be null");
        this.a = activity;
    }

    public Activity a() {
        return (Activity) this.a;
    }

    public c b() {
        return (c) this.a;
    }

    public boolean c() {
        return this.a instanceof c;
    }

    public final boolean d() {
        return this.a instanceof Activity;
    }
}
