package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.h;
import com.google.android.gms.cast.framework.i;

@Keep
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";

    private static void zza(c cVar, long j) {
        h zzi;
        if (j != 0 && (zzi = zzi(cVar)) != null && !zzi.o() && !zzi.s()) {
            zzi.y(zzi.f() + j);
        }
    }

    private static void zzh(c cVar) {
        h zzi = zzi(cVar);
        if (zzi != null) {
            zzi.C();
        }
    }

    private static h zzi(c cVar) {
        if (cVar == null || !cVar.c()) {
            return null;
        }
        return cVar.p();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            i c = a.e(context).c();
            char c2 = 65535;
            switch (action.hashCode()) {
                case -1699820260:
                    if (action.equals(ACTION_REWIND)) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -945151566:
                    if (action.equals(ACTION_SKIP_NEXT)) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -945080078:
                    if (action.equals(ACTION_SKIP_PREV)) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -668151673:
                    if (action.equals(ACTION_STOP_CASTING)) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -124479363:
                    if (action.equals(ACTION_DISCONNECT)) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 235550565:
                    if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1362116196:
                    if (action.equals(ACTION_FORWARD)) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1997055314:
                    if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    onReceiveActionRewind(c.e(), intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0));
                    return;
                case 1:
                    onReceiveActionSkipNext(c.e());
                    return;
                case 2:
                    onReceiveActionSkipPrev(c.e());
                    return;
                case 3:
                    c.c(true);
                    return;
                case 4:
                    c.c(false);
                    return;
                case 5:
                    onReceiveActionTogglePlayback(c.e());
                    return;
                case 6:
                    onReceiveActionForward(c.e(), intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0));
                    return;
                case 7:
                    onReceiveActionMediaButton(c.e(), intent);
                    return;
                default:
                    onReceiveOtherAction(context, action, intent);
                    return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionForward(h hVar, long j) {
        if (hVar instanceof c) {
            zza((c) hVar, j);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionMediaButton(h hVar, Intent intent) {
        KeyEvent keyEvent;
        if ((hVar instanceof c) && intent.hasExtra("android.intent.extra.KEY_EVENT") && (keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            zzh((c) hVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionRewind(h hVar, long j) {
        if (hVar instanceof c) {
            zza((c) hVar, -j);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionSkipNext(h hVar) {
        h zzi;
        if ((hVar instanceof c) && (zzi = zzi((c) hVar)) != null && !zzi.s()) {
            zzi.u(null);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionSkipPrev(h hVar) {
        h zzi;
        if ((hVar instanceof c) && (zzi = zzi((c) hVar)) != null && !zzi.s()) {
            zzi.v(null);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionTogglePlayback(h hVar) {
        if (hVar instanceof c) {
            zzh((c) hVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
