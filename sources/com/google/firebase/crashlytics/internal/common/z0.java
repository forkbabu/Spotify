package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.g;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class z0 {
    private static final FilenameFilter a = new a();
    private static final ExecutorService b = l0.a("awaitEvenIfOnMainThread task continuation executor");
    public static final /* synthetic */ int c = 0;

    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return true;
        }
    }

    public static <T> T a(g<T> gVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        gVar.k(b, y0.b(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (gVar.r()) {
            return gVar.n();
        }
        if (gVar.p()) {
            throw new CancellationException("Task is already canceled");
        } else if (gVar.q()) {
            throw new IllegalStateException(gVar.m());
        } else {
            throw new TimeoutException();
        }
    }

    static int b(File file, int i, Comparator<File> comparator) {
        return c(file, a, i, comparator);
    }

    static int c(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        return d(Arrays.asList(listFiles), i, comparator);
    }

    static int d(List<File> list, int i, Comparator<File> comparator) {
        int size = list.size();
        Collections.sort(list, comparator);
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            f(file);
            size--;
        }
        return size;
    }

    static int e(File file, File file2, int i, Comparator<File> comparator) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        File[] listFiles2 = file2.listFiles(a);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        if (listFiles2 == null) {
            listFiles2 = new File[0];
        }
        arrayList.addAll(Arrays.asList(listFiles));
        arrayList.addAll(Arrays.asList(listFiles2));
        return d(arrayList, i, comparator);
    }

    private static void f(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                f(file2);
            }
        }
        file.delete();
    }
}
