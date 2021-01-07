package com.spotify.mobile.android.ui.fragments.logic;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;

public abstract class PresentableDialogFragment extends LifecycleListenableFragment {
    protected DialogPresenter h0;
    protected int i0 = -1;

    public void K4(DialogPresenter dialogPresenter) {
        dialogPresenter.getClass();
        this.h0 = dialogPresenter;
        this.i0 = dialogPresenter.K4(this);
    }

    public void L4() {
        Assertion.d(-1, Integer.valueOf(this.i0));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        String X2;
        super.N3(bundle);
        DialogPresenter dialogPresenter = this.h0;
        if (!(dialogPresenter == null || (X2 = dialogPresenter.X2()) == null)) {
            bundle.putString("presenter_tag", X2);
        }
        bundle.putInt("request_code", this.i0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        Assertion.d(-1, Integer.valueOf(i));
        super.n3(i, i2, intent);
        DialogPresenter dialogPresenter = this.h0;
        if (dialogPresenter != null) {
            dialogPresenter.n3(i, i2, intent);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle != null) {
            bundle.setClassLoader(l4().getClassLoader());
            String string = bundle.getString("presenter_tag");
            if (string != null) {
                this.h0 = (DialogPresenter) Q2().U(string);
            }
            this.i0 = bundle.getInt("request_code");
        }
    }
}
