package com.spotify.music.libs.mediabrowserservice;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.service.media.error.EISError;
import com.spotify.mobile.android.service.media.h2;
import com.spotify.mobile.android.service.media.i2;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.genie.Wish;
import com.spotify.music.genie.o;
import com.spotify.music.genie.q;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.internal.operators.flowable.x;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class z2 {
    private final v1 a;
    private final PlayOrigin b;
    private final pea c;
    private final o d;

    public z2(v1 v1Var, PlayOrigin playOrigin, pea pea, o oVar) {
        this.a = v1Var;
        this.b = playOrigin;
        this.c = pea;
        this.d = oVar;
    }

    public static a a(z2 z2Var, Wish wish) {
        i iVar;
        z2Var.getClass();
        int ordinal = wish.a().ordinal();
        if (ordinal == 0) {
            return b.a;
        }
        if (ordinal == 1) {
            z<zwd> r = z2Var.a.Z2().r(LoggingParams.EMPTY);
            r.getClass();
            iVar = new i(r);
        } else if (ordinal != 2) {
            return a.t(new Throwable(String.format("Could not perform wish: %s", wish)));
        } else {
            z<zwd> p = z2Var.a.Z2().p(h2.c(wish.c()).b());
            p.getClass();
            iVar = new i(p);
        }
        return iVar;
    }

    public void b(String str, ml1 ml1) {
        if (ml1.i() || ml1.e() || ml1.f() || ml1.h() || ml1.g()) {
            StringBuilder V0 = je.V0("spotify:media-service:search:");
            V0.append(Uri.encode(str));
            String sb = V0.toString();
            i2 Z2 = this.a.Z2();
            if (ml1.i()) {
                List<ol1> k = ml1.k();
                k.getClass();
                ArrayList newArrayListWithCapacity = Collections2.newArrayListWithCapacity(k.size());
                for (int i = 0; i < k.size(); i++) {
                    ol1 ol1 = k.get(i);
                    gl1 a2 = ol1.a();
                    newArrayListWithCapacity.add(i, ContextTrack.builder(ol1.uri()).metadata(ImmutableMap.of("album_uri", a2 != null ? MoreObjects.nullToEmpty(a2.uri()) : "")).build());
                }
                h2.a b2 = h2.b(Context.builder(sb).pages(ImmutableList.of(ContextPage.builder().tracks(newArrayListWithCapacity).build())).build());
                b2.f(this.b);
                Z2.h(b2.b());
            } else if (ml1.f()) {
                List<nl1> b3 = ml1.b();
                b3.getClass();
                h2.a c2 = h2.c(b3.get(0).uri());
                c2.f(this.b);
                Z2.h(c2.b());
            } else if (ml1.e()) {
                List<gl1> a3 = ml1.a();
                a3.getClass();
                h2.a c3 = h2.c(a3.get(0).uri());
                c3.f(this.b);
                Z2.h(c3.b());
            } else if (ml1.g()) {
                nl1 nl1 = ml1.d().get(0);
                nl1.getClass();
                h2.a b4 = h2.b(Context.builder(sb).pages(ImmutableList.of(ContextPage.builder().tracks(Collections.singletonList(ContextTrack.create(nl1.uri()))).build())).build());
                b4.f(this.b);
                Z2.h(b4.b());
            } else {
                List<nl1> j = ml1.j();
                j.getClass();
                h2.a c4 = h2.c(j.get(0).uri());
                c4.f(this.b);
                Z2.h(c4.b());
            }
        } else {
            this.a.I2().b(EISError.SEARCH_FAILED);
        }
    }

    public /* synthetic */ void c(Throwable th) {
        this.a.I2().b(EISError.SEARCH_FAILED);
    }

    public a d(String str, Bundle bundle, yda yda) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (TextUtils.isEmpty(str)) {
            a t = ((q) this.d).d().t(new b1(this));
            z<String> r = this.c.r(yda);
            r.getClass();
            return t.E(new i(r).B());
        }
        this.a.Z2().pause();
        i iVar = new i(new x(this.a.c3().a(str, 0, 50, bundle).N().W(1, Functions.b()), null).p(new c1(this, str)).m(new a1(this)));
        z<String> l = this.c.l(yda, str);
        l.getClass();
        return iVar.E(new i(l));
    }
}
