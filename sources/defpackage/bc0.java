package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: bc0  reason: default package */
class bc0 extends xb0 implements ac0 {
    private final TextView n;
    private final TextView o;

    bc0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(16908309);
        this.n = textView;
        textView.setVisibility(0);
        TextView textView2 = (TextView) view.findViewById(C0707R.id.metadata);
        this.o = textView2;
        textView2.setVisibility(0);
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(view);
    }

    @Override // defpackage.ac0
    public void e(CharSequence charSequence) {
        this.o.setText(charSequence);
    }

    @Override // defpackage.yb0
    public void f(CharSequence charSequence) {
        this.n.setText(charSequence);
    }
}
