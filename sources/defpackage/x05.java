package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.music.C0707R;
import com.spotify.music.features.eventshub.model.Album;
import com.spotify.music.features.eventshub.model.ConcertEntityModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x05  reason: default package */
public class x05 implements y05 {
    private final Context a;
    private final twd b;
    private final w51 c;
    private final ia0 d;
    private i61 e;
    List<s81> f;

    public x05(Context context, twd twd, w51 w51, ia0 ia0) {
        this.a = context;
        this.b = twd;
        this.c = w51;
        this.d = ia0;
    }

    @Override // defpackage.y05
    public void a(ConcertEntityModel concertEntityModel) {
        List<Album> albumsForConcert = concertEntityModel.getAlbumsForConcert();
        if (!(albumsForConcert == null || albumsForConcert.isEmpty())) {
            this.d.setTitle(this.a.getString(C0707R.string.events_hub_concert_entity_albums_for_concert));
            this.d.i1(true);
            this.b.Z(new v02(this.d.getView(), true), 3);
            this.e = new i61(this.c);
            this.f = new ArrayList();
            int i = 0;
            if (albumsForConcert.size() > 1) {
                boolean z = concertEntityModel.getArtists().size() > 1;
                ArrayList arrayList = new ArrayList();
                for (Album album : albumsForConcert) {
                    this.f.add(z81.c().n(HubsGlueCard.NORMAL).y(z81.h().a(album.getName()).d(z ? album.getArtistName() : "")).x(z81.g(album.getUri())).t(z81.f().f(z81.e().g(album.getImageUri()))).i("ui:index_in_block", Integer.valueOf(i)).i("ui:group", "goto-album").l());
                    i++;
                }
                List<s81> list = this.f;
                i61 i61 = this.e;
                arrayList.add(z81.c().n(HubsGlueComponent.CAROUSEL).m(list).l());
                i61.c0(arrayList);
                i61.z();
                this.b.Z(this.e, 4);
                return;
            }
            Album album2 = albumsForConcert.get(0);
            this.f.add(z81.c().n(HubsGlueRow.NORMAL).y(z81.h().a(album2.getName()).d(album2.getArtistName())).x(z81.g(album2.getUri())).t(z81.f().f(z81.e().g(album2.getImageUri()))).i("ui:index_in_block", 0).i("ui:group", "goto-album").l());
            this.e.c0(this.f);
            this.e.z();
            this.b.Z(this.e, 4);
        }
    }
}
