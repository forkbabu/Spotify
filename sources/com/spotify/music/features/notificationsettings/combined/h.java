package com.spotify.music.features.notificationsettings.combined;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.notification.CategorySection;
import com.spotify.music.notification.NotificationV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class h implements f {
    private final Context a;
    private final Resources b;
    private final o0 c;
    private View d;
    private ListView e;
    private a f;
    private e g;
    private final List<rs5> h = new ArrayList(10);
    private boolean i;
    private boolean j;
    private gb0 k;

    /* access modifiers changed from: private */
    public static class a extends BaseAdapter {
        private final Context a;
        private final e b;
        private rs5[] c;

        a(Context context, e eVar) {
            this.a = context;
            this.b = eVar;
        }

        public rs5[] a() {
            return this.c;
        }

        public void b(Collection<rs5> collection) {
            this.c = (rs5[]) collection.toArray(new rs5[0]);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            rs5[] rs5Arr = this.c;
            if (rs5Arr == null) {
                return 0;
            }
            return rs5Arr.length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.c[i];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return (long) i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return this.c[i].getType();
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return this.c[i].u0(this.a, this.b, view, viewGroup, i);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return false;
        }
    }

    public h(Context context, Resources resources, o0 o0Var) {
        this.a = context;
        this.b = resources;
        this.c = o0Var;
    }

    private void i() {
        ListView listView = this.e;
        int i2 = 4;
        if (listView != null) {
            listView.setVisibility(this.i ? 0 : 4);
        }
        View view = this.d;
        if (view != null) {
            view.setVisibility(!this.i && !this.j ? 0 : 4);
        }
        gb0 gb0 = this.k;
        if (gb0 != null) {
            View view2 = gb0.getView();
            if (!this.i && this.j) {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_push_notification_settings, viewGroup, false);
        this.d = inflate.findViewById(C0707R.id.progress);
        this.e = (ListView) inflate.findViewById(C0707R.id.list);
        a aVar = new a(this.a, this.g);
        this.f = aVar;
        aVar.b(this.h);
        this.e.setAdapter((ListAdapter) this.f);
        gb0 b2 = e90.c().b((ViewStub) inflate.findViewById(C0707R.id.offlineView));
        this.k = b2;
        Context context = this.a;
        String string = this.b.getString(C0707R.string.push_notification_settings_offline);
        hb0 D2 = b2.D2();
        int i2 = yc0.b;
        D2.c(yc0.c(context, SpotifyIcon.OFFLINE_32, Float.NaN, true, true));
        b2.setTitle(context.getString(C0707R.string.error_no_connection_title));
        b2.setSubtitle(string);
        i();
        return inflate;
    }

    public void b(List<CategorySection> list) {
        this.h.clear();
        if (!list.isEmpty()) {
            for (CategorySection categorySection : list) {
                this.h.add(os5.a(categorySection.getName()));
                List<NotificationV2> preferences = categorySection.getPreferences();
                if (!preferences.isEmpty()) {
                    for (NotificationV2 notificationV2 : preferences) {
                        this.h.add(qs5.a(notificationV2.getName(), notificationV2.getDescription()));
                        this.h.add(ps5.a(notificationV2.getKey(), Channel.PUSH, notificationV2.isPushEnabled()));
                        this.h.add(ps5.a(notificationV2.getKey(), Channel.EMAIL, notificationV2.isEmailEnabled()));
                    }
                }
            }
            a aVar = this.f;
            if (aVar != null) {
                aVar.b(this.h);
            }
        }
        this.i = true;
        i();
    }

    public void c(String str, Channel channel, boolean z) {
        rs5[] a2 = this.f.a();
        int i2 = 0;
        while (true) {
            if (i2 >= a2.length) {
                i2 = -1;
                break;
            }
            rs5 rs5 = a2[i2];
            if (2 == rs5.getType()) {
                ps5 ps5 = (ps5) rs5;
                if (str.equals(ps5.c()) && channel == ps5.b()) {
                    break;
                }
            }
            i2++;
        }
        if (i2 >= -1) {
            ((ps5) this.h.get(i2)).e(z);
        }
    }

    public void d(Bundle bundle) {
        bundle.putParcelableArray("view_models", this.f.a());
        bundle.putBoolean("server_settings_loaded", this.i);
    }

    public void e(e eVar) {
        if (this.g != eVar) {
            this.g = eVar;
            ((g) eVar).b(this);
        }
    }

    public void f() {
        this.j = true;
        if (this.h.isEmpty()) {
            this.c.c(C0707R.string.toast_push_notification_settings_failed_fetch, new Object[0]);
        } else {
            this.c.d(C0707R.string.toast_push_notification_settings_failed_save, new Object[0]);
        }
        i();
    }

    public void g(e eVar, Bundle bundle) {
        this.g = eVar;
        eVar.b(this);
        if (bundle != null) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("view_models");
            if (parcelableArray != null) {
                for (Parcelable parcelable : parcelableArray) {
                    this.h.add((rs5) parcelable);
                }
            }
            bundle.setClassLoader(h.class.getClassLoader());
            this.i = bundle.getBoolean("server_settings_loaded");
        }
        this.g.start();
    }

    public void h() {
        this.g.stop();
    }
}
