package defpackage;

import com.spotify.searchview.assistedcuration.proto.Entity;

/* renamed from: wua  reason: default package */
public class wua implements oqa<Entity> {
    /* renamed from: b */
    public boolean a(Entity entity) {
        return entity.i() == Entity.EntityCase.TRACK && entity.n().l();
    }
}
