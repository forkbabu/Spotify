package defpackage;

import android.view.View;

/* renamed from: br5  reason: default package */
public final /* synthetic */ class br5 implements View.OnClickListener {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ br5(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.run();
    }
}
