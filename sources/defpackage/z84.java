package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: z84  reason: default package */
public class z84 implements y84 {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final Button f;

    public z84(ViewGroup viewGroup) {
        View G = je.G(viewGroup, C0707R.layout.find_inline_empty, viewGroup, false);
        this.a = G;
        this.b = (TextView) G.findViewById(16908308);
        TextView textView = (TextView) G.findViewById(16908309);
        this.c = textView;
        this.f = (Button) G.findViewById(C0707R.id.empty_view_button);
        int dimensionPixelSize = G.getResources().getDimensionPixelSize(C0707R.dimen.glue_empty_state_error_state_line_height);
        vc0.i(textView);
        vc0.e(textView, dimensionPixelSize);
        vc0.g(G);
    }

    private void b(int i) {
        View view = this.a;
        view.setPadding(view.getPaddingLeft(), i, this.a.getPaddingRight(), this.a.getPaddingBottom());
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.y84
    public View i() {
        return this.f;
    }

    @Override // defpackage.y84
    public void q() {
        this.f.setVisibility(8);
        b(this.a.getContext().getResources().getDimensionPixelSize(C0707R.dimen.find_inline_empty_padding));
    }

    @Override // defpackage.y84
    public void setSubtitle(String str) {
        this.c.setText(str);
    }

    @Override // defpackage.y84
    public void setTitle(String str) {
        this.b.setText(str);
        this.b.setContentDescription(str);
    }

    @Override // defpackage.y84
    public void t(String str) {
        this.f.setText(str);
        this.f.setVisibility(0);
        b(this.a.getContext().getResources().getDimensionPixelSize(C0707R.dimen.find_inline_empty_with_button_padding));
    }
}
