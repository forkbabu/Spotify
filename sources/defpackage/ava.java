package defpackage;

import com.spotify.searchview.proto.Entity;

/* renamed from: ava  reason: default package */
public class ava implements oqa<Entity> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.oqa
    public boolean a(Entity entity) {
        Entity entity2 = entity;
        return (entity2.m() == Entity.EntityCase.AUDIO_EPISODE && entity2.i().l()) || (entity2.m() == Entity.EntityCase.TRACK && entity2.q().i());
    }
}
