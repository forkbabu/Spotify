package com.spotify.music.features.yourlibrary.musicpages.view;

import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.yourlibrary.musicpages.datasource.q4;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;

public class t0 implements g<MusicPagesModel, s0> {
    private final ArrayList<q4> a = new ArrayList<>();
    private final d39<MusicItem.Type, MusicItem> b;
    private final c39 c;
    private final RecyclerView f;
    private int n;
    private b o;
    private final int p;
    private final int q;

    class a implements h<MusicPagesModel> {
        final /* synthetic */ PublishSubject a;
        final /* synthetic */ io.reactivex.disposables.b b;
        final /* synthetic */ io.reactivex.disposables.b c;

        a(PublishSubject publishSubject, io.reactivex.disposables.b bVar, io.reactivex.disposables.b bVar2) {
            this.a = publishSubject;
            this.b = bVar;
            this.c = bVar2;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            this.a.onNext((MusicPagesModel) obj);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
            this.c.dispose();
            t0.a(t0.this, null);
        }
    }

    /* access modifiers changed from: private */
    public interface b {
    }

    public t0(d39<MusicItem.Type, MusicItem> d39, RecyclerView recyclerView, e1 e1Var) {
        this.b = d39;
        MoreObjects.checkArgument(d39 instanceof c39, "Adapter was not a PlayerStateConsumer");
        this.c = (c39) d39;
        this.f = recyclerView;
        int x = e1Var.x();
        this.p = x;
        this.q = x - (x / 4);
    }

    static void a(t0 t0Var, b bVar) {
        t0Var.o = null;
    }

    public void h(q4 q4Var) {
        this.a.add(q4Var);
    }

    public void i(y3 y3Var) {
        this.b.b0(new u0(this, y3Var));
        if (this.f.getAdapter() == null) {
            this.f.setAdapter(this.b);
        }
    }

    public /* synthetic */ void j(u3 u3Var) {
        this.c.d(u3Var.a, u3Var.b);
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        this.o = new q(da2);
        PublishSubject h1 = PublishSubject.h1();
        return new a(h1, h1.j0(b0.a).E().subscribe(new m(this), p.a), h1.j0(r.a).E().subscribe(new n(this), o.a));
    }
}
