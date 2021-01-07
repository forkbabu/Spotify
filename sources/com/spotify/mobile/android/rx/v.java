package com.spotify.mobile.android.rx;

import com.spotify.android.flags.b;
import com.spotify.android.flags.c;
import com.spotify.rxjava2.y;
import io.reactivex.g;
import java.io.Serializable;
import java.util.List;

public interface v {
    @Deprecated
    <T extends Serializable> g<T> a(b<T> bVar);

    @Deprecated
    g<c> b();

    List<y> unsubscribeAndReturnLeaks();
}
