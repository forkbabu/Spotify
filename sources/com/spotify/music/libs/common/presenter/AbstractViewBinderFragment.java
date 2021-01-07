package com.spotify.music.libs.common.presenter;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.contentviewstate.view.ContentFrameLayout;
import com.spotify.music.contentviewstate.view.LoadingView;

@Deprecated
public abstract class AbstractViewBinderFragment<T extends Parcelable> extends BaseViewBinderFragment<T> {
    private ContentFrameLayout<View> k0;

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public View L4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ContentFrameLayout<View> contentFrameLayout = new ContentFrameLayout<>(B2(), null);
        this.k0 = contentFrameLayout;
        contentFrameLayout.setContentView(U4(layoutInflater, contentFrameLayout));
        return this.k0;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public View M4() {
        return this.k0.getContentView();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public gb0 P4() {
        return this.k0.getEmptyState();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public LoadingView R4() {
        return this.k0.getLoadingView();
    }

    /* access modifiers changed from: protected */
    public abstract View U4(LayoutInflater layoutInflater, ViewGroup viewGroup);
}
