package com.java.oop.service;

import com.java.oop.logic.JavaSort;
import com.java.oop.logic.Sort;

import java.util.List;

public class SortService {

    // DI 의존성 주입식 방법
    // 필드에 주입하고 싶은 것을 선언
    // 생성자에서 한 번만 쓸 거니까 final 키워드
   private final Sort<String> sort;

   // 필드에 꼭 필요한 녀석을 생성자에서 주입할 수 있도록 만든
    public SortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
