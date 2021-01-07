package com.spotify.music.voiceassistantssettings;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.partnerapps.PartnerType;
import com.spotify.music.voiceassistantssettings.alexacard.LinkState;
import io.reactivex.disposables.a;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class c {
    private a a = new a();
    private com.spotify.music.voiceassistantssettings.alexacard.c b;
    private final com.spotify.music.libs.partnerapps.api.c c;

    public c(com.spotify.music.libs.partnerapps.api.c cVar) {
        h.e(cVar, "partnerIntegrationsRepository");
        this.c = cVar;
    }

    public static final void a(c cVar) {
        com.spotify.music.voiceassistantssettings.alexacard.c cVar2 = cVar.b;
        if (cVar2 != null) {
            cVar2.b();
            com.spotify.music.voiceassistantssettings.alexacard.c cVar3 = cVar.b;
            if (cVar3 != null) {
                cVar3.setLinkState(LinkState.UNAVAILABLE);
            } else {
                h.k("alexaCardViewBinder");
                throw null;
            }
        } else {
            h.k("alexaCardViewBinder");
            throw null;
        }
    }

    public static final void b(c cVar, ImmutableMap immutableMap) {
        cVar.getClass();
        if (!(!immutableMap.isEmpty())) {
            immutableMap = null;
        }
        if (immutableMap != null) {
            for (Map.Entry entry : immutableMap.entrySet()) {
                PartnerType partnerType = (PartnerType) entry.getKey();
                if (partnerType != null && partnerType.ordinal() == 2) {
                    if (((bla) entry.getValue()) != null) {
                        com.spotify.music.voiceassistantssettings.alexacard.c cVar2 = cVar.b;
                        if (cVar2 != null) {
                            cVar2.a();
                        } else {
                            h.k("alexaCardViewBinder");
                            throw null;
                        }
                    } else {
                        com.spotify.music.voiceassistantssettings.alexacard.c cVar3 = cVar.b;
                        if (cVar3 != null) {
                            cVar3.b();
                        } else {
                            h.k("alexaCardViewBinder");
                            throw null;
                        }
                    }
                    com.spotify.music.voiceassistantssettings.alexacard.c cVar4 = cVar.b;
                    if (cVar4 != null) {
                        Object value = entry.getValue();
                        h.d(value, "integrations.value");
                        cVar4.setLinkState(((bla) value).b() ? LinkState.LINKED : LinkState.UNLINKED);
                    } else {
                        h.k("alexaCardViewBinder");
                        throw null;
                    }
                }
            }
            return;
        }
        com.spotify.music.voiceassistantssettings.alexacard.c cVar5 = cVar.b;
        if (cVar5 != null) {
            cVar5.b();
        } else {
            h.k("alexaCardViewBinder");
            throw null;
        }
    }

    public final void c(com.spotify.music.voiceassistantssettings.alexacard.c cVar) {
        h.e(cVar, "viewBinder");
        this.b = cVar;
        this.a.b(this.c.c().B(io.reactivex.android.schedulers.a.b()).subscribe(new a(this), new b(this)));
    }

    public final void d() {
        this.a.f();
    }
}
