package com.spotify.music.features.findfriends.model;

import com.google.common.base.Predicate;

public final /* synthetic */ class a implements Predicate {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        UserModel userModel = (UserModel) obj;
        FindFriendsModel findFriendsModel = FindFriendsModel.EMPTY;
        return userModel != null && !userModel.uri().isEmpty();
    }
}
