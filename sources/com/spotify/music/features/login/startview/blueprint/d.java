package com.spotify.music.features.login.startview.blueprint;

public final class d implements Runnable {
    final /* synthetic */ BlueprintActionsFragment a;

    public d(BlueprintActionsFragment blueprintActionsFragment) {
        this.a = blueprintActionsFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j4().onBackPressed();
    }
}
