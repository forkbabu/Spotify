package defpackage;

import com.spotify.music.features.playlistentity.homemix.models.HomeMixPlanType;
import com.spotify.music.features.playlistentity.homemix.models.i;

/* renamed from: if6  reason: default package */
public final /* synthetic */ class if6 implements Runnable {
    public final /* synthetic */ mf6 a;
    public final /* synthetic */ i b;
    public final /* synthetic */ HomeMixPlanType c;

    public /* synthetic */ if6(mf6 mf6, i iVar, HomeMixPlanType homeMixPlanType) {
        this.a = mf6;
        this.b = iVar;
        this.c = homeMixPlanType;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b, this.c);
    }
}
