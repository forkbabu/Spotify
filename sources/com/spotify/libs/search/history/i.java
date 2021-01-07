package com.spotify.libs.search.history;

import java.util.Iterator;

public class i {
    private final p a;

    public i(p pVar) {
        pVar.getClass();
        this.a = pVar;
    }

    public void a(SearchHistoryItem searchHistoryItem) {
        o<SearchHistoryItem> c = this.a.c();
        searchHistoryItem.getClass();
        ((f) c).i(searchHistoryItem);
    }

    public void b() {
        ((f) this.a.c()).c();
    }

    public void c() {
        this.a.e();
    }

    public o<SearchHistoryItem> d() {
        return this.a.c();
    }

    public boolean e() {
        return this.a.d();
    }

    public void f(String str) {
        SearchHistoryItem searchHistoryItem;
        f fVar = (f) this.a.c();
        Iterator it = fVar.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                searchHistoryItem = null;
                break;
            }
            searchHistoryItem = (SearchHistoryItem) it.next();
            if (searchHistoryItem.getOriginUri().equals(str)) {
                break;
            }
        }
        if (searchHistoryItem != null) {
            fVar.k(searchHistoryItem);
        }
    }
}
