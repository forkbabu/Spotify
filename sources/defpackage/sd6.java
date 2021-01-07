package defpackage;

import android.view.View;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;

/* renamed from: sd6  reason: default package */
public final /* synthetic */ class sd6 implements View.OnClickListener {
    public final /* synthetic */ ee6 a;
    public final /* synthetic */ HomeMix b;

    public /* synthetic */ sd6(ee6 ee6, HomeMix homeMix) {
        this.a = ee6;
        this.b = homeMix;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.k(this.b, view);
    }
}
