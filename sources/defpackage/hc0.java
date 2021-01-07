package defpackage;

import android.view.View;
import android.widget.TextView;

/* access modifiers changed from: package-private */
/* renamed from: hc0  reason: default package */
public class hc0 extends vb0 implements ec0 {
    private final TextView c;

    hc0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(16908309);
        this.c = textView;
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(view);
    }

    @Override // defpackage.ec0
    public void f(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
