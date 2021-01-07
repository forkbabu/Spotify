package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;

public class l {
    @RecentlyNonNull
    public static <L> k<L> a(@RecentlyNonNull L l, @RecentlyNonNull Looper looper, @RecentlyNonNull String str) {
        g.k(l, "Listener must not be null");
        g.k(looper, "Looper must not be null");
        g.k(str, "Listener type must not be null");
        return new k<>(looper, l, str);
    }
}
