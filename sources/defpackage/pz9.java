package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.assistedcuration.model.h;

/* renamed from: pz9  reason: default package */
public class pz9 extends tz9 {
    private final a C;
    private final b D;

    /* renamed from: pz9$a */
    public interface a {
        void c(h hVar);
    }

    public pz9(ViewGroup viewGroup, a aVar, b bVar) {
        super(je.G(viewGroup, C0707R.layout.assisted_curation_card_footer, viewGroup, false));
        this.C = aVar;
        this.D = bVar;
    }

    public void h0(h hVar) {
        this.a.setVisibility((!hVar.e() || this.D.c()) ? 8 : 0);
        this.a.setOnClickListener(new lz9(this, hVar));
    }

    public /* synthetic */ void j0(h hVar, View view) {
        this.C.c(hVar);
        this.a.setOnClickListener(null);
    }
}
