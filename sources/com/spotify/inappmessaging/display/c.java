package com.spotify.inappmessaging.display;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ InAppMessagingDisplayFragment a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ c(InAppMessagingDisplayFragment inAppMessagingDisplayFragment, boolean z) {
        this.a = inAppMessagingDisplayFragment;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.O4(this.b);
    }
}
