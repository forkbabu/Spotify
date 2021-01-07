package com.spotify.music.features.login.startview;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import java.util.List;
import kotlin.f;

public final /* synthetic */ class a implements nmf {
    public final /* synthetic */ StartFragment a;
    public final /* synthetic */ AuthenticationButton b;
    public final /* synthetic */ List c;

    public /* synthetic */ a(StartFragment startFragment, AuthenticationButton authenticationButton, List list) {
        this.a = startFragment;
        this.b = authenticationButton;
        this.c = list;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        this.a.M4(this.b, this.c, (AuthenticationButton.Events) obj);
        return f.a;
    }
}
