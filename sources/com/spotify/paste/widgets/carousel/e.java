package com.spotify.paste.widgets.carousel;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class e implements y4 {
    final /* synthetic */ RecyclerView.b0 a;
    final /* synthetic */ x4 b;
    final /* synthetic */ c c;

    e(c cVar, RecyclerView.b0 b0Var, x4 x4Var) {
        this.c = cVar;
        this.a = b0Var;
        this.b = x4Var;
    }

    @Override // defpackage.y4
    public void a(View view) {
        int i = q4.g;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
    }

    @Override // defpackage.y4
    public void b(View view) {
        view.setTag(C0707R.id.paste_carousel_animation_info, null);
        this.b.f(null);
        this.c.h(this.a);
        this.c.k.remove(this.a);
        c cVar = this.c;
        if (!cVar.p()) {
            cVar.i();
        }
    }

    @Override // defpackage.y4
    public void c(View view) {
        this.c.getClass();
    }
}
