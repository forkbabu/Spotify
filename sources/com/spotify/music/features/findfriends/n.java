package com.spotify.music.features.findfriends;

import com.google.common.base.Function;
import com.spotify.music.features.findfriends.model.UserModel;
import com.spotify.music.follow.j;

public final /* synthetic */ class n implements Function {
    public final /* synthetic */ j a;

    public /* synthetic */ n(j jVar) {
        this.a = jVar;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        j jVar = this.a;
        UserModel userModel = (UserModel) obj;
        if (!userModel.uri().equals(jVar.e())) {
            return userModel;
        }
        UserModel.a builder = userModel.toBuilder();
        builder.c(jVar.g());
        return builder.a();
    }
}
