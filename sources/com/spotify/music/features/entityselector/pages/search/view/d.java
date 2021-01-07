package com.spotify.music.features.entityselector.pages.search.view;

import android.animation.Animator;
import android.widget.Button;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import kotlin.jvm.internal.h;

public final class d implements ToolbarSearchFieldView.e {
    final /* synthetic */ f a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    d(f fVar) {
        this.a = fVar;
    }

    @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
    public void a() {
        this.a.m();
        Button searchPlaceHolder = this.a.g.getSearchPlaceHolder();
        h.d(searchPlaceHolder, "searchFieldView.searchPlaceHolder");
        searchPlaceHolder.setPressed(false);
        Button searchPlaceHolder2 = this.a.g.getSearchPlaceHolder();
        if (searchPlaceHolder2 != null) {
            l stateListAnimatorCompat = ((zud) searchPlaceHolder2).getStateListAnimatorCompat();
            h.d(stateListAnimatorCompat, "(searchFieldView.searchP… .stateListAnimatorCompat");
            Animator e = stateListAnimatorCompat.e();
            if (e != null) {
                e.cancel();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.paste.core.motion.StateListAnimatorCompatSupport");
    }

    @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
    public void b() {
        if (!(this.a.c != null && this.a.c.B1())) {
            this.a.b();
            this.a.c();
        }
    }

    @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
    public void c() {
        this.a.b();
    }
}
