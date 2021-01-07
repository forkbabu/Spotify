package defpackage;

import com.spotify.music.lyrics.core.experience.model.b;
import io.reactivex.functions.g;

/* renamed from: smb  reason: default package */
public final /* synthetic */ class smb implements g {
    public final /* synthetic */ enb a;

    public /* synthetic */ smb(enb enb) {
        this.a = enb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        enb.a(this.a, (b) obj);
    }
}
