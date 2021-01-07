package defpackage;

import com.spotify.searchview.proto.Entity;
import defpackage.s81;

/* renamed from: fxa  reason: default package */
public class fxa implements axa<Entity> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [s81$a, java.lang.Object] */
    @Override // defpackage.axa
    public s81.a a(s81.a aVar, Entity entity) {
        x81 main;
        Entity entity2 = entity;
        return (!(entity2.m() == Entity.EntityCase.ARTIST || entity2.m() == Entity.EntityCase.PROFILE) || (main = aVar.l().images().main()) == null) ? aVar : aVar.t(z81.f().f(main.toBuilder().b("style", "circular")));
    }
}
