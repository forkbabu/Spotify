package defpackage;

import android.view.View;
import android.widget.LinearLayout;

/* renamed from: e65  reason: default package */
final class e65 implements View.OnClickListener {
    final /* synthetic */ d65 a;
    final /* synthetic */ LinearLayout b;

    e65(d65 d65, LinearLayout linearLayout) {
        this.a = d65;
        this.b = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d65.a(this.a).a(this.b);
    }
}
