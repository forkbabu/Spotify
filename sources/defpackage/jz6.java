package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.additionaladapters.l;
import defpackage.kz6;
import io.reactivex.subjects.a;

/* renamed from: jz6  reason: default package */
public final /* synthetic */ class jz6 implements AdditionalAdapter.a {
    public final /* synthetic */ kz6.b a;

    public /* synthetic */ jz6(kz6.b bVar) {
        this.a = bVar;
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
    public final RecyclerView.e c(ViewGroup viewGroup) {
        return this.a.i(viewGroup);
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
    public /* synthetic */ a d() {
        return l.a(this);
    }
}
