package com.spotify.music.libs.mediabrowserservice;

import java.io.Serializable;
import java.util.Comparator;

public class RecentlyUsedComparator implements Comparator<n2>, Serializable {
    private static final long serialVersionUID = -3812157713554950887L;

    /* renamed from: a */
    public int compare(n2 n2Var, n2 n2Var2) {
        n2Var.getClass();
        n2Var2.getClass();
        long w = n2Var.e().w();
        long w2 = n2Var2.e().w();
        if (w2 < w) {
            return -1;
        }
        return w2 == w ? 0 : 1;
    }
}
