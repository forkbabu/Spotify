package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: mb0  reason: default package */
public class mb0 implements lb0 {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final Button f;

    public mb0(View view) {
        this.a = view;
        TextView textView = (TextView) view.findViewById(16908308);
        this.b = textView;
        TextView textView2 = (TextView) view.findViewById(16908309);
        this.c = textView2;
        this.f = (Button) view.findViewById(C0707R.id.empty_view_button);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(C0707R.dimen.glue_empty_state_error_state_line_height);
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        TextView[] textViewArr2 = {textView2};
        vc0.i(textViewArr2);
        vc0.h(textViewArr2);
        vc0.e(textView2, dimensionPixelSize);
        vc0.g(view);
    }

    @Override // defpackage.kb0
    public void A2(int i) {
        this.c.setText(i);
    }

    @Override // defpackage.rb0
    public void E(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    @Override // defpackage.kb0
    public TextView getSubtitleView() {
        return this.c;
    }

    @Override // defpackage.kb0
    public TextView getTitleView() {
        return this.b;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.rb0
    public Button i() {
        return this.f;
    }

    @Override // defpackage.kb0
    public void setSubtitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // defpackage.kb0
    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // defpackage.rb0
    public void w(int i) {
        this.f.setText(i);
    }

    @Override // defpackage.kb0
    public void setTitle(int i) {
        this.b.setText(i);
    }
}
