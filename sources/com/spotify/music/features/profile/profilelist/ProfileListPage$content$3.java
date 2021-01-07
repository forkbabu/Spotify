package com.spotify.music.features.profile.profilelist;

import com.spotify.music.features.profile.model.e;
import com.spotify.pageloader.s0;
import defpackage.mt7;
import io.reactivex.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ProfileListPage$content$3 extends Lambda implements nmf<s<e>, s0> {
    final /* synthetic */ ProfileListPage this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProfileListPage$content$3(ProfileListPage profileListPage) {
        super(1);
        this.this$0 = profileListPage;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s0 invoke(s<e> sVar) {
        s<e> sVar2 = sVar;
        h.e(sVar2, "model");
        mt7.a e = mt7.a.e();
        e.d(ProfileListPage.d(this.this$0).title());
        e.b(ProfileListPage.e(this.this$0).a());
        s b = ProfileListPage.c(this.this$0).b(e.a(), sVar2);
        h.d(b, "pageElementFactory.create(profileListModel, model)");
        return b;
    }
}
