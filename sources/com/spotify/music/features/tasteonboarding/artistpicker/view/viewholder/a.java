package com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ ShelfView a;
    public final /* synthetic */ int b;

    public /* synthetic */ a(ShelfView shelfView, int i) {
        this.a = shelfView;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.C(this.b);
    }
}
