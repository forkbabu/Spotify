package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistallsongs.f;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.t;

/* renamed from: kz6  reason: default package */
public class kz6 {
    private final Context a;
    private final String b;
    private final w17 c;
    private final com.spotify.music.features.playlistallsongs.c d;
    private final f e;
    private final wec f;

    /* renamed from: kz6$a */
    public class a extends t.a implements AdditionalAdapter {
        private Button b;

        public a() {
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
        public AdditionalAdapter.a e() {
            return new gz6(this);
        }

        public /* synthetic */ RecyclerView.e i(ViewGroup viewGroup) {
            View inflate = View.inflate(kz6.this.a, C0707R.layout.cta_button, null);
            Button button = (Button) inflate.findViewById(C0707R.id.cta_button);
            this.b = button;
            button.setText(C0707R.string.playlist_add_songs_button);
            this.b.setOnClickListener(new hz6(this));
            return new v02(inflate, true);
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
        public boolean v(h76 h76) {
            return !h76.m() && h76.a();
        }
    }

    /* renamed from: kz6$b */
    public class b extends t.a implements AdditionalAdapter {
        private Button b;

        public b() {
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
        public AdditionalAdapter.a e() {
            return new jz6(this);
        }

        public /* synthetic */ RecyclerView.e i(ViewGroup viewGroup) {
            View inflate = View.inflate(kz6.this.a, C0707R.layout.cta_button, null);
            this.b = (Button) inflate.findViewById(C0707R.id.cta_button);
            return new v02(inflate, true);
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
        public boolean v(h76 h76) {
            boolean a = h76.a();
            if (a) {
                this.b.setText(C0707R.string.playlist_edit_playlist_button);
            } else {
                this.b.setText(C0707R.string.playlist_preview_button);
            }
            this.b.setOnClickListener(new iz6(this, a));
            return !h76.m();
        }
    }

    /* renamed from: kz6$c */
    public interface c {
        kz6 a(com.spotify.music.features.playlistallsongs.c cVar);
    }

    public kz6(Context context, String str, w17 w17, f fVar, wec wec, com.spotify.music.features.playlistallsongs.c cVar) {
        this.a = context;
        this.b = str;
        this.c = w17;
        this.d = cVar;
        this.e = fVar;
        this.f = wec;
    }
}
