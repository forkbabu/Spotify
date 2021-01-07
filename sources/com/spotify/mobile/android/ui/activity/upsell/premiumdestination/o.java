package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;

public class o implements ub0 {
    private final View a;
    private final TextView b;
    private final TextView c;

    public o(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.view_premium_destination_header_content, viewGroup, false);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(C0707R.id.header);
        this.c = (TextView) inflate.findViewById(C0707R.id.subtitle);
    }

    @Override // defpackage.ub0
    public int C0() {
        return 0;
    }

    public TextView getSubtitleView() {
        return this.c;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.ub0
    public boolean h2() {
        return false;
    }

    public TextView n2() {
        return this.b;
    }

    @Override // defpackage.ub0
    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // defpackage.ub0
    public int u0() {
        return 0;
    }
}
