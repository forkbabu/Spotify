package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: c5  reason: default package */
public final class c5 extends ClickableSpan {
    private final int a;
    private final d5 b;
    private final int c;

    public c5(int i, d5 d5Var, int i2) {
        this.a = i;
        this.b = d5Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.H(this.c, bundle);
    }
}
