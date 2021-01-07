package defpackage;

import com.spotify.music.libs.connect.access.view.ConnectAccessButton;

/* renamed from: jaa  reason: default package */
public final /* synthetic */ class jaa implements Runnable {
    public final /* synthetic */ ConnectAccessButton a;

    public /* synthetic */ jaa(ConnectAccessButton connectAccessButton) {
        this.a = connectAccessButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.C();
    }
}
