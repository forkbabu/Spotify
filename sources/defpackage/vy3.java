package defpackage;

import com.spotify.music.features.album.di.AlbumAutoPlayUrlHandler;
import com.spotify.music.libs.collection.util.o;
import com.spotify.music.libs.freetiertrackpreview.transformer.g;
import com.spotify.music.libs.viewartistscontextmenu.ui.c;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.radio.formatlist.d;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: vy3  reason: default package */
public class vy3 extends yz3 {
    private final iy3 v;

    public vy3(boolean z, d dVar, String str, y yVar, t8a t8a, uk9 uk9, t tVar, com.spotify.music.features.addtoplaylist.d dVar2, jzc jzc, iy3 iy3, o oVar, boolean z2, AlbumAutoPlayUrlHandler albumAutoPlayUrlHandler, c cVar, ny3 ny3, mf3 mf3, c04 c04, tw3 tw3, qw3 qw3, g gVar) {
        super(z, dVar, str, yVar, t8a, uk9, tVar, dVar2, jzc, oVar, z2, albumAutoPlayUrlHandler, cVar, ny3, mf3, c04, tw3, qw3, gVar);
        this.v = iy3;
    }

    @Override // defpackage.yz3, defpackage.xz3
    public void a() {
        super.a();
        this.v.d();
    }

    @Override // defpackage.yz3, defpackage.xz3
    public void d(s<wv3> sVar, g04 g04) {
        super.d(sVar, g04);
        this.v.c();
    }

    @Override // defpackage.yz3, defpackage.lf3
    public void l(String str, boolean z) {
        super.l(str, z);
        if (!z) {
            this.v.e();
        }
    }
}
