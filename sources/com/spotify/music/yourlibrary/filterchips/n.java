package com.spotify.music.yourlibrary.filterchips;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.spotify.music.yourlibrary.filterchips.q;

/* access modifiers changed from: package-private */
public class n {
    private final LinearLayout a;
    private final HorizontalScrollView b;
    private q.a c;

    n(Context context) {
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setLayoutParams(new LinearLayout.LayoutParams(-2, nud.g(48.0f, context.getResources())));
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        this.b = horizontalScrollView;
        LinearLayout a2 = j.a(context);
        this.a = a2;
        a2.setPadding(nud.g(10.0f, context.getResources()), 0, 0, 0);
        horizontalScrollView.addView(a2);
    }

    /* access modifiers changed from: package-private */
    public void a(l lVar, int i) {
        CheckBox b2 = j.b(this.a, lVar.d(), lVar.b());
        b2.setOnCheckedChangeListener(new b(this));
        if (i > this.a.getChildCount()) {
            this.a.addView(b2);
        } else {
            this.a.addView(b2, i);
        }
    }

    /* access modifiers changed from: package-private */
    public int b(String str) {
        View findViewWithTag = this.a.findViewWithTag(str);
        if (findViewWithTag == null) {
            return 0;
        }
        int[] iArr = new int[2];
        findViewWithTag.getLocationOnScreen(iArr);
        return iArr[0];
    }

    /* access modifiers changed from: package-private */
    public ViewGroup c() {
        return this.b;
    }

    public void d(CompoundButton compoundButton, boolean z) {
        if (this.c != null && compoundButton.isChecked()) {
            int indexOfChild = this.a.indexOfChild(compoundButton);
            q.a aVar = this.c;
            ((FilterChipsView) ((f) aVar).a).d(compoundButton.getTag().toString(), compoundButton.getText().toString(), true, indexOfChild);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str) {
        View findViewWithTag = this.a.findViewWithTag(str);
        if (findViewWithTag != null) {
            this.a.removeView(findViewWithTag);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        for (int i = 0; i < this.a.getChildCount(); i++) {
            ((CheckBox) this.a.getChildAt(i)).setChecked(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(q.a aVar) {
        this.c = aVar;
    }
}
