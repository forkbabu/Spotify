package com.spotify.music.homecomponents.experimental.inlineonboarding.header;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ Button a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ProgressBar c;
    public final /* synthetic */ o61 f;
    public final /* synthetic */ n61 n;

    public /* synthetic */ d(Button button, Context context, ProgressBar progressBar, o61 o61, n61 n61) {
        this.a = button;
        this.b = context;
        this.c = progressBar;
        this.f = o61;
        this.n = n61;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Button button = this.a;
        Context context = this.b;
        ProgressBar progressBar = this.c;
        o61 o61 = this.f;
        n61 n61 = this.n;
        button.setTextColor(context.getResources().getColor(17170445));
        button.setClickable(false);
        progressBar.setVisibility(0);
        o61.a(n61);
    }
}
