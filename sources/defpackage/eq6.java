package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.additionaladapters.l;
import com.spotify.music.features.playlistentity.t;
import com.spotify.playlist.models.offline.WaitingReason;
import com.spotify.playlist.models.offline.a;
import kotlin.jvm.internal.h;

/* renamed from: eq6  reason: default package */
public final class eq6 extends t.a implements AdditionalAdapter {
    private final AdditionalAdapter.a b = new a(this);
    private final Activity c;
    private final com.spotify.music.navigation.t f;

    /* renamed from: eq6$a */
    public static final class a implements AdditionalAdapter.a {
        final /* synthetic */ eq6 a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(eq6 eq6) {
            this.a = eq6;
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
        public RecyclerView.e<? extends RecyclerView.b0> c(ViewGroup viewGroup) {
            View j = eq6.j(this.a, viewGroup);
            eq6 eq6 = this.a;
            h.d(j, "premiumMiniSongsNotDownloadedView");
            eq6.getClass();
            q4.G(j, C0707R.id.premium_mini_playlist_songs_not_downloaded_go_to_settings_button).setOnClickListener(new fq6(eq6));
            return new v02(j, true);
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public /* synthetic */ io.reactivex.subjects.a d() {
            return l.a(this);
        }
    }

    public eq6(Activity activity, com.spotify.music.navigation.t tVar) {
        h.e(activity, "activity");
        h.e(tVar, "navigator");
        this.c = activity;
        this.f = tVar;
    }

    public static final View j(eq6 eq6, ViewGroup viewGroup) {
        return LayoutInflater.from(eq6.c).inflate(C0707R.layout.premium_mini_songs_not_downloaded_row, viewGroup, false);
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
    public AdditionalAdapter.a e() {
        return this.b;
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
    public boolean v(h76 h76) {
        h.e(h76, "playlistMetadata");
        if (h76.l().k() instanceof a.h) {
            com.spotify.playlist.models.offline.a k = h76.l().k();
            if (k == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.playlist.models.offline.OfflineState.Waiting");
            } else if (((a.h) k).d() == WaitingReason.SYNC_NOT_ALLOWED) {
                return true;
            }
        }
        return false;
    }
}
