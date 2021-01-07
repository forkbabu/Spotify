package com.spotify.music.libs.search.transition;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.libs.search.transition.m;
import com.spotify.music.libs.search.view.l;

public class o implements n {
    private final g a;

    o(g gVar) {
        this.a = gVar;
    }

    @Override // com.spotify.music.libs.search.transition.n
    public m a(Context context, l lVar, ViewGroup viewGroup, RecyclerView recyclerView, l lVar2, m.a aVar) {
        return new q(context, lVar, viewGroup, recyclerView, lVar2, aVar, this.a);
    }
}
