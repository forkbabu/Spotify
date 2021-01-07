package com.spotify.music.features.yourlibraryx.view.entities.components;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.Component;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class a implements Component {
    private final zg9 a;

    public a(ViewGroup viewGroup) {
        h.e(viewGroup, "parent");
        zg9 b = zg9.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        h.d(b, "RowSectionHeaderYourLibr…ext), parent, false\n    )");
        this.a = b;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout a2 = this.a.a();
        h.d(a2, "binding.root");
        return a2;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<?, f> nmf) {
        h.e(nmf, "event");
        Component.DefaultImpls.onEvent(this, nmf);
    }

    @Override // com.spotify.encore.Item
    public void render(Object obj) {
        String str = (String) obj;
        h.e(str, "model");
        TextView textView = this.a.b;
        h.d(textView, "binding.title");
        textView.setText(str);
    }
}
