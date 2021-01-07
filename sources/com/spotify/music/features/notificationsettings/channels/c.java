package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.features.notificationsettings.channels.e;
import com.spotify.music.navigation.t;
import com.spotify.ubi.specification.factories.t1;
import io.reactivex.functions.g;
import java.util.Locale;
import kotlin.jvm.internal.h;

final class c<T> implements g<e.a> {
    final /* synthetic */ t1 a;
    final /* synthetic */ ere b;
    final /* synthetic */ t c;

    c(t1 t1Var, ere ere, t tVar) {
        this.a = t1Var;
        this.b = ere;
        this.c = tVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(e.a aVar) {
        e.a aVar2 = aVar;
        StringBuilder V0 = je.V0("spotify:settings:notifications:channel-details:");
        String str = aVar2.b().toString();
        Locale locale = Locale.US;
        h.d(locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            h.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            V0.append(lowerCase);
            String sb = V0.toString();
            nqe a2 = this.a.c(aVar2.b().toString(), Integer.valueOf(aVar2.a())).a(sb);
            this.b.a(a2);
            this.c.b(sb, a2.b());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
