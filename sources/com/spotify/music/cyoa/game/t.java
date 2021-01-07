package com.spotify.music.cyoa.game;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.cyoa.model.CyoaGame;
import com.spotify.music.cyoa.model.CyoaGameStatus;

public interface t {

    public interface a {
        void a();
    }

    public interface b {
    }

    View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    View b();

    void c();

    void d(b bVar);

    void e(CyoaGameStatus cyoaGameStatus);

    void f(a aVar);

    void g(a aVar);

    void h(CyoaGame cyoaGame);
}
