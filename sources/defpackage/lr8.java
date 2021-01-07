package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import kotlin.jvm.internal.h;

/* renamed from: lr8  reason: default package */
public final class lr8 implements g90 {
    private final ls8 a;
    private final Button b;
    private final Button c;

    public lr8(ViewGroup viewGroup) {
        h.e(viewGroup, "parent");
        ls8 b2 = ls8.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        h.d(b2, "TopicChipBinding.inflate…      parent, false\n    )");
        this.a = b2;
        Button a2 = b2.a();
        h.d(a2, "binding.root");
        this.b = a2;
        Button button = b2.b;
        h.d(button, "binding.chip");
        this.c = button;
        vc0.g(a2);
        dvd.b(a2).a();
    }

    public Button b() {
        return this.b;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.b;
    }

    public final void setText(CharSequence charSequence) {
        h.e(charSequence, "text");
        this.c.setText(charSequence);
    }
}
