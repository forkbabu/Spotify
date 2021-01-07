package com.spotify.music.yourlibrary.filterchips;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.LinearLayout;

/* access modifiers changed from: package-private */
public class k {
    private final CheckBox a;
    private final LinearLayout b;

    k(Context context) {
        LinearLayout a2 = j.a(context);
        this.b = a2;
        CheckBox b2 = j.b(a2, "", "");
        this.a = b2;
        a2.addView(b2);
    }

    /* access modifiers changed from: package-private */
    public LinearLayout a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void b(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.setMargins(i, layoutParams.topMargin, 0, layoutParams.bottomMargin);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.a.setChecked(false);
    }

    /* access modifiers changed from: package-private */
    public void d(l lVar) {
        String b2 = lVar.b();
        this.a.setText(lVar.d());
        this.a.setTag(b2);
        this.a.setChecked(true);
        j.c(this.a, b2);
    }
}
