package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.proto.EntityType;

/* renamed from: nd8  reason: default package */
public class nd8 implements yta<EntityType> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
    @Override // defpackage.yta
    public Optional a(EntityType entityType, String str) {
        String str2;
        switch (entityType.ordinal()) {
            case 1:
                str2 = "artists";
                break;
            case 2:
                str2 = "tracks";
                break;
            case 3:
                str2 = "albums";
                break;
            case 4:
                str2 = "playlists";
                break;
            case 5:
                str2 = "genres";
                break;
            case 6:
                str2 = "shows";
                break;
            case 7:
                str2 = "audio_episodes";
                break;
            case 8:
                str2 = "user_profiles";
                break;
            case 9:
                str2 = "topics";
                break;
            default:
                str2 = null;
                break;
        }
        return Optional.fromNullable(str2).transform(new hd8(str));
    }
}
