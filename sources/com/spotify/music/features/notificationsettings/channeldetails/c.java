package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.features.notificationsettings.channeldetails.g;
import com.spotify.music.features.notificationsettings.channeldetails.h;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import java.util.Locale;
import kotlin.jvm.internal.h;

final class c<Upstream, Downstream> implements w<g.b, h> {
    final /* synthetic */ com.spotify.music.notification.c a;
    final /* synthetic */ y b;

    static final class a<T, R> implements l<g.b, v<? extends h>> {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends h> apply(g.b bVar) {
            g.b bVar2 = bVar;
            h.e(bVar2, "effect");
            com.spotify.music.notification.c cVar = this.a.a;
            String name = bVar2.b().name();
            Locale locale = Locale.US;
            h.d(locale, "Locale.US");
            if (name != null) {
                String lowerCase = name.toLowerCase(locale);
                h.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                return cVar.b(lowerCase, bVar2.a().c()).P(new h.b.C0235b(bVar2.a(), bVar2.b(), true)).H(this.a.b).F((T) new h.b.a(bVar2.a(), bVar2.b(), true)).P();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    c(com.spotify.music.notification.c cVar, y yVar) {
        this.a = cVar;
        this.b = yVar;
    }

    @Override // io.reactivex.w
    public final v<h> apply(s<g.b> sVar) {
        kotlin.jvm.internal.h.e(sVar, "it");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
