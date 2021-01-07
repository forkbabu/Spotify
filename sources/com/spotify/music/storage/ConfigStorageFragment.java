package com.spotify.music.storage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.storage.MovingOrchestrator;
import com.spotify.android.storage.SyncError;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ConfigStorageFragment extends ListFragment implements s {
    private String q0;
    private Optional<Long> r0 = Optional.absent();
    private final Executor s0 = Executors.newSingleThreadExecutor();
    private final Handler t0 = new Handler(Looper.getMainLooper());
    private f u0;
    MovingOrchestrator v0;
    o0 w0;
    j x0;
    dd0 y0;

    class a implements MovingOrchestrator.a {
        a() {
        }

        @Override // com.spotify.android.storage.MovingOrchestrator.a
        public void a(MovingOrchestrator.State state) {
            ConfigStorageFragment.P4(ConfigStorageFragment.this);
        }

        @Override // com.spotify.android.storage.MovingOrchestrator.a
        public void b(SyncError syncError) {
            ConfigStorageFragment.P4(ConfigStorageFragment.this);
        }
    }

    private class b implements Runnable {
        private final e a;

        public b(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.spotify.android.storage.e eVar = new com.spotify.android.storage.e();
                eVar.d(this.a.a);
                this.a.d = Optional.of(Long.valueOf(eVar.a()));
                this.a.e = Optional.of(Long.valueOf(eVar.c()));
                ConfigStorageFragment.P4(ConfigStorageFragment.this);
            } catch (IOException unused) {
                Logger.d("Unable to calculate free space", new Object[0]);
            }
        }
    }

    private class c implements Runnable {
        c(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (!ConfigStorageFragment.this.r0.isPresent()) {
                int i2 = i + 1;
                if (i >= 3) {
                    break;
                }
                try {
                    ConfigStorageFragment.this.r0 = Optional.of(Long.valueOf(org.apache.commons.io.b.l(new File(ConfigStorageFragment.this.q0))));
                } catch (IllegalArgumentException e) {
                    Logger.n("sizeOfDirectory failed with message %s", e.getMessage());
                }
                i = i2;
            }
            if (!ConfigStorageFragment.this.r0.isPresent()) {
                Assertion.g("Execution of sizeOfDirectory failed");
            }
            ConfigStorageFragment.P4(ConfigStorageFragment.this);
        }
    }

    private class d implements Runnable {
        private final dd0 a;

        public d(dd0 dd0) {
            this.a = dd0;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashSet hashSet = (HashSet) this.a.a();
            ArrayList arrayList = new ArrayList(hashSet.size());
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                e eVar = new e((String) it.next());
                ConfigStorageFragment.this.s0.execute(new b(eVar));
                arrayList.add(eVar);
            }
            ConfigStorageFragment.this.u0.a.clear();
            ConfigStorageFragment.this.u0.a.addAll(arrayList);
            ConfigStorageFragment.P4(ConfigStorageFragment.this);
        }
    }

    /* access modifiers changed from: private */
    public class e {
        private final String a;
        private final boolean b;
        private final boolean c;
        private Optional<Long> d = Optional.absent();
        private Optional<Long> e = Optional.absent();

        protected e(String str) {
            this.a = str;
            this.b = ConfigStorageFragment.this.q0.startsWith(str);
            this.c = str.startsWith("/storage/emulated/0");
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean e() {
            /*
                r9 = this;
                boolean r0 = r9.b
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x005f
                com.spotify.music.storage.ConfigStorageFragment r0 = com.spotify.music.storage.ConfigStorageFragment.this
                com.spotify.android.storage.MovingOrchestrator r0 = r0.v0
                com.spotify.android.storage.MovingOrchestrator$State r0 = r0.getState()
                com.spotify.android.storage.MovingOrchestrator$State r3 = com.spotify.android.storage.MovingOrchestrator.State.IDLE
                if (r0 == r3) goto L_0x0014
                r0 = 1
                goto L_0x0015
            L_0x0014:
                r0 = 0
            L_0x0015:
                if (r0 != 0) goto L_0x005f
                com.spotify.music.storage.ConfigStorageFragment r0 = com.spotify.music.storage.ConfigStorageFragment.this
                com.google.common.base.Optional r0 = com.spotify.music.storage.ConfigStorageFragment.R4(r0)
                com.google.common.base.Optional<java.lang.Long> r3 = r9.d
                boolean r4 = r0.isPresent()
                if (r4 == 0) goto L_0x005b
                boolean r4 = r3.isPresent()
                if (r4 == 0) goto L_0x005b
                java.lang.Object r0 = r0.get()
                java.lang.Long r0 = (java.lang.Long) r0
                java.lang.Object r3 = r3.get()
                java.lang.Long r3 = (java.lang.Long) r3
                long r4 = r0.longValue()
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x005b
                long r4 = r3.longValue()
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x005b
                long r4 = r0.longValue()
                r6 = 50000000(0x2faf080, double:2.47032823E-316)
                long r4 = r4 + r6
                long r6 = r3.longValue()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 >= 0) goto L_0x005b
                r0 = 1
                goto L_0x005c
            L_0x005b:
                r0 = 0
            L_0x005c:
                if (r0 == 0) goto L_0x005f
                r1 = 1
            L_0x005f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.storage.ConfigStorageFragment.e.e():boolean");
        }

        public String f() {
            StringBuilder sb = new StringBuilder();
            if (!this.c) {
                sb.append(this.a);
                sb.append('\n');
            }
            if (this.b && ConfigStorageFragment.this.r0.isPresent()) {
                Locale locale = Locale.getDefault();
                ConfigStorageFragment configStorageFragment = ConfigStorageFragment.this;
                sb.append(String.format(locale, "%s: %s", ConfigStorageFragment.this.F2().getString(C0707R.string.cache_migration_fragment_currently_using), ConfigStorageFragment.T4(configStorageFragment, ((Long) configStorageFragment.r0.get()).longValue())));
                sb.append('\n');
            }
            if (!ConfigStorageFragment.this.r0.isPresent() || !this.e.isPresent()) {
                sb.append(ConfigStorageFragment.this.F2().getString(C0707R.string.cache_migration_fragment_checking));
            } else {
                sb.append(String.format(Locale.getDefault(), "%s: %s %s: %s", ConfigStorageFragment.this.F2().getString(C0707R.string.cache_migration_fragment_available), ConfigStorageFragment.T4(ConfigStorageFragment.this, this.d.get().longValue()), ConfigStorageFragment.this.F2().getString(C0707R.string.cache_migration_fragment_total), ConfigStorageFragment.T4(ConfigStorageFragment.this, this.e.get().longValue())));
            }
            return sb.toString();
        }

        public String g() {
            if (this.c) {
                return ConfigStorageFragment.this.F2().getString(C0707R.string.cache_migration_fragment_device_storage);
            }
            return ConfigStorageFragment.this.F2().getString(C0707R.string.cache_migration_fragment_sd_card);
        }

        public void h() {
            ConfigStorageFragment configStorageFragment = ConfigStorageFragment.this;
            Context F2 = configStorageFragment.F2();
            String str = this.a;
            long longValue = ((Long) ConfigStorageFragment.this.r0.or((Optional) 0L)).longValue();
            int i = MoveCacheConfirmationActivity.G;
            Intent intent = new Intent(F2, MoveCacheConfirmationActivity.class);
            intent.addFlags(1073741824);
            intent.addFlags(65536);
            intent.putExtra("volume", str);
            intent.putExtra("estimated-size", longValue);
            configStorageFragment.G4(intent, null);
        }
    }

    /* access modifiers changed from: private */
    public class f extends BaseAdapter {
        private final List<e> a = new ArrayList(4);

        f(a aVar) {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.a.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return (long) i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2 = e90.i;
            y90 y90 = (y90) l70.p(view, y90.class);
            if (y90 == null) {
                y90 = e90.d().j(ConfigStorageFragment.this.B2(), viewGroup, false);
            }
            e eVar = this.a.get(i);
            y90.getView().setTag(eVar);
            y90.setTitle(eVar.g());
            y90.setSubtitle(eVar.f());
            y90.getSubtitleView().setSingleLine(false);
            y90.getSubtitleView().setMaxLines(3);
            y90.getView().setEnabled(eVar.e());
            if (eVar.b) {
                y90.getImageView().setImageDrawable(new SpotifyIconDrawable(ConfigStorageFragment.this.F2(), SpotifyIcon.CHECK_32));
                y90.getImageView().setScaleType(ImageView.ScaleType.CENTER);
            }
            return y90.getView();
        }
    }

    static void P4(ConfigStorageFragment configStorageFragment) {
        configStorageFragment.t0.post(new g(configStorageFragment));
    }

    static String T4(ConfigStorageFragment configStorageFragment, long j) {
        configStorageFragment.getClass();
        if (j > 1073741824) {
            Locale locale = Locale.getDefault();
            double d2 = (double) j;
            Double.isNaN(d2);
            Double.isNaN(d2);
            return String.format(locale, "%.1f %s", Double.valueOf(((d2 / 1024.0d) / 1024.0d) / 1024.0d), configStorageFragment.V2(C0707R.string.cache_migration_fragment_gigabytes));
        } else if (j > 1048576) {
            Locale locale2 = Locale.getDefault();
            double d3 = (double) j;
            Double.isNaN(d3);
            Double.isNaN(d3);
            return String.format(locale2, "%.1f %s", Double.valueOf((d3 / 1024.0d) / 1024.0d), configStorageFragment.V2(C0707R.string.cache_migration_fragment_megabytes));
        } else {
            Locale locale3 = Locale.getDefault();
            double d4 = (double) j;
            Double.isNaN(d4);
            Double.isNaN(d4);
            return String.format(locale3, "%.1f %s", Double.valueOf(d4 / 1024.0d), configStorageFragment.V2(C0707R.string.cache_migration_fragment_kilobytes));
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.cache_migration_title);
    }

    @Override // androidx.fragment.app.ListFragment
    public void M4(ListView listView, View view, int i, long j) {
        Object itemAtPosition = listView.getItemAtPosition(i);
        if (itemAtPosition instanceof e) {
            e eVar = (e) itemAtPosition;
            if (ConfigStorageFragment.this.v0.getState() != MovingOrchestrator.State.IDLE) {
                this.w0.d(C0707R.string.cache_migration_notification_title, new Object[0]);
            } else if (eVar.e()) {
                eVar.h();
            }
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "internal:preferences_cache_migration";
    }

    @Override // androidx.fragment.app.Fragment
    public void m3(Bundle bundle) {
        super.m3(bundle);
        this.q0 = this.x0.b();
        f fVar = new f(null);
        this.u0 = fVar;
        N4(fVar);
        this.v0.d(new a());
        this.s0.execute(new d(this.y0));
        this.s0.execute(new c(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SETTINGS_STORAGE, null);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.p;
    }
}
