package com.spotify.android.flags;

import android.os.Parcelable;
import java.io.Serializable;

@Deprecated
public interface c extends Parcelable {
    <T extends Serializable> T M0(b<T> bVar);

    boolean O0(c cVar, b<?> bVar);

    boolean d();

    <T extends Serializable> boolean j2(b<T> bVar);
}
