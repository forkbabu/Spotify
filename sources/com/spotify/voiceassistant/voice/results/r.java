package com.spotify.voiceassistant.voice.results;

import com.spotify.voice.results.model.NoResultsPageException;
import java.util.concurrent.Callable;

final class r<V> implements Callable<e> {
    final /* synthetic */ o a;

    r(o oVar) {
        this.a = oVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public e call() {
        try {
            return this.a.a();
        } catch (IllegalStateException e) {
            throw new NoResultsPageException(e);
        }
    }
}
