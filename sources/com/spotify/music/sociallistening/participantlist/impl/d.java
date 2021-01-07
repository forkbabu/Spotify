package com.spotify.music.sociallistening.participantlist.impl;

import io.reactivex.functions.n;

public final /* synthetic */ class d implements n {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        edd edd = (edd) obj;
        int i = ParticipantListFragment.n0;
        return edd.a().isPresent() && edd.c().isPresent();
    }
}
