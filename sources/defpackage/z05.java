package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.playback.i;
import com.spotify.music.C0707R;
import com.spotify.music.features.eventshub.model.Artist;
import com.spotify.music.features.eventshub.model.ConcertEntityModel;
import defpackage.h61;
import defpackage.w81;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z05  reason: default package */
public class z05 implements y05 {
    private final Context a;
    private i61 b;
    List<s81> c;
    private final twd d;
    private final w51 e;
    private final i f;
    private final ia0 g;

    public z05(Context context, twd twd, w51 w51, i iVar, ia0 ia0) {
        this.a = context;
        this.d = twd;
        this.e = w51;
        this.f = iVar;
        this.g = ia0;
    }

    @Override // defpackage.y05
    public void a(ConcertEntityModel concertEntityModel) {
        String str;
        HubsGlueCard.Settings.TextLayout textLayout;
        List<Artist> artists = concertEntityModel.getArtists();
        if (!artists.isEmpty()) {
            this.g.setTitle(this.a.getString(C0707R.string.events_hub_concert_entity_line_up));
            this.g.i1(true);
            this.d.Z(new v02(this.g.getView(), true), 1);
            i61 i61 = new i61(this.e);
            this.b = i61;
            this.f.b(h61.a.a(i61));
            this.c = new ArrayList();
            int size = artists.size();
            int i = 0;
            int i2 = C0707R.string.eventshub_monthly_listeners_title;
            if (size > 1) {
                ArrayList arrayList = new ArrayList();
                for (Artist artist : artists) {
                    String name = artist.getName();
                    String uri = artist.getUri();
                    o81 a2 = b71.a(uri, name);
                    Integer monthlyListener = artist.getMonthlyListener();
                    w81.a a3 = z81.h().a(name);
                    if (monthlyListener != null) {
                        StringBuilder S0 = je.S0('\n');
                        S0.append(this.a.getString(i2));
                        a3 = a3.d(NumberFormat.getNumberInstance().format(monthlyListener) + S0.toString());
                        textLayout = HubsGlueCard.Settings.TextLayout.DOUBLE_LINE_SUBTITLE;
                    } else {
                        textLayout = HubsGlueCard.Settings.TextLayout.DEFAULT;
                    }
                    this.c.add(z81.c().n(HubsGlueCard.NORMAL).z(a3.build()).c(HubsGlueCard.Settings.k(textLayout)).d("glue:subtitleStyle", "metadata").f("click", d71.a(uri)).f("longClick", a2).f("rightAccessoryClick", a2).t(z81.f().f(z81.e().g(artist.getImageUri()).e(SpotifyIconV2.ARTIST).a(HubsGlueImageSettings.b(HubsGlueImageSettings.Style.CIRCULAR)))).i("ui:index_in_block", Integer.valueOf(i)).i("ui:group", "goto-artist").l());
                    i++;
                    i2 = C0707R.string.eventshub_monthly_listeners_title;
                }
                List<s81> list = this.c;
                i61 i612 = this.b;
                arrayList.add(z81.c().n(HubsGlueComponent.CAROUSEL).m(list).l());
                i612.c0(arrayList);
                i612.z();
                this.d.Z(this.b, 2);
                return;
            }
            Artist artist2 = artists.get(0);
            Integer monthlyListener2 = artist2.getMonthlyListener();
            if (monthlyListener2 != null) {
                StringBuilder S02 = je.S0(' ');
                S02.append(this.a.getString(C0707R.string.eventshub_monthly_listeners_title));
                str = NumberFormat.getNumberInstance().format(monthlyListener2) + S02.toString();
            } else {
                str = "";
            }
            this.c.add(z81.c().n(HubsGlueRow.NORMAL).y(z81.h().a(artist2.getName()).d(str)).x(z81.g(artist2.getUri())).t(z81.f().f(z81.e().g(artist2.getImageUri()).a(HubsGlueImageSettings.b(HubsGlueImageSettings.Style.CIRCULAR)))).i("ui:index_in_block", 0).i("ui:group", "goto-artist").l());
            this.b.c0(this.c);
            this.b.z();
            this.d.Z(this.b, 2);
        }
    }
}
