package defpackage;

import android.view.View;

/* renamed from: aj0  reason: default package */
public final /* synthetic */ class aj0 implements oj0 {
    public final /* synthetic */ View a;

    public /* synthetic */ aj0(View view) {
        this.a = view;
    }

    @Override // defpackage.oj0
    public final void dispose() {
        this.a.setOnClickListener(null);
    }
}
