package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.spotify.cosmos.session.model.LoginCredentials;

public final /* synthetic */ class i implements si0 {
    public final /* synthetic */ JsonGenerator a;

    public /* synthetic */ i(JsonGenerator jsonGenerator) {
        this.a = jsonGenerator;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        LoginRequestSerializer.h(this.a, (LoginCredentials.ParentChild) obj);
    }
}
