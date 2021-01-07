package defpackage;

import com.spotify.searchview.assistedcuration.proto.Entity;

/* renamed from: sua  reason: default package */
public class sua implements oqa<Entity> {
    /* renamed from: b */
    public boolean a(Entity entity) {
        return entity.i() == Entity.EntityCase.TRACK && entity.n().i();
    }
}
