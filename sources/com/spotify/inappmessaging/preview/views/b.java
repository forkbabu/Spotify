package com.spotify.inappmessaging.preview.views;

import android.view.View;

public final /* synthetic */ class b implements View.OnFocusChangeListener {
    public final /* synthetic */ PreviewSubmissionView a;

    public /* synthetic */ b(PreviewSubmissionView previewSubmissionView) {
        this.a = previewSubmissionView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        PreviewSubmissionView previewSubmissionView = this.a;
        previewSubmissionView.getClass();
        if (z) {
            previewSubmissionView.a();
        }
    }
}
