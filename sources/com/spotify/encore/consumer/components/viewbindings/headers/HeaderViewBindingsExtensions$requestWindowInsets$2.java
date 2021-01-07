package com.spotify.encore.consumer.components.viewbindings.headers;

import android.view.View;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.HeaderLayoutBinding;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class HeaderViewBindingsExtensions$requestWindowInsets$2 implements m4 {
    final /* synthetic */ HeaderLayoutBinding $this_requestWindowInsets;
    final /* synthetic */ nmf $windowInsetTopCallback;

    HeaderViewBindingsExtensions$requestWindowInsets$2(HeaderLayoutBinding headerLayoutBinding, nmf nmf) {
        this.$this_requestWindowInsets = headerLayoutBinding;
        this.$windowInsetTopCallback = nmf;
    }

    @Override // defpackage.m4
    public final b5 onApplyWindowInsets(View view, b5 b5Var) {
        HeaderLayoutBinding headerLayoutBinding = this.$this_requestWindowInsets;
        h.d(b5Var, "windowInsets");
        HeaderViewBindingsExtensions.applySystemWindowInsetTop(headerLayoutBinding, b5Var.j());
        this.$windowInsetTopCallback.invoke(Integer.valueOf(b5Var.j()));
        q4.P(this.$this_requestWindowInsets.getRoot(), null);
        return b5Var;
    }
}
