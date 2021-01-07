package com.spotify.music.features.login;

import com.spotify.login.AuthenticationMetadata;
import com.spotify.login.o0;

public class e1 implements o0 {
    private final chb a;

    public e1(chb chb) {
        this.a = chb;
    }

    @Override // com.spotify.login.o0
    public void a(AuthenticationMetadata authenticationMetadata) {
        if (authenticationMetadata.d()) {
            this.a.a();
        }
    }
}
