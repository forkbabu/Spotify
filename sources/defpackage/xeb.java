package defpackage;

import android.view.View;

/* renamed from: xeb  reason: default package */
final class xeb implements View.OnClickListener {
    final /* synthetic */ yeb a;
    final /* synthetic */ View b;

    xeb(yeb yeb, View view) {
        this.a = yeb;
        this.b = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.setOnClickListener(null);
        this.b.setClickable(false);
        this.a.m();
    }
}
