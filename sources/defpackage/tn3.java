package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.features.ads.audioplus.topbanner.carousel.a;
import com.spotify.music.features.ads.audioplus.topbanner.carousel.b;
import com.spotify.music.features.ads.screensaver.p0;
import com.spotify.pageloader.s0;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import java.util.List;

/* renamed from: tn3  reason: default package */
public class tn3 implements s0, vn3 {
    private View a;
    private final a b;
    private final yn3 c;
    private p0.a f;

    public tn3(b bVar, zn3 zn3) {
        a b2 = bVar.b();
        this.b = b2;
        this.c = zn3.b(b2);
    }

    public void a() {
        p0.a aVar = this.f;
        if (aVar != null && aVar.W() != null) {
            this.f.W().d();
        }
    }

    public /* synthetic */ void b(View view) {
        this.b.a();
    }

    public tn3 c(List<d> list) {
        this.c.Z(list);
        return this;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.f = (p0.a) context;
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_carousel_topbanner, viewGroup, false);
        this.a = inflate;
        ((RecyclerView) inflate.findViewById(C0707R.id.list_ads)).setAdapter(this.c);
        ((SpotifyIconView) this.a.findViewById(C0707R.id.btn_top_banner_close)).setOnClickListener(new sn3(this));
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.e(this);
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.f();
        }
    }
}
