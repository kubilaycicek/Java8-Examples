package com.kubilaycicek;

import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierTest02 {

    Supplier<String> s1 = () -> new String("kubi");
    Supplier<String> s2 = String::new;
}
