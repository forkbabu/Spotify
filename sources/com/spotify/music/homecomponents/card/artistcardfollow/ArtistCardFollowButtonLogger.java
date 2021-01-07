package com.spotify.music.homecomponents.card.artistcardfollow;

import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.g1;
import kotlin.jvm.internal.h;

public class ArtistCardFollowButtonLogger {
    private final jz1 a;
    private final ifd b;
    private final c c;
    private final cqe d;
    private final ere e;

    public enum UserIntent {
        FOLLOW("follow"),
        UNFOLLOW("unfollow");
        
        private final String intent;

        private UserIntent(String str) {
            this.intent = str;
        }

        public final String d() {
            return this.intent;
        }
    }

    public ArtistCardFollowButtonLogger(jz1 jz1, ifd ifd, c cVar, cqe cqe, ere ere) {
        h.e(jz1, "logMessageLogger");
        h.e(ifd, "featureIdentifier");
        h.e(cVar, "viewUri");
        h.e(cqe, "clock");
        h.e(ere, "userBehaviourEventLogger");
        this.a = jz1;
        this.b = ifd;
        this.c = cVar;
        this.d = cqe;
        this.e = ere;
    }

    public void a(String str, n61 n61, ArtistCardFollow.FollowingStatus followingStatus) {
        nqe nqe;
        UserIntent userIntent = UserIntent.FOLLOW;
        h.e(str, "uri");
        h.e(n61, "event");
        h.e(followingStatus, "desiredStatus");
        p81 logging = n61.d().logging();
        UserIntent userIntent2 = followingStatus == ArtistCardFollow.FollowingStatus.Following ? userIntent : UserIntent.UNFOLLOW;
        g1.d.a b2 = new g1(logging.string("ubi:pageReason")).d("home-follow-shelf", 0).b(logging.string("ui:group"), logging.intValue("ui:index_in_block"), str);
        if (userIntent2 == userIntent) {
            nqe = b2.a(str);
        } else {
            nqe = b2.b(str);
        }
        this.e.a(nqe);
        this.a.a(new fa1(logging.string("ui:source"), this.b.getName(), this.c.toString(), logging.string("ui:group"), (long) logging.intValue("ui:index_in_block", 0), str, InteractionLogger.InteractionType.HIT.toString(), userIntent2.d(), (double) this.d.d()));
    }
}
