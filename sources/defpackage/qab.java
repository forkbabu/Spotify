package defpackage;

import android.app.Activity;
import android.view.View;

/* renamed from: qab  reason: default package */
public final /* synthetic */ class qab implements View.OnClickListener {
    public final /* synthetic */ vab a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ qab(vab vab, Runnable runnable, Activity activity) {
        this.a = vab;
        this.b = runnable;
        this.c = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a(this.b, this.c, view);
    }
}
