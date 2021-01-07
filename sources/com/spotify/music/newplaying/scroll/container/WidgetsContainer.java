package com.spotify.music.newplaying.scroll.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.g;

public class WidgetsContainer extends LinearLayout implements f0 {
    public static final /* synthetic */ int c = 0;
    private g<a0> a;
    private int b;

    public WidgetsContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void e() {
        if (getChildCount() > 0) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }

    @Override // com.spotify.music.newplaying.scroll.container.f0
    public void a() {
        removeAllViews();
        e();
    }

    @Override // com.spotify.music.newplaying.scroll.container.f0
    public void b(int i) {
        removeViewAt(i);
        e();
    }

    @Override // com.spotify.music.newplaying.scroll.container.f0
    public void c(NowPlayingWidget nowPlayingWidget, int i) {
        View a2 = nowPlayingWidget.a(LayoutInflater.from(getContext()), this);
        a2.setTag(nowPlayingWidget.type());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a2.getLayoutParams();
        marginLayoutParams.bottomMargin = this.b;
        addView(a2, i, marginLayoutParams);
        e();
    }

    @Override // com.spotify.music.newplaying.scroll.container.f0
    public g<a0> d(float f) {
        return this.a.C(new k(f));
    }

    public WidgetsContainer(Context context, AttributeSet attributeSet, int i) {
        super(new ContextThemeWrapper(context, (int) C0707R.style.res_2132083521_theme_glue_scrollingwidgets), attributeSet, i);
        setOrientation(1);
        setVisibility(8);
        this.b = getResources().getDimensionPixelSize(C0707R.dimen.widgets_vertical_margin);
        this.a = new b0(this).a().V(1).r0();
    }
}
