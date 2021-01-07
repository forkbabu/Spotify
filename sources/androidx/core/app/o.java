package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public class o implements g {
    private final Notification.Builder a;
    private final k b;
    private RemoteViews c;
    private RemoteViews d;
    private final List<Bundle> e = new ArrayList();
    private final Bundle f = new Bundle();

    o(k kVar) {
        ArrayList<String> arrayList;
        Notification.Action.Builder builder;
        Bundle bundle;
        RemoteInput[] remoteInputArr;
        this.b = kVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.a = new Notification.Builder(kVar.a, kVar.x);
        } else {
            this.a = new Notification.Builder(kVar.a);
        }
        Notification notification = kVar.z;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(kVar.d).setContentText(kVar.e).setContentInfo(null).setContentIntent(kVar.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon(kVar.g).setNumber(kVar.h).setProgress(kVar.m, kVar.n, kVar.o);
        if (i < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        this.a.setSubText(kVar.l).setUsesChronometer(false).setPriority(kVar.i);
        Iterator<h> it = kVar.b.iterator();
        while (it.hasNext()) {
            h next = it.next();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 20) {
                IconCompat c2 = next.c();
                if (i2 >= 23) {
                    builder = new Notification.Action.Builder(c2 != null ? c2.n(null) : null, next.j, next.k);
                } else {
                    builder = new Notification.Action.Builder(c2 != null ? c2.g() : 0, next.j, next.k);
                }
                if (next.d() != null) {
                    r[] d2 = next.d();
                    if (d2 == null) {
                        remoteInputArr = null;
                    } else {
                        remoteInputArr = new RemoteInput[d2.length];
                        for (int i3 = 0; i3 < d2.length; i3++) {
                            d2[i3].getClass();
                            RemoteInput.Builder addExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                addExtras.setEditChoicesBeforeSending(0);
                            }
                            remoteInputArr[i3] = addExtras.build();
                        }
                    }
                    for (RemoteInput remoteInput : remoteInputArr) {
                        builder.addRemoteInput(remoteInput);
                    }
                }
                if (next.a != null) {
                    bundle = new Bundle(next.a);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", next.a());
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 24) {
                    builder.setAllowGeneratedReplies(next.a());
                }
                bundle.putInt("android.support.action.semanticAction", next.e());
                if (i4 >= 28) {
                    builder.setSemanticAction(next.e());
                }
                if (i4 >= 29) {
                    builder.setContextual(next.f());
                }
                bundle.putBoolean("android.support.action.showsUserInterface", next.f);
                builder.addExtras(bundle);
                this.a.addAction(builder.build());
            } else {
                this.e.add(p.e(this.a, next));
            }
        }
        Bundle bundle2 = kVar.s;
        if (bundle2 != null) {
            this.f.putAll(bundle2);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 20) {
            if (kVar.q) {
                this.f.putBoolean("android.support.localOnly", true);
            }
            String str = kVar.p;
            if (str != null) {
                this.f.putString("android.support.groupKey", str);
                this.f.putBoolean("android.support.useSideChannel", true);
            }
        }
        this.c = kVar.v;
        this.d = kVar.w;
        if (i5 >= 19) {
            this.a.setShowWhen(kVar.j);
            if (i5 < 21 && (arrayList = kVar.A) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f;
                ArrayList<String> arrayList2 = kVar.A;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (i5 >= 20) {
            this.a.setLocalOnly(kVar.q).setGroup(kVar.p).setGroupSummary(false).setSortKey(null);
        }
        if (i5 >= 21) {
            this.a.setCategory(kVar.r).setColor(kVar.t).setVisibility(kVar.u).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = kVar.A.iterator();
            while (it2.hasNext()) {
                this.a.addPerson(it2.next());
            }
            if (kVar.c.size() > 0) {
                if (kVar.s == null) {
                    kVar.s = new Bundle();
                }
                Bundle bundle4 = kVar.s.getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i6 = 0; i6 < kVar.c.size(); i6++) {
                    bundle5.putBundle(Integer.toString(i6), p.b(kVar.c.get(i6)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                if (kVar.s == null) {
                    kVar.s = new Bundle();
                }
                kVar.s.putBundle("android.car.EXTENSIONS", bundle4);
                this.f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            this.a.setExtras(kVar.s).setRemoteInputHistory(null);
            RemoteViews remoteViews = kVar.v;
            if (remoteViews != null) {
                this.a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = kVar.w;
            if (remoteViews2 != null) {
                this.a.setCustomBigContentView(remoteViews2);
            }
        }
        if (i7 >= 26) {
            this.a.setBadgeIconType(0).setShortcutId(null).setTimeoutAfter(0).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(kVar.x)) {
                this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 29) {
            this.a.setAllowSystemGeneratedContextualActions(kVar.y);
            this.a.setBubbleMetadata(null);
        }
    }

    @Override // androidx.core.app.g
    public Notification.Builder a() {
        return this.a;
    }

    public Notification b() {
        Notification notification;
        RemoteViews h;
        RemoteViews f2;
        n nVar = this.b.k;
        if (nVar != null) {
            nVar.a(this);
        }
        RemoteViews g = nVar != null ? nVar.g(this) : null;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            notification = this.a.build();
        } else if (i >= 24) {
            notification = this.a.build();
        } else if (i >= 21) {
            this.a.setExtras(this.f);
            notification = this.a.build();
            RemoteViews remoteViews = this.c;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.d;
            if (remoteViews2 != null) {
                notification.bigContentView = remoteViews2;
            }
        } else if (i >= 20) {
            this.a.setExtras(this.f);
            notification = this.a.build();
            RemoteViews remoteViews3 = this.c;
            if (remoteViews3 != null) {
                notification.contentView = remoteViews3;
            }
            RemoteViews remoteViews4 = this.d;
            if (remoteViews4 != null) {
                notification.bigContentView = remoteViews4;
            }
        } else if (i >= 19) {
            SparseArray<Bundle> a2 = p.a(this.e);
            if (a2 != null) {
                this.f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.a.setExtras(this.f);
            notification = this.a.build();
            RemoteViews remoteViews5 = this.c;
            if (remoteViews5 != null) {
                notification.contentView = remoteViews5;
            }
            RemoteViews remoteViews6 = this.d;
            if (remoteViews6 != null) {
                notification.bigContentView = remoteViews6;
            }
        } else {
            notification = this.a.build();
            Bundle b2 = d.b(notification);
            Bundle bundle = new Bundle(this.f);
            for (String str : this.f.keySet()) {
                if (b2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            b2.putAll(bundle);
            SparseArray<Bundle> a3 = p.a(this.e);
            if (a3 != null) {
                d.b(notification).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews7 = this.c;
            if (remoteViews7 != null) {
                notification.contentView = remoteViews7;
            }
            RemoteViews remoteViews8 = this.d;
            if (remoteViews8 != null) {
                notification.bigContentView = remoteViews8;
            }
        }
        if (g != null) {
            notification.contentView = g;
        } else {
            RemoteViews remoteViews9 = this.b.v;
            if (remoteViews9 != null) {
                notification.contentView = remoteViews9;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!(nVar == null || (f2 = nVar.f(this)) == null)) {
            notification.bigContentView = f2;
        }
        if (!(i2 < 21 || nVar == null || (h = this.b.k.h(this)) == null)) {
            notification.headsUpContentView = h;
        }
        if (nVar != null) {
            d.b(notification);
        }
        return notification;
    }
}
