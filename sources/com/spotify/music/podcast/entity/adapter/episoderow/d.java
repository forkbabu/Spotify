package com.spotify.music.podcast.entity.adapter.episoderow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.podcast.entity.adapter.episoderow.i;
import com.spotify.playlist.models.Episode;
import defpackage.yrc;
import kotlin.jvm.internal.h;

public final class d implements yrc {
    private final i.a a;

    public static final class a extends dsc {
        private final Episode b;
        private final j c;

        public a(Episode episode, j jVar) {
            h.e(episode, "episode");
            h.e(jVar, "rowViewModel");
            this.b = episode;
            this.c = jVar;
        }

        @Override // defpackage.dsc
        public Episode e() {
            return this.b;
        }

        public final j f() {
            return this.c;
        }
    }

    public static final class b extends yrc.a {
        private final i C;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(i iVar, View view) {
            super(view);
            h.e(iVar, "viewBinder");
            h.e(view, "view");
            this.C = iVar;
        }

        public final i h0() {
            return this.C;
        }
    }

    public d(i.a aVar) {
        h.e(aVar, "viewBinderFactory");
        this.a = aVar;
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        h.e(csc, "item");
        h.e(b0Var, "holder");
        ((b) b0Var).h0().b(((a) csc).f());
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "parent");
        i create = this.a.create();
        return new b(create, create.a(layoutInflater, viewGroup));
    }
}
