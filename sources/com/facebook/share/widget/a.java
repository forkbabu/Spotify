package com.facebook.share.widget;

import android.view.View;

/* access modifiers changed from: package-private */
public class a implements View.OnClickListener {
    final /* synthetic */ LikeView a;

    a(LikeView likeView) {
        this.a = likeView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!uf.c(this)) {
            try {
                LikeView.d(this.a);
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
