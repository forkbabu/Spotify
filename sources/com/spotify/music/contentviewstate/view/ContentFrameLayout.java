package com.spotify.music.contentviewstate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class ContentFrameLayout<T extends View> extends FrameLayout {
    private gb0 a;
    private LoadingView b;
    private T c;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = LoadingView.l(LayoutInflater.from(context));
        gb0 a2 = e90.c().a(context, this);
        this.a = a2;
        addView(a2.getView());
        addView(this.b);
    }

    public T getContentView() {
        return this.c;
    }

    public gb0 getEmptyState() {
        return this.a;
    }

    public LoadingView getLoadingView() {
        return this.b;
    }

    public void setContentView(T t) {
        T t2 = this.c;
        if (t2 != null) {
            removeView(t2);
            this.c = null;
        }
        if (t != null) {
            bd0.i(t);
            this.c = t;
            addView(t, 0);
        }
    }
}
