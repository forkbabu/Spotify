package defpackage;

import android.view.View;

/* renamed from: kn4  reason: default package */
public final /* synthetic */ class kn4 implements View.OnClickListener {
    public final /* synthetic */ vn4 a;
    public final /* synthetic */ String b;

    public /* synthetic */ kn4(vn4 vn4, String str) {
        this.a = vn4;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(this.b, view);
    }
}
