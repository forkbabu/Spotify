package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.superbird.earcon.EarconType;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.external.experience.domain.model.ThingViewResponse;
import com.spotify.voice.external.experience.domain.model.b;
import com.spotify.voice.external.experience.domain.model.c;
import defpackage.kef;
import defpackage.lef;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: mef */
public final class mef {
    private static Set<kef> a(b bVar) {
        Set<kef> l = z42.l(new kef.h(EarconType.ERROR));
        ((HashSet) l).add(b(bVar));
        return l;
    }

    private static kef b(b bVar) {
        if (bVar.o().booleanValue()) {
            return new kef.m();
        }
        return new kef.x();
    }

    public static s<b, kef> c(b bVar, boolean z) {
        Set set;
        boolean z2 = bVar.k() != null && z && kxd.i(bVar.k());
        if (z2) {
            set = z42.l(new kef.v(), new kef.q(-5000));
        } else {
            set = z42.l(new kef.b());
        }
        set.add(new kef.u());
        return s.c(bVar.x(Boolean.valueOf(z2)), Collections.unmodifiableSet(set));
    }

    static e0 d(b bVar, lef.e eVar) {
        Throwable j = eVar.j();
        if (!(j instanceof VoiceSessionException)) {
            return h(bVar.s(c.a()), j);
        }
        int ordinal = ((VoiceSessionException) j).a().ordinal();
        if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
            if (ordinal == 4) {
                return h(bVar.s(c.f()), j);
            }
            if (ordinal != 5) {
                throw new IllegalStateException("Unable enumeration value");
            }
        }
        return h(bVar.s(c.a()), j);
    }

    static e0 e(ObjectMapper objectMapper, b bVar, lef.a aVar) {
        String str;
        c cVar;
        b bVar2;
        b bVar3;
        c cVar2;
        ThingViewResponse.Body.Target target;
        kef.f fVar = new kef.f(bVar.m(), l9f.c(aVar.j()));
        ThingViewResponse thingViewResponse = (ThingViewResponse) objectMapper.convertValue(aVar.j(), ThingViewResponse.class);
        ThingViewResponse.Custom custom = thingViewResponse.custom();
        if (custom == null) {
            return e0.a(z42.l(fVar));
        }
        SlimoProto$ParsedQuery$Intent intent = custom.intent();
        String error = custom.error();
        ThingViewResponse.Custom.Restriction restriction = custom.restriction();
        List<ThingViewResponse.Body> body = thingViewResponse.body();
        if (body == null || body.isEmpty() || (target = body.get(0).target()) == null || (str = target.uri()) == null) {
            str = "";
        }
        ThingViewResponse.Custom.Slots slots = custom.slots();
        Integer num = null;
        String str2 = (slots == null || slots.requestedEntityType() == null || slots.requestedEntityType().isEmpty()) ? null : slots.requestedEntityType().get(0);
        if (!(slots == null || slots.preset() == null || slots.preset().isEmpty())) {
            try {
                num = Integer.valueOf(Integer.parseInt(slots.preset().get(0)));
            } catch (NumberFormatException unused) {
            }
        }
        Integer volumeLevel = custom.volumeLevel();
        if (error != null) {
            cVar = c.g(error);
            bVar2 = bVar.s(cVar);
        } else {
            if (restriction != null) {
                cVar2 = c.h(restriction.heading(), restriction.detail());
                bVar3 = bVar.s(cVar2).q(intent).p(str2).r(num).t(str).w(volumeLevel);
            } else {
                cVar2 = c.c();
                bVar3 = bVar.s(cVar2).q(intent).p(str2).r(num).t(str).w(volumeLevel);
            }
            bVar2 = bVar3;
            cVar = cVar2;
        }
        if ((cVar instanceof c.C0577c) && !bef.i(intent)) {
            Logger.n("Received unsupported intent: %s", intent.name());
            return e0.g(bVar.s(c.i()), z42.l(b(bVar), fVar));
        } else if (bef.i(intent) && bVar.l() && !MoreObjects.isNullOrEmpty(custom.ttsUrl())) {
            return e0.g(bVar2, z42.l(new kef.i(custom.ttsUrl()), fVar));
        } else {
            c h = bVar2.h();
            h.getClass();
            if (h instanceof c.h) {
                Set<kef> a = a(bVar2);
                ((HashSet) a).add(fVar);
                return e0.g(bVar2, a);
            }
            c h2 = bVar2.h();
            h2.getClass();
            if (!(h2 instanceof c.i)) {
                return i(bVar2, z42.l(fVar));
            }
            Set<kef> k = k(bVar2);
            ((HashSet) k).add(fVar);
            return e0.g(bVar2, k);
        }
    }

    private static e0<b, kef> h(b bVar, Throwable th) {
        kef.f fVar = new kef.f(bVar.m(), l9f.b(th));
        Set<kef> a = a(bVar);
        ((HashSet) a).add(fVar);
        return e0.g(bVar, a);
    }

    private static e0<b, kef> i(b bVar, Set<kef> set) {
        SlimoProto$ParsedQuery$Intent slimoProto$ParsedQuery$Intent;
        int e = bVar.e();
        SlimoProto$ParsedQuery$Intent slimoProto$ParsedQuery$Intent2 = SlimoProto$ParsedQuery$Intent.WTF;
        switch (e) {
            case 0:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.WTF;
                break;
            case 1:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.PLAY;
                break;
            case 2:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SEARCH;
                break;
            case 3:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SHOW;
                break;
            case 4:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.RESUME;
                break;
            case 5:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.STOP;
                break;
            case 6:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.NEXT;
                break;
            case 7:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.PREVIOUS;
                break;
            case 8:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.MORE_LIKE_THIS;
                break;
            case 9:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.RECOMMEND_SOMETHING;
                break;
            case 10:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SHUFFLE_ON;
                break;
            case 11:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SHUFFLE_OFF;
                break;
            case 12:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.REPEAT_ON;
                break;
            case 13:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.REPEAT_OFF;
                break;
            case 14:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.REPEAT_ONE;
                break;
            case 15:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.VOLUME_UP;
                break;
            case 16:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.VOLUME_DOWN;
                break;
            case 17:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.VOLUME_ABSOLUTE;
                break;
            case 18:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.THUMBS_UP;
                break;
            case 19:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.THUMBS_DOWN;
                break;
            case 20:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SLEEP_TIMER_SET;
                break;
            case 21:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SLEEP_TIMER_CANCEL;
                break;
            case 22:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SET_ALARM;
                break;
            case 23:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.ADD_TO_PLAYLIST;
                break;
            case 24:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.ADD_TO_COLLECTION;
                break;
            case 25:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.ADD_TO_QUEUE;
                break;
            case 26:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.HELP;
                break;
            case 27:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.WHATS_PLAYING;
                break;
            case 28:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.GENERAL_MUSIC_INFO;
                break;
            case 29:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.FOLLOW;
                break;
            case 30:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SHARE;
                break;
            case 31:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.UNSUPPORTED;
                break;
            case 32:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.NO_INTENT;
                break;
            case 33:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.CHAT;
                break;
            case 34:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.NAVIGATE;
                break;
            case 35:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.PLAY_AGAIN;
                break;
            case 36:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.BAN;
                break;
            case 37:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.MORE_OF;
                break;
            case 38:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.PULL_CONTEXT;
                break;
            case 39:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.START_ICEBREAKER;
                break;
            case 40:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.START_STEERING;
                break;
            case 41:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.MUTE_MIC;
                break;
            case 42:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.PLAY_PRESET;
                break;
            case 43:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SAVE_TO_PRESET;
                break;
            case 44:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.PLAY_DIFFERENT;
                break;
            case 45:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SHOW_DIFFERENT;
                break;
            case 46:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.PLAY_SIMILAR;
                break;
            case 47:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SHOW_SIMILAR;
                break;
            case 48:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.UNDO;
                break;
            case 49:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.DISCOVER;
                break;
            case 50:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.WHO_AM_I;
                break;
            case 51:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SHOW_SOMETHING;
                break;
            case 52:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SEEK_FORWARDS;
                break;
            case 53:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SEEK_BACKWARDS;
                break;
            case 54:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SHOW_QUEUE;
                break;
            case 55:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.LIST_MY_DEVICES;
                break;
            case 56:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.EXPLICIT_FILTER_ON;
                break;
            case 57:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.EXPLICIT_FILTER_OFF;
                break;
            case 58:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SWITCH_ACCOUNT;
                break;
            case 59:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.SET_DEFAULT_DEVICE;
                break;
            case 60:
                slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.TRANSFER_PLAYBACK;
                break;
            default:
                slimoProto$ParsedQuery$Intent = null;
                break;
        }
        sg0<b, Set<kef>> c = bef.c(slimoProto$ParsedQuery$Intent);
        kef b = b(bVar);
        if (c == null) {
            Set l = z42.l(b);
            l.addAll(set);
            return e0.g(bVar.s(c.i()), l);
        }
        try {
            Set<kef> apply = c.apply(bVar);
            apply.addAll(set);
            if (apply.contains(new kef.v()) && b.equals(new kef.m())) {
                return e0.g(bVar, Collections.unmodifiableSet(apply));
            }
            apply.add(b);
            return e0.g(bVar, Collections.unmodifiableSet(apply));
        } catch (Exception e2) {
            Logger.e(e2, "Failed to dispatch effects for the intent", new Object[0]);
            return e0.g(bVar.s(c.a()), a(bVar));
        }
    }

    public static e0<b, kef> j(b bVar) {
        c h = bVar.h();
        h.getClass();
        if (h instanceof c.h) {
            return e0.a(a(bVar));
        }
        c h2 = bVar.h();
        h2.getClass();
        if (h2 instanceof c.i) {
            return e0.a(k(bVar));
        }
        return i(bVar, z42.l(new kef[0]));
    }

    private static Set<kef> k(b bVar) {
        if (MoreObjects.isNullOrEmpty(bVar.i())) {
            return z42.l(new kef.a(bVar.o().booleanValue()));
        }
        return z42.l(b(bVar));
    }
}
