package com.spotify.music.nowplaying.podcast.mixedmedia.ui.util;

import android.content.Context;
import android.view.View;
import io.reactivex.functions.c;
import io.reactivex.g;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class UtilsKt {

    /* access modifiers changed from: package-private */
    public static final class a<T1, T2, R> implements c<A, B, C> {
        final /* synthetic */ rmf a;

        a(rmf rmf) {
            this.a = rmf;
        }

        @Override // io.reactivex.functions.c
        public final C a(A a2, B b) {
            return (C) this.a.invoke(a2, b);
        }
    }

    public static final <A, B> g<Pair<A, B>> a(g<A> gVar, g<B> gVar2) {
        h.e(gVar, "$this$combineLatest");
        h.e(gVar2, "other");
        return b(gVar, gVar2, UtilsKt$combineLatest$1.a);
    }

    public static final <A, B, C> g<C> b(g<A> gVar, g<B> gVar2, rmf<? super A, ? super B, ? extends C> rmf) {
        h.e(gVar, "$this$combineLatest");
        h.e(gVar2, "other");
        h.e(rmf, "zipper");
        return g.i(gVar, gVar2, new a(rmf));
    }

    public static final int c(View view, float f) {
        h.e(view, "$this$dpToPx");
        Context context = view.getContext();
        h.d(context, "context");
        h.e(context, "$this$dpToPx");
        return nud.g(f, context.getResources());
    }
}
