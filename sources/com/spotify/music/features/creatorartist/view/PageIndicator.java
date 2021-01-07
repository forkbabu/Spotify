package com.spotify.music.features.creatorartist.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import androidx.viewpager.widget.ViewPager;
import com.spotify.encore.foundation.R;

public class PageIndicator extends AppCompatTextView implements ViewPager.i {
    private ViewPager a;

    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTextColor(a.b(getContext(), R.color.gray_70));
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void a(int i) {
        j();
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void f(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void g(int i) {
        j();
    }

    /* access modifiers changed from: protected */
    public void j() {
        androidx.viewpager.widget.a adapter = this.a.getAdapter();
        adapter.getClass();
        int d = adapter.d();
        if (d > 0) {
            setText((this.a.getCurrentItem() + 1) + " / " + d);
            return;
        }
        setText("");
    }

    public void setViewPager(ViewPager viewPager) {
        this.a = viewPager;
        viewPager.c(this);
        j();
    }
}
