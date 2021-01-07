package defpackage;

import android.view.View;

/* renamed from: co7  reason: default package */
public final /* synthetic */ class co7 implements View.OnFocusChangeListener {
    public final /* synthetic */ so7 a;

    public /* synthetic */ co7(so7 so7) {
        this.a = so7;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.a.m(view, z);
    }
}
