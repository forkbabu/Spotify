package com.spotify.zero.tracker.eventsender;

import com.spotify.messages.ZeroFrictionAuthentication;
import java.util.List;

public interface a {
    void a(ZeroFrictionAuthentication zeroFrictionAuthentication);

    List<ZeroFrictionAuthentication> remove();
}
