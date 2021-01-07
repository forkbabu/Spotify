package com.spotify.music.features.podcast.episode.inspector.tracklist.views.page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.podcast.episode.inspector.tracklist.views.page.g;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.squareup.picasso.Picasso;

public class h implements g {
    private final x97 a;
    private RecyclerView b;
    private final q97 c;
    private View d;

    class a implements y97 {
        final /* synthetic */ ajf a;

        a(h hVar, ajf ajf) {
            this.a = ajf;
        }

        @Override // defpackage.y97
        public void a(int i, j87 j87) {
            c cVar = ViewUris.h0;
            ((g.a) this.a.get()).a(i, j87.m(), j87.k(), cVar.toString(), cVar);
        }

        @Override // defpackage.y97
        public void b(int i, j87 j87) {
            ((g.a) this.a.get()).c(i, j87.b(), j87.m(), j87.i());
        }
    }

    public h(Context context, q97 q97, Picasso picasso, ajf<g.a> ajf) {
        x97 x97 = new x97(context, picasso);
        this.a = x97;
        this.c = q97;
        x97.Y(new a(this, ajf));
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.views.page.g
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.tracklist_fragment_layout, viewGroup, false);
        this.d = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.recycler_tracklist);
        this.b = recyclerView;
        recyclerView.setAdapter(this.a);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setFocusable(false);
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.views.page.g
    public View b() {
        return this.d;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.views.page.g
    public void c(k87 k87) {
        if (k87 != null && this.b != null) {
            if (!k87.f().isEmpty()) {
                this.a.X(k87);
                this.b.setVisibility(0);
                this.c.a();
                return;
            }
            this.b.setVisibility(8);
        }
    }
}
