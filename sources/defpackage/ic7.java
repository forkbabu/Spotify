package defpackage;

import android.view.View;

/* renamed from: ic7  reason: default package */
public final /* synthetic */ class ic7 implements View.OnClickListener {
    public final /* synthetic */ pc7 a;
    public final /* synthetic */ rc7 b;

    public /* synthetic */ ic7(pc7 pc7, rc7 rc7) {
        this.a = pc7;
        this.b = rc7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(this.b, view);
    }
}
