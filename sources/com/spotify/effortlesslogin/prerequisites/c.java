package com.spotify.effortlesslogin.prerequisites;

import com.spotify.effortlesslogin.backend.EffortlessLoginNameResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return EffortlessLoginPrerequisitesResult.createSuccess(((EffortlessLoginNameResponse) obj).fullName());
    }
}
