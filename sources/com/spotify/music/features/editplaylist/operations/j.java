package com.spotify.music.features.editplaylist.operations;

import androidx.lifecycle.v;
import androidx.work.WorkInfo;
import com.spotify.music.features.editplaylist.operations.SetPictureOperationHandler;
import io.reactivex.t;
import java.util.List;

public final /* synthetic */ class j implements v {
    public final /* synthetic */ t a;

    public /* synthetic */ j(t tVar) {
        this.a = tVar;
    }

    @Override // androidx.lifecycle.v
    public final void a(Object obj) {
        t tVar = this.a;
        List list = (List) obj;
        if (list.isEmpty()) {
            tVar.onNext(SetPictureOperationHandler.Status.NOTHING);
            tVar.onComplete();
            return;
        }
        WorkInfo workInfo = (WorkInfo) list.get(0);
        int ordinal = workInfo.a().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            tVar.onNext(SetPictureOperationHandler.Status.PROGRESS);
        } else if (ordinal == 2) {
            tVar.onNext(SetPictureOperationHandler.Status.SUCCEEDED);
        } else if (ordinal == 3 || ordinal == 4) {
            tVar.onNext(SetPictureOperationHandler.Status.ERROR);
        } else if (ordinal == 5) {
            tVar.onNext(SetPictureOperationHandler.Status.CANCELLED);
        }
        if (workInfo.a().d()) {
            tVar.onComplete();
        }
    }
}
