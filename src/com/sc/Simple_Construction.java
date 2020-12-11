package com.sc;

import com.University_Construction;

abstract public class Simple_Construction extends University_Construction {

    public Simple_Construction(int number, String title) {
        super(number, title);
    }

    abstract void repair();
}
