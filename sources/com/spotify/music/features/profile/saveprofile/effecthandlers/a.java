package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.adjust.sdk.Constants;
import com.google.common.base.Optional;
import com.spotify.http.u;
import com.spotify.music.features.profile.saveprofile.domain.n;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import java.io.File;
import okhttp3.c0;
import okhttp3.u;
import okhttp3.w;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ u a;

    public /* synthetic */ a(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        u uVar = this.a;
        n.g gVar = (n.g) obj;
        if (gVar.a().isEmpty()) {
            return o.a;
        }
        u.a aVar = new u.a();
        aVar.i(Constants.SCHEME);
        aVar.f("image-upload.spotify.com");
        c0 c0Var = new c0(c0.c(w.d("image/jpeg"), new File(gVar.a())), null);
        return s.n(((a0) uVar.a(a0.class, aVar.c())).a(c0Var).P().j0(x.a).G0((R) Optional.absent()), c0Var.h(), r.a).r0(v.a);
    }
}
