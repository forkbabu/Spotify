package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: ob0  reason: default package */
public class ob0 implements nb0 {
    private final View a;
    private final TextView b;
    private final TextView c;

    public ob0(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(16908308);
        TextView textView = (TextView) view.findViewById(16908309);
        this.c = textView;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(C0707R.dimen.glue_empty_state_error_state_line_height);
        vc0.i(textView);
        vc0.e(textView, dimensionPixelSize);
        vc0.g(view);
    }

    @Override // defpackage.kb0
    public void A2(int i) {
        this.c.setText(i);
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

    @Override // defpackage.kb0
    public void setSubtitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // defpackage.kb0
    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // defpackage.kb0
    public void setTitle(int i) {
        this.b.setText(i);
    }
}
