package com.spotify.music.podcast.entity.adapter.description;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.podcast.entity.adapter.description.DescriptionViewBinderModel;
import com.spotify.music.podcast.entity.adapter.description.e;
import defpackage.yrc;

public class f implements yrc {
    private final wlf<h> a;

    public static class a extends csc {
        private String b;
        private String c;
        private boolean d;
        private boolean e;
        private boolean f;

        public void j(boolean z) {
            this.f = z;
        }

        public void k(String str) {
            this.b = str;
        }

        public void l(boolean z) {
            this.e = z;
        }

        public void m(boolean z) {
            this.d = z;
        }

        public void n(String str) {
            this.c = str;
        }
    }

    public static class b extends yrc.a {
        private final h C;

        public b(h hVar, View view) {
            super(view);
            this.C = hVar;
        }

        /* access modifiers changed from: package-private */
        public void h0(DescriptionViewBinderModel descriptionViewBinderModel) {
            this.C.b(descriptionViewBinderModel);
        }
    }

    public f(wlf<h> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        DescriptionViewBinderModel.DescriptionType descriptionType;
        b bVar = (b) b0Var;
        a aVar = (a) csc;
        e.b bVar2 = new e.b();
        if (aVar.e) {
            descriptionType = DescriptionViewBinderModel.DescriptionType.HTML;
        } else {
            descriptionType = DescriptionViewBinderModel.DescriptionType.FALLBACK;
        }
        bVar2.c(descriptionType);
        e.b bVar3 = bVar2;
        bVar3.b(aVar.b);
        e.b bVar4 = bVar3;
        bVar4.f(aVar.c);
        e.b bVar5 = bVar4;
        bVar5.e(aVar.d);
        e.b bVar6 = bVar5;
        bVar6.d(aVar.f);
        bVar.h0(bVar6.a());
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h hVar = this.a.get();
        return new b(hVar, hVar.a(layoutInflater, viewGroup));
    }
}
