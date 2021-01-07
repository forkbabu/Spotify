package defpackage;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.spotify.mobius.e0;
import com.spotify.music.C0707R;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import com.spotify.voice.results.model.e;
import defpackage.eve;
import defpackage.uue;
import defpackage.vue;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* renamed from: wue  reason: default package */
public final class wue {
    private static int a(dve dve) {
        bve k = dve.k();
        if (!k.c()) {
            return C0707R.array.suggestions_error_generic;
        }
        boolean c = c(dve.l());
        if (!k.d() || !k.b()) {
            return c ? C0707R.array.suggestions_error_array_no_show : C0707R.array.suggestions_array_no_show;
        }
        return C0707R.array.suggestions_array;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if ((((defpackage.eve.c) r0).n().c().size() > 1) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.spotify.mobius.s<defpackage.dve, defpackage.uue> b(defpackage.dve r3) {
        /*
            eve r0 = r3.l()
            r0.getClass()
            boolean r1 = r0 instanceof defpackage.eve.d
            if (r1 != 0) goto L_0x0040
            boolean r0 = r0 instanceof defpackage.eve.c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002e
            eve r0 = r3.l()
            r0.getClass()
            eve$c r0 = (defpackage.eve.c) r0
            com.spotify.voice.results.model.e r0 = r0.n()
            java.util.List r0 = r0.c()
            int r0 = r0.size()
            if (r0 <= r1) goto L_0x002a
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 == 0) goto L_0x002e
            goto L_0x0040
        L_0x002e:
            uue[] r0 = new defpackage.uue[r1]
            uue$x r1 = new uue$x
            r1.<init>()
            r0[r2] = r1
            java.util.Set r0 = defpackage.z42.l(r0)
            com.spotify.mobius.s r3 = com.spotify.mobius.s.c(r3, r0)
            return r3
        L_0x0040:
            com.spotify.mobius.s r3 = com.spotify.mobius.s.b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wue.b(dve):com.spotify.mobius.s");
    }

    private static boolean c(eve eve) {
        eve.getClass();
        return (eve instanceof eve.a) || (eve instanceof eve.h) || (eve instanceof eve.i) || (eve instanceof eve.j) || (eve instanceof eve.k) || (eve instanceof eve.l);
    }

    static e0 g(dve dve, vue.m mVar) {
        Throwable s = mVar.s();
        if (!(s instanceof VoiceSessionException)) {
            return j(dve.y(eve.a()));
        }
        int ordinal = ((VoiceSessionException) s).a().ordinal();
        if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
            if (ordinal == 3) {
                return j(dve.y(eve.i()));
            }
            if (ordinal == 4) {
                return e0.g(dve.y(eve.j()), z42.l(new uue.i(dve.c())));
            }
            if (ordinal != 5) {
                throw new IllegalStateException("Unable enumeration value");
            }
        }
        return j(dve.y(eve.a()));
    }

    static e0 h(dve dve, vue.o oVar) {
        if (dve.d()) {
            return e0.g(dve.y(eve.d(a(dve))), z42.l(new uue.a0()));
        }
        if (!c(dve.l()) || dve.e()) {
            return e0.h();
        }
        return e0.a(z42.l(new uue.a()));
    }

    static e0 i(dve dve, vue.b bVar) {
        List<VoiceInteractionResponse.Action> actions = bVar.s().interactionResponse().actions();
        if (actions == null || actions.isEmpty()) {
            return j(dve.y(eve.a()));
        }
        return k(Collections2.newArrayDeque(actions), dve);
    }

    private static e0<dve, uue> j(dve dve) {
        return e0.g(dve, z42.l(new uue.l(C0707R.raw.voice_earcon_error), new uue.w(3)));
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0228: APUT  
      (r8v8 uue[])
      (0 ??[int, short, byte, char])
      (wrap: uue$m : 0x0225: CONSTRUCTOR  (r0v11 uue$m) = (r1v6 int), (r7v0 java.util.Queue<com.spotify.voice.api.model.VoiceInteractionResponse$Action>) call: uue.m.<init>(int, java.util.Queue):void type: CONSTRUCTOR)
     */
    /* access modifiers changed from: private */
    public static e0<dve, uue> k(Queue<VoiceInteractionResponse.Action> queue, dve dve) {
        VoiceInteractionResponse.Action poll = queue.poll();
        if (poll == null) {
            return e0.h();
        }
        HashSet hashSet = new HashSet(2);
        if (!queue.isEmpty()) {
            hashSet.add(new uue.h(queue));
        } else {
            hashSet.add(new uue.a0());
        }
        int ordinal = poll.action().ordinal();
        if (ordinal == 1) {
            hashSet.add(new uue.j(dve.n(), MoreObjects.nullToEmpty(((VoiceInteractionResponse.Play) poll).getUri())));
            return e0.a(hashSet);
        } else if (ordinal == 2) {
            hashSet.add(new uue.t(dve.n()));
            return e0.a(hashSet);
        } else if (ordinal == 3) {
            hashSet.add(new uue.z());
            return e0.a(hashSet);
        } else if (ordinal == 5) {
            VoiceInteractionResponse.SpeakTts speakTts = (VoiceInteractionResponse.SpeakTts) poll;
            if (speakTts.url().isEmpty()) {
                return e0.a(z42.l(new uue.n(dve.n(), speakTts.localResId(), queue)));
            }
            return e0.a(z42.l(new uue.o(dve.n(), speakTts.url(), queue)));
        } else if (ordinal == 26) {
            return e0.g(dve.q(true), z42.l(new uue.s()));
        } else {
            if (ordinal == 29) {
                uue[] uueArr = new uue[1];
                int ordinal2 = ((VoiceInteractionResponse.Earcon) poll).getEarconValue().ordinal();
                int i = C0707R.raw.voice_earcon_confirmation;
                if (!(ordinal2 == 1 || ordinal2 == 3)) {
                    i = C0707R.raw.voice_earcon_error;
                }
                uueArr[0] = new uue.m(i, queue);
                return e0.a(z42.l(uueArr));
            } else if (ordinal == 36) {
                return e0.g(dve.y(eve.d(C0707R.array.suggestions_array)), hashSet);
            } else {
                if (ordinal == 7) {
                    hashSet.add(new uue.g(dve.n()));
                    return e0.a(hashSet);
                } else if (ordinal == 8) {
                    hashSet.add(new uue.p(dve.n()));
                    return e0.a(hashSet);
                } else if (ordinal == 17) {
                    hashSet.add(new uue.d0());
                    return e0.a(hashSet);
                } else if (ordinal != 18) {
                    switch (ordinal) {
                        case 11:
                            hashSet.add(new uue.r());
                            return e0.a(hashSet);
                        case 12:
                            hashSet.add(new uue.q(true));
                            return e0.a(hashSet);
                        case 13:
                            hashSet.add(new uue.q(false));
                            return e0.a(hashSet);
                        case 14:
                            VoiceInteractionResponse.ShuffleOn shuffleOn = (VoiceInteractionResponse.ShuffleOn) poll;
                            if (MoreObjects.isNullOrEmpty(shuffleOn.getUri())) {
                                hashSet.add(new uue.u(true));
                                return e0.a(hashSet);
                            }
                            hashSet.add(new uue.v(dve.n(), shuffleOn.getUri()));
                            return e0.a(hashSet);
                        case 15:
                            hashSet.add(new uue.u(false));
                            return e0.a(hashSet);
                        default:
                            switch (ordinal) {
                                case 31:
                                    return e0.a(z42.l(new uue.e0(((VoiceInteractionResponse.Wait) poll).seconds(), queue)));
                                case 32:
                                    VoiceInteractionResponse.Navigate navigate = (VoiceInteractionResponse.Navigate) poll;
                                    if (navigate.getTarget() == VoiceInteractionResponse.Navigate.NavigationData.Target.NOW_PLAYING_VIEW) {
                                        hashSet.add(new uue.f());
                                    } else {
                                        hashSet.add(new uue.d(navigate.getUri()));
                                    }
                                    return e0.a(hashSet);
                                case 33:
                                    VoiceInteractionResponse.Display display = (VoiceInteractionResponse.Display) poll;
                                    VoiceInteractionResponse.Display.DisplayData.DisplayError error = display.error();
                                    if (error == VoiceInteractionResponse.Display.DisplayData.DisplayError.NO_RESULTS_FOUND) {
                                        return e0.g(dve.y(eve.k(display.getTitle())), hashSet);
                                    }
                                    e b = e.b(display.getTitle(), Collections2.transform((List) display.getResults(), (Function) sue.a), display.getSubtitle());
                                    if (error == VoiceInteractionResponse.Display.DisplayData.DisplayError.RESTRICTION) {
                                        return e0.g(dve.y(eve.l(display.getTitle(), display.getSubtitle(), b)), hashSet);
                                    }
                                    if (!dve.f()) {
                                        return e0.g(dve.y(eve.c(b)), hashSet);
                                    }
                                    if (!b.c().isEmpty()) {
                                        hashSet.add(new uue.d(b.c().get(0).g()));
                                    } else if (!dve.d()) {
                                        hashSet.add(new uue.a());
                                    }
                                    return e0.g(dve.y(eve.d(a(dve))), hashSet);
                                case 34:
                                    hashSet.add(new uue.a());
                                    return e0.a(hashSet);
                                default:
                                    return e0.g(dve.y(eve.m()), z42.l(new uue.w(3)));
                            }
                    }
                } else {
                    hashSet.add(new uue.c0());
                    return e0.a(hashSet);
                }
            }
        }
    }
}
