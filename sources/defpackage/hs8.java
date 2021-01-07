package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.h;

/* renamed from: hs8  reason: default package */
public final class hs8 implements g90 {
    private final ks8 a;
    private final View b;
    private final TextView c;

    public hs8(ViewGroup viewGroup) {
        h.e(viewGroup, "parent");
        ks8 b2 = ks8.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        h.d(b2, "SectionHeaderBinding.inf…      parent, false\n    )");
        this.a = b2;
        LinearLayout a2 = b2.a();
        h.d(a2, "binding.root");
        this.b = a2;
        TextView textView = b2.b;
        h.d(textView, "binding.text1");
        this.c = textView;
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(a2);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.b;
    }

    public final void setTitle(CharSequence charSequence) {
        h.e(charSequence, "text");
        this.c.setText(charSequence);
    }
}
