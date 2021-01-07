package defpackage;

import android.content.Context;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.spotify.music.features.eventshub.model.ConcertEntityModel;
import java.util.Calendar;
import java.util.List;

/* renamed from: a15  reason: default package */
public class a15 implements y05 {
    private final Context a;
    private final twd b;
    private final Calendar c;
    private final View.OnClickListener d;
    private final View.OnClickListener e;
    private final ia0 f;
    private final cqe g;

    public a15(Context context, twd twd, Calendar calendar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, ia0 ia0, cqe cqe) {
        this.a = context;
        this.b = twd;
        this.c = calendar;
        this.d = onClickListener;
        this.e = onClickListener2;
        this.f = ia0;
        this.g = cqe;
    }

    @Override // defpackage.y05
    public void a(ConcertEntityModel concertEntityModel) {
        ImmutableList a2 = gf0.a(concertEntityModel.getUpcomingConcerts());
        List subList = a2.subList(0, Math.min(3, a2.size()));
        String upcomingConcertsSource = concertEntityModel.getUpcomingConcertsSource();
        String userLocation = concertEntityModel.getUserLocation();
        if (!subList.isEmpty()) {
            if (upcomingConcertsSource.equals("recommendations")) {
                this.f.setTitle(this.a.getString(C0707R.string.events_hub_concert_entity_recommended_for_you));
            } else if (!upcomingConcertsSource.equals("artist_concerts") || userLocation == null) {
                this.f.setTitle(this.a.getString(C0707R.string.events_hub_concert_entity_more_near_you));
            } else {
                this.f.setTitle(this.a.getString(C0707R.string.events_hub_concert_entity_more_near_user_location, userLocation));
            }
            this.f.i1(true);
            this.b.Z(new v02(this.f.getView(), true), 5);
            twd twd = this.b;
            Context context = this.a;
            twd.Z(new t05(context, subList, this.d, this.c, new d15(context.getResources()), this.g), 6);
            t90 c2 = e90.d().c(this.a, null);
            c2.setText(this.a.getText(C0707R.string.events_hub_concert_entity_see_more_concerts));
            c2.getView().setOnClickListener(this.e);
            this.b.Z(new v02(c2.getView(), true), 7);
            return;
        }
        if (userLocation != null) {
            this.f.setTitle(this.a.getString(C0707R.string.events_hub_concert_entity_more_near_user_location, userLocation));
        } else {
            this.f.setTitle(this.a.getString(C0707R.string.events_hub_concert_entity_more_near_you));
        }
        this.f.i1(true);
        this.b.Z(new v02(this.f.getView(), true), 5);
        r90 b2 = e90.d().b(this.a, null, 2);
        b2.setText(this.a.getText(C0707R.string.events_hub_concert_entity_see_more_concerts_with_no_concert_to_show));
        b2.getView().setOnClickListener(this.e);
        this.b.Z(new v02(b2.getView(), true), 8);
    }
}
