package com.spotify.music.features.login;

import com.spotify.facebook.authentication.tracker.FacebookTracker;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

public class i1 implements FacebookTracker {
    private final xhd a;

    public i1(xhd xhd) {
        this.a = xhd;
    }

    private static ScreenIdentifier i(FacebookTracker.Screen screen) {
        if (screen == FacebookTracker.Screen.FACEBOOK_ACCOUNT_CREATION) {
            return ScreenIdentifier.CREATE_FB_ACCOUNT;
        }
        return ScreenIdentifier.START;
    }

    @Override // com.spotify.facebook.authentication.tracker.FacebookTracker
    public void a(FacebookTracker.Screen screen, String str) {
        this.a.a(i(screen), ErrorTypeIdentifier.NO_CONNECTION, null);
    }

    @Override // com.spotify.facebook.authentication.tracker.FacebookTracker
    public void b() {
        this.a.g(ScreenIdentifier.CREATE_FB_ACCOUNT, ClickIdentifier.CONTINUE_BUTTON);
    }

    @Override // com.spotify.facebook.authentication.tracker.FacebookTracker
    public void c(FacebookTracker.Screen screen) {
        this.a.l(i(screen));
    }

    @Override // com.spotify.facebook.authentication.tracker.FacebookTracker
    public void d(FacebookTracker.Screen screen) {
        this.a.p(i(screen));
    }

    @Override // com.spotify.facebook.authentication.tracker.FacebookTracker
    public void e() {
        this.a.g(ScreenIdentifier.CREATE_FB_ACCOUNT, ClickIdentifier.CANCEL_BUTTON);
    }

    @Override // com.spotify.facebook.authentication.tracker.FacebookTracker
    public void f(FacebookTracker.Screen screen) {
        this.a.a(i(screen), ErrorTypeIdentifier.REGION_MISSMATCH, null);
    }

    @Override // com.spotify.facebook.authentication.tracker.FacebookTracker
    public void g(FacebookTracker.Screen screen, String str) {
        this.a.n(i(screen), ErrorTypeIdentifier.OFFLINE_MODE, null, str);
    }

    @Override // com.spotify.facebook.authentication.tracker.FacebookTracker
    public void h(FacebookTracker.Screen screen, String str) {
        this.a.n(i(screen), ErrorTypeIdentifier.FACEBOOK_GENERIC, null, str);
    }
}
