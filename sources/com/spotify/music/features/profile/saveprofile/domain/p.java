package com.spotify.music.features.profile.saveprofile.domain;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import com.spotify.music.features.profile.saveprofile.domain.n;
import com.spotify.music.features.profile.saveprofile.domain.o;
import com.spotify.music.features.profile.saveprofile.domain.q;
import kotlin.jvm.internal.h;

public final class p {
    private static boolean a(q qVar) {
        if (qVar.a() != SaveProfileTask.CONFIRM_CHANGES) {
            return false;
        }
        boolean z = true;
        if (qVar.j().contains(SaveProfileTask.SET_DISPLAY_NAME) && !qVar.b().equals(qVar.d())) {
            z = false;
        }
        if ((qVar.j().contains(SaveProfileTask.SET_IMAGE) || qVar.j().contains(SaveProfileTask.REMOVE_IMAGE)) && qVar.c().equals(qVar.g())) {
            return false;
        }
        return z;
    }

    static e0 b(q qVar, o.e eVar) {
        SaveProfileState i = qVar.i();
        SaveProfileState saveProfileState = SaveProfileState.SAVING;
        if (i == saveProfileState) {
            return e0.h();
        }
        int i2 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (qVar.n().isEmpty()) {
            builder.mo53add((ImmutableList.Builder) SaveProfileTask.GET_USERNAME);
        }
        builder.mo53add((ImmutableList.Builder) SaveProfileTask.GET_CORE_PROFILE_DATA);
        if (eVar.a().isPresent()) {
            builder.mo53add((ImmutableList.Builder) SaveProfileTask.SET_DISPLAY_NAME);
            q.a l = qVar.l();
            l.e(eVar.a().get());
            qVar = l.a();
        }
        if (eVar.b().isPresent()) {
            if (eVar.b().get().isEmpty()) {
                builder.mo53add((ImmutableList.Builder) SaveProfileTask.REMOVE_IMAGE);
                q.a l2 = qVar.l();
                l2.f("");
                qVar = l2.a();
            } else {
                builder.mo60add((Object[]) new SaveProfileTask[]{SaveProfileTask.UPLOAD_IMAGE, SaveProfileTask.SET_IMAGE});
                q.a l3 = qVar.l();
                l3.f(eVar.b().get());
                qVar = l3.a();
            }
        }
        builder.mo53add((ImmutableList.Builder) SaveProfileTask.CONFIRM_CHANGES);
        int i3 = ImmutableSet.a;
        ImmutableSet.Builder builder2 = new ImmutableSet.Builder();
        q.a l4 = qVar.l();
        l4.j(saveProfileState);
        l4.k(builder.build());
        l4.l(ImmutableList.of());
        l4.b(SaveProfileTask.NOTHING);
        return e0.g(j(l4.a(), builder2), builder2.build());
    }

    static e0 c(q qVar, o.i iVar) {
        q qVar2;
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (iVar.a().isEmpty()) {
            SaveProfileState saveProfileState = SaveProfileState.FAILED;
            q.a l = qVar.l();
            l.j(saveProfileState);
            qVar2 = l.a();
        } else {
            String a = iVar.a();
            q.a l2 = qVar.l();
            l2.n(a);
            qVar2 = j(l2.a(), builder);
        }
        return e0.g(qVar2, builder.build());
    }

    static e0 d(q qVar, o.c cVar) {
        if (!cVar.c()) {
            SaveProfileState saveProfileState = SaveProfileState.FAILED;
            q.a l = qVar.l();
            l.j(saveProfileState);
            return e0.f(l.a());
        }
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        q.a l2 = qVar.l();
        l2.c(cVar.a());
        l2.d(cVar.b());
        q a = l2.a();
        if (a.a() == SaveProfileTask.GET_CORE_PROFILE_DATA) {
            q.a l3 = a.l();
            l3.g(cVar.a());
            l3.h(cVar.b());
            a = j(l3.a(), builder);
        } else if (a(a)) {
            a = j(a, builder);
            builder.mo53add((ImmutableSet.Builder) new n.a(false));
        }
        return e0.g(a, builder.build());
    }

    static e0 e(q qVar, o.h hVar) {
        q qVar2;
        SaveProfileState saveProfileState = SaveProfileState.FAILED;
        if (!hVar.b()) {
            q.a l = qVar.l();
            l.j(saveProfileState);
            return e0.f(l.a());
        }
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (hVar.c().isPresent()) {
            String str = hVar.c().get();
            if (str.isEmpty()) {
                q.a l2 = qVar.l();
                l2.j(saveProfileState);
                qVar2 = l2.a();
            } else {
                q.a l3 = qVar.l();
                l3.m(str);
                qVar2 = j(l3.a(), builder);
            }
        } else {
            qVar2 = k(qVar, hVar.a());
        }
        return e0.g(qVar2, builder.build());
    }

    static e0 f(q qVar, o.g gVar) {
        q qVar2;
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (gVar.a()) {
            qVar2 = j(qVar, builder);
        } else {
            SaveProfileState saveProfileState = SaveProfileState.FAILED;
            q.a l = qVar.l();
            l.j(saveProfileState);
            qVar2 = l.a();
        }
        return e0.g(qVar2, builder.build());
    }

    static e0 g(q qVar, o.d dVar) {
        q qVar2;
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (dVar.a()) {
            qVar2 = j(qVar, builder);
        } else {
            SaveProfileState saveProfileState = SaveProfileState.FAILED;
            q.a l = qVar.l();
            l.j(saveProfileState);
            qVar2 = l.a();
        }
        return e0.g(qVar2, builder.build());
    }

    static e0 h(q qVar, o.f fVar) {
        q qVar2;
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (fVar.a()) {
            qVar2 = j(qVar, builder);
        } else {
            SaveProfileState saveProfileState = SaveProfileState.FAILED;
            q.a l = qVar.l();
            l.j(saveProfileState);
            qVar2 = l.a();
        }
        return e0.g(qVar2, builder.build());
    }

    static e0 i(q qVar, o.b bVar) {
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (bVar.a()) {
            qVar = j(qVar, builder);
        } else if (a(qVar)) {
            qVar = j(qVar, builder);
            builder.mo53add((ImmutableSet.Builder) new n.a(false));
        }
        return e0.g(qVar, builder.build());
    }

    private static q j(q qVar, ImmutableSet.Builder<n> builder) {
        ImmutableList<SaveProfileTask> immutableList;
        ImmutableSet immutableSet;
        SaveProfileTask a = qVar.a();
        SaveProfileTask saveProfileTask = SaveProfileTask.NOTHING;
        if (a != saveProfileTask) {
            immutableList = ImmutableList.copyOf(FluentIterable.concat(qVar.k(), ImmutableList.of(qVar.a())));
        } else {
            immutableList = qVar.k();
        }
        ImmutableList copyOf = ImmutableList.copyOf(Collections2.filter((Iterable) qVar.j(), (Predicate) new c(immutableList)).iterator());
        if (!copyOf.isEmpty()) {
            SaveProfileTask saveProfileTask2 = (SaveProfileTask) copyOf.get(0);
            switch (saveProfileTask2.ordinal()) {
                case 0:
                    immutableSet = ImmutableSet.of(n.c.a);
                    break;
                case 1:
                    String n = qVar.n();
                    h.e(n, "username");
                    immutableSet = ImmutableSet.of(new n.b(n, false));
                    break;
                case 2:
                    String e = qVar.e();
                    h.e(e, "imagePath");
                    immutableSet = ImmutableSet.of(new n.g(e));
                    break;
                case 3:
                    String n2 = qVar.n();
                    String m = qVar.m();
                    h.e(n2, "username");
                    h.e(m, "uploadToken");
                    immutableSet = ImmutableSet.of(new n.f(n2, m));
                    break;
                case 4:
                    String n3 = qVar.n();
                    h.e(n3, "username");
                    immutableSet = ImmutableSet.of(new n.d(n3));
                    break;
                case 5:
                    String n4 = qVar.n();
                    String d = qVar.d();
                    h.e(n4, "username");
                    h.e(d, "displayName");
                    immutableSet = ImmutableSet.of(new n.e(n4, d));
                    break;
                case 6:
                    String n5 = qVar.n();
                    h.e(n5, "username");
                    immutableSet = ImmutableSet.of((n.a) new n.b(n5, true), new n.a(true));
                    break;
                default:
                    immutableSet = ImmutableSet.of();
                    break;
            }
            builder.addAll((Iterable<? extends n>) immutableSet);
            saveProfileTask = saveProfileTask2;
        } else {
            q.a l = qVar.l();
            l.j(SaveProfileState.IDLE);
            qVar = l.a();
        }
        q.a l2 = qVar.l();
        l2.b(saveProfileTask);
        l2.l(immutableList);
        return k(l2.a(), 0.0f);
    }

    private static q k(q qVar, float f) {
        float d = ((float) SaveProfileTask.d(qVar.k())) / ((float) SaveProfileTask.d(qVar.j()));
        if (qVar.a() != SaveProfileTask.NOTHING) {
            d += (((float) qVar.a().weight) / ((float) SaveProfileTask.d(qVar.j()))) * f;
        }
        q.a l = qVar.l();
        l.i(d);
        return l.a();
    }
}
