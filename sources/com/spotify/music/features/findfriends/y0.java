package com.spotify.music.features.findfriends;

import com.google.common.base.Optional;
import com.spotify.music.features.findfriends.logging.FindFriendsLogger;
import com.spotify.music.features.findfriends.model.FindFriendsModel;
import com.spotify.music.features.findfriends.model.UserModel;
import com.spotify.music.follow.j;
import com.spotify.music.follow.m;
import com.spotify.music.libs.facebook.SocialState;
import com.spotify.music.navigation.t;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.List;

public class y0 {
    private final c1 a;
    private final s<p0> b;
    private final y c;
    private final m d;
    private final FindFriendsLogger e;
    private final t f;
    private final u0 g;
    private final a h = new a();
    private final io.reactivex.subjects.a<String> i = io.reactivex.subjects.a.i1("");
    private p0 j = p0.a;

    public y0(c1 c1Var, s<p0> sVar, y yVar, m mVar, FindFriendsLogger findFriendsLogger, t tVar, u0 u0Var) {
        this.a = c1Var;
        this.b = sVar.v0(1).h1();
        this.c = yVar;
        this.d = mVar;
        this.e = findFriendsLogger;
        this.f = tVar;
        this.g = u0Var;
    }

    private void e() {
        for (UserModel userModel : this.j.a().or((Optional<FindFriendsModel>) FindFriendsModel.EMPTY).results()) {
            if (!userModel.isFollowing()) {
                p(userModel.uri(), true);
            }
        }
    }

    public static boolean h(p0 p0Var) {
        return !m(p0Var) && p0Var.a().or(FindFriendsModel.EMPTY).results().isEmpty();
    }

    /* access modifiers changed from: private */
    public static boolean m(p0 p0Var) {
        Optional<SocialState> c2 = p0Var.c();
        if (!c2.isPresent()) {
            return false;
        }
        if (!c2.get().enabled() || p0Var.b().or((Optional<Boolean>) Boolean.FALSE).booleanValue()) {
            return true;
        }
        return false;
    }

    private void p(String str, boolean z) {
        if (this.d.c(str) == null) {
            j.a a2 = j.a();
            a2.f(str);
            a2.d(z);
            a2.b(false);
            a2.e(0);
            a2.c(0);
            this.d.g(a2.a());
        }
        this.d.e(str, z);
    }

    public void a() {
        this.e.a();
        this.g.a();
    }

    public void b() {
        this.e.b();
    }

    public void c() {
        this.e.c();
        int size = this.j.a().or((Optional<FindFriendsModel>) FindFriendsModel.EMPTY).results().size();
        if (size > 25) {
            this.a.b(size);
        } else {
            e();
        }
    }

    public void d() {
        e();
    }

    public void f(UserModel userModel, int i2) {
        this.e.d(i2, userModel.uri());
        this.f.d(userModel.uri());
    }

    public void g(UserModel userModel, int i2) {
        this.e.e(i2, userModel.uri(), !userModel.isFollowing());
        p(userModel.uri(), !userModel.isFollowing());
    }

    public /* synthetic */ v j(List list) {
        return this.i.j0(z.a).j0(new d0(list));
    }

    public /* synthetic */ void k(p0 p0Var) {
        this.j = p0Var;
    }

    public void l(String str) {
        this.i.onNext(str);
    }

    public void n() {
        a aVar = this.h;
        s<p0> sVar = this.b;
        i0 i0Var = i0.a;
        s<R> j0 = sVar.j0(i0Var).Q(c.a).j0(f0.a);
        d dVar = d.a;
        s o0 = s.b1(j0.j0(dVar).J0(new x(this))).o0(this.c);
        c1 c1Var = this.a;
        c1Var.getClass();
        s<R> o02 = this.b.j0(i0Var).j0(c0.a).j0(dVar).j0(g0.a).j0(a0.a).E().o0(this.c);
        c1 c1Var2 = this.a;
        c1Var2.getClass();
        s<R> o03 = this.b.j0(w.a).E().o0(this.c);
        c1 c1Var3 = this.a;
        c1Var3.getClass();
        s<R> o04 = this.b.j0(u.a).E().o0(this.c);
        c1 c1Var4 = this.a;
        c1Var4.getClass();
        aVar.e(this.b.o0(this.c).N(v.a).subscribe(new b0(this)), o0.subscribe(new e(c1Var)), o02.subscribe(new a(c1Var2)), o03.subscribe(new n0(c1Var3)), o04.subscribe(new h0(c1Var4)));
    }

    public void o() {
        this.h.f();
    }
}
