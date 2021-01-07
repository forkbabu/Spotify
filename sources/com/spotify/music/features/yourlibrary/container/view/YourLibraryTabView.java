package com.spotify.music.features.yourlibrary.container.view;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;

public class YourLibraryTabView extends FrameLayout {
    private TextView a;
    private int b;
    private int c;
    private float f;
    private ArgbEvaluator n;

    public YourLibraryTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static YourLibraryTabView a(Context context, CharSequence charSequence, ViewGroup viewGroup, boolean z) {
        YourLibraryTabView yourLibraryTabView = (YourLibraryTabView) LayoutInflater.from(context).inflate(C0707R.layout.bottom_tab_view, viewGroup, z);
        yourLibraryTabView.a = (TextView) yourLibraryTabView.findViewById(C0707R.id.bottom_tab_view_label);
        yourLibraryTabView.c();
        yourLibraryTabView.setTitle(charSequence);
        return yourLibraryTabView;
    }

    public static YourLibraryTabView b(Context context, CharSequence charSequence, ViewGroup viewGroup, boolean z) {
        YourLibraryTabView yourLibraryTabView = (YourLibraryTabView) LayoutInflater.from(context).inflate(C0707R.layout.top_tab_view, viewGroup, z);
        yourLibraryTabView.a = (TextView) yourLibraryTabView.findViewById(C0707R.id.top_tab_view_label);
        yourLibraryTabView.c();
        yourLibraryTabView.setTitle(charSequence);
        return yourLibraryTabView;
    }

    private void c() {
        this.b = getResources().getColor(C0707R.color.tab_text_inactive_color);
        this.c = getResources().getColor(C0707R.color.tab_text_highlight_color);
        this.n = new ArgbEvaluator();
    }

    public float getFocusLevel() {
        return this.f;
    }

    public void setFocusLevel(float f2) {
        this.f = f2;
        if (f2 == 0.0f) {
            this.a.setTextColor(this.b);
        } else if (f2 == 1.0f) {
            this.a.setTextColor(this.c);
        } else {
            this.a.setTextColor(((Integer) this.n.evaluate(f2, Integer.valueOf(this.b), Integer.valueOf(this.c))).intValue());
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public YourLibraryTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
