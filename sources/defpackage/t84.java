package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: t84  reason: default package */
public class t84 implements qc0, tc0 {
    private final View a;
    private final TextView b;

    public t84(ViewGroup viewGroup) {
        View G = je.G(viewGroup, C0707R.layout.browse_header_text, viewGroup, false);
        this.a = G;
        this.b = (TextView) q4.G(G, C0707R.id.header_title);
    }

    @Override // defpackage.tc0
    public void e0(int i, float f) {
        this.a.setTranslationY((float) (-i));
    }

    @Override // defpackage.qc0, com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
