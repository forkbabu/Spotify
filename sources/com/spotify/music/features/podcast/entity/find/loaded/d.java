package com.spotify.music.features.podcast.entity.find.loaded;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;

public final class d implements i {

    public static final class a implements h<w37> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            kotlin.jvm.internal.h.e((w37) obj, "value");
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    @Override // com.spotify.music.features.podcast.entity.find.loaded.i
    public View h1(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(viewGroup, "parent");
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_podcast_find, viewGroup, false);
        kotlin.jvm.internal.h.d(inflate, "inflater.inflate(R.layou…cast_find, parent, false)");
        return inflate;
    }

    @Override // com.spotify.mobius.g
    public h<w37> t(da2<u37> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        return new a();
    }
}
