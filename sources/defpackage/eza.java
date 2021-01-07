package defpackage;

import com.spotify.libs.search.history.SearchHistoryItem;

/* renamed from: eza  reason: default package */
public abstract class eza {
    public static eza a(String str, SearchHistoryItem searchHistoryItem, boolean z) {
        return new vya(searchHistoryItem, str, z);
    }

    public abstract SearchHistoryItem b();

    public abstract boolean c();

    public abstract String d();
}
