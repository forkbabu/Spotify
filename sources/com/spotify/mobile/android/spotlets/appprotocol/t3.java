package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

public interface t3 {
    void a(String str, AppProtocol.ChallengeDetails challengeDetails);

    void b(int i, int i2, Object obj, String str);

    void c(int i, int i2);

    void d(int i);

    void e(AppProtocol.Message message, String str);

    void f(int i, AppProtocol.WelcomeDetails welcomeDetails);

    void g(int i, int i2, Object obj);

    void h(AppProtocol.Message message, String str);

    void stop();
}
