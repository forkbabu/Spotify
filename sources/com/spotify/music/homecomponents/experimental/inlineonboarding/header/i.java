package com.spotify.music.homecomponents.experimental.inlineonboarding.header;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.music.C0707R;

public class i implements j {
    private final View a;
    private final TextView b;
    private final Button c;
    private final ProgressBar f;

    public i(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.home_inline_onboarding_header, viewGroup, false);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(C0707R.id.title);
        this.c = (Button) inflate.findViewById(C0707R.id.button_done);
        this.f = (ProgressBar) inflate.findViewById(C0707R.id.spinner);
    }

    @Override // com.spotify.music.homecomponents.experimental.inlineonboarding.header.j
    public View A() {
        return this.f;
    }

    @Override // com.spotify.music.homecomponents.experimental.inlineonboarding.header.j
    public void P1(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    @Override // com.spotify.music.homecomponents.experimental.inlineonboarding.header.j
    public View Y() {
        return this.c;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.music.homecomponents.experimental.inlineonboarding.header.j
    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.b.setText(charSequence);
        }
    }
}
