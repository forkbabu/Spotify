package defpackage;

import com.spotify.inappmessaging.display.InAppMessagingDisplayFragment;

/* renamed from: oy7  reason: default package */
public final /* synthetic */ class oy7 implements Runnable {
    public final /* synthetic */ n08 a;
    public final /* synthetic */ InAppMessagingDisplayFragment b;

    public /* synthetic */ oy7(n08 n08, InAppMessagingDisplayFragment inAppMessagingDisplayFragment) {
        this.a = n08;
        this.b = inAppMessagingDisplayFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b);
    }
}
