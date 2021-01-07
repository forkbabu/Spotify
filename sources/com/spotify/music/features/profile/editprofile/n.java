package com.spotify.music.features.profile.editprofile;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.rx2.o;
import com.spotify.mobius.z;
import com.spotify.music.features.profile.editprofile.permissions.EditProfilePermissionsManager;
import com.spotify.music.features.profile.editprofile.utils.a;
import defpackage.km7;
import io.reactivex.y;

public class n {
    private final y a;
    private final y b;
    private final y c;
    private final po7 d;
    private final EditProfilePermissionsManager e;
    private final hn7 f;
    private final a g;
    private final gu7 h;
    private final p i;

    public n(y yVar, y yVar2, y yVar3, po7 po7, EditProfilePermissionsManager editProfilePermissionsManager, hn7 hn7, a aVar, gu7 gu7, p pVar) {
        this.a = yVar;
        this.b = yVar2;
        this.c = yVar3;
        this.d = po7;
        this.e = editProfilePermissionsManager;
        this.f = hn7;
        this.g = aVar;
        this.h = gu7;
        this.i = pVar;
    }

    public MobiusLoop.g<mm7, lm7> a(EditProfileActivity editProfileActivity, ro7 ro7, mm7 mm7) {
        a aVar = a.a;
        y yVar = this.a;
        po7 po7 = this.d;
        EditProfilePermissionsManager editProfilePermissionsManager = this.e;
        a aVar2 = this.g;
        gu7 gu7 = this.h;
        p pVar = this.i;
        m f2 = i.f();
        f2.e(km7.l.class, new tm7(pVar, po7), yVar);
        f2.e(km7.d.class, new sm7(pVar, aVar2, ro7), yVar);
        f2.d(km7.i.class, new bn7(gu7));
        f2.d(km7.a.class, new an7(gu7));
        f2.e(km7.k.class, new pm7(po7), yVar);
        f2.h(km7.c.class, new cn7(editProfilePermissionsManager));
        f2.e(km7.h.class, new nm7(editProfilePermissionsManager), yVar);
        f2.e(km7.n.class, new ym7(po7), yVar);
        f2.h(km7.b.class, new wm7(editProfilePermissionsManager));
        f2.e(km7.g.class, new om7(editProfilePermissionsManager), yVar);
        f2.e(km7.j.class, new qm7(po7), yVar);
        f2.e(km7.e.class, new vm7(editProfileActivity), yVar);
        f2.d(km7.f.class, new um7(editProfileActivity));
        f2.e(km7.m.class, new xm7(editProfileActivity), yVar);
        return z.b(i.c(aVar, f2.i()).h(i.a(this.h.b().j0(dn7.a), this.f.b())).e(k.a).b(new j(this)).d(new i(this)).f(b.g("profile")), mm7, u92.b());
    }

    public /* synthetic */ ia2 b() {
        return new o(this.b);
    }

    public /* synthetic */ ia2 c() {
        return new o(this.c);
    }
}
