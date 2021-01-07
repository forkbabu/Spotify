package com.spotify.music.yourlibrary.quickscroll;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import com.spotify.music.yourlibrary.quickscroll.k;
import io.reactivex.schedulers.a;

class q {
    private static final l c = new o(a.c(), io.reactivex.android.schedulers.a.b());
    private final Context a;
    private final k.b b;

    q(int i, Context context, AttributeSet attributeSet, int i2, int i3) {
        this.a = context;
        this.b = new k.b(i, context, attributeSet, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void a(QuickScrollView quickScrollView) {
        Context context = this.a;
        k c2 = this.b.c();
        quickScrollView.a = c2;
        t tVar = new t(c2, c);
        quickScrollView.b = tVar;
        p pVar = new p(context);
        s sVar = new s(c2);
        quickScrollView.c = new c0(c2, sVar, pVar, new g(c2, sVar), quickScrollView, (FrameLayout) quickScrollView.findViewById(C0707R.id.quickscroll_handler), (ConstraintLayout) quickScrollView.findViewById(C0707R.id.quickscroll_handler_container), (ImageView) quickScrollView.findViewById(C0707R.id.quickscroll_handler_arrow_up), (ImageView) quickScrollView.findViewById(C0707R.id.quickscroll_handler_arrow_down), (FrameLayout) quickScrollView.findViewById(C0707R.id.quickscroll_indicator), (ConstraintLayout) quickScrollView.findViewById(C0707R.id.quickscroll_indicator_container), (TextView) quickScrollView.findViewById(C0707R.id.quickscroll_indicator_label), tVar);
    }
}
