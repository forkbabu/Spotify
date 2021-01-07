package com.spotify.encore.consumer.components.impl.sectionheading;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.encore.consumer.components.impl.R;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultSectionHeading2 implements SectionHeading2 {
    private final View root;
    private final TextView subtitle;
    private final TextView title;

    public DefaultSectionHeading2(Context context) {
        h.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.section_heading2_layout, (ViewGroup) null);
        h.d(inflate, "inflater.inflate(R.layou…on_heading2_layout, null)");
        this.root = inflate;
        View G = q4.G(getView(), R.id.section_heading2_title);
        h.d(G, "ViewCompat.requireViewBy…d.section_heading2_title)");
        TextView textView = (TextView) G;
        this.title = textView;
        View G2 = q4.G(getView(), R.id.section_heading2_subtitle);
        h.d(G2, "ViewCompat.requireViewBy…ection_heading2_subtitle)");
        this.subtitle = (TextView) G2;
        getView().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        q4.I(textView, TitleAcessibilityDelegateKt.getHeadingAccessibilityDelegate());
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super f, f> nmf) {
        h.e(nmf, "event");
        SectionHeading2.DefaultImpls.onEvent(this, nmf);
    }

    public void render(SectionHeading2.Model model) {
        h.e(model, "model");
        this.title.setText(model.getTitle());
        String subtitle2 = model.getSubtitle();
        int i = 0;
        boolean z = !(subtitle2 == null || subtitle2.length() == 0);
        if (z) {
            this.subtitle.setText(model.getSubtitle());
        }
        TextView textView = this.subtitle;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }
}
