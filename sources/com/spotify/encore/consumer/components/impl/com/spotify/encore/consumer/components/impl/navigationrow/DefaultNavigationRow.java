package com.spotify.encore.consumer.components.impl.com.spotify.encore.consumer.components.impl.navigationrow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encore.consumer.components.api.navigationrow.NavigationRow;
import com.spotify.encore.consumer.components.impl.R;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultNavigationRow implements NavigationRow {
    private final TextView title;

    public DefaultNavigationRow(Context context) {
        h.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.navigation_row_layout, (ViewGroup) null);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            this.title = textView;
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            bvd c = dvd.c(textView);
            c.g(textView);
            c.a();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.title;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super NavigationRow.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultNavigationRow$onEvent$1(nmf));
    }

    public void render(NavigationRow.Model model) {
        h.e(model, "model");
        this.title.setText(model.getTitle());
        this.title.setEnabled(model.isNavigatable());
    }
}
