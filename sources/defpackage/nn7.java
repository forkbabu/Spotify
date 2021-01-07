package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.profile.editprofile.EditProfileActivity;
import com.spotify.music.features.profile.editprofile.n;
import com.spotify.pageloader.z0;
import defpackage.mm7;

/* renamed from: nn7  reason: default package */
public class nn7 implements z0 {
    private so7 a;
    private MobiusLoop.g<mm7, lm7> b;
    private final to7 c;
    private final n f;
    private final EditProfileActivity n;
    private final mn7 o;

    public nn7(to7 to7, n nVar, EditProfileActivity editProfileActivity, mn7 mn7) {
        this.c = to7;
        this.f = nVar;
        this.n = editProfileActivity;
        this.o = mn7;
    }

    @Override // com.spotify.pageloader.z0
    public void d(Bundle bundle) {
        mm7 mm7 = (mm7) bundle.getParcelable("state");
        if (mm7 != null) {
            this.b.a(mm7);
        }
    }

    @Override // com.spotify.pageloader.z0
    public Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", this.b.b());
        return bundle;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        so7 so7 = this.a;
        if (so7 != null) {
            return so7.f();
        }
        return null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.a = this.c.b(this.n, layoutInflater, viewGroup);
        mm7.a o2 = mm7.a.o();
        String str = "";
        o2.m(this.o.f() != null ? this.o.f() : str);
        if (this.o.c() != null) {
            str = this.o.c();
        }
        o2.d(str);
        o2.h(this.o.e());
        o2.f(this.o.d());
        o2.c(this.o.b());
        this.b = this.f.a(this.n, this.a, o2.a());
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        MobiusLoop.g<mm7, lm7> gVar = this.b;
        if (gVar != null) {
            gVar.c(this.a);
            if (!this.b.isRunning()) {
                this.b.start();
            }
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        MobiusLoop.g<mm7, lm7> gVar = this.b;
        if (gVar != null) {
            gVar.stop();
            this.b.d();
        }
    }
}
