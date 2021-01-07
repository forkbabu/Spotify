package defpackage;

import android.view.View;
import android.widget.TextView;

/* access modifiers changed from: package-private */
/* renamed from: ra0  reason: default package */
public class ra0 extends ja0 implements qa0 {
    private final TextView o;

    public ra0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(16908309);
        this.o = textView;
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(view);
    }

    @Override // defpackage.qa0
    public TextView getSubtitleView() {
        return this.o;
    }

    @Override // defpackage.qa0
    public void setSubtitle(CharSequence charSequence) {
        this.o.setText(charSequence);
    }
}
