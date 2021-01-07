package com.spotify.cosmos.android.cosmonaut;

import com.spotify.cosmos.router.RxRouter;

public interface ServiceMethod {
    Object create(RxRouter rxRouter, Object[] objArr);
}
