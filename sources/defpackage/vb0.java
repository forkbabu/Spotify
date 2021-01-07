package defpackage;

import android.view.View;
import android.widget.TextView;

/* access modifiers changed from: package-private */
/* renamed from: vb0  reason: default package */
public class vb0 implements ub0 {
    private final View a;
    private final TextView b;

    vb0(View view) {
        this.a = view;
        TextView textView = (TextView) view.findViewById(16908308);
        this.b = textView;
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(view);
    }

    @Override // defpackage.ub0
    public int C0() {
        return this.a.getHeight() / 2;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.ub0
    public boolean h2() {
        return false;
    }

    @Override // defpackage.ub0
    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // defpackage.ub0
    public int u0() {
        return this.a.getMeasuredWidth() / 2;
    }
}
