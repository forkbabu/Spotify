package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.yourlibrary.quickscroll.z;
import com.spotify.playlist.endpoints.p;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: qg9  reason: default package */
public class qg9 implements g<MusicPagesModel, s0> {
    private final e1 a;
    private z b;
    private boolean c;
    private boolean f;
    private int n;
    private sg0<Integer, Optional<MusicItem>> o;
    private Supplier<b> p;

    /* renamed from: qg9$a */
    class a implements h<MusicPagesModel> {
        private MusicPagesModel a;

        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
            MusicPagesModel musicPagesModel2 = this.a;
            if (musicPagesModel2 == null || !musicPagesModel2.b().equals(musicPagesModel.b()) || !this.a.c().equals(musicPagesModel.c())) {
                c a2 = c.a(musicPagesModel, qg9.this.p, qg9.this.a);
                if (a2.e()) {
                    qg9.g(qg9.this, a2);
                    this.a = musicPagesModel;
                }
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    /* renamed from: qg9$b */
    public static abstract class b {
        public static b b(int i, int i2) {
            return new mg9(i, i2);
        }

        /* access modifiers changed from: package-private */
        public abstract int a();

        /* access modifiers changed from: package-private */
        public abstract int c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qg9$c */
    public static abstract class c {
        private static final Map<MusicPageId, ImmutableList<String>> a;

        static {
            EnumMap enumMap = new EnumMap(MusicPageId.class);
            int i = ImmutableList.a;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.mo60add((Object[]) new String[]{p.a.c.c.c(), p.a.c.b.c()});
            ImmutableList build = builder.build();
            enumMap.put((EnumMap) MusicPageId.PLAYLISTS, (MusicPageId) build);
            enumMap.put((EnumMap) MusicPageId.FOLDER, (MusicPageId) build);
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            builder2.mo60add((Object[]) new String[]{"name", "addTime"});
            enumMap.put((EnumMap) MusicPageId.ARTISTS, (MusicPageId) builder2.build());
            ImmutableList.Builder builder3 = new ImmutableList.Builder();
            builder3.mo60add((Object[]) new String[]{"name", "artist.name", "addTime"});
            enumMap.put((EnumMap) MusicPageId.ALBUMS, (MusicPageId) builder3.build());
            ImmutableList.Builder builder4 = new ImmutableList.Builder();
            builder4.mo60add((Object[]) new String[]{"name", "artist.name", "album.name", "addTime"});
            enumMap.put((EnumMap) MusicPageId.SONGS, (MusicPageId) builder4.build());
            a = enumMap;
        }

        c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static defpackage.qg9.c a(com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel r7, com.google.common.base.Supplier<defpackage.qg9.b> r8, com.spotify.music.features.yourlibrary.musicpages.e1 r9) {
            /*
                com.spotify.music.features.yourlibrary.musicpages.pages.u r0 = r7.m()
                com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId r0 = r0.k()
                com.google.common.base.Optional r1 = r7.b()
                java.util.Map<com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId, com.google.common.collect.ImmutableList<java.lang.String>> r2 = defpackage.qg9.c.a
                java.lang.Object r2 = r2.get(r0)
                com.google.common.collect.ImmutableList r2 = (com.google.common.collect.ImmutableList) r2
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0032
                boolean r5 = r1.isPresent()
                if (r5 == 0) goto L_0x0032
                java.lang.Object r0 = r1.get()
                qpd r0 = (defpackage.qpd) r0
                com.spotify.mobile.android.util.SortOption r0 = r0.a()
                java.lang.String r0 = r0.a()
                boolean r0 = r2.contains(r0)
                r0 = r0 ^ r3
                goto L_0x0039
            L_0x0032:
                com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId r1 = com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId.FOLDER
                if (r0 == r1) goto L_0x0038
                r0 = 1
                goto L_0x0039
            L_0x0038:
                r0 = 0
            L_0x0039:
                if (r0 == 0) goto L_0x0041
                ng9 r7 = new ng9
                r7.<init>(r3, r4, r4, r4)
                return r7
            L_0x0041:
                java.lang.Object r8 = r8.get()
                qg9$b r8 = (defpackage.qg9.b) r8
                int r0 = r8.c()
                if (r0 >= r3) goto L_0x0053
                ng9 r7 = new ng9
                r7.<init>(r4, r4, r4, r4)
                return r7
            L_0x0053:
                com.spotify.music.features.yourlibrary.musicpages.pages.u r0 = r7.m()
                com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId r0 = r0.k()
                com.spotify.music.features.yourlibrary.musicpages.datasource.y3 r1 = r7.c()
                int r0 = r0.ordinal()
                if (r0 == r3) goto L_0x0085
                r2 = 2
                if (r0 == r2) goto L_0x0069
                goto L_0x009b
            L_0x0069:
                com.spotify.music.features.yourlibrary.musicpages.datasource.y3 r0 = r1.j()
                if (r0 == 0) goto L_0x009b
                boolean r2 = r0.h()
                if (r2 != 0) goto L_0x009b
                int r1 = r1.getCount()
                int r0 = r0.b()
                int r1 = r1 - r0
                int r1 = r1 + -1
                int r0 = java.lang.Math.max(r1, r4)
                goto L_0x009c
            L_0x0085:
                boolean r0 = r1.h()
                if (r0 != 0) goto L_0x009b
                int r0 = r1.getCount()
                int r1 = r1.b()
                int r0 = r0 - r1
                int r0 = r0 + -3
                int r0 = java.lang.Math.max(r0, r4)
                goto L_0x009c
            L_0x009b:
                r0 = 0
            L_0x009c:
                com.spotify.music.features.yourlibrary.musicpages.datasource.y3 r7 = r7.c()
                int r1 = r8.a()
                int r8 = r8.c()
                double r5 = (double) r8
                double r1 = (double) r1
                java.lang.Double.isNaN(r5)
                java.lang.Double.isNaN(r1)
                java.lang.Double.isNaN(r5)
                java.lang.Double.isNaN(r1)
                java.lang.Double.isNaN(r5)
                java.lang.Double.isNaN(r1)
                double r5 = r5 / r1
                int r7 = r7.getCount()
                double r1 = (double) r7
                java.lang.Double.isNaN(r1)
                java.lang.Double.isNaN(r1)
                java.lang.Double.isNaN(r1)
                double r1 = r1 / r5
                int r7 = r7 - r0
                double r7 = (double) r7
                java.lang.Double.isNaN(r7)
                java.lang.Double.isNaN(r7)
                java.lang.Double.isNaN(r7)
                double r7 = r7 / r1
                int r9 = r9.n()
                double r1 = (double) r9
                int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r9 >= 0) goto L_0x00e3
                r7 = 1
                goto L_0x00e4
            L_0x00e3:
                r7 = 0
            L_0x00e4:
                if (r7 == 0) goto L_0x00ec
                ng9 r7 = new ng9
                r7.<init>(r3, r4, r4, r4)
                return r7
            L_0x00ec:
                ng9 r7 = new ng9
                r7.<init>(r3, r3, r3, r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qg9.c.a(com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel, com.google.common.base.Supplier, com.spotify.music.features.yourlibrary.musicpages.e1):qg9$c");
        }

        /* access modifiers changed from: package-private */
        public abstract boolean b();

        /* access modifiers changed from: package-private */
        public abstract boolean c();

        /* access modifiers changed from: package-private */
        public abstract int d();

        /* access modifiers changed from: package-private */
        public abstract boolean e();
    }

    public qg9(e1 e1Var) {
        this.a = e1Var;
    }

    static void g(qg9 qg9, c cVar) {
        qg9.getClass();
        qg9.c = cVar.c();
        qg9.f = cVar.b();
        qg9.n = cVar.d();
    }

    public z h(sg0<Integer, Optional<MusicItem>> sg0, Supplier<b> supplier) {
        this.o = sg0;
        this.p = supplier;
        if (this.b == null) {
            this.b = new pg9(this);
        }
        return this.b;
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        return new a();
    }
}
