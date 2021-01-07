package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.spotlets.scannables.ScannablesActivity;
import com.spotify.music.spotlets.scannables.view.h;
import com.spotify.music.spotlets.scannables.view.i;
import com.spotify.pageloader.s0;

/* renamed from: jgd  reason: default package */
public class jgd implements s0 {
    private final Boolean a;
    private final i b;
    private final ScannablesActivity c;
    private h f;

    public jgd(boolean z, i iVar, ScannablesActivity scannablesActivity) {
        this.a = Boolean.valueOf(z);
        this.b = iVar;
        this.c = scannablesActivity;
    }

    public void a(int i, int i2, Intent intent) {
        h hVar = this.f;
        if (hVar != null) {
            hVar.n(i, i2, intent);
        }
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        h hVar = this.f;
        if (hVar != null) {
            return hVar.k();
        }
        return null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.f = this.b.b(this.c, viewGroup, layoutInflater, this.a.booleanValue());
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        h hVar = this.f;
        if (hVar != null) {
            hVar.o();
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        h hVar = this.f;
        if (hVar != null) {
            hVar.p();
        }
    }
}
