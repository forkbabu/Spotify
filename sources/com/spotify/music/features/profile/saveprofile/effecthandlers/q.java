package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.profile.saveprofile.domain.o;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

public final /* synthetic */ class q implements l {
    public static final /* synthetic */ q a = new q();

    private /* synthetic */ q() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String currentUser = ((SessionState) obj).currentUser();
        h.e(currentUser, "username");
        return new o.i(currentUser);
    }
}
