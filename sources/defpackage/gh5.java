package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import java.util.List;

/* renamed from: gh5  reason: default package */
public class gh5 implements i<Episode> {
    /* Return type fixed from 'java.util.List' to match base method */
    @Override // com.spotify.playlist.models.i
    public List<Episode> getItems() {
        return ImmutableList.of();
    }

    @Override // com.spotify.playlist.models.i
    public int getUnfilteredLength() {
        return 0;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnrangedLength() {
        return 0;
    }

    @Override // com.spotify.playlist.models.i
    public boolean isLoading() {
        return false;
    }
}
