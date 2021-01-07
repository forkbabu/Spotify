package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.pageloader.s0;
import java.util.List;

/* renamed from: rh8  reason: default package */
public class rh8 implements s0 {
    private final ej8 a;
    private View b;
    ij8 c;

    public rh8(ej8 ej8) {
        this.a = ej8;
    }

    public void a(List<Ad> list) {
        this.a.Z(list);
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.b;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.b = this.c.b(layoutInflater, viewGroup, this.a).a();
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
    }
}
