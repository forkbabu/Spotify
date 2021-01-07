package defpackage;

import com.google.common.base.Function;
import com.spotify.music.features.profile.proto.PlaylistlistResponse$Playlist;

/* renamed from: lk7  reason: default package */
public final /* synthetic */ class lk7 implements Function {
    public final /* synthetic */ il7 a;

    public /* synthetic */ lk7(il7 il7) {
        this.a = il7;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        il7 il7 = this.a;
        PlaylistlistResponse$Playlist playlistlistResponse$Playlist = (PlaylistlistResponse$Playlist) obj;
        il7.getClass();
        playlistlistResponse$Playlist.getClass();
        return il7.a(playlistlistResponse$Playlist);
    }
}
