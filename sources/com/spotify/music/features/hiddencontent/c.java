package com.spotify.music.features.hiddencontent;

import android.view.View;
import com.spotify.music.features.hiddencontent.presenter.HiddenContentFragmentPresenter;

public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ HiddenContentFragment a;

    public /* synthetic */ c(HiddenContentFragment hiddenContentFragment) {
        this.a = hiddenContentFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.h0.i(HiddenContentFragmentPresenter.Tab.ARTISTS);
    }
}
