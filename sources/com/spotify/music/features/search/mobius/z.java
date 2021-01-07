package com.spotify.music.features.search.mobius;

import com.google.common.base.Optional;
import com.spotify.libs.search.history.SearchHistoryItem;

public class z implements x {
    private Optional<x> a = Optional.absent();

    @Override // com.spotify.music.features.search.mobius.x
    public void a(x98 x98, SearchHistoryItem searchHistoryItem) {
        if (this.a.isPresent()) {
            this.a.get().a(x98, searchHistoryItem);
        }
    }

    @Override // com.spotify.music.features.search.mobius.x
    public void b(String str, int i) {
        if (this.a.isPresent()) {
            this.a.get().b(str, i);
        }
    }

    @Override // com.spotify.music.features.search.mobius.x
    public void c(x98 x98) {
        if (this.a.isPresent()) {
            this.a.get().c(x98);
        }
    }

    public void d(x xVar) {
        this.a = Optional.fromNullable(xVar);
    }
}
