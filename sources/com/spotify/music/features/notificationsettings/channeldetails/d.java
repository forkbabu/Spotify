package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.features.notificationsettings.channeldetails.g;
import com.spotify.music.features.notificationsettings.channeldetails.h;
import com.spotify.music.notification.c;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import java.util.Locale;
import kotlin.jvm.internal.h;

final class d<Upstream, Downstream> implements w<g.c, h> {
    final /* synthetic */ c a;
    final /* synthetic */ y b;

    static final class a<T, R> implements l<g.c, v<? extends h>> {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends h> apply(g.c cVar) {
            g.c cVar2 = cVar;
            h.e(cVar2, "effect");
            c cVar3 = this.a.a;
            String name = cVar2.b().name();
            Locale locale = Locale.US;
            h.d(locale, "Locale.US");
            if (name != null) {
                String lowerCase = name.toLowerCase(locale);
                h.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                return cVar3.c(lowerCase, cVar2.a().c()).P(new h.b.C0235b(cVar2.a(), cVar2.b(), false)).H(this.a.b).F((T) new h.b.a(cVar2.a(), cVar2.b(), false)).P();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    d(c cVar, y yVar) {
        this.a = cVar;
        this.b = yVar;
    }

    @Override // io.reactivex.w
    public final v<h> apply(s<g.c> sVar) {
        kotlin.jvm.internal.h.e(sVar, "it");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
