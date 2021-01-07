package com.spotify.music.features.profile.saveprofile.domain;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import com.spotify.music.features.profile.saveprofile.domain.n;
import com.spotify.music.features.profile.saveprofile.domain.o;
import com.spotify.music.features.profile.saveprofile.domain.q;

public final /* synthetic */ class h implements nmf {
    public final /* synthetic */ q a;

    public /* synthetic */ h(q qVar) {
        this.a = qVar;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        q qVar = this.a;
        o.a aVar = (o.a) obj;
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (qVar.a() == SaveProfileTask.UPLOAD_IMAGE) {
            kotlin.jvm.internal.h.e("", "imagePath");
            builder.mo53add((ImmutableSet.Builder) new n.g(""));
        }
        q.a l = qVar.l();
        l.j(SaveProfileState.IDLE);
        l.b(SaveProfileTask.NOTHING);
        l.k(ImmutableList.of());
        l.l(ImmutableList.of());
        return e0.g(l.a(), builder.build());
    }
}
