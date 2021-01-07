package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.proto.DrillDownViewResponse;
import com.spotify.searchview.proto.EntityType;
import io.reactivex.functions.l;

/* renamed from: o5b  reason: default package */
public final /* synthetic */ class o5b implements l {
    public final /* synthetic */ s7b a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Optional c;

    public /* synthetic */ o5b(s7b s7b, String str, Optional optional) {
        this.a = s7b;
        this.b = str;
        this.c = optional;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        EntityType entityType;
        s7b s7b = this.a;
        String str = this.b;
        Optional optional = this.c;
        DrillDownViewResponse drillDownViewResponse = (DrillDownViewResponse) obj;
        String d = s7b.d();
        String c2 = s7b.c();
        str.hashCode();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1865828127:
                if (str.equals("playlists")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1415163932:
                if (str.equals("albums")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1249499312:
                if (str.equals("genres")) {
                    c3 = 2;
                    break;
                }
                break;
            case -1002263574:
                if (str.equals("profiles")) {
                    c3 = 3;
                    break;
                }
                break;
            case -951712290:
                if (str.equals("user_profiles")) {
                    c3 = 4;
                    break;
                }
                break;
            case -868034268:
                if (str.equals("topics")) {
                    c3 = 5;
                    break;
                }
                break;
            case -865716088:
                if (str.equals("tracks")) {
                    c3 = 6;
                    break;
                }
                break;
            case -732362228:
                if (str.equals("artists")) {
                    c3 = 7;
                    break;
                }
                break;
            case 109413654:
                if (str.equals("shows")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 1567481600:
                if (str.equals("audioshows")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 1664968622:
                if (str.equals("audioepisodes")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 1973454881:
                if (str.equals("audio_episodes")) {
                    c3 = 11;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                entityType = EntityType.ENTITY_TYPE_PLAYLIST;
                break;
            case 1:
                entityType = EntityType.ENTITY_TYPE_ALBUM;
                break;
            case 2:
                entityType = EntityType.ENTITY_TYPE_GENRE;
                break;
            case 3:
            case 4:
                entityType = EntityType.ENTITY_TYPE_PROFILE;
                break;
            case 5:
                entityType = EntityType.ENTITY_TYPE_TOPIC;
                break;
            case 6:
                entityType = EntityType.ENTITY_TYPE_TRACK;
                break;
            case 7:
                entityType = EntityType.ENTITY_TYPE_ARTIST;
                break;
            case '\b':
            case '\t':
                entityType = EntityType.ENTITY_TYPE_AUDIO_SHOW;
                break;
            case '\n':
            case 11:
                entityType = EntityType.ENTITY_TYPE_AUDIO_EPISODE;
                break;
            default:
                entityType = EntityType.ENTITY_TYPE_UNKNOWN;
                break;
        }
        return gua.a(d, c2, entityType, optional, drillDownViewResponse);
    }
}
