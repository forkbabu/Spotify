package com.google.android.flexbox;

import android.view.View;
import java.util.List;

interface a {
    void c(View view, int i, int i2, c cVar);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<c> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int h(int i, int i2, int i3);

    View j(int i);

    int k(int i, int i2, int i3);

    int l(View view);

    void n(c cVar);

    View o(int i);

    void p(int i, View view);

    int r(View view, int i, int i2);

    boolean s();

    void setFlexLines(List<c> list);
}
