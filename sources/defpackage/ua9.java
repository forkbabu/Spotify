package defpackage;

import android.view.View;

/* renamed from: ua9  reason: default package */
public final /* synthetic */ class ua9 implements View.OnClickListener {
    public final /* synthetic */ xa9 a;
    public final /* synthetic */ va9 b;

    public /* synthetic */ ua9(xa9 xa9, va9 va9) {
        this.a = xa9;
        this.b = va9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c(this.b, view);
    }
}
