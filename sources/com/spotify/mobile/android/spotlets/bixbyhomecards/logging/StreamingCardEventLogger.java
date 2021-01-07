package com.spotify.mobile.android.spotlets.bixbyhomecards.logging;

import com.adjust.sdk.Constants;
import com.google.protobuf.u;
import com.spotify.messages.BixbyHomeCardsCtaClicked;
import com.spotify.messages.BixbyHomeCardsDeeplink;
import com.spotify.messages.BixbyHomeCardsNextClicked;
import com.spotify.messages.BixbyHomeCardsPauseClicked;
import com.spotify.messages.BixbyHomeCardsPlayClicked;
import com.spotify.messages.BixbyHomeCardsPreviousClicked;
import com.spotify.messages.BixbyHomeCardsRecommendationClicked;
import com.spotify.mobile.android.spotlets.bixbyhomecards.cards.a;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.player.model.ContextTrack;

public class StreamingCardEventLogger {
    private final a a;
    private final gl0<u> b;

    public enum Element {
        PLAY_PAUSE("play_pause_button"),
        PREV("previous_button"),
        NEXT("next_button"),
        MAIN_VIEW("main_view"),
        LIST_ITEM_1("list_item_1"),
        LIST_ITEM_2("list_item_2"),
        CTA("cta");
        
        private final String mId;

        private Element(String str) {
            this.mId = str;
        }

        public String d() {
            return this.mId;
        }
    }

    public enum EventType {
        PLAY_RESUME("play_resume"),
        PAUSE(ContextTrack.TrackAction.PAUSE),
        PREV("prev"),
        NEXT("next"),
        RECOMMENDATION_CLICKED("recommendation_clicked"),
        DEEPLINK(Constants.DEEPLINK);
        
        private final String mId;

        private EventType(String str) {
            this.mId = str;
        }

        public String d() {
            return this.mId;
        }
    }

    StreamingCardEventLogger(a aVar, gl0<u> gl0) {
        this.a = aVar;
        this.b = gl0;
    }

    private static String a(StreamingCardData streamingCardData) {
        if (streamingCardData == null) {
            return "invalid";
        }
        if (streamingCardData.isPlaying()) {
            return d(streamingCardData);
        }
        return null;
    }

    private static String b(StreamingCardData streamingCardData) {
        String a2 = a(streamingCardData);
        return a2 != null ? a2 : "invalid";
    }

    private static String c(StreamingCardData streamingCardData) {
        String d = d(streamingCardData);
        return d != null ? d : "invalid";
    }

    private static String d(StreamingCardData streamingCardData) {
        return streamingCardData == null ? "invalid" : streamingCardData.trackUri();
    }

    private void g(a aVar, EventType eventType, Element element, String str) {
        this.a.a(aVar.a(), eventType.d(), element.d(), str, a(aVar.b()));
    }

    public void e(a aVar) {
        EventType eventType = EventType.DEEPLINK;
        Element element = Element.CTA;
        g(aVar, eventType, element, d(aVar.b()));
        BixbyHomeCardsCtaClicked.b n = BixbyHomeCardsCtaClicked.n();
        n.m(aVar.a());
        n.o(element.d());
        n.p(c(aVar.b()));
        n.n(b(aVar.b()));
        this.b.c(n.build());
    }

    public void f(a aVar, Element element, String str) {
        g(aVar, EventType.DEEPLINK, element, str);
        BixbyHomeCardsDeeplink.b n = BixbyHomeCardsDeeplink.n();
        n.m(aVar.a());
        n.o(element.d());
        n.p(str);
        n.n(b(aVar.b()));
        this.b.c(n.build());
    }

    public void h(a aVar) {
        EventType eventType = EventType.NEXT;
        Element element = Element.NEXT;
        g(aVar, eventType, element, d(aVar.b()));
        BixbyHomeCardsNextClicked.b n = BixbyHomeCardsNextClicked.n();
        n.m(aVar.a());
        n.o(element.d());
        n.p(c(aVar.b()));
        n.n(b(aVar.b()));
        this.b.c(n.build());
    }

    public void i(a aVar) {
        EventType eventType = EventType.PAUSE;
        Element element = Element.PLAY_PAUSE;
        g(aVar, eventType, element, d(aVar.b()));
        BixbyHomeCardsPauseClicked.b n = BixbyHomeCardsPauseClicked.n();
        n.m(aVar.a());
        n.o(element.d());
        n.p(c(aVar.b()));
        n.n(b(aVar.b()));
        this.b.c(n.build());
    }

    public void j(a aVar) {
        EventType eventType = EventType.PLAY_RESUME;
        Element element = Element.PLAY_PAUSE;
        g(aVar, eventType, element, d(aVar.b()));
        BixbyHomeCardsPlayClicked.b n = BixbyHomeCardsPlayClicked.n();
        n.m(aVar.a());
        n.o(element.d());
        n.p(c(aVar.b()));
        n.n(b(aVar.b()));
        this.b.c(n.build());
    }

    public void k(a aVar) {
        EventType eventType = EventType.PREV;
        Element element = Element.PREV;
        g(aVar, eventType, element, d(aVar.b()));
        BixbyHomeCardsPreviousClicked.b n = BixbyHomeCardsPreviousClicked.n();
        n.m(aVar.a());
        n.o(element.d());
        n.p(c(aVar.b()));
        n.n(b(aVar.b()));
        this.b.c(n.build());
    }

    public void l(a aVar, Element element, String str) {
        g(aVar, EventType.RECOMMENDATION_CLICKED, element, str);
        BixbyHomeCardsRecommendationClicked.b n = BixbyHomeCardsRecommendationClicked.n();
        n.m(aVar.a());
        n.o(element.d());
        n.p(str);
        n.n(b(aVar.b()));
        this.b.c(n.build());
    }
}
