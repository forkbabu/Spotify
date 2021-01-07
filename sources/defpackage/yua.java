package defpackage;

import com.spotify.searchview.assistedcuration.proto.Entity;

/* renamed from: yua  reason: default package */
public class yua implements oqa<Entity> {
    /* renamed from: b */
    public boolean a(Entity entity) {
        return entity.i() == Entity.EntityCase.TRACK && entity.n().p();
    }
}
