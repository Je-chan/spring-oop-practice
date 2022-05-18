package com.spring.oop.service;

import com.spring.oop.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {


   private final Sort<String> sort;

    // 스프링의 경우 아래의 코드는 에러를 발생시킨다. Bean 으로 등록된 게 JavaSort 와 BubbleSort 두 개이기 때문
    // 이 인터페이스가 바라보는 클래스가 두 개이므로, 하나만 사용하라고 에러를 발생시킨다.
    // public SortService(Sort<String> sort) {this.sort = sort; }

    // Qualifier로 한 가지의 빈만 바라보게 만든다
    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
