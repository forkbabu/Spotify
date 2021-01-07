package com.spotify.music.cyoa.game;

import com.spotify.music.cyoa.model.CyoaGame;
import com.spotify.music.cyoa.model.CyoaGameStatus;
import com.spotify.music.cyoa.model.CyoaSelectOption;
import io.reactivex.s;

public class o {
    private final p a;

    public o(p pVar) {
        this.a = pVar;
    }

    public s<CyoaGameStatus> a(int i) {
        return this.a.d(i).P();
    }

    public s<CyoaGame> b(String str) {
        return this.a.a(Integer.parseInt(str)).P();
    }

    public s<CyoaGameStatus> c(int i, int i2) {
        return this.a.b(i, new CyoaSelectOption(i2)).P();
    }

    public s<CyoaGameStatus> d(int i) {
        return this.a.c(i).P();
    }
}
