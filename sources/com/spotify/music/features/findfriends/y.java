package com.spotify.music.features.findfriends;

import com.google.common.base.Predicate;
import com.spotify.music.features.findfriends.model.UserModel;
import java.util.Locale;

public final /* synthetic */ class y implements Predicate {
    public final /* synthetic */ String a;

    public /* synthetic */ y(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((UserModel) obj).title().toLowerCase(Locale.getDefault()).contains(this.a);
    }
}
