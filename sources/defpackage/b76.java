package defpackage;

import android.os.Bundle;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;

/* renamed from: b76  reason: default package */
public interface b76 extends a76 {

    /* renamed from: b76$a */
    public interface a {
        b76 a(PlaylistDataSourceConfiguration playlistDataSourceConfiguration);
    }

    void c(Bundle bundle);

    void d(Bundle bundle);

    void onStart();
}
