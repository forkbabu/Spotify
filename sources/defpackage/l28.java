package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.fragment.app.c;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import java.util.ArrayList;

/* renamed from: l28  reason: default package */
public class l28 extends ArrayAdapter<RadioStationModel> {
    private final Drawable a;
    private final t b;
    private final View.OnClickListener c = new a();

    /* renamed from: l28$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioStationModel radioStationModel = (RadioStationModel) view.getTag();
            n.a a2 = n.a(radioStationModel.uri);
            a2.h(radioStationModel.title);
            l28.this.b.e(a2.a());
        }
    }

    public l28(c cVar, t tVar) {
        super(cVar, (int) C0707R.layout.glue_card, new ArrayList());
        this.b = tVar;
        this.a = yc0.i(cVar, SpotifyIcon.RADIO_16);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return (long) ((RadioStationModel) getItem(i)).hashCode();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = e90.i;
        u90 u90 = (u90) l70.p(view, u90.class);
        if (u90 == null) {
            u90 = e90.d().e(getContext(), viewGroup);
            u90.getView().setOnClickListener(this.c);
            u90.getImageView().setImageDrawable(this.a);
        }
        RadioStationModel radioStationModel = (RadioStationModel) getItem(i);
        u90.getView().setTag(radioStationModel);
        u90.Z().setText(radioStationModel.title);
        u90.setActive(false);
        return u90.getView();
    }

    @Override // android.widget.Adapter, android.widget.BaseAdapter
    public boolean hasStableIds() {
        return true;
    }
}
