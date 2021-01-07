package com.spotify.music.podcast.entity.adapter.topics;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.podcast.ui.topic.f;
import com.spotify.music.podcast.ui.topic.g;
import com.spotify.music.podcast.ui.topic.i;
import com.spotify.music.podcast.ui.topic.o;
import com.spotify.music.podcast.ui.topic.p;
import defpackage.yrc;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class TopicChipSectionAdapterDelegate implements yrc {
    private final p.b a;

    public static final class a extends csc {
        private final List<g> b;
        private final f c;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.spotify.music.podcast.ui.topic.g> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends g> list, f fVar) {
            h.e(list, "topicList");
            h.e(fVar, "topicClickListener");
            this.b = list;
            this.c = fVar;
        }

        public final f e() {
            return this.c;
        }

        public final List<g> f() {
            return this.b;
        }
    }

    public static final class b extends yrc.a {
        private final p C;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(((i) pVar).a());
            h.e(pVar, "topicChipSection");
            this.C = pVar;
        }

        public final p h0() {
            return this.C;
        }
    }

    public TopicChipSectionAdapterDelegate(p.b bVar) {
        h.e(bVar, "topicChipSectionFactory");
        this.a = bVar;
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        h.e(csc, "item");
        h.e(b0Var, "holder");
        if (!(b0Var instanceof b)) {
            b0Var = null;
        }
        b bVar = (b) b0Var;
        if (bVar != null) {
            if (!(csc instanceof a)) {
                csc = null;
            }
            a aVar = (a) csc;
            if (aVar != null) {
                p h0 = bVar.h0();
                List<g> f = aVar.f();
                ArrayList arrayList = new ArrayList(d.e(f, 10));
                for (T t : f) {
                    String c = t.c();
                    h.d(c, "it.uri()");
                    String b2 = t.b();
                    h.d(b2, "it.name()");
                    arrayList.add(new o.c(c, b2));
                }
                ((i) h0).c(new p.c(arrayList));
                ((i) bVar.h0()).b(new TopicChipSectionAdapterDelegate$onBindViewHolder$1(aVar));
            }
        }
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "parent");
        return new b(this.a.a(viewGroup));
    }
}
