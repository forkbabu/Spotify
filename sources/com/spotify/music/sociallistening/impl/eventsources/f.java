package com.spotify.music.sociallistening.impl.eventsources;

public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.spotify.music.sociallistening.impl.eventsources.b] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.spotify.music.sociallistening.impl.eventsources.b] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0082: APUT  
      (r0v6 io.reactivex.v[])
      (2 ??[int, float, short, byte, char])
      (wrap: io.reactivex.s : 0x007d: INVOKE  (r2v16 io.reactivex.s) = 
      (wrap: io.reactivex.s : 0x0079: INVOKE  (r2v15 io.reactivex.s) = 
      (wrap: io.reactivex.internal.operators.observable.v : 0x0074: CONSTRUCTOR  (r4v4 io.reactivex.internal.operators.observable.v) = 
      (wrap: io.reactivex.g<R> : 0x006e: INVOKE  (r2v13 io.reactivex.g<R>) = 
      (r2v12 io.reactivex.g<R>)
      (wrap: io.reactivex.functions.l<? super R, ? extends R> : 0x006c: CHECK_CAST (r4v3 io.reactivex.functions.l<? super R, ? extends R>) = (io.reactivex.functions.l) (r4v2 com.spotify.music.sociallistening.impl.eventsources.SocialListeningImplEventSources$currentUsername$2))
     type: VIRTUAL call: io.reactivex.g.O(io.reactivex.functions.l):io.reactivex.g)
     call: io.reactivex.internal.operators.observable.v.<init>(tpf):void type: CONSTRUCTOR)
      (wrap: com.spotify.music.sociallistening.impl.eventsources.a : 0x0077: SGET  (r2v14 com.spotify.music.sociallistening.impl.eventsources.a) =  com.spotify.music.sociallistening.impl.eventsources.a.a com.spotify.music.sociallistening.impl.eventsources.a)
     type: VIRTUAL call: io.reactivex.s.L(io.reactivex.functions.g):io.reactivex.s)
      (r3v6 io.reactivex.s<java.lang.Object>)
     type: VIRTUAL call: io.reactivex.s.p0(io.reactivex.v):io.reactivex.s)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.spotify.mobius.q<defpackage.o8d> a(io.reactivex.s<defpackage.o8d> r2, defpackage.v7d r3, io.reactivex.g<com.spotify.mobile.android.service.session.SessionState> r4, com.spotify.music.json.d r5, io.reactivex.y r6) {
        /*
            java.lang.String r0 = "eventSubject"
            kotlin.jvm.internal.h.e(r2, r0)
            java.lang.String r0 = "serverPushNotificationsEndpoint"
            kotlin.jvm.internal.h.e(r3, r0)
            java.lang.String r0 = "sessionStateFlowable"
            kotlin.jvm.internal.h.e(r4, r0)
            java.lang.String r0 = "lazyObjectMapperBuilder"
            kotlin.jvm.internal.h.e(r5, r0)
            java.lang.String r0 = "computationScheduler"
            kotlin.jvm.internal.h.e(r6, r0)
            r0 = 3
            io.reactivex.v[] r0 = new io.reactivex.v[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "social-connect/v2/session_update"
            io.reactivex.s r2 = r3.notifications(r2)
            com.spotify.music.sociallistening.impl.eventsources.c r3 = com.spotify.music.sociallistening.impl.eventsources.c.a
            io.reactivex.s r2 = r2.Q(r3)
            java.lang.Class<com.spotify.music.sociallistening.models.SessionUpdate> r3 = com.spotify.music.sociallistening.models.SessionUpdate.class
            com.fasterxml.jackson.databind.ObjectMapper r5 = r5.a()
            com.spotify.mobile.android.cosmos.parser.JacksonResponseParser r3 = com.spotify.mobile.android.cosmos.parser.JacksonResponseParser.forClass(r3, r5, r6)
            io.reactivex.s r2 = r2.q(r3)
            com.spotify.music.sociallistening.impl.eventsources.d r3 = com.spotify.music.sociallistening.impl.eventsources.d.a
            io.reactivex.s r2 = r2.j0(r3)
            com.spotify.music.sociallistening.impl.eventsources.e r3 = com.spotify.music.sociallistening.impl.eventsources.e.a
            io.reactivex.s r2 = r2.L(r3)
            io.reactivex.s<java.lang.Object> r3 = io.reactivex.internal.operators.observable.e0.a
            io.reactivex.s r2 = r2.p0(r3)
            r5 = 1
            r0[r5] = r2
            com.spotify.music.sociallistening.impl.eventsources.SocialListeningImplEventSources$currentUsername$1 r2 = com.spotify.music.sociallistening.impl.eventsources.SocialListeningImplEventSources$currentUsername$1.a
            if (r2 == 0) goto L_0x0058
            com.spotify.music.sociallistening.impl.eventsources.b r5 = new com.spotify.music.sociallistening.impl.eventsources.b
            r5.<init>(r2)
            r2 = r5
        L_0x0058:
            io.reactivex.functions.l r2 = (io.reactivex.functions.l) r2
            io.reactivex.g r2 = r4.O(r2)
            io.reactivex.g r2 = r2.s()
            com.spotify.music.sociallistening.impl.eventsources.SocialListeningImplEventSources$currentUsername$2 r4 = com.spotify.music.sociallistening.impl.eventsources.SocialListeningImplEventSources$currentUsername$2.a
            if (r4 == 0) goto L_0x006c
            com.spotify.music.sociallistening.impl.eventsources.b r5 = new com.spotify.music.sociallistening.impl.eventsources.b
            r5.<init>(r4)
            r4 = r5
        L_0x006c:
            io.reactivex.functions.l r4 = (io.reactivex.functions.l) r4
            io.reactivex.g r2 = r2.O(r4)
            io.reactivex.internal.operators.observable.v r4 = new io.reactivex.internal.operators.observable.v
            r4.<init>(r2)
            com.spotify.music.sociallistening.impl.eventsources.a r2 = com.spotify.music.sociallistening.impl.eventsources.a.a
            io.reactivex.s r2 = r4.L(r2)
            io.reactivex.s r2 = r2.p0(r3)
            r3 = 2
            r0[r3] = r2
            com.spotify.mobius.q r2 = com.spotify.mobius.rx2.i.a(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.sociallistening.impl.eventsources.f.a(io.reactivex.s, v7d, io.reactivex.g, com.spotify.music.json.d, io.reactivex.y):com.spotify.mobius.q");
    }
}
