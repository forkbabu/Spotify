package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: es8  reason: default package */
public final class es8 implements g90 {
    private final View a;

    public es8(ViewGroup viewGroup) {
        h.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.section_header_related_topics, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…ed_topics, parent, false)");
        this.a = inflate;
        vc0.g(inflate);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }
}
