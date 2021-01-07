package defpackage;

import android.view.View;

/* renamed from: zh9  reason: default package */
public final /* synthetic */ class zh9 implements View.OnFocusChangeListener {
    public final /* synthetic */ hi9 a;

    public /* synthetic */ zh9(hi9 hi9) {
        this.a = hi9;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.a.q(view, z);
    }
}
