package com.spotify.music.features.eventsender;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;
import java.util.List;

public final /* synthetic */ class a implements g {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Response response = (Response) obj;
        List<String> list = EventSenderFragment.j0;
        if (response.getStatus() == 200) {
            Logger.b("Event posted successfully to Core: %s", response.toString());
        } else {
            Logger.b("Event failed: %s", response.toString());
        }
    }
}
