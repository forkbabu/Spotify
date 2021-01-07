package com.spotify.cosmos.android.cosmonaut;

import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import com.spotify.cosmos.router.RxRouter;
import java.util.List;

public class Cosmonaut {
    private final CosmonautHandler mCosmonautHandler;
    private final RxRouter mRxRouter;

    public Cosmonaut(RxRouter rxRouter, List<Converter.Factory> list) {
        this.mRxRouter = rxRouter;
        this.mCosmonautHandler = new CosmonautHandler(list);
    }

    public <T> T createCosmosService(Class<T> cls) {
        return (T) createCosmosService(cls, this.mRxRouter);
    }

    @Deprecated
    public <T> T createCosmosService(Class<T> cls, RxRouter rxRouter) {
        return (T) this.mCosmonautHandler.create(cls, rxRouter);
    }
}
