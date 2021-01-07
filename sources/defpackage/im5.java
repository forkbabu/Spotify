package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.languagepicker.logger.a;

/* renamed from: im5  reason: default package */
public class im5 extends dm5<jm5> {
    public im5(a aVar) {
        super(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return new jm5(viewGroup, this.p);
    }
}
