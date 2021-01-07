package defpackage;

import android.view.View;

/* renamed from: zi0  reason: default package */
public final /* synthetic */ class zi0 implements qj0 {
    public final /* synthetic */ View a;

    public /* synthetic */ zi0(View view) {
        this.a = view;
    }

    @Override // defpackage.qj0
    public final oj0 a(wi0 wi0) {
        View view = this.a;
        if (!view.hasOnClickListeners()) {
            view.setOnClickListener(new yi0(wi0));
            return new aj0(view);
        }
        throw new IllegalStateException("this View already has a click listener");
    }
}
