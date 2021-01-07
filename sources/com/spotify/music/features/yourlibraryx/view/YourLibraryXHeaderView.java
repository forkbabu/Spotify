package com.spotify.music.features.yourlibraryx.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import io.reactivex.s;

public final class YourLibraryXHeaderView extends ConstraintLayout implements g<f, YourLibraryXEvent> {
    private final xg9 a;
    private eh9 b;

    public static final class a implements h<f> {
        final /* synthetic */ YourLibraryXHeaderView a;
        final /* synthetic */ io.reactivex.disposables.b b;

        a(YourLibraryXHeaderView yourLibraryXHeaderView, io.reactivex.disposables.b bVar) {
            this.a = yourLibraryXHeaderView;
            this.b = bVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            f fVar = (f) obj;
            kotlin.jvm.internal.h.e(fVar, "value");
            SpotifyIconView spotifyIconView = this.a.a.d;
            kotlin.jvm.internal.h.d(spotifyIconView, "binding.iconSearch");
            kotlin.jvm.internal.h.e(fVar, "model");
            kotlin.jvm.internal.h.e(fVar, "model");
            boolean z = true;
            int i = 0;
            if (!(fVar.f().e() && fVar.l().b()) || fVar.f().g() != 0) {
                z = false;
            }
            if (z) {
                i = 8;
            }
            spotifyIconView.setVisibility(i);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
        }
    }

    static final class b<T> implements io.reactivex.functions.g<YourLibraryXEvent> {
        final /* synthetic */ da2 a;

        b(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(YourLibraryXEvent yourLibraryXEvent) {
            this.a.accept(yourLibraryXEvent);
        }
    }

    public YourLibraryXHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setLogger$apps_music_features_your_library_x(eh9 eh9) {
        kotlin.jvm.internal.h.e(eh9, "yourLibraryXLogger");
        this.b = eh9;
    }

    public final void setProfileIconView$apps_music_features_your_library_x(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        this.a.c.removeAllViewsInLayout();
        this.a.c.addView(view, new ViewGroup.LayoutParams(-1, -1));
        bvd a2 = dvd.a(view);
        a2.f(view);
        a2.a();
    }

    @Override // com.spotify.mobius.g
    public h<f> t(da2<YourLibraryXEvent> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        SpotifyIconView spotifyIconView = this.a.b;
        kotlin.jvm.internal.h.d(spotifyIconView, "binding.iconCreate");
        s<R> j0 = n50.a(spotifyIconView).j0(new u(this));
        FrameLayout frameLayout = this.a.c;
        kotlin.jvm.internal.h.d(frameLayout, "binding.iconProfileContainer");
        s<R> j02 = n50.a(frameLayout).j0(new v(this));
        SpotifyIconView spotifyIconView2 = this.a.d;
        kotlin.jvm.internal.h.d(spotifyIconView2, "binding.iconSearch");
        s<R> j03 = n50.a(spotifyIconView2).j0(new w(this));
        TextView textView = this.a.a;
        kotlin.jvm.internal.h.d(textView, "binding.headerText");
        s m0 = s.m0(j0, j02, j03, n50.a(textView).j0(new x(this)));
        kotlin.jvm.internal.h.d(m0, "Observable.merge(\n      …d\n            }\n        )");
        return new a(this, m0.subscribe(new b(da2)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibraryXHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.h.e(context, "context");
        xg9 a2 = xg9.a(LayoutInflater.from(context), this);
        kotlin.jvm.internal.h.d(a2, "HeaderYourLibraryXBindin…ater.from(context), this)");
        this.a = a2;
        bvd a3 = dvd.a(a2.b);
        a3.f(a2.b);
        a3.a();
        bvd a4 = dvd.a(a2.d);
        a4.f(a2.d);
        a4.a();
        bvd a5 = dvd.a(a2.a);
        a5.g(a2.a);
        a5.a();
    }
}
