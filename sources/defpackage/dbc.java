package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.pageloader.o0;
import com.spotify.remoteconfig.MusicLibsPageloaderForMusicProperties;

/* renamed from: dbc  reason: default package */
public class dbc {
    private final zac a;
    private final MusicLibsPageloaderForMusicProperties b;

    public dbc(zac zac, MusicLibsPageloaderForMusicProperties musicLibsPageloaderForMusicProperties) {
        this.a = zac;
        this.b = musicLibsPageloaderForMusicProperties;
    }

    public <T> cbc<T> a(Fragment fragment, o0<T> o0Var) {
        if (this.b.a() == MusicLibsPageloaderForMusicProperties.PageLoaderScopePolicy.CREATE_DESTROY) {
            zac zac = this.a;
            zac.getClass();
            return new ibc(fragment, o0Var, new sac(zac));
        } else if (this.b.a() == MusicLibsPageloaderForMusicProperties.PageLoaderScopePolicy.START_STOP) {
            return new yac(fragment, this.a.a(o0Var));
        } else {
            throw new RuntimeException("Unexpected page loader policy");
        }
    }
}
