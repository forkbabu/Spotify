package com.spotify.music.features.freetierallsongsdialog;

import androidx.recyclerview.widget.RecyclerView;

class c extends RecyclerView.q {
    final /* synthetic */ FreeTierAllSongsDialogActivity a;

    c(FreeTierAllSongsDialogActivity freeTierAllSongsDialogActivity) {
        this.a = freeTierAllSongsDialogActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        this.a.N.o(Math.min(((float) recyclerView.computeVerticalScrollOffset()) / ((float) this.a.K.getHeight()), 1.0f));
    }
}
