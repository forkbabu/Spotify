package defpackage;

import com.spotify.searchview.proto.Entity;

/* renamed from: cva  reason: default package */
public class cva implements oqa<Entity> {
    /* renamed from: b */
    public boolean a(Entity entity) {
        return entity.m() == Entity.EntityCase.TRACK && entity.q().m();
    }
}
