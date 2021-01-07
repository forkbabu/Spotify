package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: js5  reason: default package */
public class js5 extends hs5 implements qa0 {
    private final TextView o;

    public js5(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(16908309);
        this.o = textView;
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(view);
    }

    @Override // defpackage.hs5, defpackage.ia0
    public View B2() {
        return getView();
    }

    @Override // defpackage.qa0
    public TextView getSubtitleView() {
        return this.o;
    }

    @Override // defpackage.hs5, defpackage.ia0
    public void i1(boolean z) {
    }

    @Override // defpackage.hs5, defpackage.ia0
    public void q1(CharSequence charSequence) {
    }

    @Override // defpackage.qa0
    public void setSubtitle(CharSequence charSequence) {
        this.o.setText(charSequence);
    }
}
