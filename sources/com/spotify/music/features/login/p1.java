package com.spotify.music.features.login;

import com.spotify.cosmos.session.model.LoginOptions;
import com.spotify.login.v0;

public class p1 implements v0 {
    p1() {
    }

    @Override // com.spotify.login.v0
    public LoginOptions a() {
        return LoginOptions.builder().bootstrapRequired(Boolean.TRUE).build();
    }
}
