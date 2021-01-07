package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.additionaladapters.l;
import com.spotify.music.features.playlistentity.t;
import defpackage.iq6;
import kotlin.jvm.internal.h;

/* renamed from: bq6  reason: default package */
public final class bq6 extends t.a implements AdditionalAdapter {
    private final AdditionalAdapter.a b = new a(this);
    private final Activity c;
    private final jq6 f;
    private final kq6 n;

    /* renamed from: bq6$a */
    public static final class a implements AdditionalAdapter.a {
        final /* synthetic */ bq6 a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(bq6 bq6) {
            this.a = bq6;
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public /* synthetic */ void a(AdditionalAdapter.a.b bVar) {
            l.c(this, bVar);
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public /* synthetic */ void b(AdditionalAdapter.a.AbstractC0240a aVar) {
            l.b(this, aVar);
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public RecyclerView.e c(ViewGroup viewGroup) {
            return new v02(this.a.f.b(this.a.c, viewGroup, this.a.n), true);
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public /* synthetic */ io.reactivex.subjects.a d() {
            return l.a(this);
        }
    }

    public bq6(Activity activity, jq6 jq6, kq6 kq6) {
        h.e(activity, "activity");
        h.e(jq6, "addRemoveRow");
        h.e(kq6, "addRemoveRowCtaListener");
        this.c = activity;
        this.f = jq6;
        this.n = kq6;
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
    public AdditionalAdapter.a e() {
        return this.b;
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
    public boolean v(h76 h76) {
        h.e(h76, "playlistMetadata");
        int max = Math.max(0, 30 - h76.k());
        if (max == 0) {
            this.f.c(iq6.b.a);
            return true;
        }
        this.f.c(new iq6.a(max));
        return true;
    }
}
