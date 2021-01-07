package com.spotify.encore.consumer.components.impl.sectionheading;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading3;
import com.spotify.encore.consumer.components.impl.R;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultSectionHeading3 implements SectionHeading3 {
    private final TextView title;

    public DefaultSectionHeading3(Context context) {
        h.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.section_heading3_layout, (ViewGroup) null);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            this.title = textView;
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            q4.I(textView, TitleAcessibilityDelegateKt.getHeadingAccessibilityDelegate());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.title;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super f, f> nmf) {
        h.e(nmf, "event");
        SectionHeading3.DefaultImpls.onEvent(this, nmf);
    }

    public void render(SectionHeading3.Model model) {
        h.e(model, "model");
        this.title.setText(model.getTitle());
    }
}
