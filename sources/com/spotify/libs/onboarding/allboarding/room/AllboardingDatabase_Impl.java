package com.spotify.libs.onboarding.allboarding.room;

import android.os.Build;
import androidx.room.RoomDatabase;
import androidx.room.g;
import androidx.room.i;
import com.spotify.music.features.ads.model.Ad;
import defpackage.n7;
import defpackage.q7;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class AllboardingDatabase_Impl extends AllboardingDatabase {
    private volatile h k;
    private volatile r l;
    private volatile w m;
    private volatile k n;
    private volatile p o;
    private volatile m p;

    class a extends i.a {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.i.a
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `PickerStepData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `onBoardingSessionId` TEXT NOT NULL, `step` TEXT, `type` TEXT, `title` TEXT, `minimumSelectedItems` INTEGER, `skippable` INTEGER NOT NULL, `parentPickerStepId` INTEGER NOT NULL, `loadingText` TEXT, `search_url` TEXT, `search_placeholder` TEXT, `search_initialText` TEXT, `nextStepPrimary_buttonLabel` TEXT, `nextStepPrimary_nextAction_type` TEXT, `nextStepPrimary_nextAction_link` TEXT, `nextStepPrimary_nextScreen_type` TEXT, `nextStepPrimary_nextScreen_loadingText` TEXT, `nextStepSecondary_buttonLabel` TEXT, `nextStepSecondary_nextAction_type` TEXT, `nextStepSecondary_nextAction_link` TEXT, `nextStepSecondary_nextScreen_type` TEXT, `nextStepSecondary_nextScreen_loadingText` TEXT)");
            p7Var.A("CREATE TABLE IF NOT EXISTS `Section` (`sectionId` TEXT NOT NULL, `pickerStepDataId` INTEGER NOT NULL, `adapterType` TEXT NOT NULL, `sectionTitle` TEXT, `sectionSubtitle` TEXT, `sectionOrder` INTEGER NOT NULL, PRIMARY KEY(`sectionId`), FOREIGN KEY(`pickerStepDataId`) REFERENCES `PickerStepData`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            p7Var.A("CREATE UNIQUE INDEX IF NOT EXISTS `index_Section_pickerStepDataId_sectionId` ON `Section` (`pickerStepDataId`, `sectionId`)");
            p7Var.A("CREATE TABLE IF NOT EXISTS `PickerSectionCrossRef` (`sortOrder` INTEGER NOT NULL, `pickerUri` TEXT NOT NULL, `sectionId` TEXT NOT NULL, PRIMARY KEY(`sectionId`, `pickerUri`), FOREIGN KEY(`sectionId`) REFERENCES `Section`(`sectionId`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`pickerUri`) REFERENCES `Picker`(`pickerUri`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            p7Var.A("CREATE INDEX IF NOT EXISTS `index_PickerSectionCrossRef_sectionId_sortOrder_pickerUri` ON `PickerSectionCrossRef` (`sectionId`, `sortOrder`, `pickerUri`)");
            p7Var.A("CREATE TABLE IF NOT EXISTS `RelatedPickerItemCrossRef` (`pickerUri` TEXT NOT NULL, `relatedPickerUri` TEXT NOT NULL, PRIMARY KEY(`pickerUri`, `relatedPickerUri`), FOREIGN KEY(`relatedPickerUri`) REFERENCES `Picker`(`pickerUri`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`pickerUri`) REFERENCES `Picker`(`pickerUri`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            p7Var.A("CREATE UNIQUE INDEX IF NOT EXISTS `index_RelatedPickerItemCrossRef_relatedPickerUri_pickerUri` ON `RelatedPickerItemCrossRef` (`relatedPickerUri`, `pickerUri`)");
            p7Var.A("CREATE TABLE IF NOT EXISTS `Picker` (`pickerUri` TEXT NOT NULL, `pickerTitle` TEXT NOT NULL, `sectionId` TEXT, `sectionTitle_title` TEXT, `sectionTitle_subtitle` TEXT, `logging_section` TEXT, `logging_contentSource` TEXT, `selectable_isSelected` INTEGER, `selectable_shouldFollowOnSelection` INTEGER, `selectable_timestamp` INTEGER, `expandable_moreUri` TEXT, `expandable_expansionLimit` INTEGER, `expandable_expansionOffset` INTEGER, `expandable_canExpandMultipleTimes` INTEGER, `expandable_removeItemOnExpansion` INTEGER, `expandable_prependsItemsOnExpansion` INTEGER, `expandable_numberOfTimesExpanded` INTEGER, `banner_imageUrl` TEXT, `show_imageUrl` TEXT, `showMore_color` TEXT, `showMore_canExpandMultipleTimes` INTEGER, `showMore_expansionOffset` INTEGER, `artist_imageUrl` TEXT, `artistMore_color` TEXT, PRIMARY KEY(`pickerUri`))");
            p7Var.A("CREATE TABLE IF NOT EXISTS `OnboardingSession` (`sessionId` TEXT NOT NULL, `currentStepId` INTEGER, PRIMARY KEY(`sessionId`), FOREIGN KEY(`currentStepId`) REFERENCES `PickerStepData`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL )");
            p7Var.A("CREATE INDEX IF NOT EXISTS `index_OnboardingSession_currentStepId` ON `OnboardingSession` (`currentStepId`)");
            p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ac5ac85c8104aaffd7aca82cc11c1373')");
        }

        @Override // androidx.room.i.a
        public void b(p7 p7Var) {
            p7Var.A("DROP TABLE IF EXISTS `PickerStepData`");
            p7Var.A("DROP TABLE IF EXISTS `Section`");
            p7Var.A("DROP TABLE IF EXISTS `PickerSectionCrossRef`");
            p7Var.A("DROP TABLE IF EXISTS `RelatedPickerItemCrossRef`");
            p7Var.A("DROP TABLE IF EXISTS `Picker`");
            p7Var.A("DROP TABLE IF EXISTS `OnboardingSession`");
            if (((RoomDatabase) AllboardingDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) AllboardingDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) AllboardingDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public void c(p7 p7Var) {
            if (((RoomDatabase) AllboardingDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) AllboardingDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) AllboardingDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p7 p7Var) {
            ((RoomDatabase) AllboardingDatabase_Impl.this).a = p7Var;
            p7Var.A("PRAGMA foreign_keys = ON");
            AllboardingDatabase_Impl.this.p(p7Var);
            if (((RoomDatabase) AllboardingDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) AllboardingDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) AllboardingDatabase_Impl.this).h.get(i)).a(p7Var);
                }
            }
        }

        @Override // androidx.room.i.a
        public void e(p7 p7Var) {
        }

        @Override // androidx.room.i.a
        public void f(p7 p7Var) {
            l7.a(p7Var);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public i.b g(p7 p7Var) {
            HashMap hashMap = new HashMap(22);
            hashMap.put("id", new n7.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("onBoardingSessionId", new n7.a("onBoardingSessionId", "TEXT", true, 0, null, 1));
            hashMap.put("step", new n7.a("step", "TEXT", false, 0, null, 1));
            hashMap.put("type", new n7.a("type", "TEXT", false, 0, null, 1));
            hashMap.put("title", new n7.a("title", "TEXT", false, 0, null, 1));
            hashMap.put("minimumSelectedItems", new n7.a("minimumSelectedItems", "INTEGER", false, 0, null, 1));
            hashMap.put(Ad.METADATA_IS_SKIPPABLE_AD, new n7.a(Ad.METADATA_IS_SKIPPABLE_AD, "INTEGER", true, 0, null, 1));
            hashMap.put("parentPickerStepId", new n7.a("parentPickerStepId", "INTEGER", true, 0, null, 1));
            hashMap.put("loadingText", new n7.a("loadingText", "TEXT", false, 0, null, 1));
            hashMap.put("search_url", new n7.a("search_url", "TEXT", false, 0, null, 1));
            hashMap.put("search_placeholder", new n7.a("search_placeholder", "TEXT", false, 0, null, 1));
            hashMap.put("search_initialText", new n7.a("search_initialText", "TEXT", false, 0, null, 1));
            hashMap.put("nextStepPrimary_buttonLabel", new n7.a("nextStepPrimary_buttonLabel", "TEXT", false, 0, null, 1));
            hashMap.put("nextStepPrimary_nextAction_type", new n7.a("nextStepPrimary_nextAction_type", "TEXT", false, 0, null, 1));
            hashMap.put("nextStepPrimary_nextAction_link", new n7.a("nextStepPrimary_nextAction_link", "TEXT", false, 0, null, 1));
            hashMap.put("nextStepPrimary_nextScreen_type", new n7.a("nextStepPrimary_nextScreen_type", "TEXT", false, 0, null, 1));
            hashMap.put("nextStepPrimary_nextScreen_loadingText", new n7.a("nextStepPrimary_nextScreen_loadingText", "TEXT", false, 0, null, 1));
            hashMap.put("nextStepSecondary_buttonLabel", new n7.a("nextStepSecondary_buttonLabel", "TEXT", false, 0, null, 1));
            hashMap.put("nextStepSecondary_nextAction_type", new n7.a("nextStepSecondary_nextAction_type", "TEXT", false, 0, null, 1));
            hashMap.put("nextStepSecondary_nextAction_link", new n7.a("nextStepSecondary_nextAction_link", "TEXT", false, 0, null, 1));
            hashMap.put("nextStepSecondary_nextScreen_type", new n7.a("nextStepSecondary_nextScreen_type", "TEXT", false, 0, null, 1));
            n7 n7Var = new n7("PickerStepData", hashMap, je.d1(hashMap, "nextStepSecondary_nextScreen_loadingText", new n7.a("nextStepSecondary_nextScreen_loadingText", "TEXT", false, 0, null, 1), 0), new HashSet(0));
            n7 a = n7.a(p7Var, "PickerStepData");
            if (!n7Var.equals(a)) {
                return new i.b(false, je.v0("PickerStepData(com.spotify.libs.onboarding.allboarding.room.PickerStepData).\n Expected:\n", n7Var, "\n Found:\n", a));
            }
            HashMap hashMap2 = new HashMap(6);
            hashMap2.put("sectionId", new n7.a("sectionId", "TEXT", true, 1, null, 1));
            hashMap2.put("pickerStepDataId", new n7.a("pickerStepDataId", "INTEGER", true, 0, null, 1));
            hashMap2.put("adapterType", new n7.a("adapterType", "TEXT", true, 0, null, 1));
            hashMap2.put("sectionTitle", new n7.a("sectionTitle", "TEXT", false, 0, null, 1));
            hashMap2.put("sectionSubtitle", new n7.a("sectionSubtitle", "TEXT", false, 0, null, 1));
            HashSet d1 = je.d1(hashMap2, "sectionOrder", new n7.a("sectionOrder", "INTEGER", true, 0, null, 1), 1);
            d1.add(new n7.b("PickerStepData", "CASCADE", "NO ACTION", Arrays.asList("pickerStepDataId"), Arrays.asList("id")));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new n7.d("index_Section_pickerStepDataId_sectionId", true, Arrays.asList("pickerStepDataId", "sectionId")));
            n7 n7Var2 = new n7("Section", hashMap2, d1, hashSet);
            n7 a2 = n7.a(p7Var, "Section");
            if (!n7Var2.equals(a2)) {
                return new i.b(false, je.v0("Section(com.spotify.libs.onboarding.allboarding.room.Section).\n Expected:\n", n7Var2, "\n Found:\n", a2));
            }
            HashMap hashMap3 = new HashMap(3);
            hashMap3.put("sortOrder", new n7.a("sortOrder", "INTEGER", true, 0, null, 1));
            hashMap3.put("pickerUri", new n7.a("pickerUri", "TEXT", true, 2, null, 1));
            HashSet d12 = je.d1(hashMap3, "sectionId", new n7.a("sectionId", "TEXT", true, 1, null, 1), 2);
            d12.add(new n7.b("Section", "CASCADE", "NO ACTION", Arrays.asList("sectionId"), Arrays.asList("sectionId")));
            d12.add(new n7.b("Picker", "CASCADE", "NO ACTION", Arrays.asList("pickerUri"), Arrays.asList("pickerUri")));
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new n7.d("index_PickerSectionCrossRef_sectionId_sortOrder_pickerUri", false, Arrays.asList("sectionId", "sortOrder", "pickerUri")));
            n7 n7Var3 = new n7("PickerSectionCrossRef", hashMap3, d12, hashSet2);
            n7 a3 = n7.a(p7Var, "PickerSectionCrossRef");
            if (!n7Var3.equals(a3)) {
                return new i.b(false, je.v0("PickerSectionCrossRef(com.spotify.libs.onboarding.allboarding.room.PickerSectionCrossRef).\n Expected:\n", n7Var3, "\n Found:\n", a3));
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("pickerUri", new n7.a("pickerUri", "TEXT", true, 1, null, 1));
            HashSet d13 = je.d1(hashMap4, "relatedPickerUri", new n7.a("relatedPickerUri", "TEXT", true, 2, null, 1), 2);
            d13.add(new n7.b("Picker", "CASCADE", "NO ACTION", Arrays.asList("relatedPickerUri"), Arrays.asList("pickerUri")));
            d13.add(new n7.b("Picker", "CASCADE", "NO ACTION", Arrays.asList("pickerUri"), Arrays.asList("pickerUri")));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new n7.d("index_RelatedPickerItemCrossRef_relatedPickerUri_pickerUri", true, Arrays.asList("relatedPickerUri", "pickerUri")));
            n7 n7Var4 = new n7("RelatedPickerItemCrossRef", hashMap4, d13, hashSet3);
            n7 a4 = n7.a(p7Var, "RelatedPickerItemCrossRef");
            if (!n7Var4.equals(a4)) {
                return new i.b(false, je.v0("RelatedPickerItemCrossRef(com.spotify.libs.onboarding.allboarding.room.RelatedPickerItemCrossRef).\n Expected:\n", n7Var4, "\n Found:\n", a4));
            }
            HashMap hashMap5 = new HashMap(24);
            hashMap5.put("pickerUri", new n7.a("pickerUri", "TEXT", true, 1, null, 1));
            hashMap5.put("pickerTitle", new n7.a("pickerTitle", "TEXT", true, 0, null, 1));
            hashMap5.put("sectionId", new n7.a("sectionId", "TEXT", false, 0, null, 1));
            hashMap5.put("sectionTitle_title", new n7.a("sectionTitle_title", "TEXT", false, 0, null, 1));
            hashMap5.put("sectionTitle_subtitle", new n7.a("sectionTitle_subtitle", "TEXT", false, 0, null, 1));
            hashMap5.put("logging_section", new n7.a("logging_section", "TEXT", false, 0, null, 1));
            hashMap5.put("logging_contentSource", new n7.a("logging_contentSource", "TEXT", false, 0, null, 1));
            hashMap5.put("selectable_isSelected", new n7.a("selectable_isSelected", "INTEGER", false, 0, null, 1));
            hashMap5.put("selectable_shouldFollowOnSelection", new n7.a("selectable_shouldFollowOnSelection", "INTEGER", false, 0, null, 1));
            hashMap5.put("selectable_timestamp", new n7.a("selectable_timestamp", "INTEGER", false, 0, null, 1));
            hashMap5.put("expandable_moreUri", new n7.a("expandable_moreUri", "TEXT", false, 0, null, 1));
            hashMap5.put("expandable_expansionLimit", new n7.a("expandable_expansionLimit", "INTEGER", false, 0, null, 1));
            hashMap5.put("expandable_expansionOffset", new n7.a("expandable_expansionOffset", "INTEGER", false, 0, null, 1));
            hashMap5.put("expandable_canExpandMultipleTimes", new n7.a("expandable_canExpandMultipleTimes", "INTEGER", false, 0, null, 1));
            hashMap5.put("expandable_removeItemOnExpansion", new n7.a("expandable_removeItemOnExpansion", "INTEGER", false, 0, null, 1));
            hashMap5.put("expandable_prependsItemsOnExpansion", new n7.a("expandable_prependsItemsOnExpansion", "INTEGER", false, 0, null, 1));
            hashMap5.put("expandable_numberOfTimesExpanded", new n7.a("expandable_numberOfTimesExpanded", "INTEGER", false, 0, null, 1));
            hashMap5.put("banner_imageUrl", new n7.a("banner_imageUrl", "TEXT", false, 0, null, 1));
            hashMap5.put("show_imageUrl", new n7.a("show_imageUrl", "TEXT", false, 0, null, 1));
            hashMap5.put("showMore_color", new n7.a("showMore_color", "TEXT", false, 0, null, 1));
            hashMap5.put("showMore_canExpandMultipleTimes", new n7.a("showMore_canExpandMultipleTimes", "INTEGER", false, 0, null, 1));
            hashMap5.put("showMore_expansionOffset", new n7.a("showMore_expansionOffset", "INTEGER", false, 0, null, 1));
            hashMap5.put("artist_imageUrl", new n7.a("artist_imageUrl", "TEXT", false, 0, null, 1));
            n7 n7Var5 = new n7("Picker", hashMap5, je.d1(hashMap5, "artistMore_color", new n7.a("artistMore_color", "TEXT", false, 0, null, 1), 0), new HashSet(0));
            n7 a5 = n7.a(p7Var, "Picker");
            if (!n7Var5.equals(a5)) {
                return new i.b(false, je.v0("Picker(com.spotify.libs.onboarding.allboarding.room.Picker).\n Expected:\n", n7Var5, "\n Found:\n", a5));
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("sessionId", new n7.a("sessionId", "TEXT", true, 1, null, 1));
            HashSet d14 = je.d1(hashMap6, "currentStepId", new n7.a("currentStepId", "INTEGER", false, 0, null, 1), 1);
            d14.add(new n7.b("PickerStepData", "SET NULL", "NO ACTION", Arrays.asList("currentStepId"), Arrays.asList("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new n7.d("index_OnboardingSession_currentStepId", false, Arrays.asList("currentStepId")));
            n7 n7Var6 = new n7("OnboardingSession", hashMap6, d14, hashSet4);
            n7 a6 = n7.a(p7Var, "OnboardingSession");
            if (!n7Var6.equals(a6)) {
                return new i.b(false, je.v0("OnboardingSession(com.spotify.libs.onboarding.allboarding.room.OnboardingSession).\n Expected:\n", n7Var6, "\n Found:\n", a6));
            }
            return new i.b(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void d() {
        a();
        p7 writableDatabase = k().getWritableDatabase();
        boolean z = Build.VERSION.SDK_INT >= 21;
        if (!z) {
            try {
                writableDatabase.A("PRAGMA foreign_keys = FALSE");
            } catch (Throwable th) {
                h();
                if (!z) {
                    writableDatabase.A("PRAGMA foreign_keys = TRUE");
                }
                writableDatabase.D1("PRAGMA wal_checkpoint(FULL)").close();
                if (!writableDatabase.S1()) {
                    writableDatabase.A("VACUUM");
                }
                throw th;
            }
        }
        c();
        if (z) {
            writableDatabase.A("PRAGMA defer_foreign_keys = TRUE");
        }
        writableDatabase.A("DELETE FROM `PickerStepData`");
        writableDatabase.A("DELETE FROM `Section`");
        writableDatabase.A("DELETE FROM `PickerSectionCrossRef`");
        writableDatabase.A("DELETE FROM `RelatedPickerItemCrossRef`");
        writableDatabase.A("DELETE FROM `Picker`");
        writableDatabase.A("DELETE FROM `OnboardingSession`");
        s();
        h();
        if (!z) {
            writableDatabase.A("PRAGMA foreign_keys = TRUE");
        }
        writableDatabase.D1("PRAGMA wal_checkpoint(FULL)").close();
        if (!writableDatabase.S1()) {
            writableDatabase.A("VACUUM");
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public g f() {
        return new g(this, new HashMap(0), new HashMap(0), "PickerStepData", "Section", "PickerSectionCrossRef", "RelatedPickerItemCrossRef", "Picker", "OnboardingSession");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public q7 g(androidx.room.a aVar) {
        i iVar = new i(aVar, new a(1), "ac5ac85c8104aaffd7aca82cc11c1373", "f1f0447243289e1e87da8e8aa66ff1f2");
        q7.b.a a2 = q7.b.a(aVar.b);
        a2.c(aVar.c);
        a2.b(iVar);
        return aVar.a.a(a2.a());
    }

    @Override // com.spotify.libs.onboarding.allboarding.room.AllboardingDatabase
    public h t() {
        h hVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new i(this);
            }
            hVar = this.k;
        }
        return hVar;
    }

    @Override // com.spotify.libs.onboarding.allboarding.room.AllboardingDatabase
    public k u() {
        k kVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new l(this);
            }
            kVar = this.n;
        }
        return kVar;
    }

    @Override // com.spotify.libs.onboarding.allboarding.room.AllboardingDatabase
    public m v() {
        m mVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new n(this);
            }
            mVar = this.p;
        }
        return mVar;
    }

    @Override // com.spotify.libs.onboarding.allboarding.room.AllboardingDatabase
    public p w() {
        p pVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new q(this);
            }
            pVar = this.o;
        }
        return pVar;
    }

    @Override // com.spotify.libs.onboarding.allboarding.room.AllboardingDatabase
    public r x() {
        r rVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new s(this);
            }
            rVar = this.l;
        }
        return rVar;
    }

    @Override // com.spotify.libs.onboarding.allboarding.room.AllboardingDatabase
    public w y() {
        w wVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new x(this);
            }
            wVar = this.m;
        }
        return wVar;
    }
}
