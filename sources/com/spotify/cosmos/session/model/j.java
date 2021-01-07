package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.spotify.cosmos.session.model.LoginCredentials;

public final /* synthetic */ class j implements si0 {
    public final /* synthetic */ JsonGenerator a;

    public /* synthetic */ j(JsonGenerator jsonGenerator) {
        this.a = jsonGenerator;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        LoginRequestSerializer.d(this.a, (LoginCredentials.StoredCredentials) obj);
    }
}
