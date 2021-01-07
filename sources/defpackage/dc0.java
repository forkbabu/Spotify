package defpackage;

import android.view.View;
import android.widget.TextView;

/* access modifiers changed from: package-private */
/* renamed from: dc0  reason: default package */
public class dc0 extends vb0 implements cc0 {
    private final TextView c;

    dc0(View view) {
        super(view);
        this.c = (TextView) view.findViewById(16908309);
    }

    @Override // defpackage.cc0
    public void C(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
