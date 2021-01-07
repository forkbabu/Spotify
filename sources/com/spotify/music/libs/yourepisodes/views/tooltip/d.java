package com.spotify.music.libs.yourepisodes.views.tooltip;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class d extends tu1 implements j {
    private View d;
    private final Context e;

    static final class a implements View.OnClickListener {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.dismiss();
        }
    }

    static final class b implements Runnable {
        final /* synthetic */ d a;

        b(d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.dismiss();
        }
    }

    public d(Context context) {
        h.e(context, "context");
        this.e = context;
    }

    @Override // defpackage.tu1, defpackage.uu1
    public boolean a() {
        return false;
    }

    @Override // defpackage.uu1
    public Integer b() {
        return Integer.valueOf(androidx.core.content.a.b(this.e, e.a()));
    }

    @Override // defpackage.tu1, defpackage.uu1
    public Integer c() {
        Resources resources = this.e.getResources();
        int i = e.b;
        return Integer.valueOf(resources.getDimensionPixelOffset(C0707R.dimen.your_episodes_tooltip_distance));
    }

    @Override // com.spotify.music.libs.yourepisodes.views.tooltip.j
    public boolean dismiss() {
        View view = this.d;
        if ((view != null ? view.getParent() : null) == null) {
            return false;
        }
        m();
        return true;
    }

    @Override // defpackage.tu1, defpackage.uu1
    public boolean k() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public int l() {
        int i = e.b;
        return C0707R.layout.tooltip_your_episodes;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public void n(View view) {
        h.e(view, "rootView");
        view.setOnClickListener(new a(this));
        view.postDelayed(new b(this), 7000);
        this.d = view;
    }
}
