package com.spotify.facebook.authentication.tracker;

public interface FacebookTracker {

    public enum Screen {
        FACEBOOK_LOGIN,
        FACEBOOK_ACCOUNT_CREATION
    }

    void a(Screen screen, String str);

    void b();

    void c(Screen screen);

    void d(Screen screen);

    void e();

    void f(Screen screen);

    void g(Screen screen, String str);

    void h(Screen screen, String str);
}
