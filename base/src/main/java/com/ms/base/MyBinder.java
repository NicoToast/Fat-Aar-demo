package com.ms.base;

import android.os.Binder;

/**
 * MyBinder class.
 *
 * @author Lucas Cheung.
 * @date 2018/4/23.
 */
public class MyBinder extends Binder {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public MyBinder setCount(int count) {
        this.count = count;
        return this;
    }
}
