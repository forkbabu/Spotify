package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.searchview.assistedcuration.proto.Entity;

/* renamed from: k24  reason: default package */
public class k24 implements fwa {

    /* renamed from: k24$a */
    class a implements q81 {
        final /* synthetic */ Entity.EntityCase a;

        a(k24 k24, Entity.EntityCase entityCase) {
            this.a = entityCase;
        }

        @Override // defpackage.q81
        public String category() {
            return HubsGlueRow.NORMAL.category();
        }

        @Override // defpackage.q81
        public String id() {
            if (this.a == Entity.EntityCase.TRACK) {
                return "ac:track";
            }
            return HubsGlueRow.NORMAL.id();
        }
    }

    @Override // defpackage.fwa
    public q81 a(Entity.EntityCase entityCase) {
        return new a(this, entityCase);
    }
}
