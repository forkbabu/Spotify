package defpackage;

import android.view.View;
import android.widget.TextView;

/* access modifiers changed from: package-private */
/* renamed from: zb0  reason: default package */
public class zb0 extends xb0 implements yb0 {
    private final TextView n;

    zb0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(16908309);
        this.n = textView;
        textView.setVisibility(0);
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(view);
    }

    @Override // defpackage.yb0
    public void f(CharSequence charSequence) {
        this.n.setText(charSequence);
    }
}
