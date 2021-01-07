package com.spotify.android.stories.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Space;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

public class StoriesProgressView extends LinearLayout {
    private final List<PausableProgressBar> a = new ArrayList();
    private int b = 5;
    private int c = -1;
    private int f;
    private int n;
    private int o = -1;
    private a p;

    public interface a {
        void j(int i);
    }

    public StoriesProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
    }

    private void a() {
        this.a.clear();
        removeAllViews();
        int i = 0;
        while (i < this.c) {
            PausableProgressBar pausableProgressBar = new PausableProgressBar(getContext(), null);
            pausableProgressBar.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            pausableProgressBar.setProgressBackgroundColor(this.n);
            pausableProgressBar.setProgressColor(this.f);
            this.a.add(pausableProgressBar);
            addView(pausableProgressBar);
            i++;
            if (i < this.c) {
                Space space = new Space(getContext());
                space.setLayoutParams(new LinearLayout.LayoutParams(this.b, 1));
                addView(space);
            }
        }
    }

    private int b(TypedArray typedArray, int i, int i2) {
        return typedArray.getColor(i, i2.c(getResources(), i2, getContext().getTheme()));
    }

    /* JADX INFO: finally extract failed */
    private void c(AttributeSet attributeSet) {
        setOrientation(0);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, zid.a);
        try {
            this.c = obtainStyledAttributes.getInt(2, 0);
            this.f = b(obtainStyledAttributes, 1, C0707R.color.default_progress_color);
            this.n = b(obtainStyledAttributes, 0, C0707R.color.default_background_progress_color);
            obtainStyledAttributes.recycle();
            this.b = getResources().getDimensionPixelSize(C0707R.dimen.progress_bar_space);
            a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ void d(int i) {
        a aVar = this.p;
        if (aVar != null) {
            aVar.j(i);
        }
    }

    public void e() {
        int i = this.o;
        if (i >= 0) {
            this.a.get(i).d();
        }
    }

    public void f() {
        int i = this.o;
        if (i >= 0) {
            this.a.get(i).e();
        }
    }

    public void g(int i, boolean z) {
        for (int i2 = 0; i2 < this.c; i2++) {
            PausableProgressBar pausableProgressBar = this.a.get(i2);
            if (i2 < i) {
                pausableProgressBar.f();
            } else if (i2 != i || !z) {
                pausableProgressBar.g();
            } else {
                pausableProgressBar.h();
            }
        }
        this.o = i;
    }

    public void h() {
        int i = this.o;
        if (i >= 0) {
            PausableProgressBar pausableProgressBar = this.a.get(i);
            pausableProgressBar.getCurrentProgressBar().setVisibility(0);
            pausableProgressBar.getMaxProgressBar().setVisibility(4);
            pausableProgressBar.h();
        }
    }

    public void setProgressListener(a aVar) {
        this.p = aVar;
    }

    public void setStoriesCount(int i) {
        this.c = i;
        a();
    }

    public void setStoriesCountWithDurations(long[] jArr) {
        this.c = jArr.length;
        a();
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).setDuration(jArr[i]);
            this.a.get(i).setCallback(new a(this, i));
        }
    }

    public void setStoryDuration(long j) {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).setDuration(j);
            this.a.get(i).setCallback(new a(this, i));
        }
    }

    public StoriesProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(attributeSet);
    }
}
