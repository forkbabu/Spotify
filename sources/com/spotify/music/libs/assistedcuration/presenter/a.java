package com.spotify.music.libs.assistedcuration.presenter;

import java.util.ArrayList;

public final /* synthetic */ class a implements io.reactivex.functions.a {
    public final /* synthetic */ AssistedCurationContentPresenter a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ a(AssistedCurationContentPresenter assistedCurationContentPresenter, ArrayList arrayList) {
        this.a = assistedCurationContentPresenter;
        this.b = arrayList;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.c(this.b);
    }
}
