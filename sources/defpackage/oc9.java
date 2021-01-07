package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse;
import java.util.Collection;

/* renamed from: oc9 */
public final class oc9 {
    public static xb9 a(FilterTagsResponse filterTagsResponse) {
        ImmutableList immutableList;
        if (filterTagsResponse.contentFilters() != null) {
            immutableList = ImmutableList.copyOf((Collection) filterTagsResponse.contentFilters());
        } else {
            immutableList = ImmutableList.of();
        }
        return xb9.c(immutableList);
    }
}
