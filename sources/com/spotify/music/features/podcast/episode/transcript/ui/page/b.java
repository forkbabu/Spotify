package com.spotify.music.features.podcast.episode.transcript.ui.page;

import androidx.recyclerview.widget.m;
import kotlin.jvm.internal.h;

public final class b {
    private static final m.d<c> a = new a();

    public static final class a extends m.d<c> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean a(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            h.e(cVar3, "oldItem");
            h.e(cVar4, "newItem");
            return h.a(cVar3, cVar4);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean b(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            h.e(cVar3, "oldItem");
            h.e(cVar4, "newItem");
            return h.a(cVar3, cVar4);
        }
    }

    public static final m.d<c> a() {
        return a;
    }
}
