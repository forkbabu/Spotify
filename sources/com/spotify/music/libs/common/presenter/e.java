package com.spotify.music.libs.common.presenter;

import android.os.Parcelable;
import com.spotify.mobile.android.service.session.SessionState;

@Deprecated
public interface e<T extends Parcelable> {
    void K0();

    void N(T t);

    void W0(SessionState sessionState);

    void f1(Throwable th);

    void s1();
}
