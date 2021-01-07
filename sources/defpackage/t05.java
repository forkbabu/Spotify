package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.localization.SpotifyLocale;
import com.spotify.music.features.eventshub.concertentity.j;
import com.spotify.music.features.eventshub.model.Concert;
import com.spotify.music.features.eventshub.model.ConcertResult;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: t05  reason: default package */
public class t05 extends RecyclerView.e<h90<y90>> {
    private final Calendar c;
    private final View.OnClickListener f;
    private final d15 n;
    private final cqe o;
    protected Context p;
    protected List<ConcertResult> q;

    public t05(Context context, List<ConcertResult> list, View.OnClickListener onClickListener, Calendar calendar, d15 d15, cqe cqe) {
        context.getClass();
        this.p = context;
        list.getClass();
        this.q = list;
        this.f = onClickListener;
        this.c = calendar;
        this.n = d15;
        this.o = cqe;
        U(true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(h90<y90> h90, int i) {
        h90<y90> h902 = h90;
        ConcertResult concertResult = this.q.get(i);
        h902.a.setTag(concertResult);
        Concert concert = concertResult.getConcert();
        y90 j0 = h902.j0();
        Locale locale = new Locale(SpotifyLocale.e());
        Date a = j.a(concert.getDateString(), "yyyy-MM-dd'T'HH:mm:ss", locale, this.c);
        if (concert.isFestival()) {
            j0.setTitle(concert.getTitle());
        } else {
            j0.setTitle(this.n.a(concert));
        }
        String d = j.d(concert.getVenue(), concert.getLocation(), concertResult.isVirtual());
        if (concert.getDateString() != null) {
            d = j.b(d, a, this.c, locale);
        }
        j0.setSubtitle(d);
        s42.b(j0.getImageView(), this.o).d(a, locale);
        j0.getView().setOnClickListener(this.f);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public h90<y90> M(ViewGroup viewGroup, int i) {
        return h90.h0(e90.d().i(this.p, viewGroup));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.q.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) this.q.get(i).getConcert().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return x90.class.hashCode();
    }
}
