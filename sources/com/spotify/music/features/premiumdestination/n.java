package com.spotify.music.features.premiumdestination;

import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.subjects.PublishSubject;

final class n extends RecyclerView.q {
    final /* synthetic */ PublishSubject a;

    n(PublishSubject publishSubject) {
        this.a = publishSubject;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        this.a.onNext(recyclerView);
    }
}
