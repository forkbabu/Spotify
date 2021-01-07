package com.spotify.music.features.profile.saveprofile.domain;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;

public final /* synthetic */ class c implements Predicate {
    public final /* synthetic */ ImmutableList a;

    public /* synthetic */ c(ImmutableList immutableList) {
        this.a = immutableList;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return !this.a.contains((SaveProfileTask) obj);
    }
}
