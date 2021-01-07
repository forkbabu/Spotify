package com.spotify.music.features.radio.fragments;

import android.view.View;
import androidx.fragment.app.c;

public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ RadioFragment a;
    public final /* synthetic */ c b;

    public /* synthetic */ e(RadioFragment radioFragment, c cVar) {
        this.a = radioFragment;
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioFragment radioFragment = this.a;
        radioFragment.I0.b(this.b);
    }
}
