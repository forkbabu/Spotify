package com.spotify.music.features.yourlibrary.musicpages.pages;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.view.c;

public class q {
    private final lb0 a;
    private final FrameLayout b;
    private final Button c;
    private a d;

    public interface a {
    }

    public q(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setId(C0707R.id.music_pages_empty_container);
        lb0 a2 = pb0.a(context, frameLayout);
        this.a = a2;
        Button i = a2.i();
        this.c = i;
        i.setOnClickListener(new e(this));
        a2.getView().setBackgroundColor(0);
        frameLayout.addView(a2.getView());
        frameLayout.setVisibility(8);
    }

    public void a(u uVar) {
        this.a.setTitle(uVar.g());
        CharSequence f = uVar.f();
        this.a.setSubtitle(f);
        int i = 0;
        this.a.getSubtitleView().setVisibility(MoreObjects.isNullOrEmpty((String) f) ? 8 : 0);
        this.a.E(uVar.d());
        Button button = this.c;
        if (uVar.e() == EmptyPageAction.NO_ACTION) {
            i = 8;
        }
        button.setVisibility(i);
    }

    public View b() {
        return this.b;
    }

    public void c(View view) {
        c cVar = (c) this.d;
        cVar.a.c(cVar.b);
    }

    public void d(a aVar) {
        this.d = aVar;
    }
}
