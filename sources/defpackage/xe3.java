package defpackage;

import android.view.View;

/* renamed from: xe3  reason: default package */
public final /* synthetic */ class xe3 implements View.OnClickListener {
    public final /* synthetic */ if3 a;
    public final /* synthetic */ String b;

    public /* synthetic */ xe3(if3 if3, String str) {
        this.a = if3;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b(this.b, view);
    }
}
