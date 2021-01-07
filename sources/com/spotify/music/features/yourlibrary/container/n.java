package com.spotify.music.features.yourlibrary.container;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.g;
import java.util.Map;

public class n {
    private final zpd a;

    public n(zpd zpd) {
        this.a = zpd;
    }

    public YourLibraryPageId a(String str, YourLibraryPageId yourLibraryPageId) {
        UnmodifiableIterator<Map.Entry<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>>> it = this.a.a().mo54entrySet().iterator();
        while (it.hasNext()) {
            UnmodifiableListIterator<YourLibraryPageId> listIterator = it.next().getValue().listIterator();
            while (true) {
                if (listIterator.hasNext()) {
                    g c = this.a.c(listIterator.next());
                    if (c.c(str)) {
                        return c.b();
                    }
                }
            }
        }
        return yourLibraryPageId;
    }
}
