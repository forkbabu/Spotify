package defpackage;

import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: bb  reason: default package */
public class bb implements cb, za {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List<cb> d = new ArrayList();
    private final MergePaths e;

    public bb(MergePaths mergePaths) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.e = mergePaths;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    private void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.d.size() - 1; size >= 1; size--) {
            cb cbVar = this.d.get(size);
            if (cbVar instanceof ta) {
                ta taVar = (ta) cbVar;
                List<cb> f = taVar.f();
                for (int size2 = f.size() - 1; size2 >= 0; size2--) {
                    Path o = f.get(size2).o();
                    o.transform(taVar.h());
                    this.b.addPath(o);
                }
            } else {
                this.b.addPath(cbVar.o());
            }
        }
        cb cbVar2 = this.d.get(0);
        if (cbVar2 instanceof ta) {
            ta taVar2 = (ta) cbVar2;
            List<cb> f2 = taVar2.f();
            for (int i = 0; i < f2.size(); i++) {
                Path o2 = f2.get(i).o();
                o2.transform(taVar2.h());
                this.a.addPath(o2);
            }
        } else {
            this.a.set(cbVar2.o());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
        for (int i = 0; i < this.d.size(); i++) {
            this.d.get(i).b(list, list2);
        }
    }

    @Override // defpackage.za
    public void f(ListIterator<sa> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            sa previous = listIterator.previous();
            if (previous instanceof cb) {
                this.d.add((cb) previous);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.cb
    public Path o() {
        this.c.reset();
        if (this.e.c()) {
            return this.c;
        }
        int ordinal = this.e.b().ordinal();
        if (ordinal == 0) {
            for (int i = 0; i < this.d.size(); i++) {
                this.c.addPath(this.d.get(i).o());
            }
        } else if (ordinal == 1) {
            a(Path.Op.UNION);
        } else if (ordinal == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (ordinal == 3) {
            a(Path.Op.INTERSECT);
        } else if (ordinal == 4) {
            a(Path.Op.XOR);
        }
        return this.c;
    }
}
