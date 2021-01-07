package defpackage;

import com.spotify.searchview.assistedcuration.proto.Entity;

/* renamed from: uua  reason: default package */
public class uua implements oqa<Entity> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.oqa
    public boolean a(Entity entity) {
        return entity.i() == Entity.EntityCase.ARTIST;
    }
}
