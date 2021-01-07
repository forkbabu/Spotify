package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import com.spotify.music.C0707R;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import defpackage.p2f;
import defpackage.q2f;
import defpackage.x2f;
import java.util.Queue;

/* renamed from: r2f  reason: default package */
public final class r2f {
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x01c6: APUT  
      (r1v15 p2f[])
      (0 ??[int, short, byte, char])
      (wrap: p2f$n : 0x01c3: CONSTRUCTOR  (r3v8 p2f$n) = 
      (r7v5 int)
      (wrap: boolean : 0x01b8: ARITH  (r0v34 boolean) = (wrap: boolean : 0x01b4: INVOKE  (r0v33 boolean) = 
      (wrap: java.lang.String : 0x01b0: INVOKE  (r0v32 java.lang.String) = (r4v6 com.spotify.voice.api.model.VoiceInteractionResponse$SpeakTts) type: VIRTUAL call: com.spotify.voice.api.model.VoiceInteractionResponse.SpeakTts.url():java.lang.String)
     type: STATIC call: com.google.common.base.MoreObjects.isNullOrEmpty(java.lang.String):boolean) ^ true)
      (wrap: java.lang.String : 0x01bd: INVOKE  (r2v10 java.lang.String) = 
      (wrap: java.lang.String : 0x01b9: INVOKE  (r2v9 java.lang.String) = (r4v6 com.spotify.voice.api.model.VoiceInteractionResponse$SpeakTts) type: VIRTUAL call: com.spotify.voice.api.model.VoiceInteractionResponse.SpeakTts.url():java.lang.String)
     type: STATIC call: com.google.common.base.MoreObjects.nullToEmpty(java.lang.String):java.lang.String)
     call: p2f.n.<init>(int, boolean, java.lang.String):void type: CONSTRUCTOR)
     */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x01ea: APUT  
      (r1v13 p2f[])
      (0 ??[int, short, byte, char])
      (wrap: p2f$m : 0x01e7: CONSTRUCTOR  (r0v30 p2f$m) = (r7v3 int) call: p2f.m.<init>(int):void type: CONSTRUCTOR)
     */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: private */
    public static e0<w2f, p2f> a(w2f w2f) {
        VoiceInteractionResponse.Earcon.EarconValue earconValue = VoiceInteractionResponse.Earcon.EarconValue.FAILURE;
        x2f d = w2f.d();
        d.getClass();
        if (!(d instanceof x2f.a)) {
            return e0.h();
        }
        x2f d2 = w2f.d();
        d2.getClass();
        Queue<VoiceInteractionResponse.Action> k = ((x2f.a) d2).k();
        if (k.isEmpty()) {
            return e0.h();
        }
        VoiceInteractionResponse.Action poll = k.poll();
        poll.getClass();
        VoiceInteractionResponse.Action action = poll;
        String h = w2f.h();
        int ordinal = action.action().ordinal();
        if (ordinal == 1) {
            return e0.g(w2f.k(x2f.a(action, k)), z42.l(new p2f.j(h, ((VoiceInteractionResponse.Play) action).getUri())));
        }
        if (ordinal == 2) {
            return e0.a(z42.l(new p2f.v(h, true)));
        }
        if (ordinal == 3) {
            return e0.a(z42.l(new p2f.b0()));
        }
        if (ordinal == 5) {
            return e0.g(w2f.k(x2f.a(action, k)), z42.l(new p2f.p(w2f.h(), MoreObjects.nullToEmpty(((VoiceInteractionResponse.SpeakTts) action).url()))));
        }
        if (ordinal != 37) {
            if (ordinal == 7) {
                return e0.a(z42.l(new p2f.h(h)));
            }
            int i = 8;
            if (ordinal == 8) {
                return e0.a(z42.l(new p2f.q(h)));
            }
            if (ordinal == 17) {
                return e0.a(z42.l(new p2f.g0()));
            }
            if (ordinal == 18) {
                return e0.a(z42.l(new p2f.f0()));
            }
            if (ordinal == 26) {
                return e0.g(w2f.k(x2f.h(false)), z42.l(new p2f.u()));
            }
            if (ordinal == 27) {
                return e0.a(z42.l(new p2f.b()));
            }
            switch (ordinal) {
                case 11:
                    return e0.a(z42.l(new p2f.s()));
                case 12:
                    return e0.a(z42.l(new p2f.r(true)));
                case 13:
                    return e0.a(z42.l(new p2f.r(false)));
                case 14:
                    VoiceInteractionResponse.ShuffleOn shuffleOn = (VoiceInteractionResponse.ShuffleOn) action;
                    if (MoreObjects.isNullOrEmpty(shuffleOn.getUri())) {
                        return e0.a(z42.l(new p2f.x(true)));
                    }
                    return e0.a(z42.l(new p2f.y(w2f.h(), shuffleOn.getUri())));
                case 15:
                    return e0.a(z42.l(new p2f.x(false)));
                default:
                    switch (ordinal) {
                        case 29:
                            VoiceInteractionResponse.Earcon earcon = (VoiceInteractionResponse.Earcon) action;
                            boolean z = k.peek() instanceof VoiceInteractionResponse.SpeakTts;
                            int i2 = C0707R.raw.voice_earcon_error;
                            if (z) {
                                VoiceInteractionResponse.SpeakTts speakTts = (VoiceInteractionResponse.SpeakTts) k.poll();
                                w2f k2 = w2f.k(x2f.a(action, k));
                                p2f[] p2fArr = new p2f[1];
                                if (earcon.getEarconValue() != earconValue) {
                                    i2 = C0707R.raw.voice_earcon_confirmation;
                                }
                                p2fArr[0] = new p2f.n(i2, !MoreObjects.isNullOrEmpty(speakTts.url()), MoreObjects.nullToEmpty(speakTts.url()));
                                return e0.g(k2, z42.l(p2fArr));
                            }
                            w2f k3 = w2f.k(x2f.a(action, k));
                            p2f[] p2fArr2 = new p2f[1];
                            if (earcon.getEarconValue() != earconValue) {
                                i2 = C0707R.raw.voice_earcon_confirmation;
                            }
                            p2fArr2[0] = new p2f.m(i2);
                            return e0.g(k3, z42.l(p2fArr2));
                        case 30:
                            return e0.g(w2f.k(x2f.a(action, k)), z42.l(new p2f.o((VoiceInteractionResponse.Preview) action)));
                        case 31:
                            VoiceInteractionResponse.Wait wait = (VoiceInteractionResponse.Wait) action;
                            if (wait.seconds() > 0) {
                                i = wait.seconds();
                            }
                            return e0.f(w2f.k(x2f.e(i)));
                        case 32:
                            VoiceInteractionResponse.Navigate navigate = (VoiceInteractionResponse.Navigate) action;
                            if (navigate.getTarget() == VoiceInteractionResponse.Navigate.NavigationData.Target.NOW_PLAYING_VIEW) {
                                return e0.a(z42.l(new p2f.g()));
                            }
                            return e0.a(z42.l(new p2f.f(navigate.getUri())));
                        case 33:
                            break;
                        case 34:
                            return e0.a(z42.l(new p2f.z(3)));
                        default:
                            Logger.n("Not handling action %s", action);
                            return e0.a(z42.l(new p2f.i()));
                    }
            }
        }
        return e0.g(w2f.k(x2f.a(action, k)), z42.l(new p2f.i()));
    }

    public static s<w2f, p2f> b(w2f w2f) {
        x2f d = w2f.d();
        d.getClass();
        if (d instanceof x2f.a) {
            return s.c(w2f, z42.l(new p2f.b0(), new p2f.d(w2f.b(), ((x2f.a) d).k())));
        }
        return s.c(w2f, z42.l(new p2f.b0(), new p2f.t()));
    }

    static e0 c(w2f w2f, q2f.p pVar) {
        x2f d = w2f.d();
        d.getClass();
        if (d instanceof x2f.a) {
            return a(w2f);
        }
        return e0.g(w2f.k(x2f.h(false)), z42.l(new p2f.m(C0707R.raw.voice_earcon_listening)));
    }

    static e0 g(w2f w2f, q2f.f fVar) {
        if (!MoreObjects.isNullOrEmpty(fVar.v())) {
            x2f d = w2f.d();
            d.getClass();
            if (!(d instanceof x2f.d)) {
                return e0.g(w2f, z42.l(new p2f.p(w2f.h(), fVar.v())));
            }
        }
        return a(w2f);
    }

    static e0 i(w2f w2f, q2f.i iVar) {
        return l(w2f.k(x2f.b()));
    }

    static e0 j(w2f w2f, q2f.o oVar) {
        Throwable v = oVar.v();
        if (!(v instanceof VoiceSessionException)) {
            return l(w2f.k(x2f.b()));
        }
        int ordinal = ((VoiceSessionException) v).a().ordinal();
        if (!(ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3)) {
            if (ordinal == 4) {
                return l(w2f.k(x2f.j()));
            }
            if (ordinal != 5) {
                throw new IllegalStateException("Unable enumeration value");
            }
        }
        return l(w2f.k(x2f.b()));
    }

    static e0 k(w2f w2f, q2f.c cVar) {
        Queue<VoiceInteractionResponse.Action> v = cVar.v();
        if (v.isEmpty()) {
            return l(w2f.k(x2f.b()));
        }
        return a(w2f.i(cVar.w()).k(x2f.a(v.peek(), Collections2.newArrayDeque(v))));
    }

    private static e0<w2f, p2f> l(w2f w2f) {
        return e0.g(w2f, z42.l(new p2f.m(C0707R.raw.voice_earcon_error), new p2f.z(3)));
    }
}
