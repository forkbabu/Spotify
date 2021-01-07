package com.spotify.mobile.android.ui.fragments.logic;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ Optional a;

    public /* synthetic */ a(Optional optional) {
        this.a = optional;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.equals((Optional) obj));
    }
}
