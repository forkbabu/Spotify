package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.g;
import java.io.Closeable;

public interface a<T> extends g, Closeable, Iterable<T> {
    @RecentlyNonNull
    T get(int i);

    int getCount();
}
