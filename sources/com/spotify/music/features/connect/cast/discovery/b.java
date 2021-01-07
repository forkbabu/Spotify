package com.spotify.music.features.connect.cast.discovery;

import com.spotify.libs.connect.model.Message;

public interface b {

    public interface a {
        void a(String str);

        void b(String str);

        void c(String str);
    }

    void a(Message message);

    void b(String str);

    void c(DiscoveredDevice discoveredDevice);

    void d();

    void e(DiscoveredDevice discoveredDevice, io.reactivex.functions.a aVar);

    void f(DiscoveredDevice discoveredDevice);

    void g(a aVar);
}
